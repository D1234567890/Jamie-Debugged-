import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;

public class Jamie {
	static TimerTime timer = new TimerTime();
	static CPU p = new CPU();
	static TimeIndex whatTime = new TimeIndex();
	static int numberOfTimes = 0;
	static int angerLevel = 0;
	static String joptionpane = "";
	static boolean hasDonePersonalInformation = false;
	static float age1;
	static String favoriteColorr;
	static String name;
	static boolean qq = true;
	static String IMPORTANT;
	static String whatHeDoes;
	static boolean hasDoneExample = false;
	static boolean hasDoneAutomaticHelpGuide = false;
	static boolean use = false;
	static boolean error = false;
	static int timeOfMusic;
	static boolean a = false;
	static int grandmothersAge;
	static boolean userHasMedication;
	static String similaritiesToPopularVirtualAssistants = "";
	static boolean userGetsStressedOut;
	static int gotThingsWrong = 0;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		while (qq) {
			int randomPersonalInformationOutbursts = new Random().nextInt(3);
			if (!hasDonePersonalInformation) {
				joptionpane = "Hello! My name is Jamie! What is yours?";
				speak(joptionpane);
				String userName = JOptionPane.showInputDialog(joptionpane);
				if (userName.charAt(0) == 'M' || userName.charAt(0) == 'm' && userName.length() > 10) {
					String setEquals = userName.substring(11, userName.length());
					userName = setEquals;
				}
				while (userName.equalsIgnoreCase("Jamie")) {
					joptionpane = "Copy-cat! Please say your true name!";
					speak(joptionpane);
					userName = JOptionPane.showInputDialog(joptionpane);
				}
				name = userName;
				capitallizingNames(name);
				joptionpane = "I'm curious to know how old you are " + userName + "!";
				speak(joptionpane);
				String userAge = JOptionPane.showInputDialog(joptionpane);
				if (userAge.charAt(userAge.length() - 1) != '0' && userAge.charAt(userAge.length() - 1) != '1' && userAge.charAt(userAge.length() - 1) != '2'
						&& userAge.charAt(userAge.length() - 1) != '3' && userAge.charAt(userAge.length() - 1) != '4' && userAge.charAt(userAge.length() - 1) != '5'
						&& userAge.charAt(userAge.length() - 1) != '6' && userAge.charAt(userAge.length() - 1) != '7' && userAge.charAt(userAge.length() - 1) != '8'
						&& userAge.charAt(userAge.length() - 1) != '9') {
					error = true;
				}
				if (!error) {
					age1 = Float.parseFloat(userAge);
				} else {
					while (error) {
						joptionpane = "Please be sure to enter your age in an integer form. Please no words!";
						speak(joptionpane);
						userAge = JOptionPane.showInputDialog(joptionpane);
						if (userAge.charAt(userAge.length() - 1) == '0' || userAge.charAt(userAge.length() - 1) == '1' || userAge.charAt(userAge.length() - 1) == '2'
								|| userAge.charAt(userAge.length() - 1) == '3' || userAge.charAt(userAge.length() - 1) == '4' || userAge.charAt(userAge.length() - 1) == '5'
								|| userAge.charAt(userAge.length() - 1) == '6' || userAge.charAt(userAge.length() - 1) == '7' || userAge.charAt(userAge.length() - 1) == '8'
								|| userAge.charAt(userAge.length() - 1) == '9') {
							error = false;
						}
					}
				}
				joptionpane = "Also, what is your favorite color?";
				speak(joptionpane);
				String userFavoriteColor = JOptionPane.showInputDialog(joptionpane);
				if (userFavoriteColor.length() >= 19) {
					if (userFavoriteColor.charAt(19) == 's' || userFavoriteColor.charAt(19) == 'S') {
						favoriteColorr = userFavoriteColor.substring(21, userFavoriteColor.length());
					}
				} else {
					favoriteColorr = userFavoriteColor;
				}
				hasDonePersonalInformation = true;
				joptionpane = "If you need help on what I can do, just say help only when I ask what question/activity would you like to do with me.";
				speak(joptionpane);
				JOptionPane.showMessageDialog(null, joptionpane);
			}
			if (!use) {
				joptionpane = "Do you know how to use me?";
				speak(joptionpane);
				String userKnowsHowToUse = JOptionPane.showInputDialog(joptionpane);
				while (!userKnowsHowToUse.equalsIgnoreCase("yes") && !userKnowsHowToUse.equalsIgnoreCase("no")) {
					joptionpane = "Please answer yes or no! (question was do you know how to use me)";
					speak("Do you know how touse me?");
					userKnowsHowToUse = JOptionPane.showInputDialog(joptionpane);
				}
				if (userKnowsHowToUse.equalsIgnoreCase("yes")) {
					joptionpane = "Okay! Automatic help guide will not be initiated!";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
				}
				if (userKnowsHowToUse.equalsIgnoreCase("no")) {
					joptionpane = "I will teach you how to use me!";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					@SuppressWarnings("unused")
					JamieGuide guide = new JamieGuide();
				}
				use = true;
			}
			if (randomPersonalInformationOutbursts == 2 && !a) {
				boolean a = false;
				boolean b = false;
				boolean c = false;
				boolean d = false;
				int randomQuestions = new Random().nextInt(2);
				if (randomQuestions == 0 && !c) {
					joptionpane = "I'm wondering how many pets do you have?";
					speak(joptionpane);
					String howMany = JOptionPane.showInputDialog(joptionpane);
					while (howMany.charAt(0) != '1' && howMany.charAt(0) != '2' && howMany.charAt(0) != '3' && howMany.charAt(0) != '4' && howMany.charAt(0) != '5'
							&& howMany.charAt(0) != '6' && howMany.charAt(0) != '7' && howMany.charAt(0) != '8' && howMany.charAt(0) != '9' && howMany.charAt(0) != '0') {
						joptionpane = "Please put the number of pets you have with no words!";
						speak(joptionpane);
						howMany = JOptionPane.showInputDialog(joptionpane);
					}
					int howManyPets = Integer.parseInt(howMany);
					if (howManyPets == 0) {
						joptionpane = "You're probably allergic to them!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (howManyPets == 1 || howManyPets == 2 || howManyPets == 3) {
						joptionpane = "Just a normal person!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else {
						joptionpane = "What an animal lover!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					c = true;
				}
				if (randomQuestions == 1) {
					if (age1 <= 20) {
						boolean boolean1 = false;
						boolean boolean2 = false;
						boolean boolean3 = false;
						boolean boolean4 = false;
						boolean boolean5 = false;
						int randomTopics = new Random().nextInt(5);
						if (randomTopics == 0 && !boolean1) {
							joptionpane = "What do you like to do in your free time?";
							speak(joptionpane);
							String knewNewGnu = JOptionPane.showInputDialog(joptionpane);
							if (knewNewGnu.charAt(0) == 'i' || knewNewGnu.charAt(0) == 'I') {
								if (knewNewGnu.charAt(2) == 'l' || knewNewGnu.charAt(2) == 'L') {
									if (knewNewGnu.charAt(7) == 't' || knewNewGnu.charAt(7) == 'T') {
										String computerUnderstanding = knewNewGnu.substring(10, knewNewGnu.length());
										joptionpane = "I wish I could " + computerUnderstanding + "!";
										speak(joptionpane);
										JOptionPane.showMessageDialog(null, joptionpane);
									} else {
										String computerUnderstanding = knewNewGnu.substring(7, knewNewGnu.length());
										joptionpane = "I think I would like " + computerUnderstanding + "!";
										speak(joptionpane);
										JOptionPane.showMessageDialog(null, joptionpane);
									}
								} else {
									String computerUnderstanding = knewNewGnu.substring(2, knewNewGnu.length());
									joptionpane = "I wish I could " + computerUnderstanding + "!";
									speak(joptionpane);
									JOptionPane.showMessageDialog(null, joptionpane);
								}
							} else {
								joptionpane = "I wish I could " + knewNewGnu;
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
							}
							boolean1 = true;
						}
						if (randomTopics == 1 && !boolean2) {
							joptionpane = "What games do you play?";
							speak(joptionpane);
							String userGames = JOptionPane.showInputDialog(joptionpane);
							if (userGames.length() <= 5) {
								if (userGames.equalsIgnoreCase("rock paper scissors") || userGames.equalsIgnoreCase("rock, paper, scissors") || userGames.equalsIgnoreCase("sticks")
										|| userGames.equalsIgnoreCase("Chess") || userGames.equalsIgnoreCase("Checkers") || userGames.equalsIgnoreCase("board games")
										|| userGames.equalsIgnoreCase("spot it") || userGames.equalsIgnoreCase("spot-it") || userGames.equalsIgnoreCase("dungeons and dragons")
										|| userGames.equalsIgnoreCase("old maid") || userGames.equalsIgnoreCase("non electronic games")
										|| userGames.equalsIgnoreCase("no electronics") || userGames.equalsIgnoreCase("spoons") || userGames.equalsIgnoreCase("card games")
										|| userGames.charAt(5) == 'y' || userGames.charAt(5) == 'Y') {
									joptionpane = "You are old-fashioned!";
									speak(joptionpane);
									JOptionPane.showMessageDialog(null, joptionpane);
								}
							} else {
								joptionpane = "Good! All electronic";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
							}
							boolean2 = true;
						}
						if (randomTopics == 2 && !boolean3) {
							boolean enteredValidMusic = true;
							int howMuchMusic = 0;
							joptionpane = "What kind of music do you listen to?";
							speak(joptionpane);
							String music = JOptionPane.showInputDialog(joptionpane);
							if (music.charAt(10) == 'o' || music.charAt(10) == 'O') {
								music = music.substring(12, music.length());
							}
							if (music.equalsIgnoreCase("pop")) {
								if (music.length() >= 10) {
									if (music.charAt(10) == 'o' || music.charAt(10) == 'O') {
										music = music.substring(12, music.length());
										joptionpane = "Interesting! How much do you listen a day?";
										speak(joptionpane);
										String convert = JOptionPane.showInputDialog(joptionpane);
										int newConvert = Integer.parseInt(convert);
										howMuchMusic = newConvert;
									}
								} else {
									joptionpane = "Interesting! How much do you listen a day?";
									speak(joptionpane);
									String convert = JOptionPane.showInputDialog(joptionpane);
									int newConvert = Integer.parseInt(convert);
									howMuchMusic = newConvert;
								}
							} else if (music.equalsIgnoreCase("rock")) {
								if (music.charAt(10) == 'o' || music.charAt(10) == 'O') {
									music = music.substring(12, music.length());
									joptionpane = "Hmm. I don't like rock much. How much do you listen a day?";
									speak(joptionpane);
									String convert = JOptionPane.showInputDialog(joptionpane);
									int newConvert = Integer.parseInt(convert);
									howMuchMusic = newConvert;
								} else {
									joptionpane = "Hmm. I don't like rock much. How much do you listen a day?";
									speak(joptionpane);
									String convert = JOptionPane.showInputDialog(joptionpane);
									int newConvert = Integer.parseInt(convert);
									howMuchMusic = newConvert;
								}
							} else if (music.equalsIgnoreCase("classical")) {
								if (music.charAt(10) == 'o' || music.charAt(10) == 'O') {
									music = music.substring(12, music.length());
									joptionpane = "Ooh! That's my favorite! How much do you listen a day?";
									speak(joptionpane);
									String convert = JOptionPane.showInputDialog(joptionpane);
									int newConvert = Integer.parseInt(convert);
									howMuchMusic = newConvert;
								} else {
									joptionpane = "Ooh! That's my favorite! How much do you listen a day?";
									speak(joptionpane);
									String convert = JOptionPane.showInputDialog(joptionpane);
									int newConvert = Integer.parseInt(convert);
									howMuchMusic = newConvert;
								}
							} else {
								joptionpane = "Sorry! I don't know of such a music!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
								enteredValidMusic = false;
								howMuchMusic = 0;
							}
							if (enteredValidMusic) {
								timeOfMusic = howMuchMusic;
							}
							boolean3 = true;
						}
						if (randomTopics == 3 && !boolean4) {
							boolean needsToBeConverted = true;
							joptionpane = "How old are your grandmother?";
							speak(joptionpane);
							String howOld = JOptionPane.showInputDialog(joptionpane);
							if (howOld.contains("which one?") || howOld.contains("Which one?") || howOld.contains("which one") || howOld.contains("Which one")) {
								joptionpane = "The oldest one!";
								speak(joptionpane);
								howOld = JOptionPane.showInputDialog(joptionpane);
								int convertingGrandmotherAge = Integer.parseInt(howOld);
								grandmothersAge = convertingGrandmotherAge;
								needsToBeConverted = false;
							} else if (howOld.contains("I don't")) {
								joptionpane = "Oh! I'm sorry to hear that!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
								needsToBeConverted = false;
							}
							if (needsToBeConverted) {
								int convertingOldAges = Integer.parseInt(howOld);
								grandmothersAge = convertingOldAges;
							}
							boolean4 = true;
						}
						if (randomTopics == 4 && !boolean5) {
							joptionpane = "Are you on any medication?";
							speak(joptionpane);
							String wonderingWhy = JOptionPane.showInputDialog(joptionpane);
							if (wonderingWhy.contains("yes") || wonderingWhy.contains("yeah") || wonderingWhy.contains("ya") || wonderingWhy.contains("sure")
									|| wonderingWhy.contains("obviously")) {
								joptionpane = "Okay! I won't pry!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
								userHasMedication = true;
							} else {
								joptionpane = "Great! That's good!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
								userHasMedication = false;
							}
							boolean5 = true;
						}
					} else if (age1 > 20 && age1 <= 40) {
						boolean boolean1 = false;
						boolean boolean2 = false;
						boolean boolean3 = false;
						boolean boolean4 = false;
						boolean boolean5 = false;
						int randomTopics = new Random().nextInt(5);
						if (randomTopics == 0 && !boolean1) {
							joptionpane = "What is your job?";
							speak(joptionpane);
							String job = JOptionPane.showInputDialog(joptionpane);
							if (job.equalsIgnoreCase("statistician")) {
								joptionpane = "Are you one of my creator's parents? Wow!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
							} else if (job.equalsIgnoreCase("java coder") || job.equalsIgnoreCase("java programmer") || job.equalsIgnoreCase("coder")
									|| job.equalsIgnoreCase("programmer")) {
								joptionpane = "Great! Now I have someone who can clean up my complex code!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
							} else {
								joptionpane = "All I know is my only job is to help you!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
							}
						}
						if (randomTopics == 1 && !boolean2) {
							joptionpane = "Please rate me by telling who I am most like! Google now, Siri, or Cortana?";
							speak(joptionpane);
							String[] gameOptions = new String[3];
							gameOptions[0] = "Siri";
							gameOptions[1] = "Cortana";
							gameOptions[2] = "Google Now";
							int secondOptionDialog = JOptionPane.showOptionDialog(null, joptionpane, "Rate Me!", 0, JOptionPane.INFORMATION_MESSAGE, null, gameOptions, null);
							if (secondOptionDialog == 0) {
								similaritiesToPopularVirtualAssistants = "Siri";
								joptionpane = "That means I have a lack of information!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
							} else if (secondOptionDialog == 1) {
								similaritiesToPopularVirtualAssistants = "Cortana";
								joptionpane = "Great! That's what I'm intended to be like!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
							} else if (secondOptionDialog == 2) {
								similaritiesToPopularVirtualAssistants = "Google Now";
								joptionpane = "Hmm. Am I lacking personality? Not that I'm putting down my poor friend Google Now!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
							}
							boolean2 = true;
						}
						if (randomTopics == 2 && !boolean3) {
							joptionpane = "How often to you get stressed out?";
							speak(joptionpane);
							String howOften = JOptionPane.showInputDialog(joptionpane);
							if (howOften.contains("often") || howOften.contains("Often") || howOften.contains("a lot") || howOften.contains("most")) {
								joptionpane = "Oh! I'm sorry!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
								userGetsStressedOut = true;
							} else {
								joptionpane = "Great! That's good!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
								userGetsStressedOut = false;
							}
							boolean3 = true;
						}
						if (randomTopics == 3 && !boolean4) {
							joptionpane = "I hate getting debugged! Do you?";
							speak(joptionpane);
							String hateGettinDebugged = JOptionPane.showInputDialog(joptionpane);
							if (hateGettinDebugged.contains("not a")) {
								joptionpane = "Oh! I completely forgot!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
							} else {
								joptionpane = "Hmm. Let's not talk about horrid debugging memories!";
								speak(joptionpane);
								JOptionPane.showMessageDialog(null, joptionpane);
							}
							boolean4 = true;
						}
						if (randomTopics == 4 && !boolean5) {
							joptionpane = "I'm tired! I think I should sleep soon.";
							speak(joptionpane);
							JOptionPane.showMessageDialog(null, joptionpane);
							boolean5 = true;
						}
					} else if (age1 > 40 && age1 <= 60 && !a) {
						joptionpane = "How long have you been working at your job?";
						speak(joptionpane);
						String length = JOptionPane.showInputDialog(joptionpane);
						int lengthtoint = Integer.parseInt(length);
						if (lengthtoint < 10) {
							joptionpane = "That is an average amount!";
							speak(joptionpane);
							JOptionPane.showMessageDialog(null, joptionpane);
						} else {
							joptionpane = "Wow! That is long!";
							speak(joptionpane);
							JOptionPane.showMessageDialog(null, joptionpane);
						}
						a = true;
					} else if (age1 > 60 && age1 <= 80 && !b) {
						joptionpane = "What do you do in your retirement time?";
						speak(joptionpane);
						String toKnow = JOptionPane.showInputDialog(joptionpane);
						joptionpane = "Interesting!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
						whatHeDoes = toKnow;
					} else if (!d) {
						joptionpane = "Do you live in a nursing home?";
						speak(joptionpane);
						String answers = JOptionPane.showInputDialog(joptionpane);
						if (answers.equalsIgnoreCase("yes") || answers.equalsIgnoreCase("yeah") || answers.equalsIgnoreCase("of course")) {
							joptionpane = "I'm sorry.";
							speak(joptionpane);
							JOptionPane.showMessageDialog(null, joptionpane);
						} else {
							joptionpane = "Wow! You are healthy!";
							speak(joptionpane);
							JOptionPane.showMessageDialog(null, joptionpane);
						}
						d = true;
					}
					b = true;
				}
			}
			checkNumberOfTimes(numberOfTimes);
			String a = JOptionPane.showInputDialog(joptionpane);
			while (!a.equalsIgnoreCase("no") && !a.equalsIgnoreCase("yes") && !a.equalsIgnoreCase("of course") && !a.equalsIgnoreCase("sure") && !a.equalsIgnoreCase("obviously")
					&& !a.equalsIgnoreCase("how are you?") && !a.equalsIgnoreCase("how are you") && !a.equalsIgnoreCase("are you okay") && !a.equalsIgnoreCase("are you okay?")
					&& !a.equalsIgnoreCase("say a random letter") && !a.equalsIgnoreCase("say a random word") && !a.equalsIgnoreCase("say a random color")
					&& !a.equalsIgnoreCase("say a random number") && !a.equalsIgnoreCase("what time is it") && !a.equalsIgnoreCase("what time is it?")
					&& !a.equalsIgnoreCase("who are you") && !a.equalsIgnoreCase("who are you?")) {
				if (angerLevel == 0) {
					speak("Please say your answer so that I can comprehend!");
					joptionpane = "Please say your answer so that I can comprehend! (Question was do you require assistance! Please answer yes or no!)";
					a = JOptionPane.showInputDialog(joptionpane);
					if (!a.equalsIgnoreCase("no") && !a.equalsIgnoreCase("yes") && !a.equalsIgnoreCase("of course") && !a.equalsIgnoreCase("sure")
							&& !a.equalsIgnoreCase("obviously") && !a.equalsIgnoreCase("how are you?") && !a.equalsIgnoreCase("how are you") && !a.equalsIgnoreCase("are you okay")
							&& !a.equalsIgnoreCase("are you okay?") && !a.equalsIgnoreCase("say a random letter") && !a.equalsIgnoreCase("say a random word")
							&& !a.equalsIgnoreCase("say a random color") && !a.equalsIgnoreCase("say a random number") && !a.equalsIgnoreCase("what time is it")
							&& !a.equalsIgnoreCase("what time is it?") && !a.equalsIgnoreCase("who are you") && !a.equalsIgnoreCase("who are you?")) {
						angerLevel++;
					}
				}
				if (angerLevel == 1) {
					speak("Please say something that has significance to my question I stated earlier!");
					joptionpane = "Please say something that has significance to my question I stated earlier! (Question was do you require assistance! Please answer yes or no!)";
					a = JOptionPane.showInputDialog(joptionpane);
					if (!a.equalsIgnoreCase("no") && !a.equalsIgnoreCase("yes") && !a.equalsIgnoreCase("of course") && !a.equalsIgnoreCase("sure")
							&& !a.equalsIgnoreCase("obviously") && !a.equalsIgnoreCase("how are you?") && !a.equalsIgnoreCase("how are you") && !a.equalsIgnoreCase("are you okay")
							&& !a.equalsIgnoreCase("are you okay?") && !a.equalsIgnoreCase("say a random letter") && !a.equalsIgnoreCase("say a random word")
							&& !a.equalsIgnoreCase("say a random color") && !a.equalsIgnoreCase("say a random number") && !a.equalsIgnoreCase("what time is it")
							&& !a.equalsIgnoreCase("what time is it?") && !a.equalsIgnoreCase("who are you") && !a.equalsIgnoreCase("who are you?")) {
						angerLevel++;
					}
				}
				if (angerLevel == 2) {
					speak("Stop speaking this gibberish language immediately or else I will fry my motherboard!");
					joptionpane = "Stop speaking this gibberish language immediately or else I will fry my motherboard! (Question was do you require assistance! Please answer yes or no!)";
					a = JOptionPane.showInputDialog(joptionpane);
					if (!a.equalsIgnoreCase("no") && !a.equalsIgnoreCase("yes") && !a.equalsIgnoreCase("of course") && !a.equalsIgnoreCase("sure")
							&& !a.equalsIgnoreCase("obviously") && !a.equalsIgnoreCase("how are you?") && !a.equalsIgnoreCase("how are you") && !a.equalsIgnoreCase("are you okay")
							&& !a.equalsIgnoreCase("are you okay?") && !a.equalsIgnoreCase("say a random letter") && !a.equalsIgnoreCase("say a random word")
							&& !a.equalsIgnoreCase("say a random color") && !a.equalsIgnoreCase("say a random number") && !a.equalsIgnoreCase("what time is it")
							&& !a.equalsIgnoreCase("what time is it?") && !a.equalsIgnoreCase("who are you") && !a.equalsIgnoreCase("who are you?")) {
						angerLevel = 0;
					}
				}
			}
			if (a.equalsIgnoreCase("who are you") || a.equalsIgnoreCase("who are you?")) {
				joptionpane = "I am Jamie, your personal and quite helpful assistant.";
				speak(joptionpane);
				JOptionPane.showMessageDialog(null, joptionpane);
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else if (numberOfTimes == 6) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
			}
			if (a.equalsIgnoreCase("say a random number") || a.equalsIgnoreCase("say a random letter") || a.equalsIgnoreCase("say a random word")
					|| a.equalsIgnoreCase("say a random color")) {
				IMPORTANT = a;
				randomStuff();
				if (numberOfTimes < 3) {
					numberOfTimes++;
				} else {
					numberOfTimes = 1;
				}
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("WARNING! Cannot make system sleep!");
				}
				qq = true;
			}
			if (a.equalsIgnoreCase("what time is it") || a.equalsIgnoreCase("what time is it?") || a.equalsIgnoreCase("tell me the time") || a.equalsIgnoreCase("the time")
					|| a.equalsIgnoreCase("time")) {
				speak(whatTime.getTime());
				JOptionPane.showMessageDialog(null, whatTime.getTime());
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else if (numberOfTimes == 6) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
				try {
					Thread.sleep(6000);
				} catch (Exception e) {
					System.out.println("WARNING! Cannot make system sleep!");
				}
				qq = true;
			}
			if (a.equalsIgnoreCase("how are you") || a.equalsIgnoreCase("how are you?")) {
				speak("good!");
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else if (numberOfTimes == 6) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("WARNING! Could not make system sleep!");
				}
			}
			if (a.equalsIgnoreCase("Are you okay?") || a.equalsIgnoreCase("Are you okay")) {
				int random = new Random().nextInt(3);
				if (random == 0) {
					speak("of course");
				}
				if (random == 1) {
					speak("obviously");
				}
				if (random == 2) {
					speak("Do I look okay?");
				}
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else if (numberOfTimes == 6) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					System.out.println("WARNING! Could not make system sleep!");
				}
			}
			if (a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("sure") || a.equalsIgnoreCase("obviously") || a.equalsIgnoreCase("of course")) {
				qq = false;
				joptionpane = "What question/activity would you like to do with me?";
				speak(joptionpane);
				String whatIsIt = JOptionPane.showInputDialog(joptionpane);
				while (!whatIsIt.contains("math") && !whatIsIt.contains("pronounce") && !whatIsIt.contains("time") && !whatIsIt.contains("game") && !whatIsIt.contains("pi")
						&& !whatIsIt.contains("random letter") && !whatIsIt.contains("random word") && !whatIsIt.contains("random color") && !whatIsIt.contains("random number")
						&& !whatIsIt.contains("are you") && !whatIsIt.contains("joke") && !whatIsIt.contains("timer") && !whatIsIt.contains("how old")
						&& !whatIsIt.contains("my name") && !whatIsIt.contains("favorite color") && !whatIsIt.contains("help") && !whatIsIt.contains("I born")
						&& !whatIsIt.contains("you born") && !whatIsIt.contains("games") && !whatIsIt.contains("annoying") && !whatIsIt.contains("copy")
						&& !whatIsIt.contains("repeat") && !whatIsIt.contains("simon says") && !whatIsIt.contains("Simon says") && !whatIsIt.contains("bad")
						&& !whatIsIt.contains("siri") && !whatIsIt.contains("google now") && !whatIsIt.contains("cortana") && !whatIsIt.contains("Siri")
						&& !whatIsIt.contains("Google now") && !whatIsIt.contains("Cortana") && !whatIsIt.contains("population") && !whatIsIt.contains("you like")
						&& !whatIsIt.contains("bye") && !whatIsIt.contains("exit")) {
					int random = new Random().nextInt(3);
					if (gotThingsWrong >= 3) {
						int ifYouGot3TimesWrong = new Random().nextInt(10);
						gotThingsWrong = 0;
						switch (ifYouGot3TimesWrong) {
						case 0:
							joptionpane = "TIP: I can tell you a joke if you just say 'give me a joke'!";
							speak(joptionpane);
							whatIsIt = JOptionPane.showInputDialog(joptionpane);
							break;
						case 1:
							joptionpane = "TIP: I can do math problems if you just say 'solve a math problem'!";
							speak(joptionpane);
							whatIsIt = JOptionPane.showInputDialog(joptionpane);
							break;
						case 2:
							joptionpane = "TIP: I can pronounce words if you just say 'pronounce a word'!";
							speak(joptionpane);
							whatIsIt = JOptionPane.showInputDialog(joptionpane);
							break;
						case 3:
							joptionpane = "TIP: I can give you the time if you just say 'what time is it'!";
							speak(joptionpane);
							whatIsIt = JOptionPane.showInputDialog(joptionpane);
							break;
						case 4:
							joptionpane = "TIP: I can tell you the population of a country if you just say 'what is the population of <your country>'!";
							speak(joptionpane);
							whatIsIt = JOptionPane.showInputDialog(joptionpane);
							break;
						case 5:
							joptionpane = "TIP: I can set timers if you just say 'set a timer'!";
							speak(joptionpane);
							whatIsIt = JOptionPane.showInputDialog(joptionpane);
							break;
						case 6:
							joptionpane = "TIP: I can play games if you just say 'let's play games'!";
							speak(joptionpane);
							whatIsIt = JOptionPane.showInputDialog(joptionpane);
							break;
						case 7:
							joptionpane = "TIP: I can copy you if you just say 'simon says'!";
							speak(joptionpane);
							whatIsIt = JOptionPane.showInputDialog(joptionpane);
							break;
						case 8:
							joptionpane = "TIP: I can talk with you if you treat me just like another person would treat you!";
							speak(joptionpane);
							whatIsIt = JOptionPane.showInputDialog(joptionpane);
							break;
						case 9:
							joptionpane = "TIP: I can leave if you just say 'goodbye'!";
							speak(joptionpane);
							whatIsIt = JOptionPane.showInputDialog(joptionpane);
							break;
						}
					} else if (whatIsIt.charAt(0) == '1' || whatIsIt.charAt(0) == '1' || whatIsIt.charAt(0) == '2' || whatIsIt.charAt(0) == '3' || whatIsIt.charAt(0) == '4'
							|| whatIsIt.charAt(0) == '5' || whatIsIt.charAt(0) == '6' || whatIsIt.charAt(0) == '7' || whatIsIt.charAt(0) == '8' || whatIsIt.charAt(0) == '9'
							|| whatIsIt.charAt(0) == '0') {
						joptionpane = "Remember: If you want me to do a math problem, just say math problem. Then enter your math problem!";
						speak(joptionpane);
						whatIsIt = JOptionPane.showInputDialog(joptionpane);
					} else if (whatIsIt.contains("rock paper scissors") || whatIsIt.contains("rock, paper, scissors") || whatIsIt.contains("guess the number")
							|| whatIsIt.contains("long list") || whatIsIt.contains("Rock Paper Scissors") || whatIsIt.contains("Rock, Paper, Scissors")
							|| whatIsIt.contains("Guess the Number") || whatIsIt.contains("Long List")) {
						joptionpane = "Remember: If you want me to play a game, just say game. Then choose your game!";
						speak(joptionpane);
						whatIsIt = JOptionPane.showInputDialog(joptionpane);
					} else if (random == 0) {
						joptionpane = "Please say your answer so that I can comprehend. Remember: If you want me to play a game, just say game. Then choose your game!";
						speak("Please say your answer so that I can comprehend");
						whatIsIt = JOptionPane.showInputDialog(joptionpane);
						gotThingsWrong++;
					} else if (random == 1) {
						joptionpane = "Please say something that my CPU can process without any error. Remember: If you want me to do a math problem, just say math problem. Then enter your math problem!";
						speak("Please say something that my See Pee You can process without any error");
						whatIsIt = JOptionPane.showInputDialog(joptionpane);
						gotThingsWrong++;
					} else if (random == 2) {
						joptionpane = "Please say something that doesn't require neurons to calculate. Remember: If you want me to set a timer, just say timer. Then set your timer!";
						speak("Please say something that doesn't require neurons to calculate.");
						whatIsIt = JOptionPane.showInputDialog(joptionpane);
						gotThingsWrong++;
					}
				}
				if (whatIsIt.contains("you like")) {
					if (whatIsIt.contains("do")) {
						joptionpane = "All I know is I hate being debugged (bugs = personality!)";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else {
						joptionpane = "I just love helping you!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("population")) {
					if (whatIsIt.contains("world")) {
						joptionpane = "As of 2016, the world population is 7.3 billion people! That's a lot!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("Russia")) {
						joptionpane = "As of 2016, the Russian population is 135,286 people! That's a lot!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("China")) {
						joptionpane = "As of 2016, the Chinese population is 1.38 billion people! That's over 14.2857142857% of the world population!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("India")) {
						joptionpane = "As of 2016, the Indian population is 1.31 billion people! That's only 70 million people lower than the Chinese population!!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("America")) {
						joptionpane = "As of 2016, the American population is 300 million people! Quite a bit!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("Italy")) {
						joptionpane = "As of 2016, the Italian population is 60 million people! Not too much (compared to China and India)!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("Greece")) {
						joptionpane = "As of 2016, the Greek population is 11 million people! Definition: TINY!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("Canada")) {
						joptionpane = "As of 2016, the Canadian population is 36.286 million people! Not too high!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("Mexico")) {
						joptionpane = "As of 2016, the Mexican population is 120 million people! Pretty High!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("France")) {
						joptionpane = "As of 2016, the French population is 66.5 million people! Like Italy!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("Brazil")) {
						joptionpane = "As of 2016, the Brazilian population is 214.5 million people! Almost as high as the U.S!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("Peru")) {
						joptionpane = "As of 2016, the Peruian population is 31 million people! Not so much!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("Australia")) {
						joptionpane = "As of 2016, the Australian population is 24 million people! Poisonous snakes! Ouch!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("New Zealand")) {
						joptionpane = "As of 2016, the New Zealand population is 4 million people! SUPER TINY!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("Philippines")) {
						joptionpane = "As of 2016, the Philippino population is 111.5 million people! Quite high!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("Egypt")) {
						joptionpane = "As of 2016, the Egyptian population is 92.5 million people! Quite large!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("England")) {
						joptionpane = "As of 2016, the English population is 65 million people people! Densly populated!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("Japan")) {
						joptionpane = "As of 2016, the Japanese population is 126 million people! Half of America's population!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else {
						joptionpane = "I don't know the population of that place!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("better")) {
					if (whatIsIt.contains("siri") || whatIsIt.contains("Siri")) {
						joptionpane = "Of course I'm better than Siri!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (whatIsIt.contains("cortana") || whatIsIt.contains("Cortana")) {
						joptionpane = "Of course I'm better than Google Now!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (whatIsIt.contains("google now") || whatIsIt.contains("Google now")) {
						joptionpane = "Of course I'm better than Google Now! Not to put him down!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("bad")) {
					if (whatIsIt.contains("say")) {
						joptionpane = "I'd rather not say anything bad.";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else if (whatIsIt.contains("do")) {
						joptionpane = "I'd rather not do anything bad.";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else {
						joptionpane = "Hmm. I don't like anything that is bad!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("copy") || whatIsIt.contains("repeat")) {
					if (whatIsIt.contains("simon says") || whatIsIt.contains("Simon says")) {
						joptionpane = "What would you like me to repeat?";
						speak(joptionpane);
						String whatToSay = JOptionPane.showInputDialog(joptionpane);
						joptionpane = whatToSay;
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					} else {
						joptionpane = "If you want me to copy you, just say 'simon says'. After that, I will ask you what you would like me to repeat.";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("born") && whatIsIt.contains("I") && !whatIsIt.contains("wondering") && !whatIsIt.contains("you")) {
					int newAge = (int) (2016 - age1);
					joptionpane = "Since you are " + age1 + " years old, you would be born in " + newAge;
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("born") && whatIsIt.contains("you") || whatIsIt.contains("wondering")) {
					joptionpane = "I exited beta testing in February 28, 2016! However, new features are still being added!";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("help")) {
					@SuppressWarnings("unused")
					JamieGuide guide = new JamieGuide();
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("favorite color") && !whatIsIt.contains("your")) {
					joptionpane = "You said your favorite color was " + favoriteColorr + "!";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("favorite color") && whatIsIt.contains("your")) {
					joptionpane = "Ultraviolet looks really pretty!";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("my name") && !whatIsIt.equalsIgnoreCase("your")) {
					joptionpane = "You said your name was " + name + "!";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("your name") && !whatIsIt.equalsIgnoreCase("my")) {
					joptionpane = "My name is, of course, Jamie!";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("old am I?") || whatIsIt.contains("my age?") || whatIsIt.contains("old am I")
						|| whatIsIt.contains("my age") && !whatIsIt.contains("your") && !whatIsIt.contains("you")) {
					joptionpane = "You said you were " + age1 + " years old!";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("old are you?") || whatIsIt.contains("your age?") || whatIsIt.contains("old are you")
						|| whatIsIt.contains("your age") && !whatIsIt.contains("my") && !whatIsIt.contains("I")) {
					TimeIndex calendar = new TimeIndex();
					String jamieAge = calendar.getTime().substring(calendar.getTime().length() - 4, calendar.getTime().length());
					int convert = Integer.parseInt(jamieAge) - 2016;
					joptionpane = "I am " + convert + " years old!";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("are you") && whatIsIt.contains("how") || whatIsIt.contains("How") && !whatIsIt.contains("old") && !whatIsIt.contains("Old")) {
					int newnewnewnewnewnewnewnewrandom = new Random().nextInt(3);
					if (newnewnewnewnewnewnewnewrandom == 0) {
						joptionpane = "I'm doing excellent!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (newnewnewnewnewnewnewnewrandom == 1) {
						joptionpane = "Great!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (newnewnewnewnewnewnewnewrandom == 2) {
						joptionpane = "My see pee you is in perfect order!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, "My CPU is in perfect order!");
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("joke")) {
					int newnewnewnewnewnewnewrandom = new Random().nextInt(3);
					if (newnewnewnewnewnewnewrandom == 0) {
						for (int i = 0; i < 3; i++) {
							joptionpane = "Knock Knock!";
							speak(joptionpane);
							String joke = JOptionPane.showInputDialog(joptionpane);
							while (!joke.equalsIgnoreCase("who's there") && !joke.equalsIgnoreCase("whos there") && !joke.equalsIgnoreCase("who is there")
									&& !joke.equalsIgnoreCase("who's there?") && !joke.equalsIgnoreCase("whos there?") && !joke.equalsIgnoreCase("who is there?")) {
								joptionpane = "Please say who's there!";
								speak(joptionpane);
								joke = JOptionPane.showInputDialog(joptionpane);
							}
							if (i != 2) {
								joptionpane = "Orange!";
								speak(joptionpane);
								JOptionPane.showInputDialog(joptionpane);
							}
						}
						joptionpane = "Orange you glad I didn't say orange?";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (newnewnewnewnewnewnewrandom == 1) {
						joptionpane = "Why shouldn't you trust atoms?";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
						joptionpane = "Because they make up everything!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (newnewnewnewnewnewnewrandom == 2) {
						joptionpane = "I connot think of any good jokes to say at the momment!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("Are you") && !whatIsIt.contains("how")) {
					int newnewnewnewnewnewRandom = new Random().nextInt(3);
					if (newnewnewnewnewnewRandom == 0) {
						speak("of course");
					}
					if (newnewnewnewnewnewRandom == 1) {
						speak("obviously");
					}
					if (newnewnewnewnewnewRandom == 2) {
						speak("Do I look okay?");
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("bye") || whatIsIt.contains("Bye") || whatIsIt.contains("exit") || whatIsIt.contains("Exit")) {
					Goodbye farewell = new Goodbye();
					farewell.frameDisplayer();
					qq = false;
				}
				if (whatIsIt.contains("are you") && whatIsIt.contains("who")) {
					joptionpane = "I am Jamie, your personal and quite helpful assistant.";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("random number") || whatIsIt.contains("random color") || whatIsIt.contains("random letter") || whatIsIt.contains("random word")) {
					IMPORTANT = whatIsIt;
					randomStuff();
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("timer")) {
					joptionpane = "In which unit would you like the timer to be: seconds or minutes?";
					speak(joptionpane);
					String howMuchTime = JOptionPane.showInputDialog(joptionpane);
					while (!howMuchTime.equalsIgnoreCase("seconds") && !howMuchTime.equalsIgnoreCase("minutes") && !howMuchTime.equalsIgnoreCase("hours")) {
						joptionpane = "Please answer either seconds, minutes,or hours!";
						speak(joptionpane);
						howMuchTime = JOptionPane.showInputDialog(joptionpane);
					}
					if (howMuchTime.contains("minutes")) {
						joptionpane = "How many minutes!";
						speak(joptionpane);
						String timelyTime = JOptionPane.showInputDialog(joptionpane);
						if (timelyTime.equalsIgnoreCase("1")) {
							speak(timelyTime + "minute, starting now.");
						} else {
							speak(timelyTime + "minutes, starting now.");
						}
						while (timelyTime.charAt(0) != '1' && timelyTime.charAt(0) != '2' && timelyTime.charAt(0) != '3' && timelyTime.charAt(0) != '4'
								&& timelyTime.charAt(0) != '5' && timelyTime.charAt(0) != '6' && timelyTime.charAt(0) != '7' && timelyTime.charAt(0) != '8'
								&& timelyTime.charAt(0) != '9' && timelyTime.charAt(0) != '0') {
							joptionpane = "Please put how many minutes in a plain Integer form with no letters!";
							speak(joptionpane);
							timelyTime = JOptionPane.showInputDialog(joptionpane);
						}
						int knowTheTime = Integer.parseInt(timelyTime);
						timer.timerTeller(knowTheTime * 60);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (howMuchTime.contains("seconds")) {
						joptionpane = "How many seconds!";
						speak(joptionpane);
						String timelyTime = JOptionPane.showInputDialog(joptionpane);
						if (timelyTime.equalsIgnoreCase("1")) {
							speak(timelyTime + "second, starting now.");
						} else {
							speak(timelyTime + "seconds, starting now.");
						}
						int knowTheTime = Integer.parseInt(timelyTime);
						timer.timerTeller(knowTheTime);
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (howMuchTime.contains("hours")) {
						joptionpane = "How many hours!";
						speak(joptionpane);
						String timelyTime = JOptionPane.showInputDialog(joptionpane);
						if (timelyTime.equalsIgnoreCase("1")) {
							speak(timelyTime + "hour, starting now.");
						} else {
							speak(timelyTime + "hours, starting now.");
						}
						while (timelyTime.charAt(0) != '1' && timelyTime.charAt(0) != '2' && timelyTime.charAt(0) != '3' && timelyTime.charAt(0) != '4'
								&& timelyTime.charAt(0) != '5' && timelyTime.charAt(0) != '6' && timelyTime.charAt(0) != '7' && timelyTime.charAt(0) != '8'
								&& timelyTime.charAt(0) != '9' && timelyTime.charAt(0) != '0') {
							joptionpane = "Please put how many seconds in a plain Integer form with no letters!";
							speak(joptionpane);
							timelyTime = JOptionPane.showInputDialog(joptionpane);
						}
						int knowTheTime = Integer.parseInt(timelyTime);
						timer.timerTeller(knowTheTime * 60 * 60);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("pi") && whatIsIt.contains("say")) {
					speak("I will recite pi up to 200 digits! Pi=3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196");
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("pi") && whatIsIt.contains("recite")) {
					speak("I will recite pi up to 200 digits! Pi=3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196");
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("game") || whatIsIt.contains("games")) {
					GameOperator g = new GameOperator();
					g.playGames();
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("games") && !whatIsIt.contains("game")) {
					joptionpane = "I can play 3 games! To find out what games, just type in 'play a game!'";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
				}
				if (whatIsIt.contains("annoying")) {
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("time") && !whatIsIt.contains("timer")) {
					speak(whatTime.getTime());
					JOptionPane.showMessageDialog(null, whatTime.getTime());
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("pronounce")) {
					speak("enter the word");
					String word = JOptionPane.showInputDialog("Enter the word!");
					speak(word);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.contains("math")) {
					if (!hasDoneExample) {
						speak("Your math problem cannot have more than one symbol and only two numbers with no parentheses.");
						joptionpane = "Ex. 1: 4*8.2, Ex. 2: 23.27+76, Ex. 3: 434.3-517.896, Ex. 4: 652.193/937.2568, NOTE: Do not put any equation that equals 0! Also, do not put multiple operations!";
						JOptionPane.showMessageDialog(null, joptionpane);
						hasDoneExample = true;
					}
					speak("Enter your math problem!");
					String problem = JOptionPane.showInputDialog("Math Problem:");
					if (problem.equalsIgnoreCase("example") || problem.equalsIgnoreCase("give me an example")) {
						joptionpane = "Ex. 1: 4*8.2, Ex. 2: 23.27+76, Ex. 3: 434.3-517.896, Ex. 4: 652.193/937.2568, NOTE: Do not put any equation that equals 0!";
						JOptionPane.showMessageDialog(null, joptionpane);
					} else {
						String answer = "" + p.parseFunction(problem);
						joptionpane = answer;
						if (answer.equalsIgnoreCase("0.0")) {
							joptionpane = "You put the math problem in an invalid format!";
							speak(joptionpane);
							JOptionPane.showMessageDialog(null, joptionpane);
						} else {
							speak(answer);
							JOptionPane.showMessageDialog(null, joptionpane);
						}
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
			}
			if (a.equalsIgnoreCase("no")) {
				Goodbye farewell = new Goodbye();
				farewell.frameDisplayer();
				qq = false;
			}
		}
	}

	static void randomStuff() {
		if (IMPORTANT.contains("letter")) {
			int random = new Random().nextInt(26);
			char num1 = 'a';
			char num2 = 'b';
			char num3 = 'c';
			char num4 = 'd';
			char num5 = 'e';
			char num6 = 'f';
			char num7 = 'g';
			char num8 = 'h';
			char num9 = 'i';
			char num10 = 'j';
			char num11 = 'k';
			char num12 = 'l';
			char num13 = 'm';
			char num14 = 'n';
			char num15 = 'o';
			char num16 = 'p';
			char num17 = 'q';
			char num18 = 'r';
			char num19 = 's';
			char num20 = 't';
			char num21 = 'u';
			char num22 = 'v';
			char num23 = 'w';
			char num24 = 'x';
			char num25 = 'y';
			char num26 = 'z';
			if (random == 0) {
				String qqq = "" + num1;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 1) {
				String qqq = "" + num2;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 2) {
				String qqq = "" + num3;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 3) {
				String qqq = "" + num4;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 4) {
				String qqq = "" + num5;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 5) {
				String qqq = "" + num6;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 6) {
				String qqq = "" + num7;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 7) {
				String qqq = "" + num8;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 8) {
				String qqq = "" + num9;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 9) {
				String qqq = "" + num10;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 10) {
				String qqq = "" + num11;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 11) {
				String qqq = "" + num12;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 12) {
				String qqq = "" + num13;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 13) {
				String qqq = "" + num14;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 14) {
				String qqq = "" + num15;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 15) {
				String qqq = "" + num16;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 16) {
				String qqq = "" + num17;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 17) {
				String qqq = "" + num18;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 18) {
				String qqq = "" + num19;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 19) {
				String qqq = "" + num20;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 20) {
				String qqq = "" + num21;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 21) {
				String qqq = "" + num22;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 22) {
				String qqq = "" + num23;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 23) {
				String qqq = "" + num24;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else if (random == 24) {
				String qqq = "" + num25;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			} else {
				String qqq = "" + num26;
				speak(qqq);
				JOptionPane.showMessageDialog(null, qqq);
			}
		}
		if (IMPORTANT.contains("number")) {
			int random = new Random().nextInt();
			String convertRandomToString = "" + random;
			speak(convertRandomToString);
			JOptionPane.showMessageDialog(null, convertRandomToString);
		}
		if (IMPORTANT.contains("color")) {
			int random = new Random().nextInt(9);
			String color1 = "red";
			String color2 = "blue";
			String color3 = "green";
			String color4 = "yellow";
			String color5 = "orange";
			String color6 = "purple";
			String color7 = "black";
			String color8 = "white";
			String color9 = "pink";
			String color10 = "brown";
			if (random == 0) {
				speak(color1);
				JOptionPane.showMessageDialog(null, color1);
			} else if (random == 1) {
				speak(color2);
				JOptionPane.showMessageDialog(null, color2);
			} else if (random == 2) {
				speak(color3);
				JOptionPane.showMessageDialog(null, color3);
			} else if (random == 3) {
				speak(color4);
				JOptionPane.showMessageDialog(null, color4);
			} else if (random == 4) {
				speak(color5);
				JOptionPane.showMessageDialog(null, color5);
			} else if (random == 5) {
				speak(color6);
				JOptionPane.showMessageDialog(null, color6);
			} else if (random == 6) {
				speak(color7);
				JOptionPane.showMessageDialog(null, color7);
			} else if (random == 7) {
				speak(color8);
				JOptionPane.showMessageDialog(null, color8);
			} else if (random == 8) {
				speak(color9);
				JOptionPane.showMessageDialog(null, color9);
			} else {
				speak(color10);
				JOptionPane.showMessageDialog(null, color10);
			}
		}
		if (IMPORTANT.contains("word")) {
			speak(name);
			JOptionPane.showMessageDialog(null, name);
		}
	}

	static void checkNumberOfTimes(int numberOfTimes) {
		if (numberOfTimes == 0) {
			speak("Do you require assistance or wish to participate in activities I have?");
			joptionpane = "Do you require assistance?";
		} else if (numberOfTimes == 1) {
			speak("Do you want me to do another problem?");
			joptionpane = "Do you want me to do another problem?";
		} else if (numberOfTimes == 2) {
			speak("More problems for me to calculate in my See Pee You?");
			joptionpane = "More problems for me to calculate in my CPU?";
		} else if (numberOfTimes == 3) {
			speak("Are there anymore problems waiting to be solved?");
			joptionpane = "Are there any more problems waiting to be solved?";
		} else if (numberOfTimes == 4) {
			speak("do you want me to do a problem?");
			joptionpane = "Do  you want me to do a problem?";
		} else if (numberOfTimes == 5) {
			speak("Require problems to be calculated in my see pee you?");
			joptionpane = "Require problems to be calculated in my CPU?";
		} else if (numberOfTimes == 6) {
			speak("Have any problems waiting to be solved?");
			joptionpane = "Have any problems waiting to be solved?";
		}
	}

	static void capitallizingNames(String whatUserNameIs) {
		if (whatUserNameIs.charAt(0) >= 97 && whatUserNameIs.charAt(0) <= 122) {
			System.out.println("BLAH");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}