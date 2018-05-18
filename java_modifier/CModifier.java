
public class CModifier {

    public static final String name = "CModifier";
    private String format = "**%%";
    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public static String getName() {
        return CModifier.name;
    }

    static class AudioPlayer {
        protected boolean openSpeaker(byte sp) {
            //
            return true;
        }

        private boolean Speaker() {
            System.out.println("parent class");
            return true;
        }
    }

    static class StreamAudioPlayer extends AudioPlayer {
        protected boolean openSpeaker(byte sp) {
                //
                return false;
        }

        private boolean Speaker() {
            System.out.println("son class");
            return true;
        }
    }

    public static void main(String[] args) {
        CModifier cm = new CModifier();
        System.out.println(cm.getFormat());
        System.out.println(CModifier.getName());
        CModifier.AudioPlayer audio = new CModifier.AudioPlayer();
        audio.Speaker();
        CModifier.StreamAudioPlayer audio1 = new CModifier.StreamAudioPlayer();
        audio1.Speaker();
    }
}