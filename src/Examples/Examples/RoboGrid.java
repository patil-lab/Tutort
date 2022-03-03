package Examples;


public class RoboGrid {
	public static int x = 0, y = 0;

	public static void main(String[] args) {
		Commands cmd1 = new Commands();
		cmd1.setCmd(CommandEnum.FWD);
		cmd1.setValue(3);
		Commands cmd2 = new Commands();
		cmd2.setCmd(CommandEnum.RGT);
		cmd2.setValue(2);
		Commands cmd3 = new Commands();

		cmd3.setCmd(CommandEnum.UNDO);
		cmd3.setValue(1);
		Commands[] cmds = {cmd1, cmd2, cmd3};
		ReturnEnum returnEnum = parseComds(cmds);
		System.out.println(" X: " + x + " Y: " + y);
	}


	private static ReturnEnum parseComds(Commands cmds[]) {

		int countUp = 0, countDown = 0;
		int countLeft = 0, countRight = 0;
		PreviousCmd previousCmd = new PreviousCmd();
		for (Commands cm : cmds) {
			try {
				if (CommandEnum.FWD.equals(cm.getCmd())) {
					countUp += cm.getValue();
					previousCmd.setCmd(CommandEnum.FWD);
					previousCmd.setValue(cm.getValue());

				} else if (CommandEnum.BCK.equals(cm.getCmd())) {
					countDown += cm.getValue();
					previousCmd.setCmd(CommandEnum.BCK);
					previousCmd.setValue(cm.getValue());

				} else if (CommandEnum.LFT.equals(cm.getCmd())) {
					countLeft += cm.getValue();
					previousCmd.setCmd(CommandEnum.LFT);
					previousCmd.setValue(cm.getValue());

				} else if (CommandEnum.RGT.equals(cm.getCmd())) {
					countRight += cm.getValue();
					previousCmd.setCmd(CommandEnum.RGT);
					previousCmd.setValue(cm.getValue());

				} else if (CommandEnum.UNDO.equals(cm.getCmd())) {

					if (cm.getValue() < 0) {
						return ReturnEnum.INVALID_UNDO_CMD;
					}
					switch (previousCmd.getCmd()) {
						case FWD:
							countUp -= previousCmd.getValue();
							break;
						case BCK:
							countDown -= previousCmd.getValue();
							break;
						case LFT:
							countLeft -= previousCmd.getValue();
							break;
						case RGT:
							countRight -= previousCmd.getValue();
					}

				}
			} catch (Exception ex) {
				return ReturnEnum.NULL_PARAM;
			}
		}

		x = countRight - countLeft;
		y = countUp - countDown;

		return ReturnEnum.SUCCESS;


	}
}
