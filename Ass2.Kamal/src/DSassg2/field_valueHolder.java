package DSassg2;


/**
* DSassg2/field_valueHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/quocminhvu/Documents/workspace/IdeaProjects/COMP6231_Project/Ass2.Kamal/src/ServerInterface.idl
* Monday, July 31, 2017 8:16:37 o'clock PM EDT
*/

public final class field_valueHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public field_valueHolder ()
  {
  }

  public field_valueHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DSassg2.field_valueHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DSassg2.field_valueHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DSassg2.field_valueHelper.type ();
  }

}
