package jp.mitukiii.tumblife2.exeption;

public class TLSDCardNotFoundException extends TLFailureException
{
  private static final long serialVersionUID = 7263100142532892304L;

  public TLSDCardNotFoundException() {}
  
  public TLSDCardNotFoundException(String message)
  {
    super(message);
  }
}
