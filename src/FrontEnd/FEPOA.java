package FrontEnd;


/**
* FrontEnd/FEPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/quocminhvu/Documents/workspace/IdeaProjects/COMP6231_Project/src/FrontEnd.idl
* Friday, July 21, 2017 9:43:46 o'clock PM EDT
*/

public abstract class FEPOA extends org.omg.PortableServer.Servant
 implements FrontEnd.FEOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("createTRecord", new java.lang.Integer (0));
    _methods.put ("createSRecord", new java.lang.Integer (1));
    _methods.put ("getRecordCounts", new java.lang.Integer (2));
    _methods.put ("editRecord", new java.lang.Integer (3));
    _methods.put ("transferRecord", new java.lang.Integer (4));
    _methods.put ("printRecord", new java.lang.Integer (5));
    _methods.put ("printAllRecords", new java.lang.Integer (6));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // FrontEnd/FE/createTRecord
       {
         String managerID = in.read_string ();
         String firstName = in.read_string ();
         String lastName = in.read_string ();
         String address = in.read_string ();
         String phone = in.read_string ();
         String specialization = in.read_string ();
         String location = in.read_string ();
         String $result = null;
         $result = this.createTRecord (managerID, firstName, lastName, address, phone, specialization, location);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // FrontEnd/FE/createSRecord
       {
         String managerID = in.read_string ();
         String firstName = in.read_string ();
         String lastName = in.read_string ();
         String coursesRegistered = in.read_string ();
         String status = in.read_string ();
         String $result = null;
         $result = this.createSRecord (managerID, firstName, lastName, coursesRegistered, status);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // FrontEnd/FE/getRecordCounts
       {
         String managerID = in.read_string ();
         String $result = null;
         $result = this.getRecordCounts (managerID);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // FrontEnd/FE/editRecord
       {
         String managerID = in.read_string ();
         String recordID = in.read_string ();
         String fieldName = in.read_string ();
         String newValue = in.read_string ();
         boolean $result = false;
         $result = this.editRecord (managerID, recordID, fieldName, newValue);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 4:  // FrontEnd/FE/transferRecord
       {
         String managerID = in.read_string ();
         String recordID = in.read_string ();
         String remoteCenterServerName = in.read_string ();
         boolean $result = false;
         $result = this.transferRecord (managerID, recordID, remoteCenterServerName);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 5:  // FrontEnd/FE/printRecord
       {
         String managerID = in.read_string ();
         String recordID = in.read_string ();
         String $result = null;
         $result = this.printRecord (managerID, recordID);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 6:  // FrontEnd/FE/printAllRecords
       {
         String managerID = in.read_string ();
         String $result = null;
         $result = this.printAllRecords (managerID);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:FrontEnd/FE:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public FE _this() 
  {
    return FEHelper.narrow(
    super._this_object());
  }

  public FE _this(org.omg.CORBA.ORB orb) 
  {
    return FEHelper.narrow(
    super._this_object(orb));
  }


} // class FEPOA