import { useContext } from "react";
import styles from "./CrudModal.module.scss";
import { SubmitHandler, useForm } from "react-hook-form";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faCheck, faTimes } from "@fortawesome/free-solid-svg-icons";
import { TodoContext } from "../../context/TodoContextProvider";

interface CrudModalProps {
  submitFunction: SubmitHandler<{ inputField: string }>;
  closeModal: React.MouseEventHandler<HTMLButtonElement>;
}

const CrudModal = ({ submitFunction, closeModal }: CrudModalProps) => {
  const { handleSubmit, register } = useForm<{ inputField: string }>();
  const { setMessage } = useContext(TodoContext);

  const onSubmit = async (data: { inputField: string }) => {
    try {
      if (data.inputField.length > 50) {
        throw new Error("Input must be less than 50 characters");
      }
      await submitFunction(data);
    } catch (error: any) {
      console.error("Form submission error:", error);
      const errorMessage = error.message || "An error occurred";
      setMessage(errorMessage);
    }
  };

  return (
    <form
      className={styles.modal__wrap}
      onSubmit={handleSubmit(onSubmit)}
     
    >
      <article className={styles.modal__article}>
        <textarea  {...register("inputField")} />
      </article>

      <footer className={styles.modal__buttonWrap}>
        <button type="submit" >
          <FontAwesomeIcon icon={faCheck} />
        </button>
        <button type="button" onClick={closeModal} >
          <FontAwesomeIcon icon={faTimes} />
        </button>
      </footer>
    </form>
  );
};

export default CrudModal;