// Java Package flashlight is a proxy for talking to a Go program.
//   gobind -lang=java github.com/getlantern/lantern-android/libflashlight/bindings
//
// File is generated by gobind. Do not edit.
package go.flashlight;

import go.Seq;

public abstract class Flashlight {
    private Flashlight() {} // uninstantiable
    
    public static void RunClientProxy(String listenAddr) throws Exception {
        go.Seq _in = new go.Seq();
        go.Seq _out = new go.Seq();
        _in.writeUTF16(listenAddr);
        Seq.send(DESCRIPTOR, CALL_RunClientProxy, _in, _out);
        String _err = _out.readUTF16();
        if (_err != null) {
            throw new Exception(_err);
        }
    }
    
    public static void StopClientProxy() throws Exception {
        go.Seq _in = new go.Seq();
        go.Seq _out = new go.Seq();
        Seq.send(DESCRIPTOR, CALL_StopClientProxy, _in, _out);
        String _err = _out.readUTF16();
        if (_err != null) {
            throw new Exception(_err);
        }
    }
    
    private static final int CALL_RunClientProxy = 1;
    private static final int CALL_StopClientProxy = 2;
    private static final String DESCRIPTOR = "flashlight";
}
