import javax.sound.midi.*;

public class Badumtsss {
	public static void main(String[] args) {
		Badumtsss badumtsss = new Badumtsss();

		if (args.length < 3) {
			System.out.println("Niet genoeg args lul");
		} else {
			int drum1 = Integer.parseInt(args[0]);
			int drum2 = Integer.parseInt(args[1]);
			int drum3 = Integer.parseInt(args[2]);
			badumtsss.play(drum1, drum2, drum3);
		}

	} // close main

	public void play(int drum1, int drum2, int drum3) {
		try {

			Sequencer player = MidiSystem.getSequencer(); // get a sequencer
			player.open(); // open the sequencer
			Sequence seq = new Sequence(Sequence.PPQ, 16); // Make a new sequence
			Track track = seq.createTrack(); // Get a track from the sequence

			MidiEvent event = null;			

			ShortMessage first = new ShortMessage();
			first.setMessage(144, 9, drum1, 127);
			MidiEvent noteOn1 = new MidiEvent(first, 1);
			track.add(noteOn1);

			ShortMessage firstOff = new ShortMessage();
			firstOff.setMessage(128, 9, drum1, 127);
			MidiEvent noteOff1 = new MidiEvent(firstOff, 4);
			track.add(noteOff1);
			
			ShortMessage second = new ShortMessage();
			second.setMessage(144, 9, drum2, 127);
			MidiEvent noteOn2 = new MidiEvent(second, 4);
			track.add(noteOn2);

			ShortMessage secondOff = new ShortMessage();
			secondOff.setMessage(128, 9, drum2, 127);
			MidiEvent noteOff2 = new MidiEvent(secondOff, 7);
			track.add(noteOff2);

			ShortMessage third = new ShortMessage();
			third.setMessage(144, 9, drum3, 127);
			MidiEvent noteOn3 = new MidiEvent(third, 20);
			track.add(noteOn3); 

			player.setSequence(seq); // Give the sequence to the sequencer (like putting the cd in the cd player)

			player.start(); // Start the sequencer (like pushing play)

			Thread.sleep(3000);
			player.close();
			System.exit(0);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // close play
} // close class