package umm3601.todo;

/**
 * A todo object based on the structure in the `todos.json` file.
 *
 * The fields are all public because (in later labs) they will be
 * populated by MongoDB.
 */
@SuppressWarnings("VisibilityModifier")
public class Todo {
  @SuppressWarnings("MemberName")
  public String _id;
  public String owner;
  public boolean status;
  public String body;
  public String category;
}
