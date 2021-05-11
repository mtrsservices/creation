package java.io;

public class ObjectOutputStream
    extends OutputStream
    implements ObjectOutput, ObjectStreamConstants
{
    public ObjectOutputStream(OutputStream out)
        throws IOException;

    public final void writeObject(Object obj)
        throws IOException;

    public void writeUnshared(Object obj)
        throws IOException;

    public void defaultWriteObject()
        throws IOException, NotActiveException;

    public PutField putFields()
        throws IOException;

    public writeFields()
        throws IOException;

    public void reset() throws IOException;

    protected void annotateClass(Class cl) throws IOException;

    protected void writeClassDescriptor(ObjectStreamClass desc)
        throws IOException;

    protected Object replaceObject(Object obj) throws IOException;

    protected boolean enableReplaceObject(boolean enable)
        throws SecurityException;

    protected void writeStreamHeader() throws IOException;

    public void write(int data) throws IOException;

    public void write(byte b[]) throws IOException;

    public void write(byte b[], int off, int len) throws IOException;

    public void flush() throws IOException;

    protected void drain() throws IOException;

    public void close() throws IOException;

    public void writeBoolean(boolean data) throws IOException;

    public void writeByte(int data) throws IOException;

    public void writeShort(int data) throws IOException;

    public void writeChar(int data) throws IOException;

    public void writeInt(int data) throws IOException;

    public void writeLong(long data) throws IOException;

    public void writeFloat(float data) throws IOException;

    public void writeDouble(double data) throws IOException;

    public void writeBytes(String data) throws IOException;

    public void writeChars(String data) throws IOException;

    public void writeUTF(String data) throws IOException;

    // Inner class to provide access to serializable fields.
    abstract static public class PutField
    {
        public void put(String name, boolean value)
            throws IOException, IllegalArgumentException;

        public void put(String name, char data)
            throws IOException, IllegalArgumentException;

        public void put(String name, byte data)
            throws IOException, IllegalArgumentException;

        public void put(String name, short data)
            throws IOException, IllegalArgumentException;

        public void put(String name, int data)
            throws IOException, IllegalArgumentException;

        public void put(String name, long data)
            throws IOException, IllegalArgumentException;

        public void put(String name, float data)
            throws IOException, IllegalArgumentException;

        public void put(String name, double data)
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