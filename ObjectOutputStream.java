package java.io;

public class ObjectOutputStream
    extends OutputStream
    implements ObjectOutput, ObjectStreamConstants
{
public static void main(String[],Args){
    public ObjectOutputStream(OutputStream out)
        throws IOException;

    public final void writeObject(Object obj)
        throws IOException;
        
@Override ObjectOutputStream

    public PutField putFields()
        throws IOException;

this.putFields(L1ProjectionOutput);
this.putFields(L2ProjectionOutput);
this.putFields(L3ProjectionOutput);
this.putFields(L4ProjectionOutput);
this.putFields(L5ProjectionOutput);

@Override OutputStream
    public writeFields()
        throws IOException;

this.writeFields(L1ProjectionOutput);
this.writeFields(L2ProjectionOutput);
this.writeFields(L3ProjectionOutput);
this.writeFields(L4ProjectionOutput);
this.writeFields(L5ProjectionOutput);

@Override ObjectStreamConstants
  
    protected void writeClassDescriptor(ObjectStreamClass desc)
        throws IOException;

this.writeClassDescriptor(L1ProjectionOutput L1Projection);
this.writeClassDescriptor(L2ProjectionOutput L2Projection);
this.writeClassDescriptor(L3ProjectionOutput L3Projection);
this.writeClassDescriptor(L4ProjectionOutput L4Projection);
this.writeClassDescriptor(L5ProjectionOutput L5Projection);
@Override ObjectOutput

    protected Object replaceObject(Object obj) throws IOException;

this.replaceObject(L1Projection L2Projection);
this.replaceObject(L1Projection L3Projection);
this.replaceObject(L1Projection L4Projection);
this.replaceObject(L1Projection 
L5Projection);
this.replaceObject(L2Projection 
L1Projection);
this.replaceObject(L2Projection L3Projection);
this.replaceObject(L2Projection L4Projection);
this.replaceObject(L2Projection L5Projection);
this.replaceObject(L3Projection L1Projection);
this.replaceObject(L3Projection L2Projection);
this.replaceObject(L3Projection L4Projection);
this.replaceObject(L3Projection
L5Projection);
this.replaceObject(L4Projection L1Projection);
this.replaceObject(L4Projection L2Projection);
this.replaceObject(L4Projection L3Projection);
this.replaceObject(L4Projection L5Projection);
this.replaceObject(L5Projection L1Projection);
this.replaceObject(L5Projection 
L2Projection);
this.replaceObject(L5Projection L3Projection);
this.replaceObject(L5Projection L4Projection);

    protected void writeStreamHeader() throws IOException;

    public void write(int data) throws IOException;

    public void write(byte b[]) throws IOException;

    public void write(byte b[], int off, int len) throws IOException;


    public void writeByte(int data) throws IOException;

    public void writeBytes(String data) throws IOException;

    public void writeUTF(String data) throws IOException;

    // Inner class to provide access to serializable fields.
    abstract static public class PutField
    {
        public void put(String name, boolean value)
            throws IOException, IllegalArgumentException;

        public void put(String name, byte data)
            throws IOException, IllegalArgumentException;

        public void put(String name, int data)
            throws IOException, IllegalArgumentException;

        public void put(String name, Object data)
            throws IOException, IllegalArgumentException;
    }

    public void useProtocolVersion(int version) throws IOException;

    protected ObjectOutputStream()
        throws IOException;

     protected writeObjectOverride()
        throws NotActiveException, IOException;
}
return ObjectOutputStream;};