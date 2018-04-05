import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("norway.jpg"));  
			Encoder e = new Encoder(img);
			BufferedImage bi;
			try {
				bi = e.hideString("\r\n" + 
						"The Tragedy of Hamlet, Prince of Denmark\r\n" + 
						"Shakespeare homepage | Hamlet | Entire play\r\n" + 
						"ACT I\r\n" + 
						"SCENE I. Elsinore. A platform before the castle.\r\n" + 
						"FRANCISCO at his post. Enter to him BERNARDO\r\n" + 
						"BERNARDO\r\n" + 
						"Who's there?\r\n" + 
						"FRANCISCO\r\n" + 
						"Nay, answer me: stand, and unfold yourself.\r\n" + 
						"BERNARDO\r\n" + 
						"Long live the king!\r\n" + 
						"FRANCISCO\r\n" + 
						"Bernardo?\r\n" + 
						"BERNARDO\r\n" + 
						"He.\r\n" + 
						"FRANCISCO\r\n" + 
						"You come most carefully upon your hour.\r\n" + 
						"BERNARDO\r\n" + 
						"'Tis now struck twelve; get thee to bed, Francisco.\r\n" + 
						"FRANCISCO\r\n" + 
						"For this relief much thanks: 'tis bitter cold,\r\n" + 
						"And I am sick at heart.\r\n" + 
						"BERNARDO\r\n" + 
						"Have you had quiet guard?\r\n" + 
						"FRANCISCO\r\n" + 
						"Not a mouse stirring.\r\n" + 
						"BERNARDO\r\n" + 
						"Well, good night.\r\n" + 
						"If you do meet Horatio and Marcellus,\r\n" + 
						"The rivals of my watch, bid them make haste.\r\n" + 
						"FRANCISCO\r\n" + 
						"I think I hear them. Stand, ho! Who's there?\r\n" + 
						"Enter HORATIO and MARCELLUS\r\n" + 
						"\r\n" + 
						"HORATIO\r\n" + 
						"Friends to this ground.\r\n" + 
						"MARCELLUS\r\n" + 
						"And liegemen to the Dane.\r\n" + 
						"FRANCISCO\r\n" + 
						"Give you good night.\r\n" + 
						"MARCELLUS\r\n" + 
						"O, farewell, honest soldier:\r\n" + 
						"Who hath relieved you?\r\n" + 
						"FRANCISCO\r\n" + 
						"Bernardo has my place.\r\n" + 
						"Give you good night.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"MARCELLUS\r\n" + 
						"Holla! Bernardo!\r\n" + 
						"BERNARDO\r\n" + 
						"Say,\r\n" + 
						"What, is Horatio there?\r\n" + 
						"HORATIO\r\n" + 
						"A piece of him.\r\n" + 
						"BERNARDO\r\n" + 
						"Welcome, Horatio: welcome, good Marcellus.\r\n" + 
						"MARCELLUS\r\n" + 
						"What, has this thing appear'd again to-night?\r\n" + 
						"BERNARDO\r\n" + 
						"I have seen nothing.\r\n" + 
						"MARCELLUS\r\n" + 
						"Horatio says 'tis but our fantasy,\r\n" + 
						"And will not let belief take hold of him\r\n" + 
						"Touching this dreaded sight, twice seen of us:\r\n" + 
						"Therefore I have entreated him along\r\n" + 
						"With us to watch the minutes of this night;\r\n" + 
						"That if again this apparition come,\r\n" + 
						"He may approve our eyes and speak to it.\r\n" + 
						"HORATIO\r\n" + 
						"Tush, tush, 'twill not appear.\r\n" + 
						"BERNARDO\r\n" + 
						"Sit down awhile;\r\n" + 
						"And let us once again assail your ears,\r\n" + 
						"That are so fortified against our story\r\n" + 
						"What we have two nights seen.\r\n" + 
						"HORATIO\r\n" + 
						"Well, sit we down,\r\n" + 
						"And let us hear Bernardo speak of this.\r\n" + 
						"BERNARDO\r\n" + 
						"Last night of all,\r\n" + 
						"When yond same star that's westward from the pole\r\n" + 
						"Had made his course to illume that part of heaven\r\n" + 
						"Where now it burns, Marcellus and myself,\r\n" + 
						"The bell then beating one,--\r\n" + 
						"Enter Ghost\r\n" + 
						"\r\n" + 
						"MARCELLUS\r\n" + 
						"Peace, break thee off; look, where it comes again!\r\n" + 
						"BERNARDO\r\n" + 
						"In the same figure, like the king that's dead.\r\n" + 
						"MARCELLUS\r\n" + 
						"Thou art a scholar; speak to it, Horatio.\r\n" + 
						"BERNARDO\r\n" + 
						"Looks it not like the king? mark it, Horatio.\r\n" + 
						"HORATIO\r\n" + 
						"Most like: it harrows me with fear and wonder.\r\n" + 
						"BERNARDO\r\n" + 
						"It would be spoke to.\r\n" + 
						"MARCELLUS\r\n" + 
						"Question it, Horatio.\r\n" + 
						"HORATIO\r\n" + 
						"What art thou that usurp'st this time of night,\r\n" + 
						"Together with that fair and warlike form\r\n" + 
						"In which the majesty of buried Denmark\r\n" + 
						"Did sometimes march? by heaven I charge thee, speak!\r\n" + 
						"MARCELLUS\r\n" + 
						"It is offended.\r\n" + 
						"BERNARDO\r\n" + 
						"See, it stalks away!\r\n" + 
						"HORATIO\r\n" + 
						"Stay! speak, speak! I charge thee, speak!\r\n" + 
						"Exit Ghost\r\n" + 
						"\r\n" + 
						"MARCELLUS\r\n" + 
						"'Tis gone, and will not answer.\r\n" + 
						"BERNARDO\r\n" + 
						"How now, Horatio! you tremble and look pale:\r\n" + 
						"Is not this something more than fantasy?\r\n" + 
						"What think you on't?\r\n" + 
						"HORATIO\r\n" + 
						"Before my God, I might not this believe\r\n" + 
						"Without the sensible and true avouch\r\n" + 
						"Of mine own eyes.\r\n" + 
						"MARCELLUS\r\n" + 
						"Is it not like the king?\r\n" + 
						"HORATIO\r\n" + 
						"As thou art to thyself:\r\n" + 
						"Such was the very armour he had on\r\n" + 
						"When he the ambitious Norway combated;\r\n" + 
						"So frown'd he once, when, in an angry parle,\r\n" + 
						"He smote the sledded Polacks on the ice.\r\n" + 
						"'Tis strange.\r\n" + 
						"MARCELLUS\r\n" + 
						"Thus twice before, and jump at this dead hour,\r\n" + 
						"With martial stalk hath he gone by our watch.\r\n" + 
						"HORATIO\r\n" + 
						"In what particular thought to work I know not;\r\n" + 
						"But in the gross and scope of my opinion,\r\n" + 
						"This bodes some strange eruption to our state.\r\n" + 
						"MARCELLUS\r\n" + 
						"Good now, sit down, and tell me, he that knows,\r\n" + 
						"Why this same strict and most observant watch\r\n" + 
						"So nightly toils the subject of the land,\r\n" + 
						"And why such daily cast of brazen cannon,\r\n" + 
						"And foreign mart for implements of war;\r\n" + 
						"Why such impress of shipwrights, whose sore task\r\n" + 
						"Does not divide the Sunday from the week;\r\n" + 
						"What might be toward, that this sweaty haste\r\n" + 
						"Doth make the night joint-labourer with the day:\r\n" + 
						"Who is't that can inform me?\r\n" + 
						"HORATIO\r\n" + 
						"That can I;\r\n" + 
						"At least, the whisper goes so. Our last king,\r\n" + 
						"Whose image even but now appear'd to us,\r\n" + 
						"Was, as you know, by Fortinbras of Norway,\r\n" + 
						"Thereto prick'd on by a most emulate pride,\r\n" + 
						"Dared to the combat; in which our valiant Hamlet--\r\n" + 
						"For so this side of our known world esteem'd him--\r\n" + 
						"Did slay this Fortinbras; who by a seal'd compact,\r\n" + 
						"Well ratified by law and heraldry,\r\n" + 
						"Did forfeit, with his life, all those his lands\r\n" + 
						"Which he stood seized of, to the conqueror:\r\n" + 
						"Against the which, a moiety competent\r\n" + 
						"Was gaged by our king; which had return'd\r\n" + 
						"To the inheritance of Fortinbras,\r\n" + 
						"Had he been vanquisher; as, by the same covenant,\r\n" + 
						"And carriage of the article design'd,\r\n" + 
						"His fell to Hamlet. Now, sir, young Fortinbras,\r\n" + 
						"Of unimproved mettle hot and full,\r\n" + 
						"Hath in the skirts of Norway here and there\r\n" + 
						"Shark'd up a list of lawless resolutes,\r\n" + 
						"For food and diet, to some enterprise\r\n" + 
						"That hath a stomach in't; which is no other--\r\n" + 
						"As it doth well appear unto our state--\r\n" + 
						"But to recover of us, by strong hand\r\n" + 
						"And terms compulsatory, those foresaid lands\r\n" + 
						"So by his father lost: and this, I take it,\r\n" + 
						"Is the main motive of our preparations,\r\n" + 
						"The source of this our watch and the chief head\r\n" + 
						"Of this post-haste and romage in the land.\r\n" + 
						"BERNARDO\r\n" + 
						"I think it be no other but e'en so:\r\n" + 
						"Well may it sort that this portentous figure\r\n" + 
						"Comes armed through our watch; so like the king\r\n" + 
						"That was and is the question of these wars.\r\n" + 
						"HORATIO\r\n" + 
						"A mote it is to trouble the mind's eye.\r\n" + 
						"In the most high and palmy state of Rome,\r\n" + 
						"A little ere the mightiest Julius fell,\r\n" + 
						"The graves stood tenantless and the sheeted dead\r\n" + 
						"Did squeak and gibber in the Roman streets:\r\n" + 
						"As stars with trains of fire and dews of blood,\r\n" + 
						"Disasters in the sun; and the moist star\r\n" + 
						"Upon whose influence Neptune's empire stands\r\n" + 
						"Was sick almost to doomsday with eclipse:\r\n" + 
						"And even the like precurse of fierce events,\r\n" + 
						"As harbingers preceding still the fates\r\n" + 
						"And prologue to the omen coming on,\r\n" + 
						"Have heaven and earth together demonstrated\r\n" + 
						"Unto our climatures and countrymen.--\r\n" + 
						"But soft, behold! lo, where it comes again!\r\n" + 
						"Re-enter Ghost\r\n" + 
						"\r\n" + 
						"I'll cross it, though it blast me. Stay, illusion!\r\n" + 
						"If thou hast any sound, or use of voice,\r\n" + 
						"Speak to me:\r\n" + 
						"If there be any good thing to be done,\r\n" + 
						"That may to thee do ease and grace to me,\r\n" + 
						"Speak to me:\r\n" + 
						"Cock crows\r\n" + 
						"\r\n" + 
						"If thou art privy to thy country's fate,\r\n" + 
						"Which, happily, foreknowing may avoid, O, speak!\r\n" + 
						"Or if thou hast uphoarded in thy life\r\n" + 
						"Extorted treasure in the womb of earth,\r\n" + 
						"For which, they say, you spirits oft walk in death,\r\n" + 
						"Speak of it: stay, and speak! Stop it, Marcellus.\r\n" + 
						"MARCELLUS\r\n" + 
						"Shall I strike at it with my partisan?\r\n" + 
						"HORATIO\r\n" + 
						"Do, if it will not stand.\r\n" + 
						"BERNARDO\r\n" + 
						"'Tis here!\r\n" + 
						"HORATIO\r\n" + 
						"'Tis here!\r\n" + 
						"MARCELLUS\r\n" + 
						"'Tis gone!\r\n" + 
						"Exit Ghost\r\n" + 
						"\r\n" + 
						"We do it wrong, being so majestical,\r\n" + 
						"To offer it the show of violence;\r\n" + 
						"For it is, as the air, invulnerable,\r\n" + 
						"And our vain blows malicious mockery.\r\n" + 
						"BERNARDO\r\n" + 
						"It was about to speak, when the cock crew.\r\n" + 
						"HORATIO\r\n" + 
						"And then it started like a guilty thing\r\n" + 
						"Upon a fearful summons. I have heard,\r\n" + 
						"The cock, that is the trumpet to the morn,\r\n" + 
						"Doth with his lofty and shrill-sounding throat\r\n" + 
						"Awake the god of day; and, at his warning,\r\n" + 
						"Whether in sea or fire, in earth or air,\r\n" + 
						"The extravagant and erring spirit hies\r\n" + 
						"To his confine: and of the truth herein\r\n" + 
						"This present object made probation.\r\n" + 
						"MARCELLUS\r\n" + 
						"It faded on the crowing of the cock.\r\n" + 
						"Some say that ever 'gainst that season comes\r\n" + 
						"Wherein our Saviour's birth is celebrated,\r\n" + 
						"The bird of dawning singeth all night long:\r\n" + 
						"And then, they say, no spirit dares stir abroad;\r\n" + 
						"The nights are wholesome; then no planets strike,\r\n" + 
						"No fairy takes, nor witch hath power to charm,\r\n" + 
						"So hallow'd and so gracious is the time.\r\n" + 
						"HORATIO\r\n" + 
						"So have I heard and do in part believe it.\r\n" + 
						"But, look, the morn, in russet mantle clad,\r\n" + 
						"Walks o'er the dew of yon high eastward hill:\r\n" + 
						"Break we our watch up; and by my advice,\r\n" + 
						"Let us impart what we have seen to-night\r\n" + 
						"Unto young Hamlet; for, upon my life,\r\n" + 
						"This spirit, dumb to us, will speak to him.\r\n" + 
						"Do you consent we shall acquaint him with it,\r\n" + 
						"As needful in our loves, fitting our duty?\r\n" + 
						"MARCELLUS\r\n" + 
						"Let's do't, I pray; and I this morning know\r\n" + 
						"Where we shall find him most conveniently.\r\n" + 
						"Exeunt\r\n" + 
						"\r\n" + 
						"SCENE II. A room of state in the castle.\r\n" + 
						"Enter KING CLAUDIUS, QUEEN GERTRUDE, HAMLET, POLONIUS, LAERTES, VOLTIMAND, CORNELIUS, Lords, and Attendants\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Though yet of Hamlet our dear brother's death\r\n" + 
						"The memory be green, and that it us befitted\r\n" + 
						"To bear our hearts in grief and our whole kingdom\r\n" + 
						"To be contracted in one brow of woe,\r\n" + 
						"Yet so far hath discretion fought with nature\r\n" + 
						"That we with wisest sorrow think on him,\r\n" + 
						"Together with remembrance of ourselves.\r\n" + 
						"Therefore our sometime sister, now our queen,\r\n" + 
						"The imperial jointress to this warlike state,\r\n" + 
						"Have we, as 'twere with a defeated joy,--\r\n" + 
						"With an auspicious and a dropping eye,\r\n" + 
						"With mirth in funeral and with dirge in marriage,\r\n" + 
						"In equal scale weighing delight and dole,--\r\n" + 
						"Taken to wife: nor have we herein barr'd\r\n" + 
						"Your better wisdoms, which have freely gone\r\n" + 
						"With this affair along. For all, our thanks.\r\n" + 
						"Now follows, that you know, young Fortinbras,\r\n" + 
						"Holding a weak supposal of our worth,\r\n" + 
						"Or thinking by our late dear brother's death\r\n" + 
						"Our state to be disjoint and out of frame,\r\n" + 
						"Colleagued with the dream of his advantage,\r\n" + 
						"He hath not fail'd to pester us with message,\r\n" + 
						"Importing the surrender of those lands\r\n" + 
						"Lost by his father, with all bonds of law,\r\n" + 
						"To our most valiant brother. So much for him.\r\n" + 
						"Now for ourself and for this time of meeting:\r\n" + 
						"Thus much the business is: we have here writ\r\n" + 
						"To Norway, uncle of young Fortinbras,--\r\n" + 
						"Who, impotent and bed-rid, scarcely hears\r\n" + 
						"Of this his nephew's purpose,--to suppress\r\n" + 
						"His further gait herein; in that the levies,\r\n" + 
						"The lists and full proportions, are all made\r\n" + 
						"Out of his subject: and we here dispatch\r\n" + 
						"You, good Cornelius, and you, Voltimand,\r\n" + 
						"For bearers of this greeting to old Norway;\r\n" + 
						"Giving to you no further personal power\r\n" + 
						"To business with the king, more than the scope\r\n" + 
						"Of these delated articles allow.\r\n" + 
						"Farewell, and let your haste commend your duty.\r\n" + 
						"CORNELIUS VOLTIMAND\r\n" + 
						"In that and all things will we show our duty.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"We doubt it nothing: heartily farewell.\r\n" + 
						"Exeunt VOLTIMAND and CORNELIUS\r\n" + 
						"\r\n" + 
						"And now, Laertes, what's the news with you?\r\n" + 
						"You told us of some suit; what is't, Laertes?\r\n" + 
						"You cannot speak of reason to the Dane,\r\n" + 
						"And loose your voice: what wouldst thou beg, Laertes,\r\n" + 
						"That shall not be my offer, not thy asking?\r\n" + 
						"The head is not more native to the heart,\r\n" + 
						"The hand more instrumental to the mouth,\r\n" + 
						"Than is the throne of Denmark to thy father.\r\n" + 
						"What wouldst thou have, Laertes?\r\n" + 
						"LAERTES\r\n" + 
						"My dread lord,\r\n" + 
						"Your leave and favour to return to France;\r\n" + 
						"From whence though willingly I came to Denmark,\r\n" + 
						"To show my duty in your coronation,\r\n" + 
						"Yet now, I must confess, that duty done,\r\n" + 
						"My thoughts and wishes bend again toward France\r\n" + 
						"And bow them to your gracious leave and pardon.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Have you your father's leave? What says Polonius?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"He hath, my lord, wrung from me my slow leave\r\n" + 
						"By laboursome petition, and at last\r\n" + 
						"Upon his will I seal'd my hard consent:\r\n" + 
						"I do beseech you, give him leave to go.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Take thy fair hour, Laertes; time be thine,\r\n" + 
						"And thy best graces spend it at thy will!\r\n" + 
						"But now, my cousin Hamlet, and my son,--\r\n" + 
						"HAMLET\r\n" + 
						"[Aside] A little more than kin, and less than kind.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"How is it that the clouds still hang on you?\r\n" + 
						"HAMLET\r\n" + 
						"Not so, my lord; I am too much i' the sun.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Good Hamlet, cast thy nighted colour off,\r\n" + 
						"And let thine eye look like a friend on Denmark.\r\n" + 
						"Do not for ever with thy vailed lids\r\n" + 
						"Seek for thy noble father in the dust:\r\n" + 
						"Thou know'st 'tis common; all that lives must die,\r\n" + 
						"Passing through nature to eternity.\r\n" + 
						"HAMLET\r\n" + 
						"Ay, madam, it is common.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"If it be,\r\n" + 
						"Why seems it so particular with thee?\r\n" + 
						"HAMLET\r\n" + 
						"Seems, madam! nay it is; I know not 'seems.'\r\n" + 
						"'Tis not alone my inky cloak, good mother,\r\n" + 
						"Nor customary suits of solemn black,\r\n" + 
						"Nor windy suspiration of forced breath,\r\n" + 
						"No, nor the fruitful river in the eye,\r\n" + 
						"Nor the dejected 'havior of the visage,\r\n" + 
						"Together with all forms, moods, shapes of grief,\r\n" + 
						"That can denote me truly: these indeed seem,\r\n" + 
						"For they are actions that a man might play:\r\n" + 
						"But I have that within which passeth show;\r\n" + 
						"These but the trappings and the suits of woe.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"'Tis sweet and commendable in your nature, Hamlet,\r\n" + 
						"To give these mourning duties to your father:\r\n" + 
						"But, you must know, your father lost a father;\r\n" + 
						"That father lost, lost his, and the survivor bound\r\n" + 
						"In filial obligation for some term\r\n" + 
						"To do obsequious sorrow: but to persever\r\n" + 
						"In obstinate condolement is a course\r\n" + 
						"Of impious stubbornness; 'tis unmanly grief;\r\n" + 
						"It shows a will most incorrect to heaven,\r\n" + 
						"A heart unfortified, a mind impatient,\r\n" + 
						"An understanding simple and unschool'd:\r\n" + 
						"For what we know must be and is as common\r\n" + 
						"As any the most vulgar thing to sense,\r\n" + 
						"Why should we in our peevish opposition\r\n" + 
						"Take it to heart? Fie! 'tis a fault to heaven,\r\n" + 
						"A fault against the dead, a fault to nature,\r\n" + 
						"To reason most absurd: whose common theme\r\n" + 
						"Is death of fathers, and who still hath cried,\r\n" + 
						"From the first corse till he that died to-day,\r\n" + 
						"'This must be so.' We pray you, throw to earth\r\n" + 
						"This unprevailing woe, and think of us\r\n" + 
						"As of a father: for let the world take note,\r\n" + 
						"You are the most immediate to our throne;\r\n" + 
						"And with no less nobility of love\r\n" + 
						"Than that which dearest father bears his son,\r\n" + 
						"Do I impart toward you. For your intent\r\n" + 
						"In going back to school in Wittenberg,\r\n" + 
						"It is most retrograde to our desire:\r\n" + 
						"And we beseech you, bend you to remain\r\n" + 
						"Here, in the cheer and comfort of our eye,\r\n" + 
						"Our chiefest courtier, cousin, and our son.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Let not thy mother lose her prayers, Hamlet:\r\n" + 
						"I pray thee, stay with us; go not to Wittenberg.\r\n" + 
						"HAMLET\r\n" + 
						"I shall in all my best obey you, madam.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Why, 'tis a loving and a fair reply:\r\n" + 
						"Be as ourself in Denmark. Madam, come;\r\n" + 
						"This gentle and unforced accord of Hamlet\r\n" + 
						"Sits smiling to my heart: in grace whereof,\r\n" + 
						"No jocund health that Denmark drinks to-day,\r\n" + 
						"But the great cannon to the clouds shall tell,\r\n" + 
						"And the king's rouse the heavens all bruit again,\r\n" + 
						"Re-speaking earthly thunder. Come away.\r\n" + 
						"Exeunt all but HAMLET\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"O, that this too too solid flesh would melt\r\n" + 
						"Thaw and resolve itself into a dew!\r\n" + 
						"Or that the Everlasting had not fix'd\r\n" + 
						"His canon 'gainst self-slaughter! O God! God!\r\n" + 
						"How weary, stale, flat and unprofitable,\r\n" + 
						"Seem to me all the uses of this world!\r\n" + 
						"Fie on't! ah fie! 'tis an unweeded garden,\r\n" + 
						"That grows to seed; things rank and gross in nature\r\n" + 
						"Possess it merely. That it should come to this!\r\n" + 
						"But two months dead: nay, not so much, not two:\r\n" + 
						"So excellent a king; that was, to this,\r\n" + 
						"Hyperion to a satyr; so loving to my mother\r\n" + 
						"That he might not beteem the winds of heaven\r\n" + 
						"Visit her face too roughly. Heaven and earth!\r\n" + 
						"Must I remember? why, she would hang on him,\r\n" + 
						"As if increase of appetite had grown\r\n" + 
						"By what it fed on: and yet, within a month--\r\n" + 
						"Let me not think on't--Frailty, thy name is woman!--\r\n" + 
						"A little month, or ere those shoes were old\r\n" + 
						"With which she follow'd my poor father's body,\r\n" + 
						"Like Niobe, all tears:--why she, even she--\r\n" + 
						"O, God! a beast, that wants discourse of reason,\r\n" + 
						"Would have mourn'd longer--married with my uncle,\r\n" + 
						"My father's brother, but no more like my father\r\n" + 
						"Than I to Hercules: within a month:\r\n" + 
						"Ere yet the salt of most unrighteous tears\r\n" + 
						"Had left the flushing in her galled eyes,\r\n" + 
						"She married. O, most wicked speed, to post\r\n" + 
						"With such dexterity to incestuous sheets!\r\n" + 
						"It is not nor it cannot come to good:\r\n" + 
						"But break, my heart; for I must hold my tongue.\r\n" + 
						"Enter HORATIO, MARCELLUS, and BERNARDO\r\n" + 
						"\r\n" + 
						"HORATIO\r\n" + 
						"Hail to your lordship!\r\n" + 
						"HAMLET\r\n" + 
						"I am glad to see you well:\r\n" + 
						"Horatio,--or I do forget myself.\r\n" + 
						"HORATIO\r\n" + 
						"The same, my lord, and your poor servant ever.\r\n" + 
						"HAMLET\r\n" + 
						"Sir, my good friend; I'll change that name with you:\r\n" + 
						"And what make you from Wittenberg, Horatio? Marcellus?\r\n" + 
						"MARCELLUS\r\n" + 
						"My good lord--\r\n" + 
						"HAMLET\r\n" + 
						"I am very glad to see you. Good even, sir.\r\n" + 
						"But what, in faith, make you from Wittenberg?\r\n" + 
						"HORATIO\r\n" + 
						"A truant disposition, good my lord.\r\n" + 
						"HAMLET\r\n" + 
						"I would not hear your enemy say so,\r\n" + 
						"Nor shall you do mine ear that violence,\r\n" + 
						"To make it truster of your own report\r\n" + 
						"Against yourself: I know you are no truant.\r\n" + 
						"But what is your affair in Elsinore?\r\n" + 
						"We'll teach you to drink deep ere you depart.\r\n" + 
						"HORATIO\r\n" + 
						"My lord, I came to see your father's funeral.\r\n" + 
						"HAMLET\r\n" + 
						"I pray thee, do not mock me, fellow-student;\r\n" + 
						"I think it was to see my mother's wedding.\r\n" + 
						"HORATIO\r\n" + 
						"Indeed, my lord, it follow'd hard upon.\r\n" + 
						"HAMLET\r\n" + 
						"Thrift, thrift, Horatio! the funeral baked meats\r\n" + 
						"Did coldly furnish forth the marriage tables.\r\n" + 
						"Would I had met my dearest foe in heaven\r\n" + 
						"Or ever I had seen that day, Horatio!\r\n" + 
						"My father!--methinks I see my father.\r\n" + 
						"HORATIO\r\n" + 
						"Where, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"In my mind's eye, Horatio.\r\n" + 
						"HORATIO\r\n" + 
						"I saw him once; he was a goodly king.\r\n" + 
						"HAMLET\r\n" + 
						"He was a man, take him for all in all,\r\n" + 
						"I shall not look upon his like again.\r\n" + 
						"HORATIO\r\n" + 
						"My lord, I think I saw him yesternight.\r\n" + 
						"HAMLET\r\n" + 
						"Saw? who?\r\n" + 
						"HORATIO\r\n" + 
						"My lord, the king your father.\r\n" + 
						"HAMLET\r\n" + 
						"The king my father!\r\n" + 
						"HORATIO\r\n" + 
						"Season your admiration for awhile\r\n" + 
						"With an attent ear, till I may deliver,\r\n" + 
						"Upon the witness of these gentlemen,\r\n" + 
						"This marvel to you.\r\n" + 
						"HAMLET\r\n" + 
						"For God's love, let me hear.\r\n" + 
						"HORATIO\r\n" + 
						"Two nights together had these gentlemen,\r\n" + 
						"Marcellus and Bernardo, on their watch,\r\n" + 
						"In the dead vast and middle of the night,\r\n" + 
						"Been thus encounter'd. A figure like your father,\r\n" + 
						"Armed at point exactly, cap-a-pe,\r\n" + 
						"Appears before them, and with solemn march\r\n" + 
						"Goes slow and stately by them: thrice he walk'd\r\n" + 
						"By their oppress'd and fear-surprised eyes,\r\n" + 
						"Within his truncheon's length; whilst they, distilled\r\n" + 
						"Almost to jelly with the act of fear,\r\n" + 
						"Stand dumb and speak not to him. This to me\r\n" + 
						"In dreadful secrecy impart they did;\r\n" + 
						"And I with them the third night kept the watch;\r\n" + 
						"Where, as they had deliver'd, both in time,\r\n" + 
						"Form of the thing, each word made true and good,\r\n" + 
						"The apparition comes: I knew your father;\r\n" + 
						"These hands are not more like.\r\n" + 
						"HAMLET\r\n" + 
						"But where was this?\r\n" + 
						"MARCELLUS\r\n" + 
						"My lord, upon the platform where we watch'd.\r\n" + 
						"HAMLET\r\n" + 
						"Did you not speak to it?\r\n" + 
						"HORATIO\r\n" + 
						"My lord, I did;\r\n" + 
						"But answer made it none: yet once methought\r\n" + 
						"It lifted up its head and did address\r\n" + 
						"Itself to motion, like as it would speak;\r\n" + 
						"But even then the morning cock crew loud,\r\n" + 
						"And at the sound it shrunk in haste away,\r\n" + 
						"And vanish'd from our sight.\r\n" + 
						"HAMLET\r\n" + 
						"'Tis very strange.\r\n" + 
						"HORATIO\r\n" + 
						"As I do live, my honour'd lord, 'tis true;\r\n" + 
						"And we did think it writ down in our duty\r\n" + 
						"To let you know of it.\r\n" + 
						"HAMLET\r\n" + 
						"Indeed, indeed, sirs, but this troubles me.\r\n" + 
						"Hold you the watch to-night?\r\n" + 
						"MARCELLUS BERNARDO\r\n" + 
						"We do, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Arm'd, say you?\r\n" + 
						"MARCELLUS BERNARDO\r\n" + 
						"Arm'd, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"From top to toe?\r\n" + 
						"MARCELLUS BERNARDO\r\n" + 
						"My lord, from head to foot.\r\n" + 
						"HAMLET\r\n" + 
						"Then saw you not his face?\r\n" + 
						"HORATIO\r\n" + 
						"O, yes, my lord; he wore his beaver up.\r\n" + 
						"HAMLET\r\n" + 
						"What, look'd he frowningly?\r\n" + 
						"HORATIO\r\n" + 
						"A countenance more in sorrow than in anger.\r\n" + 
						"HAMLET\r\n" + 
						"Pale or red?\r\n" + 
						"HORATIO\r\n" + 
						"Nay, very pale.\r\n" + 
						"HAMLET\r\n" + 
						"And fix'd his eyes upon you?\r\n" + 
						"HORATIO\r\n" + 
						"Most constantly.\r\n" + 
						"HAMLET\r\n" + 
						"I would I had been there.\r\n" + 
						"HORATIO\r\n" + 
						"It would have much amazed you.\r\n" + 
						"HAMLET\r\n" + 
						"Very like, very like. Stay'd it long?\r\n" + 
						"HORATIO\r\n" + 
						"While one with moderate haste might tell a hundred.\r\n" + 
						"MARCELLUS BERNARDO\r\n" + 
						"Longer, longer.\r\n" + 
						"HORATIO\r\n" + 
						"Not when I saw't.\r\n" + 
						"HAMLET\r\n" + 
						"His beard was grizzled--no?\r\n" + 
						"HORATIO\r\n" + 
						"It was, as I have seen it in his life,\r\n" + 
						"A sable silver'd.\r\n" + 
						"HAMLET\r\n" + 
						"I will watch to-night;\r\n" + 
						"Perchance 'twill walk again.\r\n" + 
						"HORATIO\r\n" + 
						"I warrant it will.\r\n" + 
						"HAMLET\r\n" + 
						"If it assume my noble father's person,\r\n" + 
						"I'll speak to it, though hell itself should gape\r\n" + 
						"And bid me hold my peace. I pray you all,\r\n" + 
						"If you have hitherto conceal'd this sight,\r\n" + 
						"Let it be tenable in your silence still;\r\n" + 
						"And whatsoever else shall hap to-night,\r\n" + 
						"Give it an understanding, but no tongue:\r\n" + 
						"I will requite your loves. So, fare you well:\r\n" + 
						"Upon the platform, 'twixt eleven and twelve,\r\n" + 
						"I'll visit you.\r\n" + 
						"All\r\n" + 
						"Our duty to your honour.\r\n" + 
						"HAMLET\r\n" + 
						"Your loves, as mine to you: farewell.\r\n" + 
						"Exeunt all but HAMLET\r\n" + 
						"\r\n" + 
						"My father's spirit in arms! all is not well;\r\n" + 
						"I doubt some foul play: would the night were come!\r\n" + 
						"Till then sit still, my soul: foul deeds will rise,\r\n" + 
						"Though all the earth o'erwhelm them, to men's eyes.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"SCENE III. A room in Polonius' house.\r\n" + 
						"Enter LAERTES and OPHELIA\r\n" + 
						"LAERTES\r\n" + 
						"My necessaries are embark'd: farewell:\r\n" + 
						"And, sister, as the winds give benefit\r\n" + 
						"And convoy is assistant, do not sleep,\r\n" + 
						"But let me hear from you.\r\n" + 
						"OPHELIA\r\n" + 
						"Do you doubt that?\r\n" + 
						"LAERTES\r\n" + 
						"For Hamlet and the trifling of his favour,\r\n" + 
						"Hold it a fashion and a toy in blood,\r\n" + 
						"A violet in the youth of primy nature,\r\n" + 
						"Forward, not permanent, sweet, not lasting,\r\n" + 
						"The perfume and suppliance of a minute; No more.\r\n" + 
						"OPHELIA\r\n" + 
						"No more but so?\r\n" + 
						"LAERTES\r\n" + 
						"Think it no more;\r\n" + 
						"For nature, crescent, does not grow alone\r\n" + 
						"In thews and bulk, but, as this temple waxes,\r\n" + 
						"The inward service of the mind and soul\r\n" + 
						"Grows wide withal. Perhaps he loves you now,\r\n" + 
						"And now no soil nor cautel doth besmirch\r\n" + 
						"The virtue of his will: but you must fear,\r\n" + 
						"His greatness weigh'd, his will is not his own;\r\n" + 
						"For he himself is subject to his birth:\r\n" + 
						"He may not, as unvalued persons do,\r\n" + 
						"Carve for himself; for on his choice depends\r\n" + 
						"The safety and health of this whole state;\r\n" + 
						"And therefore must his choice be circumscribed\r\n" + 
						"Unto the voice and yielding of that body\r\n" + 
						"Whereof he is the head. Then if he says he loves you,\r\n" + 
						"It fits your wisdom so far to believe it\r\n" + 
						"As he in his particular act and place\r\n" + 
						"May give his saying deed; which is no further\r\n" + 
						"Than the main voice of Denmark goes withal.\r\n" + 
						"Then weigh what loss your honour may sustain,\r\n" + 
						"If with too credent ear you list his songs,\r\n" + 
						"Or lose your heart, or your chaste treasure open\r\n" + 
						"To his unmaster'd importunity.\r\n" + 
						"Fear it, Ophelia, fear it, my dear sister,\r\n" + 
						"And keep you in the rear of your affection,\r\n" + 
						"Out of the shot and danger of desire.\r\n" + 
						"The chariest maid is prodigal enough,\r\n" + 
						"If she unmask her beauty to the moon:\r\n" + 
						"Virtue itself 'scapes not calumnious strokes:\r\n" + 
						"The canker galls the infants of the spring,\r\n" + 
						"Too oft before their buttons be disclosed,\r\n" + 
						"And in the morn and liquid dew of youth\r\n" + 
						"Contagious blastments are most imminent.\r\n" + 
						"Be wary then; best safety lies in fear:\r\n" + 
						"Youth to itself rebels, though none else near.\r\n" + 
						"OPHELIA\r\n" + 
						"I shall the effect of this good lesson keep,\r\n" + 
						"As watchman to my heart. But, good my brother,\r\n" + 
						"Do not, as some ungracious pastors do,\r\n" + 
						"Show me the steep and thorny way to heaven;\r\n" + 
						"Whiles, like a puff'd and reckless libertine,\r\n" + 
						"Himself the primrose path of dalliance treads,\r\n" + 
						"And recks not his own rede.\r\n" + 
						"LAERTES\r\n" + 
						"O, fear me not.\r\n" + 
						"I stay too long: but here my father comes.\r\n" + 
						"Enter POLONIUS\r\n" + 
						"\r\n" + 
						"A double blessing is a double grace,\r\n" + 
						"Occasion smiles upon a second leave.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Yet here, Laertes! aboard, aboard, for shame!\r\n" + 
						"The wind sits in the shoulder of your sail,\r\n" + 
						"And you are stay'd for. There; my blessing with thee!\r\n" + 
						"And these few precepts in thy memory\r\n" + 
						"See thou character. Give thy thoughts no tongue,\r\n" + 
						"Nor any unproportioned thought his act.\r\n" + 
						"Be thou familiar, but by no means vulgar.\r\n" + 
						"Those friends thou hast, and their adoption tried,\r\n" + 
						"Grapple them to thy soul with hoops of steel;\r\n" + 
						"But do not dull thy palm with entertainment\r\n" + 
						"Of each new-hatch'd, unfledged comrade. Beware\r\n" + 
						"Of entrance to a quarrel, but being in,\r\n" + 
						"Bear't that the opposed may beware of thee.\r\n" + 
						"Give every man thy ear, but few thy voice;\r\n" + 
						"Take each man's censure, but reserve thy judgment.\r\n" + 
						"Costly thy habit as thy purse can buy,\r\n" + 
						"But not express'd in fancy; rich, not gaudy;\r\n" + 
						"For the apparel oft proclaims the man,\r\n" + 
						"And they in France of the best rank and station\r\n" + 
						"Are of a most select and generous chief in that.\r\n" + 
						"Neither a borrower nor a lender be;\r\n" + 
						"For loan oft loses both itself and friend,\r\n" + 
						"And borrowing dulls the edge of husbandry.\r\n" + 
						"This above all: to thine ownself be true,\r\n" + 
						"And it must follow, as the night the day,\r\n" + 
						"Thou canst not then be false to any man.\r\n" + 
						"Farewell: my blessing season this in thee!\r\n" + 
						"LAERTES\r\n" + 
						"Most humbly do I take my leave, my lord.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"The time invites you; go; your servants tend.\r\n" + 
						"LAERTES\r\n" + 
						"Farewell, Ophelia; and remember well\r\n" + 
						"What I have said to you.\r\n" + 
						"OPHELIA\r\n" + 
						"'Tis in my memory lock'd,\r\n" + 
						"And you yourself shall keep the key of it.\r\n" + 
						"LAERTES\r\n" + 
						"Farewell.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"LORD POLONIUS\r\n" + 
						"What is't, Ophelia, be hath said to you?\r\n" + 
						"OPHELIA\r\n" + 
						"So please you, something touching the Lord Hamlet.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Marry, well bethought:\r\n" + 
						"'Tis told me, he hath very oft of late\r\n" + 
						"Given private time to you; and you yourself\r\n" + 
						"Have of your audience been most free and bounteous:\r\n" + 
						"If it be so, as so 'tis put on me,\r\n" + 
						"And that in way of caution, I must tell you,\r\n" + 
						"You do not understand yourself so clearly\r\n" + 
						"As it behoves my daughter and your honour.\r\n" + 
						"What is between you? give me up the truth.\r\n" + 
						"OPHELIA\r\n" + 
						"He hath, my lord, of late made many tenders\r\n" + 
						"Of his affection to me.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Affection! pooh! you speak like a green girl,\r\n" + 
						"Unsifted in such perilous circumstance.\r\n" + 
						"Do you believe his tenders, as you call them?\r\n" + 
						"OPHELIA\r\n" + 
						"I do not know, my lord, what I should think.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Marry, I'll teach you: think yourself a baby;\r\n" + 
						"That you have ta'en these tenders for true pay,\r\n" + 
						"Which are not sterling. Tender yourself more dearly;\r\n" + 
						"Or--not to crack the wind of the poor phrase,\r\n" + 
						"Running it thus--you'll tender me a fool.\r\n" + 
						"OPHELIA\r\n" + 
						"My lord, he hath importuned me with love\r\n" + 
						"In honourable fashion.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Ay, fashion you may call it; go to, go to.\r\n" + 
						"OPHELIA\r\n" + 
						"And hath given countenance to his speech, my lord,\r\n" + 
						"With almost all the holy vows of heaven.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Ay, springes to catch woodcocks. I do know,\r\n" + 
						"When the blood burns, how prodigal the soul\r\n" + 
						"Lends the tongue vows: these blazes, daughter,\r\n" + 
						"Giving more light than heat, extinct in both,\r\n" + 
						"Even in their promise, as it is a-making,\r\n" + 
						"You must not take for fire. From this time\r\n" + 
						"Be somewhat scanter of your maiden presence;\r\n" + 
						"Set your entreatments at a higher rate\r\n" + 
						"Than a command to parley. For Lord Hamlet,\r\n" + 
						"Believe so much in him, that he is young\r\n" + 
						"And with a larger tether may he walk\r\n" + 
						"Than may be given you: in few, Ophelia,\r\n" + 
						"Do not believe his vows; for they are brokers,\r\n" + 
						"Not of that dye which their investments show,\r\n" + 
						"But mere implorators of unholy suits,\r\n" + 
						"Breathing like sanctified and pious bawds,\r\n" + 
						"The better to beguile. This is for all:\r\n" + 
						"I would not, in plain terms, from this time forth,\r\n" + 
						"Have you so slander any moment leisure,\r\n" + 
						"As to give words or talk with the Lord Hamlet.\r\n" + 
						"Look to't, I charge you: come your ways.\r\n" + 
						"OPHELIA\r\n" + 
						"I shall obey, my lord.\r\n" + 
						"Exeunt\r\n" + 
						"\r\n" + 
						"SCENE IV. The platform.\r\n" + 
						"Enter HAMLET, HORATIO, and MARCELLUS\r\n" + 
						"HAMLET\r\n" + 
						"The air bites shrewdly; it is very cold.\r\n" + 
						"HORATIO\r\n" + 
						"It is a nipping and an eager air.\r\n" + 
						"HAMLET\r\n" + 
						"What hour now?\r\n" + 
						"HORATIO\r\n" + 
						"I think it lacks of twelve.\r\n" + 
						"HAMLET\r\n" + 
						"No, it is struck.\r\n" + 
						"HORATIO\r\n" + 
						"Indeed? I heard it not: then it draws near the season\r\n" + 
						"Wherein the spirit held his wont to walk.\r\n" + 
						"A flourish of trumpets, and ordnance shot off, within\r\n" + 
						"\r\n" + 
						"What does this mean, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"The king doth wake to-night and takes his rouse,\r\n" + 
						"Keeps wassail, and the swaggering up-spring reels;\r\n" + 
						"And, as he drains his draughts of Rhenish down,\r\n" + 
						"The kettle-drum and trumpet thus bray out\r\n" + 
						"The triumph of his pledge.\r\n" + 
						"HORATIO\r\n" + 
						"Is it a custom?\r\n" + 
						"HAMLET\r\n" + 
						"Ay, marry, is't:\r\n" + 
						"But to my mind, though I am native here\r\n" + 
						"And to the manner born, it is a custom\r\n" + 
						"More honour'd in the breach than the observance.\r\n" + 
						"This heavy-headed revel east and west\r\n" + 
						"Makes us traduced and tax'd of other nations:\r\n" + 
						"They clepe us drunkards, and with swinish phrase\r\n" + 
						"Soil our addition; and indeed it takes\r\n" + 
						"From our achievements, though perform'd at height,\r\n" + 
						"The pith and marrow of our attribute.\r\n" + 
						"So, oft it chances in particular men,\r\n" + 
						"That for some vicious mole of nature in them,\r\n" + 
						"As, in their birth--wherein they are not guilty,\r\n" + 
						"Since nature cannot choose his origin--\r\n" + 
						"By the o'ergrowth of some complexion,\r\n" + 
						"Oft breaking down the pales and forts of reason,\r\n" + 
						"Or by some habit that too much o'er-leavens\r\n" + 
						"The form of plausive manners, that these men,\r\n" + 
						"Carrying, I say, the stamp of one defect,\r\n" + 
						"Being nature's livery, or fortune's star,--\r\n" + 
						"Their virtues else--be they as pure as grace,\r\n" + 
						"As infinite as man may undergo--\r\n" + 
						"Shall in the general censure take corruption\r\n" + 
						"From that particular fault: the dram of eale\r\n" + 
						"Doth all the noble substance of a doubt\r\n" + 
						"To his own scandal.\r\n" + 
						"HORATIO\r\n" + 
						"Look, my lord, it comes!\r\n" + 
						"Enter Ghost\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"Angels and ministers of grace defend us!\r\n" + 
						"Be thou a spirit of health or goblin damn'd,\r\n" + 
						"Bring with thee airs from heaven or blasts from hell,\r\n" + 
						"Be thy intents wicked or charitable,\r\n" + 
						"Thou comest in such a questionable shape\r\n" + 
						"That I will speak to thee: I'll call thee Hamlet,\r\n" + 
						"King, father, royal Dane: O, answer me!\r\n" + 
						"Let me not burst in ignorance; but tell\r\n" + 
						"Why thy canonized bones, hearsed in death,\r\n" + 
						"Have burst their cerements; why the sepulchre,\r\n" + 
						"Wherein we saw thee quietly inurn'd,\r\n" + 
						"Hath oped his ponderous and marble jaws,\r\n" + 
						"To cast thee up again. What may this mean,\r\n" + 
						"That thou, dead corse, again in complete steel\r\n" + 
						"Revisit'st thus the glimpses of the moon,\r\n" + 
						"Making night hideous; and we fools of nature\r\n" + 
						"So horridly to shake our disposition\r\n" + 
						"With thoughts beyond the reaches of our souls?\r\n" + 
						"Say, why is this? wherefore? what should we do?\r\n" + 
						"Ghost beckons HAMLET\r\n" + 
						"\r\n" + 
						"HORATIO\r\n" + 
						"It beckons you to go away with it,\r\n" + 
						"As if it some impartment did desire\r\n" + 
						"To you alone.\r\n" + 
						"MARCELLUS\r\n" + 
						"Look, with what courteous action\r\n" + 
						"It waves you to a more removed ground:\r\n" + 
						"But do not go with it.\r\n" + 
						"HORATIO\r\n" + 
						"No, by no means.\r\n" + 
						"HAMLET\r\n" + 
						"It will not speak; then I will follow it.\r\n" + 
						"HORATIO\r\n" + 
						"Do not, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Why, what should be the fear?\r\n" + 
						"I do not set my life in a pin's fee;\r\n" + 
						"And for my soul, what can it do to that,\r\n" + 
						"Being a thing immortal as itself?\r\n" + 
						"It waves me forth again: I'll follow it.\r\n" + 
						"HORATIO\r\n" + 
						"What if it tempt you toward the flood, my lord,\r\n" + 
						"Or to the dreadful summit of the cliff\r\n" + 
						"That beetles o'er his base into the sea,\r\n" + 
						"And there assume some other horrible form,\r\n" + 
						"Which might deprive your sovereignty of reason\r\n" + 
						"And draw you into madness? think of it:\r\n" + 
						"The very place puts toys of desperation,\r\n" + 
						"Without more motive, into every brain\r\n" + 
						"That looks so many fathoms to the sea\r\n" + 
						"And hears it roar beneath.\r\n" + 
						"HAMLET\r\n" + 
						"It waves me still.\r\n" + 
						"Go on; I'll follow thee.\r\n" + 
						"MARCELLUS\r\n" + 
						"You shall not go, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Hold off your hands.\r\n" + 
						"HORATIO\r\n" + 
						"Be ruled; you shall not go.\r\n" + 
						"HAMLET\r\n" + 
						"My fate cries out,\r\n" + 
						"And makes each petty artery in this body\r\n" + 
						"As hardy as the Nemean lion's nerve.\r\n" + 
						"Still am I call'd. Unhand me, gentlemen.\r\n" + 
						"By heaven, I'll make a ghost of him that lets me!\r\n" + 
						"I say, away! Go on; I'll follow thee.\r\n" + 
						"Exeunt Ghost and HAMLET\r\n" + 
						"\r\n" + 
						"HORATIO\r\n" + 
						"He waxes desperate with imagination.\r\n" + 
						"MARCELLUS\r\n" + 
						"Let's follow; 'tis not fit thus to obey him.\r\n" + 
						"HORATIO\r\n" + 
						"Have after. To what issue will this come?\r\n" + 
						"MARCELLUS\r\n" + 
						"Something is rotten in the state of Denmark.\r\n" + 
						"HORATIO\r\n" + 
						"Heaven will direct it.\r\n" + 
						"MARCELLUS\r\n" + 
						"Nay, let's follow him.\r\n" + 
						"Exeunt\r\n" + 
						"\r\n" + 
						"SCENE V. Another part of the platform.\r\n" + 
						"Enter GHOST and HAMLET\r\n" + 
						"HAMLET\r\n" + 
						"Where wilt thou lead me? speak; I'll go no further.\r\n" + 
						"Ghost\r\n" + 
						"Mark me.\r\n" + 
						"HAMLET\r\n" + 
						"I will.\r\n" + 
						"Ghost\r\n" + 
						"My hour is almost come,\r\n" + 
						"When I to sulphurous and tormenting flames\r\n" + 
						"Must render up myself.\r\n" + 
						"HAMLET\r\n" + 
						"Alas, poor ghost!\r\n" + 
						"Ghost\r\n" + 
						"Pity me not, but lend thy serious hearing\r\n" + 
						"To what I shall unfold.\r\n" + 
						"HAMLET\r\n" + 
						"Speak; I am bound to hear.\r\n" + 
						"Ghost\r\n" + 
						"So art thou to revenge, when thou shalt hear.\r\n" + 
						"HAMLET\r\n" + 
						"What?\r\n" + 
						"Ghost\r\n" + 
						"I am thy father's spirit,\r\n" + 
						"Doom'd for a certain term to walk the night,\r\n" + 
						"And for the day confined to fast in fires,\r\n" + 
						"Till the foul crimes done in my days of nature\r\n" + 
						"Are burnt and purged away. But that I am forbid\r\n" + 
						"To tell the secrets of my prison-house,\r\n" + 
						"I could a tale unfold whose lightest word\r\n" + 
						"Would harrow up thy soul, freeze thy young blood,\r\n" + 
						"Make thy two eyes, like stars, start from their spheres,\r\n" + 
						"Thy knotted and combined locks to part\r\n" + 
						"And each particular hair to stand on end,\r\n" + 
						"Like quills upon the fretful porpentine:\r\n" + 
						"But this eternal blazon must not be\r\n" + 
						"To ears of flesh and blood. List, list, O, list!\r\n" + 
						"If thou didst ever thy dear father love--\r\n" + 
						"HAMLET\r\n" + 
						"O God!\r\n" + 
						"Ghost\r\n" + 
						"Revenge his foul and most unnatural murder.\r\n" + 
						"HAMLET\r\n" + 
						"Murder!\r\n" + 
						"Ghost\r\n" + 
						"Murder most foul, as in the best it is;\r\n" + 
						"But this most foul, strange and unnatural.\r\n" + 
						"HAMLET\r\n" + 
						"Haste me to know't, that I, with wings as swift\r\n" + 
						"As meditation or the thoughts of love,\r\n" + 
						"May sweep to my revenge.\r\n" + 
						"Ghost\r\n" + 
						"I find thee apt;\r\n" + 
						"And duller shouldst thou be than the fat weed\r\n" + 
						"That roots itself in ease on Lethe wharf,\r\n" + 
						"Wouldst thou not stir in this. Now, Hamlet, hear:\r\n" + 
						"'Tis given out that, sleeping in my orchard,\r\n" + 
						"A serpent stung me; so the whole ear of Denmark\r\n" + 
						"Is by a forged process of my death\r\n" + 
						"Rankly abused: but know, thou noble youth,\r\n" + 
						"The serpent that did sting thy father's life\r\n" + 
						"Now wears his crown.\r\n" + 
						"HAMLET\r\n" + 
						"O my prophetic soul! My uncle!\r\n" + 
						"Ghost\r\n" + 
						"Ay, that incestuous, that adulterate beast,\r\n" + 
						"With witchcraft of his wit, with traitorous gifts,--\r\n" + 
						"O wicked wit and gifts, that have the power\r\n" + 
						"So to seduce!--won to his shameful lust\r\n" + 
						"The will of my most seeming-virtuous queen:\r\n" + 
						"O Hamlet, what a falling-off was there!\r\n" + 
						"From me, whose love was of that dignity\r\n" + 
						"That it went hand in hand even with the vow\r\n" + 
						"I made to her in marriage, and to decline\r\n" + 
						"Upon a wretch whose natural gifts were poor\r\n" + 
						"To those of mine!\r\n" + 
						"But virtue, as it never will be moved,\r\n" + 
						"Though lewdness court it in a shape of heaven,\r\n" + 
						"So lust, though to a radiant angel link'd,\r\n" + 
						"Will sate itself in a celestial bed,\r\n" + 
						"And prey on garbage.\r\n" + 
						"But, soft! methinks I scent the morning air;\r\n" + 
						"Brief let me be. Sleeping within my orchard,\r\n" + 
						"My custom always of the afternoon,\r\n" + 
						"Upon my secure hour thy uncle stole,\r\n" + 
						"With juice of cursed hebenon in a vial,\r\n" + 
						"And in the porches of my ears did pour\r\n" + 
						"The leperous distilment; whose effect\r\n" + 
						"Holds such an enmity with blood of man\r\n" + 
						"That swift as quicksilver it courses through\r\n" + 
						"The natural gates and alleys of the body,\r\n" + 
						"And with a sudden vigour doth posset\r\n" + 
						"And curd, like eager droppings into milk,\r\n" + 
						"The thin and wholesome blood: so did it mine;\r\n" + 
						"And a most instant tetter bark'd about,\r\n" + 
						"Most lazar-like, with vile and loathsome crust,\r\n" + 
						"All my smooth body.\r\n" + 
						"Thus was I, sleeping, by a brother's hand\r\n" + 
						"Of life, of crown, of queen, at once dispatch'd:\r\n" + 
						"Cut off even in the blossoms of my sin,\r\n" + 
						"Unhousel'd, disappointed, unanel'd,\r\n" + 
						"No reckoning made, but sent to my account\r\n" + 
						"With all my imperfections on my head:\r\n" + 
						"O, horrible! O, horrible! most horrible!\r\n" + 
						"If thou hast nature in thee, bear it not;\r\n" + 
						"Let not the royal bed of Denmark be\r\n" + 
						"A couch for luxury and damned incest.\r\n" + 
						"But, howsoever thou pursuest this act,\r\n" + 
						"Taint not thy mind, nor let thy soul contrive\r\n" + 
						"Against thy mother aught: leave her to heaven\r\n" + 
						"And to those thorns that in her bosom lodge,\r\n" + 
						"To prick and sting her. Fare thee well at once!\r\n" + 
						"The glow-worm shows the matin to be near,\r\n" + 
						"And 'gins to pale his uneffectual fire:\r\n" + 
						"Adieu, adieu! Hamlet, remember me.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"O all you host of heaven! O earth! what else?\r\n" + 
						"And shall I couple hell? O, fie! Hold, hold, my heart;\r\n" + 
						"And you, my sinews, grow not instant old,\r\n" + 
						"But bear me stiffly up. Remember thee!\r\n" + 
						"Ay, thou poor ghost, while memory holds a seat\r\n" + 
						"In this distracted globe. Remember thee!\r\n" + 
						"Yea, from the table of my memory\r\n" + 
						"I'll wipe away all trivial fond records,\r\n" + 
						"All saws of books, all forms, all pressures past,\r\n" + 
						"That youth and observation copied there;\r\n" + 
						"And thy commandment all alone shall live\r\n" + 
						"Within the book and volume of my brain,\r\n" + 
						"Unmix'd with baser matter: yes, by heaven!\r\n" + 
						"O most pernicious woman!\r\n" + 
						"O villain, villain, smiling, damned villain!\r\n" + 
						"My tables,--meet it is I set it down,\r\n" + 
						"That one may smile, and smile, and be a villain;\r\n" + 
						"At least I'm sure it may be so in Denmark:\r\n" + 
						"Writing\r\n" + 
						"\r\n" + 
						"So, uncle, there you are. Now to my word;\r\n" + 
						"It is 'Adieu, adieu! remember me.'\r\n" + 
						"I have sworn 't.\r\n" + 
						"MARCELLUS HORATIO\r\n" + 
						"[Within] My lord, my lord,--\r\n" + 
						"MARCELLUS\r\n" + 
						"[Within]	Lord Hamlet,--\r\n" + 
						"HORATIO\r\n" + 
						"[Within]	Heaven secure him!\r\n" + 
						"HAMLET\r\n" + 
						"So be it!\r\n" + 
						"HORATIO\r\n" + 
						"[Within] Hillo, ho, ho, my lord!\r\n" + 
						"HAMLET\r\n" + 
						"Hillo, ho, ho, boy! come, bird, come.\r\n" + 
						"Enter HORATIO and MARCELLUS\r\n" + 
						"\r\n" + 
						"MARCELLUS\r\n" + 
						"How is't, my noble lord?\r\n" + 
						"HORATIO\r\n" + 
						"What news, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"O, wonderful!\r\n" + 
						"HORATIO\r\n" + 
						"Good my lord, tell it.\r\n" + 
						"HAMLET\r\n" + 
						"No; you'll reveal it.\r\n" + 
						"HORATIO\r\n" + 
						"Not I, my lord, by heaven.\r\n" + 
						"MARCELLUS\r\n" + 
						"Nor I, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"How say you, then; would heart of man once think it?\r\n" + 
						"But you'll be secret?\r\n" + 
						"HORATIO MARCELLUS\r\n" + 
						"Ay, by heaven, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"There's ne'er a villain dwelling in all Denmark\r\n" + 
						"But he's an arrant knave.\r\n" + 
						"HORATIO\r\n" + 
						"There needs no ghost, my lord, come from the grave\r\n" + 
						"To tell us this.\r\n" + 
						"HAMLET\r\n" + 
						"Why, right; you are i' the right;\r\n" + 
						"And so, without more circumstance at all,\r\n" + 
						"I hold it fit that we shake hands and part:\r\n" + 
						"You, as your business and desire shall point you;\r\n" + 
						"For every man has business and desire,\r\n" + 
						"Such as it is; and for mine own poor part,\r\n" + 
						"Look you, I'll go pray.\r\n" + 
						"HORATIO\r\n" + 
						"These are but wild and whirling words, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"I'm sorry they offend you, heartily;\r\n" + 
						"Yes, 'faith heartily.\r\n" + 
						"HORATIO\r\n" + 
						"There's no offence, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Yes, by Saint Patrick, but there is, Horatio,\r\n" + 
						"And much offence too. Touching this vision here,\r\n" + 
						"It is an honest ghost, that let me tell you:\r\n" + 
						"For your desire to know what is between us,\r\n" + 
						"O'ermaster 't as you may. And now, good friends,\r\n" + 
						"As you are friends, scholars and soldiers,\r\n" + 
						"Give me one poor request.\r\n" + 
						"HORATIO\r\n" + 
						"What is't, my lord? we will.\r\n" + 
						"HAMLET\r\n" + 
						"Never make known what you have seen to-night.\r\n" + 
						"HORATIO MARCELLUS\r\n" + 
						"My lord, we will not.\r\n" + 
						"HAMLET\r\n" + 
						"Nay, but swear't.\r\n" + 
						"HORATIO\r\n" + 
						"In faith,\r\n" + 
						"My lord, not I.\r\n" + 
						"MARCELLUS\r\n" + 
						"Nor I, my lord, in faith.\r\n" + 
						"HAMLET\r\n" + 
						"Upon my sword.\r\n" + 
						"MARCELLUS\r\n" + 
						"We have sworn, my lord, already.\r\n" + 
						"HAMLET\r\n" + 
						"Indeed, upon my sword, indeed.\r\n" + 
						"Ghost\r\n" + 
						"[Beneath] Swear.\r\n" + 
						"HAMLET\r\n" + 
						"Ah, ha, boy! say'st thou so? art thou there,\r\n" + 
						"truepenny?\r\n" + 
						"Come on--you hear this fellow in the cellarage--\r\n" + 
						"Consent to swear.\r\n" + 
						"HORATIO\r\n" + 
						"Propose the oath, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Never to speak of this that you have seen,\r\n" + 
						"Swear by my sword.\r\n" + 
						"Ghost\r\n" + 
						"[Beneath] Swear.\r\n" + 
						"HAMLET\r\n" + 
						"Hic et ubique? then we'll shift our ground.\r\n" + 
						"Come hither, gentlemen,\r\n" + 
						"And lay your hands again upon my sword:\r\n" + 
						"Never to speak of this that you have heard,\r\n" + 
						"Swear by my sword.\r\n" + 
						"Ghost\r\n" + 
						"[Beneath] Swear.\r\n" + 
						"HAMLET\r\n" + 
						"Well said, old mole! canst work i' the earth so fast?\r\n" + 
						"A worthy pioner! Once more remove, good friends.\r\n" + 
						"HORATIO\r\n" + 
						"O day and night, but this is wondrous strange!\r\n" + 
						"HAMLET\r\n" + 
						"And therefore as a stranger give it welcome.\r\n" + 
						"There are more things in heaven and earth, Horatio,\r\n" + 
						"Than are dreamt of in your philosophy. But come;\r\n" + 
						"Here, as before, never, so help you mercy,\r\n" + 
						"How strange or odd soe'er I bear myself,\r\n" + 
						"As I perchance hereafter shall think meet\r\n" + 
						"To put an antic disposition on,\r\n" + 
						"That you, at such times seeing me, never shall,\r\n" + 
						"With arms encumber'd thus, or this headshake,\r\n" + 
						"Or by pronouncing of some doubtful phrase,\r\n" + 
						"As 'Well, well, we know,' or 'We could, an if we would,'\r\n" + 
						"Or 'If we list to speak,' or 'There be, an if they might,'\r\n" + 
						"Or such ambiguous giving out, to note\r\n" + 
						"That you know aught of me: this not to do,\r\n" + 
						"So grace and mercy at your most need help you, Swear.\r\n" + 
						"Ghost\r\n" + 
						"[Beneath] Swear.\r\n" + 
						"HAMLET\r\n" + 
						"Rest, rest, perturbed spirit!\r\n" + 
						"They swear\r\n" + 
						"\r\n" + 
						"So, gentlemen,\r\n" + 
						"With all my love I do commend me to you:\r\n" + 
						"And what so poor a man as Hamlet is\r\n" + 
						"May do, to express his love and friending to you,\r\n" + 
						"God willing, shall not lack. Let us go in together;\r\n" + 
						"And still your fingers on your lips, I pray.\r\n" + 
						"The time is out of joint: O cursed spite,\r\n" + 
						"That ever I was born to set it right!\r\n" + 
						"Nay, come, let's go together.\r\n" + 
						"Exeunt\r\n" + 
						"\r\n" + 
						"ACT II\r\n" + 
						"SCENE I. A room in POLONIUS' house.\r\n" + 
						"Enter POLONIUS and REYNALDO\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Give him this money and these notes, Reynaldo.\r\n" + 
						"REYNALDO\r\n" + 
						"I will, my lord.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"You shall do marvellous wisely, good Reynaldo,\r\n" + 
						"Before you visit him, to make inquire\r\n" + 
						"Of his behavior.\r\n" + 
						"REYNALDO\r\n" + 
						"My lord, I did intend it.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Marry, well said; very well said. Look you, sir,\r\n" + 
						"Inquire me first what Danskers are in Paris;\r\n" + 
						"And how, and who, what means, and where they keep,\r\n" + 
						"What company, at what expense; and finding\r\n" + 
						"By this encompassment and drift of question\r\n" + 
						"That they do know my son, come you more nearer\r\n" + 
						"Than your particular demands will touch it:\r\n" + 
						"Take you, as 'twere, some distant knowledge of him;\r\n" + 
						"As thus, 'I know his father and his friends,\r\n" + 
						"And in part him: ' do you mark this, Reynaldo?\r\n" + 
						"REYNALDO\r\n" + 
						"Ay, very well, my lord.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"'And in part him; but' you may say 'not well:\r\n" + 
						"But, if't be he I mean, he's very wild;\r\n" + 
						"Addicted so and so:' and there put on him\r\n" + 
						"What forgeries you please; marry, none so rank\r\n" + 
						"As may dishonour him; take heed of that;\r\n" + 
						"But, sir, such wanton, wild and usual slips\r\n" + 
						"As are companions noted and most known\r\n" + 
						"To youth and liberty.\r\n" + 
						"REYNALDO\r\n" + 
						"As gaming, my lord.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Ay, or drinking, fencing, swearing, quarrelling,\r\n" + 
						"Drabbing: you may go so far.\r\n" + 
						"REYNALDO\r\n" + 
						"My lord, that would dishonour him.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"'Faith, no; as you may season it in the charge\r\n" + 
						"You must not put another scandal on him,\r\n" + 
						"That he is open to incontinency;\r\n" + 
						"That's not my meaning: but breathe his faults so quaintly\r\n" + 
						"That they may seem the taints of liberty,\r\n" + 
						"The flash and outbreak of a fiery mind,\r\n" + 
						"A savageness in unreclaimed blood,\r\n" + 
						"Of general assault.\r\n" + 
						"REYNALDO\r\n" + 
						"But, my good lord,--\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Wherefore should you do this?\r\n" + 
						"REYNALDO\r\n" + 
						"Ay, my lord,\r\n" + 
						"I would know that.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Marry, sir, here's my drift;\r\n" + 
						"And I believe, it is a fetch of wit:\r\n" + 
						"You laying these slight sullies on my son,\r\n" + 
						"As 'twere a thing a little soil'd i' the working, Mark you,\r\n" + 
						"Your party in converse, him you would sound,\r\n" + 
						"Having ever seen in the prenominate crimes\r\n" + 
						"The youth you breathe of guilty, be assured\r\n" + 
						"He closes with you in this consequence;\r\n" + 
						"'Good sir,' or so, or 'friend,' or 'gentleman,'\r\n" + 
						"According to the phrase or the addition\r\n" + 
						"Of man and country.\r\n" + 
						"REYNALDO\r\n" + 
						"Very good, my lord.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"And then, sir, does he this--he does--what was I\r\n" + 
						"about to say? By the mass, I was about to say\r\n" + 
						"something: where did I leave?\r\n" + 
						"REYNALDO\r\n" + 
						"At 'closes in the consequence,' at 'friend or so,'\r\n" + 
						"and 'gentleman.'\r\n" + 
						"LORD POLONIUS\r\n" + 
						"At 'closes in the consequence,' ay, marry;\r\n" + 
						"He closes thus: 'I know the gentleman;\r\n" + 
						"I saw him yesterday, or t' other day,\r\n" + 
						"Or then, or then; with such, or such; and, as you say,\r\n" + 
						"There was a' gaming; there o'ertook in's rouse;\r\n" + 
						"There falling out at tennis:' or perchance,\r\n" + 
						"'I saw him enter such a house of sale,'\r\n" + 
						"Videlicet, a brothel, or so forth.\r\n" + 
						"See you now;\r\n" + 
						"Your bait of falsehood takes this carp of truth:\r\n" + 
						"And thus do we of wisdom and of reach,\r\n" + 
						"With windlasses and with assays of bias,\r\n" + 
						"By indirections find directions out:\r\n" + 
						"So by my former lecture and advice,\r\n" + 
						"Shall you my son. You have me, have you not?\r\n" + 
						"REYNALDO\r\n" + 
						"My lord, I have.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"God be wi' you; fare you well.\r\n" + 
						"REYNALDO\r\n" + 
						"Good my lord!\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Observe his inclination in yourself.\r\n" + 
						"REYNALDO\r\n" + 
						"I shall, my lord.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"And let him ply his music.\r\n" + 
						"REYNALDO\r\n" + 
						"Well, my lord.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Farewell!\r\n" + 
						"Exit REYNALDO\r\n" + 
						"\r\n" + 
						"Enter OPHELIA\r\n" + 
						"\r\n" + 
						"How now, Ophelia! what's the matter?\r\n" + 
						"OPHELIA\r\n" + 
						"O, my lord, my lord, I have been so affrighted!\r\n" + 
						"LORD POLONIUS\r\n" + 
						"With what, i' the name of God?\r\n" + 
						"OPHELIA\r\n" + 
						"My lord, as I was sewing in my closet,\r\n" + 
						"Lord Hamlet, with his doublet all unbraced;\r\n" + 
						"No hat upon his head; his stockings foul'd,\r\n" + 
						"Ungarter'd, and down-gyved to his ancle;\r\n" + 
						"Pale as his shirt; his knees knocking each other;\r\n" + 
						"And with a look so piteous in purport\r\n" + 
						"As if he had been loosed out of hell\r\n" + 
						"To speak of horrors,--he comes before me.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Mad for thy love?\r\n" + 
						"OPHELIA\r\n" + 
						"My lord, I do not know;\r\n" + 
						"But truly, I do fear it.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"What said he?\r\n" + 
						"OPHELIA\r\n" + 
						"He took me by the wrist and held me hard;\r\n" + 
						"Then goes he to the length of all his arm;\r\n" + 
						"And, with his other hand thus o'er his brow,\r\n" + 
						"He falls to such perusal of my face\r\n" + 
						"As he would draw it. Long stay'd he so;\r\n" + 
						"At last, a little shaking of mine arm\r\n" + 
						"And thrice his head thus waving up and down,\r\n" + 
						"He raised a sigh so piteous and profound\r\n" + 
						"As it did seem to shatter all his bulk\r\n" + 
						"And end his being: that done, he lets me go:\r\n" + 
						"And, with his head over his shoulder turn'd,\r\n" + 
						"He seem'd to find his way without his eyes;\r\n" + 
						"For out o' doors he went without their helps,\r\n" + 
						"And, to the last, bended their light on me.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Come, go with me: I will go seek the king.\r\n" + 
						"This is the very ecstasy of love,\r\n" + 
						"Whose violent property fordoes itself\r\n" + 
						"And leads the will to desperate undertakings\r\n" + 
						"As oft as any passion under heaven\r\n" + 
						"That does afflict our natures. I am sorry.\r\n" + 
						"What, have you given him any hard words of late?\r\n" + 
						"OPHELIA\r\n" + 
						"No, my good lord, but, as you did command,\r\n" + 
						"I did repel his fetters and denied\r\n" + 
						"His access to me.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"That hath made him mad.\r\n" + 
						"I am sorry that with better heed and judgment\r\n" + 
						"I had not quoted him: I fear'd he did but trifle,\r\n" + 
						"And meant to wreck thee; but, beshrew my jealousy!\r\n" + 
						"By heaven, it is as proper to our age\r\n" + 
						"To cast beyond ourselves in our opinions\r\n" + 
						"As it is common for the younger sort\r\n" + 
						"To lack discretion. Come, go we to the king:\r\n" + 
						"This must be known; which, being kept close, might\r\n" + 
						"move\r\n" + 
						"More grief to hide than hate to utter love.\r\n" + 
						"Exeunt\r\n" + 
						"\r\n" + 
						"SCENE II. A room in the castle.\r\n" + 
						"Enter KING CLAUDIUS, QUEEN GERTRUDE, ROSENCRANTZ, GUILDENSTERN, and Attendants\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Welcome, dear Rosencrantz and Guildenstern!\r\n" + 
						"Moreover that we much did long to see you,\r\n" + 
						"The need we have to use you did provoke\r\n" + 
						"Our hasty sending. Something have you heard\r\n" + 
						"Of Hamlet's transformation; so call it,\r\n" + 
						"Sith nor the exterior nor the inward man\r\n" + 
						"Resembles that it was. What it should be,\r\n" + 
						"More than his father's death, that thus hath put him\r\n" + 
						"So much from the understanding of himself,\r\n" + 
						"I cannot dream of: I entreat you both,\r\n" + 
						"That, being of so young days brought up with him,\r\n" + 
						"And sith so neighbour'd to his youth and havior,\r\n" + 
						"That you vouchsafe your rest here in our court\r\n" + 
						"Some little time: so by your companies\r\n" + 
						"To draw him on to pleasures, and to gather,\r\n" + 
						"So much as from occasion you may glean,\r\n" + 
						"Whether aught, to us unknown, afflicts him thus,\r\n" + 
						"That, open'd, lies within our remedy.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Good gentlemen, he hath much talk'd of you;\r\n" + 
						"And sure I am two men there are not living\r\n" + 
						"To whom he more adheres. If it will please you\r\n" + 
						"To show us so much gentry and good will\r\n" + 
						"As to expend your time with us awhile,\r\n" + 
						"For the supply and profit of our hope,\r\n" + 
						"Your visitation shall receive such thanks\r\n" + 
						"As fits a king's remembrance.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Both your majesties\r\n" + 
						"Might, by the sovereign power you have of us,\r\n" + 
						"Put your dread pleasures more into command\r\n" + 
						"Than to entreaty.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"But we both obey,\r\n" + 
						"And here give up ourselves, in the full bent\r\n" + 
						"To lay our service freely at your feet,\r\n" + 
						"To be commanded.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Thanks, Rosencrantz and gentle Guildenstern.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Thanks, Guildenstern and gentle Rosencrantz:\r\n" + 
						"And I beseech you instantly to visit\r\n" + 
						"My too much changed son. Go, some of you,\r\n" + 
						"And bring these gentlemen where Hamlet is.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"Heavens make our presence and our practises\r\n" + 
						"Pleasant and helpful to him!\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Ay, amen!\r\n" + 
						"Exeunt ROSENCRANTZ, GUILDENSTERN, and some Attendants\r\n" + 
						"\r\n" + 
						"Enter POLONIUS\r\n" + 
						"\r\n" + 
						"LORD POLONIUS\r\n" + 
						"The ambassadors from Norway, my good lord,\r\n" + 
						"Are joyfully return'd.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Thou still hast been the father of good news.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Have I, my lord? I assure my good liege,\r\n" + 
						"I hold my duty, as I hold my soul,\r\n" + 
						"Both to my God and to my gracious king:\r\n" + 
						"And I do think, or else this brain of mine\r\n" + 
						"Hunts not the trail of policy so sure\r\n" + 
						"As it hath used to do, that I have found\r\n" + 
						"The very cause of Hamlet's lunacy.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"O, speak of that; that do I long to hear.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Give first admittance to the ambassadors;\r\n" + 
						"My news shall be the fruit to that great feast.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Thyself do grace to them, and bring them in.\r\n" + 
						"Exit POLONIUS\r\n" + 
						"\r\n" + 
						"He tells me, my dear Gertrude, he hath found\r\n" + 
						"The head and source of all your son's distemper.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"I doubt it is no other but the main;\r\n" + 
						"His father's death, and our o'erhasty marriage.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Well, we shall sift him.\r\n" + 
						"Re-enter POLONIUS, with VOLTIMAND and CORNELIUS\r\n" + 
						"\r\n" + 
						"Welcome, my good friends!\r\n" + 
						"Say, Voltimand, what from our brother Norway?\r\n" + 
						"VOLTIMAND\r\n" + 
						"Most fair return of greetings and desires.\r\n" + 
						"Upon our first, he sent out to suppress\r\n" + 
						"His nephew's levies; which to him appear'd\r\n" + 
						"To be a preparation 'gainst the Polack;\r\n" + 
						"But, better look'd into, he truly found\r\n" + 
						"It was against your highness: whereat grieved,\r\n" + 
						"That so his sickness, age and impotence\r\n" + 
						"Was falsely borne in hand, sends out arrests\r\n" + 
						"On Fortinbras; which he, in brief, obeys;\r\n" + 
						"Receives rebuke from Norway, and in fine\r\n" + 
						"Makes vow before his uncle never more\r\n" + 
						"To give the assay of arms against your majesty.\r\n" + 
						"Whereon old Norway, overcome with joy,\r\n" + 
						"Gives him three thousand crowns in annual fee,\r\n" + 
						"And his commission to employ those soldiers,\r\n" + 
						"So levied as before, against the Polack:\r\n" + 
						"With an entreaty, herein further shown,\r\n" + 
						"Giving a paper\r\n" + 
						"\r\n" + 
						"That it might please you to give quiet pass\r\n" + 
						"Through your dominions for this enterprise,\r\n" + 
						"On such regards of safety and allowance\r\n" + 
						"As therein are set down.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"It likes us well;\r\n" + 
						"And at our more consider'd time well read,\r\n" + 
						"Answer, and think upon this business.\r\n" + 
						"Meantime we thank you for your well-took labour:\r\n" + 
						"Go to your rest; at night we'll feast together:\r\n" + 
						"Most welcome home!\r\n" + 
						"Exeunt VOLTIMAND and CORNELIUS\r\n" + 
						"\r\n" + 
						"LORD POLONIUS\r\n" + 
						"This business is well ended.\r\n" + 
						"My liege, and madam, to expostulate\r\n" + 
						"What majesty should be, what duty is,\r\n" + 
						"Why day is day, night night, and time is time,\r\n" + 
						"Were nothing but to waste night, day and time.\r\n" + 
						"Therefore, since brevity is the soul of wit,\r\n" + 
						"And tediousness the limbs and outward flourishes,\r\n" + 
						"I will be brief: your noble son is mad:\r\n" + 
						"Mad call I it; for, to define true madness,\r\n" + 
						"What is't but to be nothing else but mad?\r\n" + 
						"But let that go.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"More matter, with less art.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Madam, I swear I use no art at all.\r\n" + 
						"That he is mad, 'tis true: 'tis true 'tis pity;\r\n" + 
						"And pity 'tis 'tis true: a foolish figure;\r\n" + 
						"But farewell it, for I will use no art.\r\n" + 
						"Mad let us grant him, then: and now remains\r\n" + 
						"That we find out the cause of this effect,\r\n" + 
						"Or rather say, the cause of this defect,\r\n" + 
						"For this effect defective comes by cause:\r\n" + 
						"Thus it remains, and the remainder thus. Perpend.\r\n" + 
						"I have a daughter--have while she is mine--\r\n" + 
						"Who, in her duty and obedience, mark,\r\n" + 
						"Hath given me this: now gather, and surmise.\r\n" + 
						"Reads\r\n" + 
						"\r\n" + 
						"'To the celestial and my soul's idol, the most\r\n" + 
						"beautified Ophelia,'--\r\n" + 
						"That's an ill phrase, a vile phrase; 'beautified' is\r\n" + 
						"a vile phrase: but you shall hear. Thus:\r\n" + 
						"Reads\r\n" + 
						"\r\n" + 
						"'In her excellent white bosom, these, & c.'\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Came this from Hamlet to her?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Good madam, stay awhile; I will be faithful.\r\n" + 
						"Reads\r\n" + 
						"\r\n" + 
						"'Doubt thou the stars are fire;\r\n" + 
						"Doubt that the sun doth move;\r\n" + 
						"Doubt truth to be a liar;\r\n" + 
						"But never doubt I love.\r\n" + 
						"'O dear Ophelia, I am ill at these numbers;\r\n" + 
						"I have not art to reckon my groans: but that\r\n" + 
						"I love thee best, O most best, believe it. Adieu.\r\n" + 
						"'Thine evermore most dear lady, whilst\r\n" + 
						"this machine is to him, HAMLET.'\r\n" + 
						"This, in obedience, hath my daughter shown me,\r\n" + 
						"And more above, hath his solicitings,\r\n" + 
						"As they fell out by time, by means and place,\r\n" + 
						"All given to mine ear.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"But how hath she\r\n" + 
						"Received his love?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"What do you think of me?\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"As of a man faithful and honourable.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"I would fain prove so. But what might you think,\r\n" + 
						"When I had seen this hot love on the wing--\r\n" + 
						"As I perceived it, I must tell you that,\r\n" + 
						"Before my daughter told me--what might you,\r\n" + 
						"Or my dear majesty your queen here, think,\r\n" + 
						"If I had play'd the desk or table-book,\r\n" + 
						"Or given my heart a winking, mute and dumb,\r\n" + 
						"Or look'd upon this love with idle sight;\r\n" + 
						"What might you think? No, I went round to work,\r\n" + 
						"And my young mistress thus I did bespeak:\r\n" + 
						"'Lord Hamlet is a prince, out of thy star;\r\n" + 
						"This must not be:' and then I precepts gave her,\r\n" + 
						"That she should lock herself from his resort,\r\n" + 
						"Admit no messengers, receive no tokens.\r\n" + 
						"Which done, she took the fruits of my advice;\r\n" + 
						"And he, repulsed--a short tale to make--\r\n" + 
						"Fell into a sadness, then into a fast,\r\n" + 
						"Thence to a watch, thence into a weakness,\r\n" + 
						"Thence to a lightness, and, by this declension,\r\n" + 
						"Into the madness wherein now he raves,\r\n" + 
						"And all we mourn for.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Do you think 'tis this?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"It may be, very likely.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Hath there been such a time--I'd fain know that--\r\n" + 
						"That I have positively said 'Tis so,'\r\n" + 
						"When it proved otherwise?\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Not that I know.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"[Pointing to his head and shoulder]\r\n" + 
						"Take this from this, if this be otherwise:\r\n" + 
						"If circumstances lead me, I will find\r\n" + 
						"Where truth is hid, though it were hid indeed\r\n" + 
						"Within the centre.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"How may we try it further?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"You know, sometimes he walks four hours together\r\n" + 
						"Here in the lobby.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"So he does indeed.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"At such a time I'll loose my daughter to him:\r\n" + 
						"Be you and I behind an arras then;\r\n" + 
						"Mark the encounter: if he love her not\r\n" + 
						"And be not from his reason fall'n thereon,\r\n" + 
						"Let me be no assistant for a state,\r\n" + 
						"But keep a farm and carters.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"We will try it.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"But, look, where sadly the poor wretch comes reading.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Away, I do beseech you, both away:\r\n" + 
						"I'll board him presently.\r\n" + 
						"Exeunt KING CLAUDIUS, QUEEN GERTRUDE, and Attendants\r\n" + 
						"\r\n" + 
						"Enter HAMLET, reading\r\n" + 
						"\r\n" + 
						"O, give me leave:\r\n" + 
						"How does my good Lord Hamlet?\r\n" + 
						"HAMLET\r\n" + 
						"Well, God-a-mercy.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Do you know me, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"Excellent well; you are a fishmonger.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Not I, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Then I would you were so honest a man.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Honest, my lord!\r\n" + 
						"HAMLET\r\n" + 
						"Ay, sir; to be honest, as this world goes, is to be\r\n" + 
						"one man picked out of ten thousand.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"That's very true, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"For if the sun breed maggots in a dead dog, being a\r\n" + 
						"god kissing carrion,--Have you a daughter?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"I have, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Let her not walk i' the sun: conception is a\r\n" + 
						"blessing: but not as your daughter may conceive.\r\n" + 
						"Friend, look to 't.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"[Aside] How say you by that? Still harping on my\r\n" + 
						"daughter: yet he knew me not at first; he said I\r\n" + 
						"was a fishmonger: he is far gone, far gone: and\r\n" + 
						"truly in my youth I suffered much extremity for\r\n" + 
						"love; very near this. I'll speak to him again.\r\n" + 
						"What do you read, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"Words, words, words.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"What is the matter, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"Between who?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"I mean, the matter that you read, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Slanders, sir: for the satirical rogue says here\r\n" + 
						"that old men have grey beards, that their faces are\r\n" + 
						"wrinkled, their eyes purging thick amber and\r\n" + 
						"plum-tree gum and that they have a plentiful lack of\r\n" + 
						"wit, together with most weak hams: all which, sir,\r\n" + 
						"though I most powerfully and potently believe, yet\r\n" + 
						"I hold it not honesty to have it thus set down, for\r\n" + 
						"yourself, sir, should be old as I am, if like a crab\r\n" + 
						"you could go backward.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"[Aside] Though this be madness, yet there is method\r\n" + 
						"in 't. Will you walk out of the air, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"Into my grave.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Indeed, that is out o' the air.\r\n" + 
						"Aside\r\n" + 
						"\r\n" + 
						"How pregnant sometimes his replies are! a happiness\r\n" + 
						"that often madness hits on, which reason and sanity\r\n" + 
						"could not so prosperously be delivered of. I will\r\n" + 
						"leave him, and suddenly contrive the means of\r\n" + 
						"meeting between him and my daughter.--My honourable\r\n" + 
						"lord, I will most humbly take my leave of you.\r\n" + 
						"HAMLET\r\n" + 
						"You cannot, sir, take from me any thing that I will\r\n" + 
						"more willingly part withal: except my life, except\r\n" + 
						"my life, except my life.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Fare you well, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"These tedious old fools!\r\n" + 
						"Enter ROSENCRANTZ and GUILDENSTERN\r\n" + 
						"\r\n" + 
						"LORD POLONIUS\r\n" + 
						"You go to seek the Lord Hamlet; there he is.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"[To POLONIUS] God save you, sir!\r\n" + 
						"Exit POLONIUS\r\n" + 
						"\r\n" + 
						"GUILDENSTERN\r\n" + 
						"My honoured lord!\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"My most dear lord!\r\n" + 
						"HAMLET\r\n" + 
						"My excellent good friends! How dost thou,\r\n" + 
						"Guildenstern? Ah, Rosencrantz! Good lads, how do ye both?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"As the indifferent children of the earth.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"Happy, in that we are not over-happy;\r\n" + 
						"On fortune's cap we are not the very button.\r\n" + 
						"HAMLET\r\n" + 
						"Nor the soles of her shoe?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Neither, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Then you live about her waist, or in the middle of\r\n" + 
						"her favours?\r\n" + 
						"GUILDENSTERN\r\n" + 
						"'Faith, her privates we.\r\n" + 
						"HAMLET\r\n" + 
						"In the secret parts of fortune? O, most true; she\r\n" + 
						"is a strumpet. What's the news?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"None, my lord, but that the world's grown honest.\r\n" + 
						"HAMLET\r\n" + 
						"Then is doomsday near: but your news is not true.\r\n" + 
						"Let me question more in particular: what have you,\r\n" + 
						"my good friends, deserved at the hands of fortune,\r\n" + 
						"that she sends you to prison hither?\r\n" + 
						"GUILDENSTERN\r\n" + 
						"Prison, my lord!\r\n" + 
						"HAMLET\r\n" + 
						"Denmark's a prison.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Then is the world one.\r\n" + 
						"HAMLET\r\n" + 
						"A goodly one; in which there are many confines,\r\n" + 
						"wards and dungeons, Denmark being one o' the worst.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"We think not so, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Why, then, 'tis none to you; for there is nothing\r\n" + 
						"either good or bad, but thinking makes it so: to me\r\n" + 
						"it is a prison.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Why then, your ambition makes it one; 'tis too\r\n" + 
						"narrow for your mind.\r\n" + 
						"HAMLET\r\n" + 
						"O God, I could be bounded in a nut shell and count\r\n" + 
						"myself a king of infinite space, were it not that I\r\n" + 
						"have bad dreams.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"Which dreams indeed are ambition, for the very\r\n" + 
						"substance of the ambitious is merely the shadow of a dream.\r\n" + 
						"HAMLET\r\n" + 
						"A dream itself is but a shadow.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Truly, and I hold ambition of so airy and light a\r\n" + 
						"quality that it is but a shadow's shadow.\r\n" + 
						"HAMLET\r\n" + 
						"Then are our beggars bodies, and our monarchs and\r\n" + 
						"outstretched heroes the beggars' shadows. Shall we\r\n" + 
						"to the court? for, by my fay, I cannot reason.\r\n" + 
						"ROSENCRANTZ GUILDENSTERN\r\n" + 
						"We'll wait upon you.\r\n" + 
						"HAMLET\r\n" + 
						"No such matter: I will not sort you with the rest\r\n" + 
						"of my servants, for, to speak to you like an honest\r\n" + 
						"man, I am most dreadfully attended. But, in the\r\n" + 
						"beaten way of friendship, what make you at Elsinore?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"To visit you, my lord; no other occasion.\r\n" + 
						"HAMLET\r\n" + 
						"Beggar that I am, I am even poor in thanks; but I\r\n" + 
						"thank you: and sure, dear friends, my thanks are\r\n" + 
						"too dear a halfpenny. Were you not sent for? Is it\r\n" + 
						"your own inclining? Is it a free visitation? Come,\r\n" + 
						"deal justly with me: come, come; nay, speak.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"What should we say, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"Why, any thing, but to the purpose. You were sent\r\n" + 
						"for; and there is a kind of confession in your looks\r\n" + 
						"which your modesties have not craft enough to colour:\r\n" + 
						"I know the good king and queen have sent for you.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"To what end, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"That you must teach me. But let me conjure you, by\r\n" + 
						"the rights of our fellowship, by the consonancy of\r\n" + 
						"our youth, by the obligation of our ever-preserved\r\n" + 
						"love, and by what more dear a better proposer could\r\n" + 
						"charge you withal, be even and direct with me,\r\n" + 
						"whether you were sent for, or no?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"[Aside to GUILDENSTERN] What say you?\r\n" + 
						"HAMLET\r\n" + 
						"[Aside] Nay, then, I have an eye of you.--If you\r\n" + 
						"love me, hold not off.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"My lord, we were sent for.\r\n" + 
						"HAMLET\r\n" + 
						"I will tell you why; so shall my anticipation\r\n" + 
						"prevent your discovery, and your secrecy to the king\r\n" + 
						"and queen moult no feather. I have of late--but\r\n" + 
						"wherefore I know not--lost all my mirth, forgone all\r\n" + 
						"custom of exercises; and indeed it goes so heavily\r\n" + 
						"with my disposition that this goodly frame, the\r\n" + 
						"earth, seems to me a sterile promontory, this most\r\n" + 
						"excellent canopy, the air, look you, this brave\r\n" + 
						"o'erhanging firmament, this majestical roof fretted\r\n" + 
						"with golden fire, why, it appears no other thing to\r\n" + 
						"me than a foul and pestilent congregation of vapours.\r\n" + 
						"What a piece of work is a man! how noble in reason!\r\n" + 
						"how infinite in faculty! in form and moving how\r\n" + 
						"express and admirable! in action how like an angel!\r\n" + 
						"in apprehension how like a god! the beauty of the\r\n" + 
						"world! the paragon of animals! And yet, to me,\r\n" + 
						"what is this quintessence of dust? man delights not\r\n" + 
						"me: no, nor woman neither, though by your smiling\r\n" + 
						"you seem to say so.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"My lord, there was no such stuff in my thoughts.\r\n" + 
						"HAMLET\r\n" + 
						"Why did you laugh then, when I said 'man delights not me'?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"To think, my lord, if you delight not in man, what\r\n" + 
						"lenten entertainment the players shall receive from\r\n" + 
						"you: we coted them on the way; and hither are they\r\n" + 
						"coming, to offer you service.\r\n" + 
						"HAMLET\r\n" + 
						"He that plays the king shall be welcome; his majesty\r\n" + 
						"shall have tribute of me; the adventurous knight\r\n" + 
						"shall use his foil and target; the lover shall not\r\n" + 
						"sigh gratis; the humourous man shall end his part\r\n" + 
						"in peace; the clown shall make those laugh whose\r\n" + 
						"lungs are tickled o' the sere; and the lady shall\r\n" + 
						"say her mind freely, or the blank verse shall halt\r\n" + 
						"for't. What players are they?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Even those you were wont to take delight in, the\r\n" + 
						"tragedians of the city.\r\n" + 
						"HAMLET\r\n" + 
						"How chances it they travel? their residence, both\r\n" + 
						"in reputation and profit, was better both ways.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"I think their inhibition comes by the means of the\r\n" + 
						"late innovation.\r\n" + 
						"HAMLET\r\n" + 
						"Do they hold the same estimation they did when I was\r\n" + 
						"in the city? are they so followed?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"No, indeed, are they not.\r\n" + 
						"HAMLET\r\n" + 
						"How comes it? do they grow rusty?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Nay, their endeavour keeps in the wonted pace: but\r\n" + 
						"there is, sir, an aery of children, little eyases,\r\n" + 
						"that cry out on the top of question, and are most\r\n" + 
						"tyrannically clapped for't: these are now the\r\n" + 
						"fashion, and so berattle the common stages--so they\r\n" + 
						"call them--that many wearing rapiers are afraid of\r\n" + 
						"goose-quills and dare scarce come thither.\r\n" + 
						"HAMLET\r\n" + 
						"What, are they children? who maintains 'em? how are\r\n" + 
						"they escoted? Will they pursue the quality no\r\n" + 
						"longer than they can sing? will they not say\r\n" + 
						"afterwards, if they should grow themselves to common\r\n" + 
						"players--as it is most like, if their means are no\r\n" + 
						"better--their writers do them wrong, to make them\r\n" + 
						"exclaim against their own succession?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"'Faith, there has been much to do on both sides; and\r\n" + 
						"the nation holds it no sin to tarre them to\r\n" + 
						"controversy: there was, for a while, no money bid\r\n" + 
						"for argument, unless the poet and the player went to\r\n" + 
						"cuffs in the question.\r\n" + 
						"HAMLET\r\n" + 
						"Is't possible?\r\n" + 
						"GUILDENSTERN\r\n" + 
						"O, there has been much throwing about of brains.\r\n" + 
						"HAMLET\r\n" + 
						"Do the boys carry it away?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Ay, that they do, my lord; Hercules and his load too.\r\n" + 
						"HAMLET\r\n" + 
						"It is not very strange; for mine uncle is king of\r\n" + 
						"Denmark, and those that would make mows at him while\r\n" + 
						"my father lived, give twenty, forty, fifty, an\r\n" + 
						"hundred ducats a-piece for his picture in little.\r\n" + 
						"'Sblood, there is something in this more than\r\n" + 
						"natural, if philosophy could find it out.\r\n" + 
						"Flourish of trumpets within\r\n" + 
						"\r\n" + 
						"GUILDENSTERN\r\n" + 
						"There are the players.\r\n" + 
						"HAMLET\r\n" + 
						"Gentlemen, you are welcome to Elsinore. Your hands,\r\n" + 
						"come then: the appurtenance of welcome is fashion\r\n" + 
						"and ceremony: let me comply with you in this garb,\r\n" + 
						"lest my extent to the players, which, I tell you,\r\n" + 
						"must show fairly outward, should more appear like\r\n" + 
						"entertainment than yours. You are welcome: but my\r\n" + 
						"uncle-father and aunt-mother are deceived.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"In what, my dear lord?\r\n" + 
						"HAMLET\r\n" + 
						"I am but mad north-north-west: when the wind is\r\n" + 
						"southerly I know a hawk from a handsaw.\r\n" + 
						"Enter POLONIUS\r\n" + 
						"\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Well be with you, gentlemen!\r\n" + 
						"HAMLET\r\n" + 
						"Hark you, Guildenstern; and you too: at each ear a\r\n" + 
						"hearer: that great baby you see there is not yet\r\n" + 
						"out of his swaddling-clouts.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Happily he's the second time come to them; for they\r\n" + 
						"say an old man is twice a child.\r\n" + 
						"HAMLET\r\n" + 
						"I will prophesy he comes to tell me of the players;\r\n" + 
						"mark it. You say right, sir: o' Monday morning;\r\n" + 
						"'twas so indeed.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"My lord, I have news to tell you.\r\n" + 
						"HAMLET\r\n" + 
						"My lord, I have news to tell you.\r\n" + 
						"When Roscius was an actor in Rome,--\r\n" + 
						"LORD POLONIUS\r\n" + 
						"The actors are come hither, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Buz, buz!\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Upon mine honour,--\r\n" + 
						"HAMLET\r\n" + 
						"Then came each actor on his ass,--\r\n" + 
						"LORD POLONIUS\r\n" + 
						"The best actors in the world, either for tragedy,\r\n" + 
						"comedy, history, pastoral, pastoral-comical,\r\n" + 
						"historical-pastoral, tragical-historical, tragical-\r\n" + 
						"comical-historical-pastoral, scene individable, or\r\n" + 
						"poem unlimited: Seneca cannot be too heavy, nor\r\n" + 
						"Plautus too light. For the law of writ and the\r\n" + 
						"liberty, these are the only men.\r\n" + 
						"HAMLET\r\n" + 
						"O Jephthah, judge of Israel, what a treasure hadst thou!\r\n" + 
						"LORD POLONIUS\r\n" + 
						"What a treasure had he, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"Why,\r\n" + 
						"'One fair daughter and no more,\r\n" + 
						"The which he loved passing well.'\r\n" + 
						"LORD POLONIUS\r\n" + 
						"[Aside] Still on my daughter.\r\n" + 
						"HAMLET\r\n" + 
						"Am I not i' the right, old Jephthah?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"If you call me Jephthah, my lord, I have a daughter\r\n" + 
						"that I love passing well.\r\n" + 
						"HAMLET\r\n" + 
						"Nay, that follows not.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"What follows, then, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"Why,\r\n" + 
						"'As by lot, God wot,'\r\n" + 
						"and then, you know,\r\n" + 
						"'It came to pass, as most like it was,'--\r\n" + 
						"the first row of the pious chanson will show you\r\n" + 
						"more; for look, where my abridgement comes.\r\n" + 
						"Enter four or five Players\r\n" + 
						"\r\n" + 
						"You are welcome, masters; welcome, all. I am glad\r\n" + 
						"to see thee well. Welcome, good friends. O, my old\r\n" + 
						"friend! thy face is valenced since I saw thee last:\r\n" + 
						"comest thou to beard me in Denmark? What, my young\r\n" + 
						"lady and mistress! By'r lady, your ladyship is\r\n" + 
						"nearer to heaven than when I saw you last, by the\r\n" + 
						"altitude of a chopine. Pray God, your voice, like\r\n" + 
						"apiece of uncurrent gold, be not cracked within the\r\n" + 
						"ring. Masters, you are all welcome. We'll e'en\r\n" + 
						"to't like French falconers, fly at any thing we see:\r\n" + 
						"we'll have a speech straight: come, give us a taste\r\n" + 
						"of your quality; come, a passionate speech.\r\n" + 
						"First Player\r\n" + 
						"What speech, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"I heard thee speak me a speech once, but it was\r\n" + 
						"never acted; or, if it was, not above once; for the\r\n" + 
						"play, I remember, pleased not the million; 'twas\r\n" + 
						"caviare to the general: but it was--as I received\r\n" + 
						"it, and others, whose judgments in such matters\r\n" + 
						"cried in the top of mine--an excellent play, well\r\n" + 
						"digested in the scenes, set down with as much\r\n" + 
						"modesty as cunning. I remember, one said there\r\n" + 
						"were no sallets in the lines to make the matter\r\n" + 
						"savoury, nor no matter in the phrase that might\r\n" + 
						"indict the author of affectation; but called it an\r\n" + 
						"honest method, as wholesome as sweet, and by very\r\n" + 
						"much more handsome than fine. One speech in it I\r\n" + 
						"chiefly loved: 'twas Aeneas' tale to Dido; and\r\n" + 
						"thereabout of it especially, where he speaks of\r\n" + 
						"Priam's slaughter: if it live in your memory, begin\r\n" + 
						"at this line: let me see, let me see--\r\n" + 
						"'The rugged Pyrrhus, like the Hyrcanian beast,'--\r\n" + 
						"it is not so:--it begins with Pyrrhus:--\r\n" + 
						"'The rugged Pyrrhus, he whose sable arms,\r\n" + 
						"Black as his purpose, did the night resemble\r\n" + 
						"When he lay couched in the ominous horse,\r\n" + 
						"Hath now this dread and black complexion smear'd\r\n" + 
						"With heraldry more dismal; head to foot\r\n" + 
						"Now is he total gules; horridly trick'd\r\n" + 
						"With blood of fathers, mothers, daughters, sons,\r\n" + 
						"Baked and impasted with the parching streets,\r\n" + 
						"That lend a tyrannous and damned light\r\n" + 
						"To their lord's murder: roasted in wrath and fire,\r\n" + 
						"And thus o'er-sized with coagulate gore,\r\n" + 
						"With eyes like carbuncles, the hellish Pyrrhus\r\n" + 
						"Old grandsire Priam seeks.'\r\n" + 
						"So, proceed you.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"'Fore God, my lord, well spoken, with good accent and\r\n" + 
						"good discretion.\r\n" + 
						"First Player\r\n" + 
						"'Anon he finds him\r\n" + 
						"Striking too short at Greeks; his antique sword,\r\n" + 
						"Rebellious to his arm, lies where it falls,\r\n" + 
						"Repugnant to command: unequal match'd,\r\n" + 
						"Pyrrhus at Priam drives; in rage strikes wide;\r\n" + 
						"But with the whiff and wind of his fell sword\r\n" + 
						"The unnerved father falls. Then senseless Ilium,\r\n" + 
						"Seeming to feel this blow, with flaming top\r\n" + 
						"Stoops to his base, and with a hideous crash\r\n" + 
						"Takes prisoner Pyrrhus' ear: for, lo! his sword,\r\n" + 
						"Which was declining on the milky head\r\n" + 
						"Of reverend Priam, seem'd i' the air to stick:\r\n" + 
						"So, as a painted tyrant, Pyrrhus stood,\r\n" + 
						"And like a neutral to his will and matter,\r\n" + 
						"Did nothing.\r\n" + 
						"But, as we often see, against some storm,\r\n" + 
						"A silence in the heavens, the rack stand still,\r\n" + 
						"The bold winds speechless and the orb below\r\n" + 
						"As hush as death, anon the dreadful thunder\r\n" + 
						"Doth rend the region, so, after Pyrrhus' pause,\r\n" + 
						"Aroused vengeance sets him new a-work;\r\n" + 
						"And never did the Cyclops' hammers fall\r\n" + 
						"On Mars's armour forged for proof eterne\r\n" + 
						"With less remorse than Pyrrhus' bleeding sword\r\n" + 
						"Now falls on Priam.\r\n" + 
						"Out, out, thou strumpet, Fortune! All you gods,\r\n" + 
						"In general synod 'take away her power;\r\n" + 
						"Break all the spokes and fellies from her wheel,\r\n" + 
						"And bowl the round nave down the hill of heaven,\r\n" + 
						"As low as to the fiends!'\r\n" + 
						"LORD POLONIUS\r\n" + 
						"This is too long.\r\n" + 
						"HAMLET\r\n" + 
						"It shall to the barber's, with your beard. Prithee,\r\n" + 
						"say on: he's for a jig or a tale of bawdry, or he\r\n" + 
						"sleeps: say on: come to Hecuba.\r\n" + 
						"First Player\r\n" + 
						"'But who, O, who had seen the mobled queen--'\r\n" + 
						"HAMLET\r\n" + 
						"'The mobled queen?'\r\n" + 
						"LORD POLONIUS\r\n" + 
						"That's good; 'mobled queen' is good.\r\n" + 
						"First Player\r\n" + 
						"'Run barefoot up and down, threatening the flames\r\n" + 
						"With bisson rheum; a clout upon that head\r\n" + 
						"Where late the diadem stood, and for a robe,\r\n" + 
						"About her lank and all o'er-teemed loins,\r\n" + 
						"A blanket, in the alarm of fear caught up;\r\n" + 
						"Who this had seen, with tongue in venom steep'd,\r\n" + 
						"'Gainst Fortune's state would treason have\r\n" + 
						"pronounced:\r\n" + 
						"But if the gods themselves did see her then\r\n" + 
						"When she saw Pyrrhus make malicious sport\r\n" + 
						"In mincing with his sword her husband's limbs,\r\n" + 
						"The instant burst of clamour that she made,\r\n" + 
						"Unless things mortal move them not at all,\r\n" + 
						"Would have made milch the burning eyes of heaven,\r\n" + 
						"And passion in the gods.'\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Look, whether he has not turned his colour and has\r\n" + 
						"tears in's eyes. Pray you, no more.\r\n" + 
						"HAMLET\r\n" + 
						"'Tis well: I'll have thee speak out the rest soon.\r\n" + 
						"Good my lord, will you see the players well\r\n" + 
						"bestowed? Do you hear, let them be well used; for\r\n" + 
						"they are the abstract and brief chronicles of the\r\n" + 
						"time: after your death you were better have a bad\r\n" + 
						"epitaph than their ill report while you live.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"My lord, I will use them according to their desert.\r\n" + 
						"HAMLET\r\n" + 
						"God's bodykins, man, much better: use every man\r\n" + 
						"after his desert, and who should 'scape whipping?\r\n" + 
						"Use them after your own honour and dignity: the less\r\n" + 
						"they deserve, the more merit is in your bounty.\r\n" + 
						"Take them in.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Come, sirs.\r\n" + 
						"HAMLET\r\n" + 
						"Follow him, friends: we'll hear a play to-morrow.\r\n" + 
						"Exit POLONIUS with all the Players but the First\r\n" + 
						"\r\n" + 
						"Dost thou hear me, old friend; can you play the\r\n" + 
						"Murder of Gonzago?\r\n" + 
						"First Player\r\n" + 
						"Ay, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"We'll ha't to-morrow night. You could, for a need,\r\n" + 
						"study a speech of some dozen or sixteen lines, which\r\n" + 
						"I would set down and insert in't, could you not?\r\n" + 
						"First Player\r\n" + 
						"Ay, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Very well. Follow that lord; and look you mock him\r\n" + 
						"not.\r\n" + 
						"Exit First Player\r\n" + 
						"\r\n" + 
						"My good friends, I'll leave you till night: you are\r\n" + 
						"welcome to Elsinore.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Good my lord!\r\n" + 
						"HAMLET\r\n" + 
						"Ay, so, God be wi' ye;\r\n" + 
						"Exeunt ROSENCRANTZ and GUILDENSTERN\r\n" + 
						"\r\n" + 
						"Now I am alone.\r\n" + 
						"O, what a rogue and peasant slave am I!\r\n" + 
						"Is it not monstrous that this player here,\r\n" + 
						"But in a fiction, in a dream of passion,\r\n" + 
						"Could force his soul so to his own conceit\r\n" + 
						"That from her working all his visage wann'd,\r\n" + 
						"Tears in his eyes, distraction in's aspect,\r\n" + 
						"A broken voice, and his whole function suiting\r\n" + 
						"With forms to his conceit? and all for nothing!\r\n" + 
						"For Hecuba!\r\n" + 
						"What's Hecuba to him, or he to Hecuba,\r\n" + 
						"That he should weep for her? What would he do,\r\n" + 
						"Had he the motive and the cue for passion\r\n" + 
						"That I have? He would drown the stage with tears\r\n" + 
						"And cleave the general ear with horrid speech,\r\n" + 
						"Make mad the guilty and appal the free,\r\n" + 
						"Confound the ignorant, and amaze indeed\r\n" + 
						"The very faculties of eyes and ears. Yet I,\r\n" + 
						"A dull and muddy-mettled rascal, peak,\r\n" + 
						"Like John-a-dreams, unpregnant of my cause,\r\n" + 
						"And can say nothing; no, not for a king,\r\n" + 
						"Upon whose property and most dear life\r\n" + 
						"A damn'd defeat was made. Am I a coward?\r\n" + 
						"Who calls me villain? breaks my pate across?\r\n" + 
						"Plucks off my beard, and blows it in my face?\r\n" + 
						"Tweaks me by the nose? gives me the lie i' the throat,\r\n" + 
						"As deep as to the lungs? who does me this?\r\n" + 
						"Ha!\r\n" + 
						"'Swounds, I should take it: for it cannot be\r\n" + 
						"But I am pigeon-liver'd and lack gall\r\n" + 
						"To make oppression bitter, or ere this\r\n" + 
						"I should have fatted all the region kites\r\n" + 
						"With this slave's offal: bloody, bawdy villain!\r\n" + 
						"Remorseless, treacherous, lecherous, kindless villain!\r\n" + 
						"O, vengeance!\r\n" + 
						"Why, what an ass am I! This is most brave,\r\n" + 
						"That I, the son of a dear father murder'd,\r\n" + 
						"Prompted to my revenge by heaven and hell,\r\n" + 
						"Must, like a whore, unpack my heart with words,\r\n" + 
						"And fall a-cursing, like a very drab,\r\n" + 
						"A scullion!\r\n" + 
						"Fie upon't! foh! About, my brain! I have heard\r\n" + 
						"That guilty creatures sitting at a play\r\n" + 
						"Have by the very cunning of the scene\r\n" + 
						"Been struck so to the soul that presently\r\n" + 
						"They have proclaim'd their malefactions;\r\n" + 
						"For murder, though it have no tongue, will speak\r\n" + 
						"With most miraculous organ. I'll have these players\r\n" + 
						"Play something like the murder of my father\r\n" + 
						"Before mine uncle: I'll observe his looks;\r\n" + 
						"I'll tent him to the quick: if he but blench,\r\n" + 
						"I know my course. The spirit that I have seen\r\n" + 
						"May be the devil: and the devil hath power\r\n" + 
						"To assume a pleasing shape; yea, and perhaps\r\n" + 
						"Out of my weakness and my melancholy,\r\n" + 
						"As he is very potent with such spirits,\r\n" + 
						"Abuses me to damn me: I'll have grounds\r\n" + 
						"More relative than this: the play 's the thing\r\n" + 
						"Wherein I'll catch the conscience of the king.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"ACT III\r\n" + 
						"SCENE I. A room in the castle.\r\n" + 
						"Enter KING CLAUDIUS, QUEEN GERTRUDE, POLONIUS, OPHELIA, ROSENCRANTZ, and GUILDENSTERN\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"And can you, by no drift of circumstance,\r\n" + 
						"Get from him why he puts on this confusion,\r\n" + 
						"Grating so harshly all his days of quiet\r\n" + 
						"With turbulent and dangerous lunacy?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"He does confess he feels himself distracted;\r\n" + 
						"But from what cause he will by no means speak.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"Nor do we find him forward to be sounded,\r\n" + 
						"But, with a crafty madness, keeps aloof,\r\n" + 
						"When we would bring him on to some confession\r\n" + 
						"Of his true state.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Did he receive you well?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Most like a gentleman.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"But with much forcing of his disposition.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Niggard of question; but, of our demands,\r\n" + 
						"Most free in his reply.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Did you assay him?\r\n" + 
						"To any pastime?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Madam, it so fell out, that certain players\r\n" + 
						"We o'er-raught on the way: of these we told him;\r\n" + 
						"And there did seem in him a kind of joy\r\n" + 
						"To hear of it: they are about the court,\r\n" + 
						"And, as I think, they have already order\r\n" + 
						"This night to play before him.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"'Tis most true:\r\n" + 
						"And he beseech'd me to entreat your majesties\r\n" + 
						"To hear and see the matter.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"With all my heart; and it doth much content me\r\n" + 
						"To hear him so inclined.\r\n" + 
						"Good gentlemen, give him a further edge,\r\n" + 
						"And drive his purpose on to these delights.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"We shall, my lord.\r\n" + 
						"Exeunt ROSENCRANTZ and GUILDENSTERN\r\n" + 
						"\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Sweet Gertrude, leave us too;\r\n" + 
						"For we have closely sent for Hamlet hither,\r\n" + 
						"That he, as 'twere by accident, may here\r\n" + 
						"Affront Ophelia:\r\n" + 
						"Her father and myself, lawful espials,\r\n" + 
						"Will so bestow ourselves that, seeing, unseen,\r\n" + 
						"We may of their encounter frankly judge,\r\n" + 
						"And gather by him, as he is behaved,\r\n" + 
						"If 't be the affliction of his love or no\r\n" + 
						"That thus he suffers for.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"I shall obey you.\r\n" + 
						"And for your part, Ophelia, I do wish\r\n" + 
						"That your good beauties be the happy cause\r\n" + 
						"Of Hamlet's wildness: so shall I hope your virtues\r\n" + 
						"Will bring him to his wonted way again,\r\n" + 
						"To both your honours.\r\n" + 
						"OPHELIA\r\n" + 
						"Madam, I wish it may.\r\n" + 
						"Exit QUEEN GERTRUDE\r\n" + 
						"\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Ophelia, walk you here. Gracious, so please you,\r\n" + 
						"We will bestow ourselves.\r\n" + 
						"To OPHELIA\r\n" + 
						"\r\n" + 
						"Read on this book;\r\n" + 
						"That show of such an exercise may colour\r\n" + 
						"Your loneliness. We are oft to blame in this,--\r\n" + 
						"'Tis too much proved--that with devotion's visage\r\n" + 
						"And pious action we do sugar o'er\r\n" + 
						"The devil himself.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"[Aside] O, 'tis too true!\r\n" + 
						"How smart a lash that speech doth give my conscience!\r\n" + 
						"The harlot's cheek, beautied with plastering art,\r\n" + 
						"Is not more ugly to the thing that helps it\r\n" + 
						"Than is my deed to my most painted word:\r\n" + 
						"O heavy burthen!\r\n" + 
						"LORD POLONIUS\r\n" + 
						"I hear him coming: let's withdraw, my lord.\r\n" + 
						"Exeunt KING CLAUDIUS and POLONIUS\r\n" + 
						"\r\n" + 
						"Enter HAMLET\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"To be, or not to be: that is the question:\r\n" + 
						"Whether 'tis nobler in the mind to suffer\r\n" + 
						"The slings and arrows of outrageous fortune,\r\n" + 
						"Or to take arms against a sea of troubles,\r\n" + 
						"And by opposing end them? To die: to sleep;\r\n" + 
						"No more; and by a sleep to say we end\r\n" + 
						"The heart-ache and the thousand natural shocks\r\n" + 
						"That flesh is heir to, 'tis a consummation\r\n" + 
						"Devoutly to be wish'd. To die, to sleep;\r\n" + 
						"To sleep: perchance to dream: ay, there's the rub;\r\n" + 
						"For in that sleep of death what dreams may come\r\n" + 
						"When we have shuffled off this mortal coil,\r\n" + 
						"Must give us pause: there's the respect\r\n" + 
						"That makes calamity of so long life;\r\n" + 
						"For who would bear the whips and scorns of time,\r\n" + 
						"The oppressor's wrong, the proud man's contumely,\r\n" + 
						"The pangs of despised love, the law's delay,\r\n" + 
						"The insolence of office and the spurns\r\n" + 
						"That patient merit of the unworthy takes,\r\n" + 
						"When he himself might his quietus make\r\n" + 
						"With a bare bodkin? who would fardels bear,\r\n" + 
						"To grunt and sweat under a weary life,\r\n" + 
						"But that the dread of something after death,\r\n" + 
						"The undiscover'd country from whose bourn\r\n" + 
						"No traveller returns, puzzles the will\r\n" + 
						"And makes us rather bear those ills we have\r\n" + 
						"Than fly to others that we know not of?\r\n" + 
						"Thus conscience does make cowards of us all;\r\n" + 
						"And thus the native hue of resolution\r\n" + 
						"Is sicklied o'er with the pale cast of thought,\r\n" + 
						"And enterprises of great pith and moment\r\n" + 
						"With this regard their currents turn awry,\r\n" + 
						"And lose the name of action.--Soft you now!\r\n" + 
						"The fair Ophelia! Nymph, in thy orisons\r\n" + 
						"Be all my sins remember'd.\r\n" + 
						"OPHELIA\r\n" + 
						"Good my lord,\r\n" + 
						"How does your honour for this many a day?\r\n" + 
						"HAMLET\r\n" + 
						"I humbly thank you; well, well, well.\r\n" + 
						"OPHELIA\r\n" + 
						"My lord, I have remembrances of yours,\r\n" + 
						"That I have longed long to re-deliver;\r\n" + 
						"I pray you, now receive them.\r\n" + 
						"HAMLET\r\n" + 
						"No, not I;\r\n" + 
						"I never gave you aught.\r\n" + 
						"OPHELIA\r\n" + 
						"My honour'd lord, you know right well you did;\r\n" + 
						"And, with them, words of so sweet breath composed\r\n" + 
						"As made the things more rich: their perfume lost,\r\n" + 
						"Take these again; for to the noble mind\r\n" + 
						"Rich gifts wax poor when givers prove unkind.\r\n" + 
						"There, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Ha, ha! are you honest?\r\n" + 
						"OPHELIA\r\n" + 
						"My lord?\r\n" + 
						"HAMLET\r\n" + 
						"Are you fair?\r\n" + 
						"OPHELIA\r\n" + 
						"What means your lordship?\r\n" + 
						"HAMLET\r\n" + 
						"That if you be honest and fair, your honesty should\r\n" + 
						"admit no discourse to your beauty.\r\n" + 
						"OPHELIA\r\n" + 
						"Could beauty, my lord, have better commerce than\r\n" + 
						"with honesty?\r\n" + 
						"HAMLET\r\n" + 
						"Ay, truly; for the power of beauty will sooner\r\n" + 
						"transform honesty from what it is to a bawd than the\r\n" + 
						"force of honesty can translate beauty into his\r\n" + 
						"likeness: this was sometime a paradox, but now the\r\n" + 
						"time gives it proof. I did love you once.\r\n" + 
						"OPHELIA\r\n" + 
						"Indeed, my lord, you made me believe so.\r\n" + 
						"HAMLET\r\n" + 
						"You should not have believed me; for virtue cannot\r\n" + 
						"so inoculate our old stock but we shall relish of\r\n" + 
						"it: I loved you not.\r\n" + 
						"OPHELIA\r\n" + 
						"I was the more deceived.\r\n" + 
						"HAMLET\r\n" + 
						"Get thee to a nunnery: why wouldst thou be a\r\n" + 
						"breeder of sinners? I am myself indifferent honest;\r\n" + 
						"but yet I could accuse me of such things that it\r\n" + 
						"were better my mother had not borne me: I am very\r\n" + 
						"proud, revengeful, ambitious, with more offences at\r\n" + 
						"my beck than I have thoughts to put them in,\r\n" + 
						"imagination to give them shape, or time to act them\r\n" + 
						"in. What should such fellows as I do crawling\r\n" + 
						"between earth and heaven? We are arrant knaves,\r\n" + 
						"all; believe none of us. Go thy ways to a nunnery.\r\n" + 
						"Where's your father?\r\n" + 
						"OPHELIA\r\n" + 
						"At home, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Let the doors be shut upon him, that he may play the\r\n" + 
						"fool no where but in's own house. Farewell.\r\n" + 
						"OPHELIA\r\n" + 
						"O, help him, you sweet heavens!\r\n" + 
						"HAMLET\r\n" + 
						"If thou dost marry, I'll give thee this plague for\r\n" + 
						"thy dowry: be thou as chaste as ice, as pure as\r\n" + 
						"snow, thou shalt not escape calumny. Get thee to a\r\n" + 
						"nunnery, go: farewell. Or, if thou wilt needs\r\n" + 
						"marry, marry a fool; for wise men know well enough\r\n" + 
						"what monsters you make of them. To a nunnery, go,\r\n" + 
						"and quickly too. Farewell.\r\n" + 
						"OPHELIA\r\n" + 
						"O heavenly powers, restore him!\r\n" + 
						"HAMLET\r\n" + 
						"I have heard of your paintings too, well enough; God\r\n" + 
						"has given you one face, and you make yourselves\r\n" + 
						"another: you jig, you amble, and you lisp, and\r\n" + 
						"nick-name God's creatures, and make your wantonness\r\n" + 
						"your ignorance. Go to, I'll no more on't; it hath\r\n" + 
						"made me mad. I say, we will have no more marriages:\r\n" + 
						"those that are married already, all but one, shall\r\n" + 
						"live; the rest shall keep as they are. To a\r\n" + 
						"nunnery, go.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"OPHELIA\r\n" + 
						"O, what a noble mind is here o'erthrown!\r\n" + 
						"The courtier's, soldier's, scholar's, eye, tongue, sword;\r\n" + 
						"The expectancy and rose of the fair state,\r\n" + 
						"The glass of fashion and the mould of form,\r\n" + 
						"The observed of all observers, quite, quite down!\r\n" + 
						"And I, of ladies most deject and wretched,\r\n" + 
						"That suck'd the honey of his music vows,\r\n" + 
						"Now see that noble and most sovereign reason,\r\n" + 
						"Like sweet bells jangled, out of tune and harsh;\r\n" + 
						"That unmatch'd form and feature of blown youth\r\n" + 
						"Blasted with ecstasy: O, woe is me,\r\n" + 
						"To have seen what I have seen, see what I see!\r\n" + 
						"Re-enter KING CLAUDIUS and POLONIUS\r\n" + 
						"\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Love! his affections do not that way tend;\r\n" + 
						"Nor what he spake, though it lack'd form a little,\r\n" + 
						"Was not like madness. There's something in his soul,\r\n" + 
						"O'er which his melancholy sits on brood;\r\n" + 
						"And I do doubt the hatch and the disclose\r\n" + 
						"Will be some danger: which for to prevent,\r\n" + 
						"I have in quick determination\r\n" + 
						"Thus set it down: he shall with speed to England,\r\n" + 
						"For the demand of our neglected tribute\r\n" + 
						"Haply the seas and countries different\r\n" + 
						"With variable objects shall expel\r\n" + 
						"This something-settled matter in his heart,\r\n" + 
						"Whereon his brains still beating puts him thus\r\n" + 
						"From fashion of himself. What think you on't?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"It shall do well: but yet do I believe\r\n" + 
						"The origin and commencement of his grief\r\n" + 
						"Sprung from neglected love. How now, Ophelia!\r\n" + 
						"You need not tell us what Lord Hamlet said;\r\n" + 
						"We heard it all. My lord, do as you please;\r\n" + 
						"But, if you hold it fit, after the play\r\n" + 
						"Let his queen mother all alone entreat him\r\n" + 
						"To show his grief: let her be round with him;\r\n" + 
						"And I'll be placed, so please you, in the ear\r\n" + 
						"Of all their conference. If she find him not,\r\n" + 
						"To England send him, or confine him where\r\n" + 
						"Your wisdom best shall think.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"It shall be so:\r\n" + 
						"Madness in great ones must not unwatch'd go.\r\n" + 
						"Exeunt\r\n" + 
						"\r\n" + 
						"SCENE II. A hall in the castle.\r\n" + 
						"Enter HAMLET and Players\r\n" + 
						"HAMLET\r\n" + 
						"Speak the speech, I pray you, as I pronounced it to\r\n" + 
						"you, trippingly on the tongue: but if you mouth it,\r\n" + 
						"as many of your players do, I had as lief the\r\n" + 
						"town-crier spoke my lines. Nor do not saw the air\r\n" + 
						"too much with your hand, thus, but use all gently;\r\n" + 
						"for in the very torrent, tempest, and, as I may say,\r\n" + 
						"the whirlwind of passion, you must acquire and beget\r\n" + 
						"a temperance that may give it smoothness. O, it\r\n" + 
						"offends me to the soul to hear a robustious\r\n" + 
						"periwig-pated fellow tear a passion to tatters, to\r\n" + 
						"very rags, to split the ears of the groundlings, who\r\n" + 
						"for the most part are capable of nothing but\r\n" + 
						"inexplicable dumbshows and noise: I would have such\r\n" + 
						"a fellow whipped for o'erdoing Termagant; it\r\n" + 
						"out-herods Herod: pray you, avoid it.\r\n" + 
						"First Player\r\n" + 
						"I warrant your honour.\r\n" + 
						"HAMLET\r\n" + 
						"Be not too tame neither, but let your own discretion\r\n" + 
						"be your tutor: suit the action to the word, the\r\n" + 
						"word to the action; with this special o'erstep not\r\n" + 
						"the modesty of nature: for any thing so overdone is\r\n" + 
						"from the purpose of playing, whose end, both at the\r\n" + 
						"first and now, was and is, to hold, as 'twere, the\r\n" + 
						"mirror up to nature; to show virtue her own feature,\r\n" + 
						"scorn her own image, and the very age and body of\r\n" + 
						"the time his form and pressure. Now this overdone,\r\n" + 
						"or come tardy off, though it make the unskilful\r\n" + 
						"laugh, cannot but make the judicious grieve; the\r\n" + 
						"censure of the which one must in your allowance\r\n" + 
						"o'erweigh a whole theatre of others. O, there be\r\n" + 
						"players that I have seen play, and heard others\r\n" + 
						"praise, and that highly, not to speak it profanely,\r\n" + 
						"that, neither having the accent of Christians nor\r\n" + 
						"the gait of Christian, pagan, nor man, have so\r\n" + 
						"strutted and bellowed that I have thought some of\r\n" + 
						"nature's journeymen had made men and not made them\r\n" + 
						"well, they imitated humanity so abominably.\r\n" + 
						"First Player\r\n" + 
						"I hope we have reformed that indifferently with us,\r\n" + 
						"sir.\r\n" + 
						"HAMLET\r\n" + 
						"O, reform it altogether. And let those that play\r\n" + 
						"your clowns speak no more than is set down for them;\r\n" + 
						"for there be of them that will themselves laugh, to\r\n" + 
						"set on some quantity of barren spectators to laugh\r\n" + 
						"too; though, in the mean time, some necessary\r\n" + 
						"question of the play be then to be considered:\r\n" + 
						"that's villanous, and shows a most pitiful ambition\r\n" + 
						"in the fool that uses it. Go, make you ready.\r\n" + 
						"Exeunt Players\r\n" + 
						"\r\n" + 
						"Enter POLONIUS, ROSENCRANTZ, and GUILDENSTERN\r\n" + 
						"\r\n" + 
						"How now, my lord! I will the king hear this piece of work?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"And the queen too, and that presently.\r\n" + 
						"HAMLET\r\n" + 
						"Bid the players make haste.\r\n" + 
						"Exit POLONIUS\r\n" + 
						"\r\n" + 
						"Will you two help to hasten them?\r\n" + 
						"ROSENCRANTZ GUILDENSTERN\r\n" + 
						"We will, my lord.\r\n" + 
						"Exeunt ROSENCRANTZ and GUILDENSTERN\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"What ho! Horatio!\r\n" + 
						"Enter HORATIO\r\n" + 
						"\r\n" + 
						"HORATIO\r\n" + 
						"Here, sweet lord, at your service.\r\n" + 
						"HAMLET\r\n" + 
						"Horatio, thou art e'en as just a man\r\n" + 
						"As e'er my conversation coped withal.\r\n" + 
						"HORATIO\r\n" + 
						"O, my dear lord,--\r\n" + 
						"HAMLET\r\n" + 
						"Nay, do not think I flatter;\r\n" + 
						"For what advancement may I hope from thee\r\n" + 
						"That no revenue hast but thy good spirits,\r\n" + 
						"To feed and clothe thee? Why should the poor be flatter'd?\r\n" + 
						"No, let the candied tongue lick absurd pomp,\r\n" + 
						"And crook the pregnant hinges of the knee\r\n" + 
						"Where thrift may follow fawning. Dost thou hear?\r\n" + 
						"Since my dear soul was mistress of her choice\r\n" + 
						"And could of men distinguish, her election\r\n" + 
						"Hath seal'd thee for herself; for thou hast been\r\n" + 
						"As one, in suffering all, that suffers nothing,\r\n" + 
						"A man that fortune's buffets and rewards\r\n" + 
						"Hast ta'en with equal thanks: and blest are those\r\n" + 
						"Whose blood and judgment are so well commingled,\r\n" + 
						"That they are not a pipe for fortune's finger\r\n" + 
						"To sound what stop she please. Give me that man\r\n" + 
						"That is not passion's slave, and I will wear him\r\n" + 
						"In my heart's core, ay, in my heart of heart,\r\n" + 
						"As I do thee.--Something too much of this.--\r\n" + 
						"There is a play to-night before the king;\r\n" + 
						"One scene of it comes near the circumstance\r\n" + 
						"Which I have told thee of my father's death:\r\n" + 
						"I prithee, when thou seest that act afoot,\r\n" + 
						"Even with the very comment of thy soul\r\n" + 
						"Observe mine uncle: if his occulted guilt\r\n" + 
						"Do not itself unkennel in one speech,\r\n" + 
						"It is a damned ghost that we have seen,\r\n" + 
						"And my imaginations are as foul\r\n" + 
						"As Vulcan's stithy. Give him heedful note;\r\n" + 
						"For I mine eyes will rivet to his face,\r\n" + 
						"And after we will both our judgments join\r\n" + 
						"In censure of his seeming.\r\n" + 
						"HORATIO\r\n" + 
						"Well, my lord:\r\n" + 
						"If he steal aught the whilst this play is playing,\r\n" + 
						"And 'scape detecting, I will pay the theft.\r\n" + 
						"HAMLET\r\n" + 
						"They are coming to the play; I must be idle:\r\n" + 
						"Get you a place.\r\n" + 
						"Danish march. A flourish. Enter KING CLAUDIUS, QUEEN GERTRUDE, POLONIUS, OPHELIA, ROSENCRANTZ, GUILDENSTERN, and others\r\n" + 
						"\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"How fares our cousin Hamlet?\r\n" + 
						"HAMLET\r\n" + 
						"Excellent, i' faith; of the chameleon's dish: I eat\r\n" + 
						"the air, promise-crammed: you cannot feed capons so.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"I have nothing with this answer, Hamlet; these words\r\n" + 
						"are not mine.\r\n" + 
						"HAMLET\r\n" + 
						"No, nor mine now.\r\n" + 
						"To POLONIUS\r\n" + 
						"\r\n" + 
						"My lord, you played once i' the university, you say?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"That did I, my lord; and was accounted a good actor.\r\n" + 
						"HAMLET\r\n" + 
						"What did you enact?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"I did enact Julius Caesar: I was killed i' the\r\n" + 
						"Capitol; Brutus killed me.\r\n" + 
						"HAMLET\r\n" + 
						"It was a brute part of him to kill so capital a calf\r\n" + 
						"there. Be the players ready?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Ay, my lord; they stay upon your patience.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Come hither, my dear Hamlet, sit by me.\r\n" + 
						"HAMLET\r\n" + 
						"No, good mother, here's metal more attractive.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"[To KING CLAUDIUS] O, ho! do you mark that?\r\n" + 
						"HAMLET\r\n" + 
						"Lady, shall I lie in your lap?\r\n" + 
						"Lying down at OPHELIA's feet\r\n" + 
						"\r\n" + 
						"OPHELIA\r\n" + 
						"No, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"I mean, my head upon your lap?\r\n" + 
						"OPHELIA\r\n" + 
						"Ay, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Do you think I meant country matters?\r\n" + 
						"OPHELIA\r\n" + 
						"I think nothing, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"That's a fair thought to lie between maids' legs.\r\n" + 
						"OPHELIA\r\n" + 
						"What is, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"Nothing.\r\n" + 
						"OPHELIA\r\n" + 
						"You are merry, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Who, I?\r\n" + 
						"OPHELIA\r\n" + 
						"Ay, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"O God, your only jig-maker. What should a man do\r\n" + 
						"but be merry? for, look you, how cheerfully my\r\n" + 
						"mother looks, and my father died within these two hours.\r\n" + 
						"OPHELIA\r\n" + 
						"Nay, 'tis twice two months, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"So long? Nay then, let the devil wear black, for\r\n" + 
						"I'll have a suit of sables. O heavens! die two\r\n" + 
						"months ago, and not forgotten yet? Then there's\r\n" + 
						"hope a great man's memory may outlive his life half\r\n" + 
						"a year: but, by'r lady, he must build churches,\r\n" + 
						"then; or else shall he suffer not thinking on, with\r\n" + 
						"the hobby-horse, whose epitaph is 'For, O, for, O,\r\n" + 
						"the hobby-horse is forgot.'\r\n" + 
						"Hautboys play. The dumb-show enters\r\n" + 
						"\r\n" + 
						"Enter a King and a Queen very lovingly; the Queen embracing him, and he her. She kneels, and makes show of protestation unto him. He takes her up, and declines his head upon her neck: lays him down upon a bank of flowers: she, seeing him asleep, leaves him. Anon comes in a fellow, takes off his crown, kisses it, and pours poison in the King's ears, and exit. The Queen returns; finds the King dead, and makes passionate action. The Poisoner, with some two or three Mutes, comes in again, seeming to lament with her. The dead body is carried away. The Poisoner wooes the Queen with gifts: she seems loath and unwilling awhile, but in the end accepts his love\r\n" + 
						"\r\n" + 
						"Exeunt\r\n" + 
						"\r\n" + 
						"OPHELIA\r\n" + 
						"What means this, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"Marry, this is miching mallecho; it means mischief.\r\n" + 
						"OPHELIA\r\n" + 
						"Belike this show imports the argument of the play.\r\n" + 
						"Enter Prologue\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"We shall know by this fellow: the players cannot\r\n" + 
						"keep counsel; they'll tell all.\r\n" + 
						"OPHELIA\r\n" + 
						"Will he tell us what this show meant?\r\n" + 
						"HAMLET\r\n" + 
						"Ay, or any show that you'll show him: be not you\r\n" + 
						"ashamed to show, he'll not shame to tell you what it means.\r\n" + 
						"OPHELIA\r\n" + 
						"You are naught, you are naught: I'll mark the play.\r\n" + 
						"Prologue\r\n" + 
						"For us, and for our tragedy,\r\n" + 
						"Here stooping to your clemency,\r\n" + 
						"We beg your hearing patiently.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"Is this a prologue, or the posy of a ring?\r\n" + 
						"OPHELIA\r\n" + 
						"'Tis brief, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"As woman's love.\r\n" + 
						"Enter two Players, King and Queen\r\n" + 
						"\r\n" + 
						"Player King\r\n" + 
						"Full thirty times hath Phoebus' cart gone round\r\n" + 
						"Neptune's salt wash and Tellus' orbed ground,\r\n" + 
						"And thirty dozen moons with borrow'd sheen\r\n" + 
						"About the world have times twelve thirties been,\r\n" + 
						"Since love our hearts and Hymen did our hands\r\n" + 
						"Unite commutual in most sacred bands.\r\n" + 
						"Player Queen\r\n" + 
						"So many journeys may the sun and moon\r\n" + 
						"Make us again count o'er ere love be done!\r\n" + 
						"But, woe is me, you are so sick of late,\r\n" + 
						"So far from cheer and from your former state,\r\n" + 
						"That I distrust you. Yet, though I distrust,\r\n" + 
						"Discomfort you, my lord, it nothing must:\r\n" + 
						"For women's fear and love holds quantity;\r\n" + 
						"In neither aught, or in extremity.\r\n" + 
						"Now, what my love is, proof hath made you know;\r\n" + 
						"And as my love is sized, my fear is so:\r\n" + 
						"Where love is great, the littlest doubts are fear;\r\n" + 
						"Where little fears grow great, great love grows there.\r\n" + 
						"Player King\r\n" + 
						"'Faith, I must leave thee, love, and shortly too;\r\n" + 
						"My operant powers their functions leave to do:\r\n" + 
						"And thou shalt live in this fair world behind,\r\n" + 
						"Honour'd, beloved; and haply one as kind\r\n" + 
						"For husband shalt thou--\r\n" + 
						"Player Queen\r\n" + 
						"O, confound the rest!\r\n" + 
						"Such love must needs be treason in my breast:\r\n" + 
						"In second husband let me be accurst!\r\n" + 
						"None wed the second but who kill'd the first.\r\n" + 
						"HAMLET\r\n" + 
						"[Aside] Wormwood, wormwood.\r\n" + 
						"Player Queen\r\n" + 
						"The instances that second marriage move\r\n" + 
						"Are base respects of thrift, but none of love:\r\n" + 
						"A second time I kill my husband dead,\r\n" + 
						"When second husband kisses me in bed.\r\n" + 
						"Player King\r\n" + 
						"I do believe you think what now you speak;\r\n" + 
						"But what we do determine oft we break.\r\n" + 
						"Purpose is but the slave to memory,\r\n" + 
						"Of violent birth, but poor validity;\r\n" + 
						"Which now, like fruit unripe, sticks on the tree;\r\n" + 
						"But fall, unshaken, when they mellow be.\r\n" + 
						"Most necessary 'tis that we forget\r\n" + 
						"To pay ourselves what to ourselves is debt:\r\n" + 
						"What to ourselves in passion we propose,\r\n" + 
						"The passion ending, doth the purpose lose.\r\n" + 
						"The violence of either grief or joy\r\n" + 
						"Their own enactures with themselves destroy:\r\n" + 
						"Where joy most revels, grief doth most lament;\r\n" + 
						"Grief joys, joy grieves, on slender accident.\r\n" + 
						"This world is not for aye, nor 'tis not strange\r\n" + 
						"That even our loves should with our fortunes change;\r\n" + 
						"For 'tis a question left us yet to prove,\r\n" + 
						"Whether love lead fortune, or else fortune love.\r\n" + 
						"The great man down, you mark his favourite flies;\r\n" + 
						"The poor advanced makes friends of enemies.\r\n" + 
						"And hitherto doth love on fortune tend;\r\n" + 
						"For who not needs shall never lack a friend,\r\n" + 
						"And who in want a hollow friend doth try,\r\n" + 
						"Directly seasons him his enemy.\r\n" + 
						"But, orderly to end where I begun,\r\n" + 
						"Our wills and fates do so contrary run\r\n" + 
						"That our devices still are overthrown;\r\n" + 
						"Our thoughts are ours, their ends none of our own:\r\n" + 
						"So think thou wilt no second husband wed;\r\n" + 
						"But die thy thoughts when thy first lord is dead.\r\n" + 
						"Player Queen\r\n" + 
						"Nor earth to me give food, nor heaven light!\r\n" + 
						"Sport and repose lock from me day and night!\r\n" + 
						"To desperation turn my trust and hope!\r\n" + 
						"An anchor's cheer in prison be my scope!\r\n" + 
						"Each opposite that blanks the face of joy\r\n" + 
						"Meet what I would have well and it destroy!\r\n" + 
						"Both here and hence pursue me lasting strife,\r\n" + 
						"If, once a widow, ever I be wife!\r\n" + 
						"HAMLET\r\n" + 
						"If she should break it now!\r\n" + 
						"Player King\r\n" + 
						"'Tis deeply sworn. Sweet, leave me here awhile;\r\n" + 
						"My spirits grow dull, and fain I would beguile\r\n" + 
						"The tedious day with sleep.\r\n" + 
						"Sleeps\r\n" + 
						"\r\n" + 
						"Player Queen\r\n" + 
						"Sleep rock thy brain,\r\n" + 
						"And never come mischance between us twain!\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"Madam, how like you this play?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"The lady protests too much, methinks.\r\n" + 
						"HAMLET\r\n" + 
						"O, but she'll keep her word.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Have you heard the argument? Is there no offence in 't?\r\n" + 
						"HAMLET\r\n" + 
						"No, no, they do but jest, poison in jest; no offence\r\n" + 
						"i' the world.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"What do you call the play?\r\n" + 
						"HAMLET\r\n" + 
						"The Mouse-trap. Marry, how? Tropically. This play\r\n" + 
						"is the image of a murder done in Vienna: Gonzago is\r\n" + 
						"the duke's name; his wife, Baptista: you shall see\r\n" + 
						"anon; 'tis a knavish piece of work: but what o'\r\n" + 
						"that? your majesty and we that have free souls, it\r\n" + 
						"touches us not: let the galled jade wince, our\r\n" + 
						"withers are unwrung.\r\n" + 
						"Enter LUCIANUS\r\n" + 
						"\r\n" + 
						"This is one Lucianus, nephew to the king.\r\n" + 
						"OPHELIA\r\n" + 
						"You are as good as a chorus, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"I could interpret between you and your love, if I\r\n" + 
						"could see the puppets dallying.\r\n" + 
						"OPHELIA\r\n" + 
						"You are keen, my lord, you are keen.\r\n" + 
						"HAMLET\r\n" + 
						"It would cost you a groaning to take off my edge.\r\n" + 
						"OPHELIA\r\n" + 
						"Still better, and worse.\r\n" + 
						"HAMLET\r\n" + 
						"So you must take your husbands. Begin, murderer;\r\n" + 
						"pox, leave thy damnable faces, and begin. Come:\r\n" + 
						"'the croaking raven doth bellow for revenge.'\r\n" + 
						"LUCIANUS\r\n" + 
						"Thoughts black, hands apt, drugs fit, and time agreeing;\r\n" + 
						"Confederate season, else no creature seeing;\r\n" + 
						"Thou mixture rank, of midnight weeds collected,\r\n" + 
						"With Hecate's ban thrice blasted, thrice infected,\r\n" + 
						"Thy natural magic and dire property,\r\n" + 
						"On wholesome life usurp immediately.\r\n" + 
						"Pours the poison into the sleeper's ears\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"He poisons him i' the garden for's estate. His\r\n" + 
						"name's Gonzago: the story is extant, and writ in\r\n" + 
						"choice Italian: you shall see anon how the murderer\r\n" + 
						"gets the love of Gonzago's wife.\r\n" + 
						"OPHELIA\r\n" + 
						"The king rises.\r\n" + 
						"HAMLET\r\n" + 
						"What, frighted with false fire!\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"How fares my lord?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Give o'er the play.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Give me some light: away!\r\n" + 
						"All\r\n" + 
						"Lights, lights, lights!\r\n" + 
						"Exeunt all but HAMLET and HORATIO\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"Why, let the stricken deer go weep,\r\n" + 
						"The hart ungalled play;\r\n" + 
						"For some must watch, while some must sleep:\r\n" + 
						"So runs the world away.\r\n" + 
						"Would not this, sir, and a forest of feathers-- if\r\n" + 
						"the rest of my fortunes turn Turk with me--with two\r\n" + 
						"Provincial roses on my razed shoes, get me a\r\n" + 
						"fellowship in a cry of players, sir?\r\n" + 
						"HORATIO\r\n" + 
						"Half a share.\r\n" + 
						"HAMLET\r\n" + 
						"A whole one, I.\r\n" + 
						"For thou dost know, O Damon dear,\r\n" + 
						"This realm dismantled was\r\n" + 
						"Of Jove himself; and now reigns here\r\n" + 
						"A very, very--pajock.\r\n" + 
						"HORATIO\r\n" + 
						"You might have rhymed.\r\n" + 
						"HAMLET\r\n" + 
						"O good Horatio, I'll take the ghost's word for a\r\n" + 
						"thousand pound. Didst perceive?\r\n" + 
						"HORATIO\r\n" + 
						"Very well, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Upon the talk of the poisoning?\r\n" + 
						"HORATIO\r\n" + 
						"I did very well note him.\r\n" + 
						"HAMLET\r\n" + 
						"Ah, ha! Come, some music! come, the recorders!\r\n" + 
						"For if the king like not the comedy,\r\n" + 
						"Why then, belike, he likes it not, perdy.\r\n" + 
						"Come, some music!\r\n" + 
						"Re-enter ROSENCRANTZ and GUILDENSTERN\r\n" + 
						"\r\n" + 
						"GUILDENSTERN\r\n" + 
						"Good my lord, vouchsafe me a word with you.\r\n" + 
						"HAMLET\r\n" + 
						"Sir, a whole history.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"The king, sir,--\r\n" + 
						"HAMLET\r\n" + 
						"Ay, sir, what of him?\r\n" + 
						"GUILDENSTERN\r\n" + 
						"Is in his retirement marvellous distempered.\r\n" + 
						"HAMLET\r\n" + 
						"With drink, sir?\r\n" + 
						"GUILDENSTERN\r\n" + 
						"No, my lord, rather with choler.\r\n" + 
						"HAMLET\r\n" + 
						"Your wisdom should show itself more richer to\r\n" + 
						"signify this to his doctor; for, for me to put him\r\n" + 
						"to his purgation would perhaps plunge him into far\r\n" + 
						"more choler.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"Good my lord, put your discourse into some frame and\r\n" + 
						"start not so wildly from my affair.\r\n" + 
						"HAMLET\r\n" + 
						"I am tame, sir: pronounce.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"The queen, your mother, in most great affliction of\r\n" + 
						"spirit, hath sent me to you.\r\n" + 
						"HAMLET\r\n" + 
						"You are welcome.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"Nay, good my lord, this courtesy is not of the right\r\n" + 
						"breed. If it shall please you to make me a\r\n" + 
						"wholesome answer, I will do your mother's\r\n" + 
						"commandment: if not, your pardon and my return\r\n" + 
						"shall be the end of my business.\r\n" + 
						"HAMLET\r\n" + 
						"Sir, I cannot.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"What, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"Make you a wholesome answer; my wit's diseased: but,\r\n" + 
						"sir, such answer as I can make, you shall command;\r\n" + 
						"or, rather, as you say, my mother: therefore no\r\n" + 
						"more, but to the matter: my mother, you say,--\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Then thus she says; your behavior hath struck her\r\n" + 
						"into amazement and admiration.\r\n" + 
						"HAMLET\r\n" + 
						"O wonderful son, that can so astonish a mother! But\r\n" + 
						"is there no sequel at the heels of this mother's\r\n" + 
						"admiration? Impart.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"She desires to speak with you in her closet, ere you\r\n" + 
						"go to bed.\r\n" + 
						"HAMLET\r\n" + 
						"We shall obey, were she ten times our mother. Have\r\n" + 
						"you any further trade with us?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"My lord, you once did love me.\r\n" + 
						"HAMLET\r\n" + 
						"So I do still, by these pickers and stealers.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Good my lord, what is your cause of distemper? you\r\n" + 
						"do, surely, bar the door upon your own liberty, if\r\n" + 
						"you deny your griefs to your friend.\r\n" + 
						"HAMLET\r\n" + 
						"Sir, I lack advancement.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"How can that be, when you have the voice of the king\r\n" + 
						"himself for your succession in Denmark?\r\n" + 
						"HAMLET\r\n" + 
						"Ay, but sir, 'While the grass grows,'--the proverb\r\n" + 
						"is something musty.\r\n" + 
						"Re-enter Players with recorders\r\n" + 
						"\r\n" + 
						"O, the recorders! let me see one. To withdraw with\r\n" + 
						"you:--why do you go about to recover the wind of me,\r\n" + 
						"as if you would drive me into a toil?\r\n" + 
						"GUILDENSTERN\r\n" + 
						"O, my lord, if my duty be too bold, my love is too\r\n" + 
						"unmannerly.\r\n" + 
						"HAMLET\r\n" + 
						"I do not well understand that. Will you play upon\r\n" + 
						"this pipe?\r\n" + 
						"GUILDENSTERN\r\n" + 
						"My lord, I cannot.\r\n" + 
						"HAMLET\r\n" + 
						"I pray you.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"Believe me, I cannot.\r\n" + 
						"HAMLET\r\n" + 
						"I do beseech you.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"I know no touch of it, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"'Tis as easy as lying: govern these ventages with\r\n" + 
						"your lingers and thumb, give it breath with your\r\n" + 
						"mouth, and it will discourse most eloquent music.\r\n" + 
						"Look you, these are the stops.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"But these cannot I command to any utterance of\r\n" + 
						"harmony; I have not the skill.\r\n" + 
						"HAMLET\r\n" + 
						"Why, look you now, how unworthy a thing you make of\r\n" + 
						"me! You would play upon me; you would seem to know\r\n" + 
						"my stops; you would pluck out the heart of my\r\n" + 
						"mystery; you would sound me from my lowest note to\r\n" + 
						"the top of my compass: and there is much music,\r\n" + 
						"excellent voice, in this little organ; yet cannot\r\n" + 
						"you make it speak. 'Sblood, do you think I am\r\n" + 
						"easier to be played on than a pipe? Call me what\r\n" + 
						"instrument you will, though you can fret me, yet you\r\n" + 
						"cannot play upon me.\r\n" + 
						"Enter POLONIUS\r\n" + 
						"\r\n" + 
						"God bless you, sir!\r\n" + 
						"LORD POLONIUS\r\n" + 
						"My lord, the queen would speak with you, and\r\n" + 
						"presently.\r\n" + 
						"HAMLET\r\n" + 
						"Do you see yonder cloud that's almost in shape of a camel?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"By the mass, and 'tis like a camel, indeed.\r\n" + 
						"HAMLET\r\n" + 
						"Methinks it is like a weasel.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"It is backed like a weasel.\r\n" + 
						"HAMLET\r\n" + 
						"Or like a whale?\r\n" + 
						"LORD POLONIUS\r\n" + 
						"Very like a whale.\r\n" + 
						"HAMLET\r\n" + 
						"Then I will come to my mother by and by. They fool\r\n" + 
						"me to the top of my bent. I will come by and by.\r\n" + 
						"LORD POLONIUS\r\n" + 
						"I will say so.\r\n" + 
						"HAMLET\r\n" + 
						"By and by is easily said.\r\n" + 
						"Exit POLONIUS\r\n" + 
						"\r\n" + 
						"Leave me, friends.\r\n" + 
						"Exeunt all but HAMLET\r\n" + 
						"\r\n" + 
						"Tis now the very witching time of night,\r\n" + 
						"When churchyards yawn and hell itself breathes out\r\n" + 
						"Contagion to this world: now could I drink hot blood,\r\n" + 
						"And do such bitter business as the day\r\n" + 
						"Would quake to look on. Soft! now to my mother.\r\n" + 
						"O heart, lose not thy nature; let not ever\r\n" + 
						"The soul of Nero enter this firm bosom:\r\n" + 
						"Let me be cruel, not unnatural:\r\n" + 
						"I will speak daggers to her, but use none;\r\n" + 
						"My tongue and soul in this be hypocrites;\r\n" + 
						"How in my words soever she be shent,\r\n" + 
						"To give them seals never, my soul, consent!\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"SCENE III. A room in the castle.\r\n" + 
						"Enter KING CLAUDIUS, ROSENCRANTZ, and GUILDENSTERN\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"I like him not, nor stands it safe with us\r\n" + 
						"To let his madness range. Therefore prepare you;\r\n" + 
						"I your commission will forthwith dispatch,\r\n" + 
						"And he to England shall along with you:\r\n" + 
						"The terms of our estate may not endure\r\n" + 
						"Hazard so dangerous as doth hourly grow\r\n" + 
						"Out of his lunacies.\r\n" + 
						"GUILDENSTERN\r\n" + 
						"We will ourselves provide:\r\n" + 
						"Most holy and religious fear it is\r\n" + 
						"To keep those many many bodies safe\r\n" + 
						"That live and feed upon your majesty.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"The single and peculiar life is bound,\r\n" + 
						"With all the strength and armour of the mind,\r\n" + 
						"To keep itself from noyance; but much more\r\n" + 
						"That spirit upon whose weal depend and rest\r\n" + 
						"The lives of many. The cease of majesty\r\n" + 
						"Dies not alone; but, like a gulf, doth draw\r\n" + 
						"What's near it with it: it is a massy wheel,\r\n" + 
						"Fix'd on the summit of the highest mount,\r\n" + 
						"To whose huge spokes ten thousand lesser things\r\n" + 
						"Are mortised and adjoin'd; which, when it falls,\r\n" + 
						"Each small annexment, petty consequence,\r\n" + 
						"Attends the boisterous ruin. Never alone\r\n" + 
						"Did the king sigh, but with a general groan.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Arm you, I pray you, to this speedy voyage;\r\n" + 
						"For we will fetters put upon this fear,\r\n" + 
						"Which now goes too free-footed.\r\n" + 
						"ROSENCRANTZ GUILDENSTERN\r\n" + 
						"We will haste us.\r\n" + 
						"Exeunt ROSENCRANTZ and GUILDENSTERN\r\n" + 
						"\r\n" + 
						"Enter POLONIUS\r\n" + 
						"\r\n" + 
						"LORD POLONIUS\r\n" + 
						"My lord, he's going to his mother's closet:\r\n" + 
						"Behind the arras I'll convey myself,\r\n" + 
						"To hear the process; and warrant she'll tax him home:\r\n" + 
						"And, as you said, and wisely was it said,\r\n" + 
						"'Tis meet that some more audience than a mother,\r\n" + 
						"Since nature makes them partial, should o'erhear\r\n" + 
						"The speech, of vantage. Fare you well, my liege:\r\n" + 
						"I'll call upon you ere you go to bed,\r\n" + 
						"And tell you what I know.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Thanks, dear my lord.\r\n" + 
						"Exit POLONIUS\r\n" + 
						"\r\n" + 
						"O, my offence is rank it smells to heaven;\r\n" + 
						"It hath the primal eldest curse upon't,\r\n" + 
						"A brother's murder. Pray can I not,\r\n" + 
						"Though inclination be as sharp as will:\r\n" + 
						"My stronger guilt defeats my strong intent;\r\n" + 
						"And, like a man to double business bound,\r\n" + 
						"I stand in pause where I shall first begin,\r\n" + 
						"And both neglect. What if this cursed hand\r\n" + 
						"Were thicker than itself with brother's blood,\r\n" + 
						"Is there not rain enough in the sweet heavens\r\n" + 
						"To wash it white as snow? Whereto serves mercy\r\n" + 
						"But to confront the visage of offence?\r\n" + 
						"And what's in prayer but this two-fold force,\r\n" + 
						"To be forestalled ere we come to fall,\r\n" + 
						"Or pardon'd being down? Then I'll look up;\r\n" + 
						"My fault is past. But, O, what form of prayer\r\n" + 
						"Can serve my turn? 'Forgive me my foul murder'?\r\n" + 
						"That cannot be; since I am still possess'd\r\n" + 
						"Of those effects for which I did the murder,\r\n" + 
						"My crown, mine own ambition and my queen.\r\n" + 
						"May one be pardon'd and retain the offence?\r\n" + 
						"In the corrupted currents of this world\r\n" + 
						"Offence's gilded hand may shove by justice,\r\n" + 
						"And oft 'tis seen the wicked prize itself\r\n" + 
						"Buys out the law: but 'tis not so above;\r\n" + 
						"There is no shuffling, there the action lies\r\n" + 
						"In his true nature; and we ourselves compell'd,\r\n" + 
						"Even to the teeth and forehead of our faults,\r\n" + 
						"To give in evidence. What then? what rests?\r\n" + 
						"Try what repentance can: what can it not?\r\n" + 
						"Yet what can it when one can not repent?\r\n" + 
						"O wretched state! O bosom black as death!\r\n" + 
						"O limed soul, that, struggling to be free,\r\n" + 
						"Art more engaged! Help, angels! Make assay!\r\n" + 
						"Bow, stubborn knees; and, heart with strings of steel,\r\n" + 
						"Be soft as sinews of the newborn babe!\r\n" + 
						"All may be well.\r\n" + 
						"Retires and kneels\r\n" + 
						"\r\n" + 
						"Enter HAMLET\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"Now might I do it pat, now he is praying;\r\n" + 
						"And now I'll do't. And so he goes to heaven;\r\n" + 
						"And so am I revenged. That would be scann'd:\r\n" + 
						"A villain kills my father; and for that,\r\n" + 
						"I, his sole son, do this same villain send\r\n" + 
						"To heaven.\r\n" + 
						"O, this is hire and salary, not revenge.\r\n" + 
						"He took my father grossly, full of bread;\r\n" + 
						"With all his crimes broad blown, as flush as May;\r\n" + 
						"And how his audit stands who knows save heaven?\r\n" + 
						"But in our circumstance and course of thought,\r\n" + 
						"'Tis heavy with him: and am I then revenged,\r\n" + 
						"To take him in the purging of his soul,\r\n" + 
						"When he is fit and season'd for his passage?\r\n" + 
						"No!\r\n" + 
						"Up, sword; and know thou a more horrid hent:\r\n" + 
						"When he is drunk asleep, or in his rage,\r\n" + 
						"Or in the incestuous pleasure of his bed;\r\n" + 
						"At gaming, swearing, or about some act\r\n" + 
						"That has no relish of salvation in't;\r\n" + 
						"Then trip him, that his heels may kick at heaven,\r\n" + 
						"And that his soul may be as damn'd and black\r\n" + 
						"As hell, whereto it goes. My mother stays:\r\n" + 
						"This physic but prolongs thy sickly days.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"[Rising] My words fly up, my thoughts remain below:\r\n" + 
						"Words without thoughts never to heaven go.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"SCENE IV. The Queen's closet.\r\n" + 
						"Enter QUEEN GERTRUDE and POLONIUS\r\n" + 
						"LORD POLONIUS\r\n" + 
						"He will come straight. Look you lay home to him:\r\n" + 
						"Tell him his pranks have been too broad to bear with,\r\n" + 
						"And that your grace hath screen'd and stood between\r\n" + 
						"Much heat and him. I'll sconce me even here.\r\n" + 
						"Pray you, be round with him.\r\n" + 
						"HAMLET\r\n" + 
						"[Within] Mother, mother, mother!\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"I'll warrant you,\r\n" + 
						"Fear me not: withdraw, I hear him coming.\r\n" + 
						"POLONIUS hides behind the arras\r\n" + 
						"\r\n" + 
						"Enter HAMLET\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"Now, mother, what's the matter?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Hamlet, thou hast thy father much offended.\r\n" + 
						"HAMLET\r\n" + 
						"Mother, you have my father much offended.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Come, come, you answer with an idle tongue.\r\n" + 
						"HAMLET\r\n" + 
						"Go, go, you question with a wicked tongue.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Why, how now, Hamlet!\r\n" + 
						"HAMLET\r\n" + 
						"What's the matter now?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Have you forgot me?\r\n" + 
						"HAMLET\r\n" + 
						"No, by the rood, not so:\r\n" + 
						"You are the queen, your husband's brother's wife;\r\n" + 
						"And--would it were not so!--you are my mother.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Nay, then, I'll set those to you that can speak.\r\n" + 
						"HAMLET\r\n" + 
						"Come, come, and sit you down; you shall not budge;\r\n" + 
						"You go not till I set you up a glass\r\n" + 
						"Where you may see the inmost part of you.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"What wilt thou do? thou wilt not murder me?\r\n" + 
						"Help, help, ho!\r\n" + 
						"LORD POLONIUS\r\n" + 
						"[Behind] What, ho! help, help, help!\r\n" + 
						"HAMLET\r\n" + 
						"[Drawing] How now! a rat? Dead, for a ducat, dead!\r\n" + 
						"Makes a pass through the arras\r\n" + 
						"\r\n" + 
						"LORD POLONIUS\r\n" + 
						"[Behind] O, I am slain!\r\n" + 
						"Falls and dies\r\n" + 
						"\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"O me, what hast thou done?\r\n" + 
						"HAMLET\r\n" + 
						"Nay, I know not:\r\n" + 
						"Is it the king?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"O, what a rash and bloody deed is this!\r\n" + 
						"HAMLET\r\n" + 
						"A bloody deed! almost as bad, good mother,\r\n" + 
						"As kill a king, and marry with his brother.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"As kill a king!\r\n" + 
						"HAMLET\r\n" + 
						"Ay, lady, 'twas my word.\r\n" + 
						"Lifts up the array and discovers POLONIUS\r\n" + 
						"\r\n" + 
						"Thou wretched, rash, intruding fool, farewell!\r\n" + 
						"I took thee for thy better: take thy fortune;\r\n" + 
						"Thou find'st to be too busy is some danger.\r\n" + 
						"Leave wringing of your hands: peace! sit you down,\r\n" + 
						"And let me wring your heart; for so I shall,\r\n" + 
						"If it be made of penetrable stuff,\r\n" + 
						"If damned custom have not brass'd it so\r\n" + 
						"That it is proof and bulwark against sense.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"What have I done, that thou darest wag thy tongue\r\n" + 
						"In noise so rude against me?\r\n" + 
						"HAMLET\r\n" + 
						"Such an act\r\n" + 
						"That blurs the grace and blush of modesty,\r\n" + 
						"Calls virtue hypocrite, takes off the rose\r\n" + 
						"From the fair forehead of an innocent love\r\n" + 
						"And sets a blister there, makes marriage-vows\r\n" + 
						"As false as dicers' oaths: O, such a deed\r\n" + 
						"As from the body of contraction plucks\r\n" + 
						"The very soul, and sweet religion makes\r\n" + 
						"A rhapsody of words: heaven's face doth glow:\r\n" + 
						"Yea, this solidity and compound mass,\r\n" + 
						"With tristful visage, as against the doom,\r\n" + 
						"Is thought-sick at the act.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Ay me, what act,\r\n" + 
						"That roars so loud, and thunders in the index?\r\n" + 
						"HAMLET\r\n" + 
						"Look here, upon this picture, and on this,\r\n" + 
						"The counterfeit presentment of two brothers.\r\n" + 
						"See, what a grace was seated on this brow;\r\n" + 
						"Hyperion's curls; the front of Jove himself;\r\n" + 
						"An eye like Mars, to threaten and command;\r\n" + 
						"A station like the herald Mercury\r\n" + 
						"New-lighted on a heaven-kissing hill;\r\n" + 
						"A combination and a form indeed,\r\n" + 
						"Where every god did seem to set his seal,\r\n" + 
						"To give the world assurance of a man:\r\n" + 
						"This was your husband. Look you now, what follows:\r\n" + 
						"Here is your husband; like a mildew'd ear,\r\n" + 
						"Blasting his wholesome brother. Have you eyes?\r\n" + 
						"Could you on this fair mountain leave to feed,\r\n" + 
						"And batten on this moor? Ha! have you eyes?\r\n" + 
						"You cannot call it love; for at your age\r\n" + 
						"The hey-day in the blood is tame, it's humble,\r\n" + 
						"And waits upon the judgment: and what judgment\r\n" + 
						"Would step from this to this? Sense, sure, you have,\r\n" + 
						"Else could you not have motion; but sure, that sense\r\n" + 
						"Is apoplex'd; for madness would not err,\r\n" + 
						"Nor sense to ecstasy was ne'er so thrall'd\r\n" + 
						"But it reserved some quantity of choice,\r\n" + 
						"To serve in such a difference. What devil was't\r\n" + 
						"That thus hath cozen'd you at hoodman-blind?\r\n" + 
						"Eyes without feeling, feeling without sight,\r\n" + 
						"Ears without hands or eyes, smelling sans all,\r\n" + 
						"Or but a sickly part of one true sense\r\n" + 
						"Could not so mope.\r\n" + 
						"O shame! where is thy blush? Rebellious hell,\r\n" + 
						"If thou canst mutine in a matron's bones,\r\n" + 
						"To flaming youth let virtue be as wax,\r\n" + 
						"And melt in her own fire: proclaim no shame\r\n" + 
						"When the compulsive ardour gives the charge,\r\n" + 
						"Since frost itself as actively doth burn\r\n" + 
						"And reason panders will.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"O Hamlet, speak no more:\r\n" + 
						"Thou turn'st mine eyes into my very soul;\r\n" + 
						"And there I see such black and grained spots\r\n" + 
						"As will not leave their tinct.\r\n" + 
						"HAMLET\r\n" + 
						"Nay, but to live\r\n" + 
						"In the rank sweat of an enseamed bed,\r\n" + 
						"Stew'd in corruption, honeying and making love\r\n" + 
						"Over the nasty sty,--\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"O, speak to me no more;\r\n" + 
						"These words, like daggers, enter in mine ears;\r\n" + 
						"No more, sweet Hamlet!\r\n" + 
						"HAMLET\r\n" + 
						"A murderer and a villain;\r\n" + 
						"A slave that is not twentieth part the tithe\r\n" + 
						"Of your precedent lord; a vice of kings;\r\n" + 
						"A cutpurse of the empire and the rule,\r\n" + 
						"That from a shelf the precious diadem stole,\r\n" + 
						"And put it in his pocket!\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"No more!\r\n" + 
						"HAMLET\r\n" + 
						"A king of shreds and patches,--\r\n" + 
						"Enter Ghost\r\n" + 
						"\r\n" + 
						"Save me, and hover o'er me with your wings,\r\n" + 
						"You heavenly guards! What would your gracious figure?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Alas, he's mad!\r\n" + 
						"HAMLET\r\n" + 
						"Do you not come your tardy son to chide,\r\n" + 
						"That, lapsed in time and passion, lets go by\r\n" + 
						"The important acting of your dread command? O, say!\r\n" + 
						"Ghost\r\n" + 
						"Do not forget: this visitation\r\n" + 
						"Is but to whet thy almost blunted purpose.\r\n" + 
						"But, look, amazement on thy mother sits:\r\n" + 
						"O, step between her and her fighting soul:\r\n" + 
						"Conceit in weakest bodies strongest works:\r\n" + 
						"Speak to her, Hamlet.\r\n" + 
						"HAMLET\r\n" + 
						"How is it with you, lady?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Alas, how is't with you,\r\n" + 
						"That you do bend your eye on vacancy\r\n" + 
						"And with the incorporal air do hold discourse?\r\n" + 
						"Forth at your eyes your spirits wildly peep;\r\n" + 
						"And, as the sleeping soldiers in the alarm,\r\n" + 
						"Your bedded hair, like life in excrements,\r\n" + 
						"Starts up, and stands on end. O gentle son,\r\n" + 
						"Upon the heat and flame of thy distemper\r\n" + 
						"Sprinkle cool patience. Whereon do you look?\r\n" + 
						"HAMLET\r\n" + 
						"On him, on him! Look you, how pale he glares!\r\n" + 
						"His form and cause conjoin'd, preaching to stones,\r\n" + 
						"Would make them capable. Do not look upon me;\r\n" + 
						"Lest with this piteous action you convert\r\n" + 
						"My stern effects: then what I have to do\r\n" + 
						"Will want true colour; tears perchance for blood.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"To whom do you speak this?\r\n" + 
						"HAMLET\r\n" + 
						"Do you see nothing there?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Nothing at all; yet all that is I see.\r\n" + 
						"HAMLET\r\n" + 
						"Nor did you nothing hear?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"No, nothing but ourselves.\r\n" + 
						"HAMLET\r\n" + 
						"Why, look you there! look, how it steals away!\r\n" + 
						"My father, in his habit as he lived!\r\n" + 
						"Look, where he goes, even now, out at the portal!\r\n" + 
						"Exit Ghost\r\n" + 
						"\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"This the very coinage of your brain:\r\n" + 
						"This bodiless creation ecstasy\r\n" + 
						"Is very cunning in.\r\n" + 
						"HAMLET\r\n" + 
						"Ecstasy!\r\n" + 
						"My pulse, as yours, doth temperately keep time,\r\n" + 
						"And makes as healthful music: it is not madness\r\n" + 
						"That I have utter'd: bring me to the test,\r\n" + 
						"And I the matter will re-word; which madness\r\n" + 
						"Would gambol from. Mother, for love of grace,\r\n" + 
						"Lay not that mattering unction to your soul,\r\n" + 
						"That not your trespass, but my madness speaks:\r\n" + 
						"It will but skin and film the ulcerous place,\r\n" + 
						"Whilst rank corruption, mining all within,\r\n" + 
						"Infects unseen. Confess yourself to heaven;\r\n" + 
						"Repent what's past; avoid what is to come;\r\n" + 
						"And do not spread the compost on the weeds,\r\n" + 
						"To make them ranker. Forgive me this my virtue;\r\n" + 
						"For in the fatness of these pursy times\r\n" + 
						"Virtue itself of vice must pardon beg,\r\n" + 
						"Yea, curb and woo for leave to do him good.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"O Hamlet, thou hast cleft my heart in twain.\r\n" + 
						"HAMLET\r\n" + 
						"O, throw away the worser part of it,\r\n" + 
						"And live the purer with the other half.\r\n" + 
						"Good night: but go not to mine uncle's bed;\r\n" + 
						"Assume a virtue, if you have it not.\r\n" + 
						"That monster, custom, who all sense doth eat,\r\n" + 
						"Of habits devil, is angel yet in this,\r\n" + 
						"That to the use of actions fair and good\r\n" + 
						"He likewise gives a frock or livery,\r\n" + 
						"That aptly is put on. Refrain to-night,\r\n" + 
						"And that shall lend a kind of easiness\r\n" + 
						"To the next abstinence: the next more easy;\r\n" + 
						"For use almost can change the stamp of nature,\r\n" + 
						"And either [ ] the devil, or throw him out\r\n" + 
						"With wondrous potency. Once more, good night:\r\n" + 
						"And when you are desirous to be bless'd,\r\n" + 
						"I'll blessing beg of you. For this same lord,\r\n" + 
						"Pointing to POLONIUS\r\n" + 
						"\r\n" + 
						"I do repent: but heaven hath pleased it so,\r\n" + 
						"To punish me with this and this with me,\r\n" + 
						"That I must be their scourge and minister.\r\n" + 
						"I will bestow him, and will answer well\r\n" + 
						"The death I gave him. So, again, good night.\r\n" + 
						"I must be cruel, only to be kind:\r\n" + 
						"Thus bad begins and worse remains behind.\r\n" + 
						"One word more, good lady.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"What shall I do?\r\n" + 
						"HAMLET\r\n" + 
						"Not this, by no means, that I bid you do:\r\n" + 
						"Let the bloat king tempt you again to bed;\r\n" + 
						"Pinch wanton on your cheek; call you his mouse;\r\n" + 
						"And let him, for a pair of reechy kisses,\r\n" + 
						"Or paddling in your neck with his damn'd fingers,\r\n" + 
						"Make you to ravel all this matter out,\r\n" + 
						"That I essentially am not in madness,\r\n" + 
						"But mad in craft. 'Twere good you let him know;\r\n" + 
						"For who, that's but a queen, fair, sober, wise,\r\n" + 
						"Would from a paddock, from a bat, a gib,\r\n" + 
						"Such dear concernings hide? who would do so?\r\n" + 
						"No, in despite of sense and secrecy,\r\n" + 
						"Unpeg the basket on the house's top.\r\n" + 
						"Let the birds fly, and, like the famous ape,\r\n" + 
						"To try conclusions, in the basket creep,\r\n" + 
						"And break your own neck down.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Be thou assured, if words be made of breath,\r\n" + 
						"And breath of life, I have no life to breathe\r\n" + 
						"What thou hast said to me.\r\n" + 
						"HAMLET\r\n" + 
						"I must to England; you know that?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Alack,\r\n" + 
						"I had forgot: 'tis so concluded on.\r\n" + 
						"HAMLET\r\n" + 
						"There's letters seal'd: and my two schoolfellows,\r\n" + 
						"Whom I will trust as I will adders fang'd,\r\n" + 
						"They bear the mandate; they must sweep my way,\r\n" + 
						"And marshal me to knavery. Let it work;\r\n" + 
						"For 'tis the sport to have the engineer\r\n" + 
						"Hoist with his own petard: and 't shall go hard\r\n" + 
						"But I will delve one yard below their mines,\r\n" + 
						"And blow them at the moon: O, 'tis most sweet,\r\n" + 
						"When in one line two crafts directly meet.\r\n" + 
						"This man shall set me packing:\r\n" + 
						"I'll lug the guts into the neighbour room.\r\n" + 
						"Mother, good night. Indeed this counsellor\r\n" + 
						"Is now most still, most secret and most grave,\r\n" + 
						"Who was in life a foolish prating knave.\r\n" + 
						"Come, sir, to draw toward an end with you.\r\n" + 
						"Good night, mother.\r\n" + 
						"Exeunt severally; HAMLET dragging in POLONIUS\r\n" + 
						"\r\n" + 
						"ACT IV\r\n" + 
						"SCENE I. A room in the castle.\r\n" + 
						"Enter KING CLAUDIUS, QUEEN GERTRUDE, ROSENCRANTZ, and GUILDENSTERN\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"There's matter in these sighs, these profound heaves:\r\n" + 
						"You must translate: 'tis fit we understand them.\r\n" + 
						"Where is your son?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Bestow this place on us a little while.\r\n" + 
						"Exeunt ROSENCRANTZ and GUILDENSTERN\r\n" + 
						"\r\n" + 
						"Ah, my good lord, what have I seen to-night!\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"What, Gertrude? How does Hamlet?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Mad as the sea and wind, when both contend\r\n" + 
						"Which is the mightier: in his lawless fit,\r\n" + 
						"Behind the arras hearing something stir,\r\n" + 
						"Whips out his rapier, cries, 'A rat, a rat!'\r\n" + 
						"And, in this brainish apprehension, kills\r\n" + 
						"The unseen good old man.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"O heavy deed!\r\n" + 
						"It had been so with us, had we been there:\r\n" + 
						"His liberty is full of threats to all;\r\n" + 
						"To you yourself, to us, to every one.\r\n" + 
						"Alas, how shall this bloody deed be answer'd?\r\n" + 
						"It will be laid to us, whose providence\r\n" + 
						"Should have kept short, restrain'd and out of haunt,\r\n" + 
						"This mad young man: but so much was our love,\r\n" + 
						"We would not understand what was most fit;\r\n" + 
						"But, like the owner of a foul disease,\r\n" + 
						"To keep it from divulging, let it feed\r\n" + 
						"Even on the pith of Life. Where is he gone?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"To draw apart the body he hath kill'd:\r\n" + 
						"O'er whom his very madness, like some ore\r\n" + 
						"Among a mineral of metals base,\r\n" + 
						"Shows itself pure; he weeps for what is done.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"O Gertrude, come away!\r\n" + 
						"The sun no sooner shall the mountains touch,\r\n" + 
						"But we will ship him hence: and this vile deed\r\n" + 
						"We must, with all our majesty and skill,\r\n" + 
						"Both countenance and excuse. Ho, Guildenstern!\r\n" + 
						"Re-enter ROSENCRANTZ and GUILDENSTERN\r\n" + 
						"\r\n" + 
						"Friends both, go join you with some further aid:\r\n" + 
						"Hamlet in madness hath Polonius slain,\r\n" + 
						"And from his mother's closet hath he dragg'd him:\r\n" + 
						"Go seek him out; speak fair, and bring the body\r\n" + 
						"Into the chapel. I pray you, haste in this.\r\n" + 
						"Exeunt ROSENCRANTZ and GUILDENSTERN\r\n" + 
						"\r\n" + 
						"Come, Gertrude, we'll call up our wisest friends;\r\n" + 
						"And let them know, both what we mean to do,\r\n" + 
						"And what's untimely done. O, come away!\r\n" + 
						"My soul is full of discord and dismay.\r\n" + 
						"Exeunt\r\n" + 
						"\r\n" + 
						"SCENE II. Another room in the castle.\r\n" + 
						"Enter HAMLET\r\n" + 
						"HAMLET\r\n" + 
						"Safely stowed.\r\n" + 
						"ROSENCRANTZ: GUILDENSTERN:\r\n" + 
						"[Within] Hamlet! Lord Hamlet!\r\n" + 
						"HAMLET\r\n" + 
						"What noise? who calls on Hamlet?\r\n" + 
						"O, here they come.\r\n" + 
						"Enter ROSENCRANTZ and GUILDENSTERN\r\n" + 
						"\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"What have you done, my lord, with the dead body?\r\n" + 
						"HAMLET\r\n" + 
						"Compounded it with dust, whereto 'tis kin.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Tell us where 'tis, that we may take it thence\r\n" + 
						"And bear it to the chapel.\r\n" + 
						"HAMLET\r\n" + 
						"Do not believe it.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Believe what?\r\n" + 
						"HAMLET\r\n" + 
						"That I can keep your counsel and not mine own.\r\n" + 
						"Besides, to be demanded of a sponge! what\r\n" + 
						"replication should be made by the son of a king?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Take you me for a sponge, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"Ay, sir, that soaks up the king's countenance, his\r\n" + 
						"rewards, his authorities. But such officers do the\r\n" + 
						"king best service in the end: he keeps them, like\r\n" + 
						"an ape, in the corner of his jaw; first mouthed, to\r\n" + 
						"be last swallowed: when he needs what you have\r\n" + 
						"gleaned, it is but squeezing you, and, sponge, you\r\n" + 
						"shall be dry again.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"I understand you not, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"I am glad of it: a knavish speech sleeps in a\r\n" + 
						"foolish ear.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"My lord, you must tell us where the body is, and go\r\n" + 
						"with us to the king.\r\n" + 
						"HAMLET\r\n" + 
						"The body is with the king, but the king is not with\r\n" + 
						"the body. The king is a thing--\r\n" + 
						"GUILDENSTERN\r\n" + 
						"A thing, my lord!\r\n" + 
						"HAMLET\r\n" + 
						"Of nothing: bring me to him. Hide fox, and all after.\r\n" + 
						"Exeunt\r\n" + 
						"\r\n" + 
						"SCENE III. Another room in the castle.\r\n" + 
						"Enter KING CLAUDIUS, attended\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"I have sent to seek him, and to find the body.\r\n" + 
						"How dangerous is it that this man goes loose!\r\n" + 
						"Yet must not we put the strong law on him:\r\n" + 
						"He's loved of the distracted multitude,\r\n" + 
						"Who like not in their judgment, but their eyes;\r\n" + 
						"And where tis so, the offender's scourge is weigh'd,\r\n" + 
						"But never the offence. To bear all smooth and even,\r\n" + 
						"This sudden sending him away must seem\r\n" + 
						"Deliberate pause: diseases desperate grown\r\n" + 
						"By desperate appliance are relieved,\r\n" + 
						"Or not at all.\r\n" + 
						"Enter ROSENCRANTZ\r\n" + 
						"\r\n" + 
						"How now! what hath befall'n?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Where the dead body is bestow'd, my lord,\r\n" + 
						"We cannot get from him.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"But where is he?\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Without, my lord; guarded, to know your pleasure.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Bring him before us.\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Ho, Guildenstern! bring in my lord.\r\n" + 
						"Enter HAMLET and GUILDENSTERN\r\n" + 
						"\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Now, Hamlet, where's Polonius?\r\n" + 
						"HAMLET\r\n" + 
						"At supper.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"At supper! where?\r\n" + 
						"HAMLET\r\n" + 
						"Not where he eats, but where he is eaten: a certain\r\n" + 
						"convocation of politic worms are e'en at him. Your\r\n" + 
						"worm is your only emperor for diet: we fat all\r\n" + 
						"creatures else to fat us, and we fat ourselves for\r\n" + 
						"maggots: your fat king and your lean beggar is but\r\n" + 
						"variable service, two dishes, but to one table:\r\n" + 
						"that's the end.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Alas, alas!\r\n" + 
						"HAMLET\r\n" + 
						"A man may fish with the worm that hath eat of a\r\n" + 
						"king, and eat of the fish that hath fed of that worm.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"What dost you mean by this?\r\n" + 
						"HAMLET\r\n" + 
						"Nothing but to show you how a king may go a\r\n" + 
						"progress through the guts of a beggar.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Where is Polonius?\r\n" + 
						"HAMLET\r\n" + 
						"In heaven; send hither to see: if your messenger\r\n" + 
						"find him not there, seek him i' the other place\r\n" + 
						"yourself. But indeed, if you find him not within\r\n" + 
						"this month, you shall nose him as you go up the\r\n" + 
						"stairs into the lobby.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Go seek him there.\r\n" + 
						"To some Attendants\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"He will stay till ye come.\r\n" + 
						"Exeunt Attendants\r\n" + 
						"\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Hamlet, this deed, for thine especial safety,--\r\n" + 
						"Which we do tender, as we dearly grieve\r\n" + 
						"For that which thou hast done,--must send thee hence\r\n" + 
						"With fiery quickness: therefore prepare thyself;\r\n" + 
						"The bark is ready, and the wind at help,\r\n" + 
						"The associates tend, and every thing is bent\r\n" + 
						"For England.\r\n" + 
						"HAMLET\r\n" + 
						"For England!\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Ay, Hamlet.\r\n" + 
						"HAMLET\r\n" + 
						"Good.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"So is it, if thou knew'st our purposes.\r\n" + 
						"HAMLET\r\n" + 
						"I see a cherub that sees them. But, come; for\r\n" + 
						"England! Farewell, dear mother.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Thy loving father, Hamlet.\r\n" + 
						"HAMLET\r\n" + 
						"My mother: father and mother is man and wife; man\r\n" + 
						"and wife is one flesh; and so, my mother. Come, for England!\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Follow him at foot; tempt him with speed aboard;\r\n" + 
						"Delay it not; I'll have him hence to-night:\r\n" + 
						"Away! for every thing is seal'd and done\r\n" + 
						"That else leans on the affair: pray you, make haste.\r\n" + 
						"Exeunt ROSENCRANTZ and GUILDENSTERN\r\n" + 
						"\r\n" + 
						"And, England, if my love thou hold'st at aught--\r\n" + 
						"As my great power thereof may give thee sense,\r\n" + 
						"Since yet thy cicatrice looks raw and red\r\n" + 
						"After the Danish sword, and thy free awe\r\n" + 
						"Pays homage to us--thou mayst not coldly set\r\n" + 
						"Our sovereign process; which imports at full,\r\n" + 
						"By letters congruing to that effect,\r\n" + 
						"The present death of Hamlet. Do it, England;\r\n" + 
						"For like the hectic in my blood he rages,\r\n" + 
						"And thou must cure me: till I know 'tis done,\r\n" + 
						"Howe'er my haps, my joys were ne'er begun.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"SCENE IV. A plain in Denmark.\r\n" + 
						"Enter FORTINBRAS, a Captain, and Soldiers, marching\r\n" + 
						"PRINCE FORTINBRAS\r\n" + 
						"Go, captain, from me greet the Danish king;\r\n" + 
						"Tell him that, by his licence, Fortinbras\r\n" + 
						"Craves the conveyance of a promised march\r\n" + 
						"Over his kingdom. You know the rendezvous.\r\n" + 
						"If that his majesty would aught with us,\r\n" + 
						"We shall express our duty in his eye;\r\n" + 
						"And let him know so.\r\n" + 
						"Captain\r\n" + 
						"I will do't, my lord.\r\n" + 
						"PRINCE FORTINBRAS\r\n" + 
						"Go softly on.\r\n" + 
						"Exeunt FORTINBRAS and Soldiers\r\n" + 
						"\r\n" + 
						"Enter HAMLET, ROSENCRANTZ, GUILDENSTERN, and others\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"Good sir, whose powers are these?\r\n" + 
						"Captain\r\n" + 
						"They are of Norway, sir.\r\n" + 
						"HAMLET\r\n" + 
						"How purposed, sir, I pray you?\r\n" + 
						"Captain\r\n" + 
						"Against some part of Poland.\r\n" + 
						"HAMLET\r\n" + 
						"Who commands them, sir?\r\n" + 
						"Captain\r\n" + 
						"The nephews to old Norway, Fortinbras.\r\n" + 
						"HAMLET\r\n" + 
						"Goes it against the main of Poland, sir,\r\n" + 
						"Or for some frontier?\r\n" + 
						"Captain\r\n" + 
						"Truly to speak, and with no addition,\r\n" + 
						"We go to gain a little patch of ground\r\n" + 
						"That hath in it no profit but the name.\r\n" + 
						"To pay five ducats, five, I would not farm it;\r\n" + 
						"Nor will it yield to Norway or the Pole\r\n" + 
						"A ranker rate, should it be sold in fee.\r\n" + 
						"HAMLET\r\n" + 
						"Why, then the Polack never will defend it.\r\n" + 
						"Captain\r\n" + 
						"Yes, it is already garrison'd.\r\n" + 
						"HAMLET\r\n" + 
						"Two thousand souls and twenty thousand ducats\r\n" + 
						"Will not debate the question of this straw:\r\n" + 
						"This is the imposthume of much wealth and peace,\r\n" + 
						"That inward breaks, and shows no cause without\r\n" + 
						"Why the man dies. I humbly thank you, sir.\r\n" + 
						"Captain\r\n" + 
						"God be wi' you, sir.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"ROSENCRANTZ\r\n" + 
						"Wilt please you go, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"I'll be with you straight go a little before.\r\n" + 
						"Exeunt all except HAMLET\r\n" + 
						"\r\n" + 
						"How all occasions do inform against me,\r\n" + 
						"And spur my dull revenge! What is a man,\r\n" + 
						"If his chief good and market of his time\r\n" + 
						"Be but to sleep and feed? a beast, no more.\r\n" + 
						"Sure, he that made us with such large discourse,\r\n" + 
						"Looking before and after, gave us not\r\n" + 
						"That capability and god-like reason\r\n" + 
						"To fust in us unused. Now, whether it be\r\n" + 
						"Bestial oblivion, or some craven scruple\r\n" + 
						"Of thinking too precisely on the event,\r\n" + 
						"A thought which, quarter'd, hath but one part wisdom\r\n" + 
						"And ever three parts coward, I do not know\r\n" + 
						"Why yet I live to say 'This thing's to do;'\r\n" + 
						"Sith I have cause and will and strength and means\r\n" + 
						"To do't. Examples gross as earth exhort me:\r\n" + 
						"Witness this army of such mass and charge\r\n" + 
						"Led by a delicate and tender prince,\r\n" + 
						"Whose spirit with divine ambition puff'd\r\n" + 
						"Makes mouths at the invisible event,\r\n" + 
						"Exposing what is mortal and unsure\r\n" + 
						"To all that fortune, death and danger dare,\r\n" + 
						"Even for an egg-shell. Rightly to be great\r\n" + 
						"Is not to stir without great argument,\r\n" + 
						"But greatly to find quarrel in a straw\r\n" + 
						"When honour's at the stake. How stand I then,\r\n" + 
						"That have a father kill'd, a mother stain'd,\r\n" + 
						"Excitements of my reason and my blood,\r\n" + 
						"And let all sleep? while, to my shame, I see\r\n" + 
						"The imminent death of twenty thousand men,\r\n" + 
						"That, for a fantasy and trick of fame,\r\n" + 
						"Go to their graves like beds, fight for a plot\r\n" + 
						"Whereon the numbers cannot try the cause,\r\n" + 
						"Which is not tomb enough and continent\r\n" + 
						"To hide the slain? O, from this time forth,\r\n" + 
						"My thoughts be bloody, or be nothing worth!\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"SCENE V. Elsinore. A room in the castle.\r\n" + 
						"Enter QUEEN GERTRUDE, HORATIO, and a Gentleman\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"I will not speak with her.\r\n" + 
						"Gentleman\r\n" + 
						"She is importunate, indeed distract:\r\n" + 
						"Her mood will needs be pitied.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"What would she have?\r\n" + 
						"Gentleman\r\n" + 
						"She speaks much of her father; says she hears\r\n" + 
						"There's tricks i' the world; and hems, and beats her heart;\r\n" + 
						"Spurns enviously at straws; speaks things in doubt,\r\n" + 
						"That carry but half sense: her speech is nothing,\r\n" + 
						"Yet the unshaped use of it doth move\r\n" + 
						"The hearers to collection; they aim at it,\r\n" + 
						"And botch the words up fit to their own thoughts;\r\n" + 
						"Which, as her winks, and nods, and gestures\r\n" + 
						"yield them,\r\n" + 
						"Indeed would make one think there might be thought,\r\n" + 
						"Though nothing sure, yet much unhappily.\r\n" + 
						"HORATIO\r\n" + 
						"'Twere good she were spoken with; for she may strew\r\n" + 
						"Dangerous conjectures in ill-breeding minds.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Let her come in.\r\n" + 
						"Exit HORATIO\r\n" + 
						"\r\n" + 
						"To my sick soul, as sin's true nature is,\r\n" + 
						"Each toy seems prologue to some great amiss:\r\n" + 
						"So full of artless jealousy is guilt,\r\n" + 
						"It spills itself in fearing to be spilt.\r\n" + 
						"Re-enter HORATIO, with OPHELIA\r\n" + 
						"\r\n" + 
						"OPHELIA\r\n" + 
						"Where is the beauteous majesty of Denmark?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"How now, Ophelia!\r\n" + 
						"OPHELIA\r\n" + 
						"[Sings]\r\n" + 
						"How should I your true love know\r\n" + 
						"From another one?\r\n" + 
						"By his cockle hat and staff,\r\n" + 
						"And his sandal shoon.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Alas, sweet lady, what imports this song?\r\n" + 
						"OPHELIA\r\n" + 
						"Say you? nay, pray you, mark.\r\n" + 
						"Sings\r\n" + 
						"\r\n" + 
						"He is dead and gone, lady,\r\n" + 
						"He is dead and gone;\r\n" + 
						"At his head a grass-green turf,\r\n" + 
						"At his heels a stone.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Nay, but, Ophelia,--\r\n" + 
						"OPHELIA\r\n" + 
						"Pray you, mark.\r\n" + 
						"Sings\r\n" + 
						"\r\n" + 
						"White his shroud as the mountain snow,--\r\n" + 
						"Enter KING CLAUDIUS\r\n" + 
						"\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Alas, look here, my lord.\r\n" + 
						"OPHELIA\r\n" + 
						"[Sings]\r\n" + 
						"Larded with sweet flowers\r\n" + 
						"Which bewept to the grave did go\r\n" + 
						"With true-love showers.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"How do you, pretty lady?\r\n" + 
						"OPHELIA\r\n" + 
						"Well, God 'ild you! They say the owl was a baker's\r\n" + 
						"daughter. Lord, we know what we are, but know not\r\n" + 
						"what we may be. God be at your table!\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Conceit upon her father.\r\n" + 
						"OPHELIA\r\n" + 
						"Pray you, let's have no words of this; but when they\r\n" + 
						"ask you what it means, say you this:\r\n" + 
						"Sings\r\n" + 
						"\r\n" + 
						"To-morrow is Saint Valentine's day,\r\n" + 
						"All in the morning betime,\r\n" + 
						"And I a maid at your window,\r\n" + 
						"To be your Valentine.\r\n" + 
						"Then up he rose, and donn'd his clothes,\r\n" + 
						"And dupp'd the chamber-door;\r\n" + 
						"Let in the maid, that out a maid\r\n" + 
						"Never departed more.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Pretty Ophelia!\r\n" + 
						"OPHELIA\r\n" + 
						"Indeed, la, without an oath, I'll make an end on't:\r\n" + 
						"Sings\r\n" + 
						"\r\n" + 
						"By Gis and by Saint Charity,\r\n" + 
						"Alack, and fie for shame!\r\n" + 
						"Young men will do't, if they come to't;\r\n" + 
						"By cock, they are to blame.\r\n" + 
						"Quoth she, before you tumbled me,\r\n" + 
						"You promised me to wed.\r\n" + 
						"So would I ha' done, by yonder sun,\r\n" + 
						"An thou hadst not come to my bed.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"How long hath she been thus?\r\n" + 
						"OPHELIA\r\n" + 
						"I hope all will be well. We must be patient: but I\r\n" + 
						"cannot choose but weep, to think they should lay him\r\n" + 
						"i' the cold ground. My brother shall know of it:\r\n" + 
						"and so I thank you for your good counsel. Come, my\r\n" + 
						"coach! Good night, ladies; good night, sweet ladies;\r\n" + 
						"good night, good night.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Follow her close; give her good watch,\r\n" + 
						"I pray you.\r\n" + 
						"Exit HORATIO\r\n" + 
						"\r\n" + 
						"O, this is the poison of deep grief; it springs\r\n" + 
						"All from her father's death. O Gertrude, Gertrude,\r\n" + 
						"When sorrows come, they come not single spies\r\n" + 
						"But in battalions. First, her father slain:\r\n" + 
						"Next, your son gone; and he most violent author\r\n" + 
						"Of his own just remove: the people muddied,\r\n" + 
						"Thick and unwholesome in their thoughts and whispers,\r\n" + 
						"For good Polonius' death; and we have done but greenly,\r\n" + 
						"In hugger-mugger to inter him: poor Ophelia\r\n" + 
						"Divided from herself and her fair judgment,\r\n" + 
						"Without the which we are pictures, or mere beasts:\r\n" + 
						"Last, and as much containing as all these,\r\n" + 
						"Her brother is in secret come from France;\r\n" + 
						"Feeds on his wonder, keeps himself in clouds,\r\n" + 
						"And wants not buzzers to infect his ear\r\n" + 
						"With pestilent speeches of his father's death;\r\n" + 
						"Wherein necessity, of matter beggar'd,\r\n" + 
						"Will nothing stick our person to arraign\r\n" + 
						"In ear and ear. O my dear Gertrude, this,\r\n" + 
						"Like to a murdering-piece, in many places\r\n" + 
						"Gives me superfluous death.\r\n" + 
						"A noise within\r\n" + 
						"\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Alack, what noise is this?\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Where are my Switzers? Let them guard the door.\r\n" + 
						"Enter another Gentleman\r\n" + 
						"\r\n" + 
						"What is the matter?\r\n" + 
						"Gentleman\r\n" + 
						"Save yourself, my lord:\r\n" + 
						"The ocean, overpeering of his list,\r\n" + 
						"Eats not the flats with more impetuous haste\r\n" + 
						"Than young Laertes, in a riotous head,\r\n" + 
						"O'erbears your officers. The rabble call him lord;\r\n" + 
						"And, as the world were now but to begin,\r\n" + 
						"Antiquity forgot, custom not known,\r\n" + 
						"The ratifiers and props of every word,\r\n" + 
						"They cry 'Choose we: Laertes shall be king:'\r\n" + 
						"Caps, hands, and tongues, applaud it to the clouds:\r\n" + 
						"'Laertes shall be king, Laertes king!'\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"How cheerfully on the false trail they cry!\r\n" + 
						"O, this is counter, you false Danish dogs!\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"The doors are broke.\r\n" + 
						"Noise within\r\n" + 
						"\r\n" + 
						"Enter LAERTES, armed; Danes following\r\n" + 
						"\r\n" + 
						"LAERTES\r\n" + 
						"Where is this king? Sirs, stand you all without.\r\n" + 
						"Danes\r\n" + 
						"No, let's come in.\r\n" + 
						"LAERTES\r\n" + 
						"I pray you, give me leave.\r\n" + 
						"Danes\r\n" + 
						"We will, we will.\r\n" + 
						"They retire without the door\r\n" + 
						"\r\n" + 
						"LAERTES\r\n" + 
						"I thank you: keep the door. O thou vile king,\r\n" + 
						"Give me my father!\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Calmly, good Laertes.\r\n" + 
						"LAERTES\r\n" + 
						"That drop of blood that's calm proclaims me bastard,\r\n" + 
						"Cries cuckold to my father, brands the harlot\r\n" + 
						"Even here, between the chaste unsmirched brow\r\n" + 
						"Of my true mother.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"What is the cause, Laertes,\r\n" + 
						"That thy rebellion looks so giant-like?\r\n" + 
						"Let him go, Gertrude; do not fear our person:\r\n" + 
						"There's such divinity doth hedge a king,\r\n" + 
						"That treason can but peep to what it would,\r\n" + 
						"Acts little of his will. Tell me, Laertes,\r\n" + 
						"Why thou art thus incensed. Let him go, Gertrude.\r\n" + 
						"Speak, man.\r\n" + 
						"LAERTES\r\n" + 
						"Where is my father?\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Dead.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"But not by him.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Let him demand his fill.\r\n" + 
						"LAERTES\r\n" + 
						"How came he dead? I'll not be juggled with:\r\n" + 
						"To hell, allegiance! vows, to the blackest devil!\r\n" + 
						"Conscience and grace, to the profoundest pit!\r\n" + 
						"I dare damnation. To this point I stand,\r\n" + 
						"That both the worlds I give to negligence,\r\n" + 
						"Let come what comes; only I'll be revenged\r\n" + 
						"Most thoroughly for my father.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Who shall stay you?\r\n" + 
						"LAERTES\r\n" + 
						"My will, not all the world:\r\n" + 
						"And for my means, I'll husband them so well,\r\n" + 
						"They shall go far with little.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Good Laertes,\r\n" + 
						"If you desire to know the certainty\r\n" + 
						"Of your dear father's death, is't writ in your revenge,\r\n" + 
						"That, swoopstake, you will draw both friend and foe,\r\n" + 
						"Winner and loser?\r\n" + 
						"LAERTES\r\n" + 
						"None but his enemies.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Will you know them then?\r\n" + 
						"LAERTES\r\n" + 
						"To his good friends thus wide I'll ope my arms;\r\n" + 
						"And like the kind life-rendering pelican,\r\n" + 
						"Repast them with my blood.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Why, now you speak\r\n" + 
						"Like a good child and a true gentleman.\r\n" + 
						"That I am guiltless of your father's death,\r\n" + 
						"And am most sensible in grief for it,\r\n" + 
						"It shall as level to your judgment pierce\r\n" + 
						"As day does to your eye.\r\n" + 
						"Danes\r\n" + 
						"[Within] Let her come in.\r\n" + 
						"LAERTES\r\n" + 
						"How now! what noise is that?\r\n" + 
						"Re-enter OPHELIA\r\n" + 
						"\r\n" + 
						"O heat, dry up my brains! tears seven times salt,\r\n" + 
						"Burn out the sense and virtue of mine eye!\r\n" + 
						"By heaven, thy madness shall be paid by weight,\r\n" + 
						"Till our scale turn the beam. O rose of May!\r\n" + 
						"Dear maid, kind sister, sweet Ophelia!\r\n" + 
						"O heavens! is't possible, a young maid's wits\r\n" + 
						"Should be as moral as an old man's life?\r\n" + 
						"Nature is fine in love, and where 'tis fine,\r\n" + 
						"It sends some precious instance of itself\r\n" + 
						"After the thing it loves.\r\n" + 
						"OPHELIA\r\n" + 
						"[Sings]\r\n" + 
						"They bore him barefaced on the bier;\r\n" + 
						"Hey non nonny, nonny, hey nonny;\r\n" + 
						"And in his grave rain'd many a tear:--\r\n" + 
						"Fare you well, my dove!\r\n" + 
						"LAERTES\r\n" + 
						"Hadst thou thy wits, and didst persuade revenge,\r\n" + 
						"It could not move thus.\r\n" + 
						"OPHELIA\r\n" + 
						"[Sings]\r\n" + 
						"You must sing a-down a-down,\r\n" + 
						"An you call him a-down-a.\r\n" + 
						"O, how the wheel becomes it! It is the false\r\n" + 
						"steward, that stole his master's daughter.\r\n" + 
						"LAERTES\r\n" + 
						"This nothing's more than matter.\r\n" + 
						"OPHELIA\r\n" + 
						"There's rosemary, that's for remembrance; pray,\r\n" + 
						"love, remember: and there is pansies. that's for thoughts.\r\n" + 
						"LAERTES\r\n" + 
						"A document in madness, thoughts and remembrance fitted.\r\n" + 
						"OPHELIA\r\n" + 
						"There's fennel for you, and columbines: there's rue\r\n" + 
						"for you; and here's some for me: we may call it\r\n" + 
						"herb-grace o' Sundays: O you must wear your rue with\r\n" + 
						"a difference. There's a daisy: I would give you\r\n" + 
						"some violets, but they withered all when my father\r\n" + 
						"died: they say he made a good end,--\r\n" + 
						"Sings\r\n" + 
						"\r\n" + 
						"For bonny sweet Robin is all my joy.\r\n" + 
						"LAERTES\r\n" + 
						"Thought and affliction, passion, hell itself,\r\n" + 
						"She turns to favour and to prettiness.\r\n" + 
						"OPHELIA\r\n" + 
						"[Sings]\r\n" + 
						"And will he not come again?\r\n" + 
						"And will he not come again?\r\n" + 
						"No, no, he is dead:\r\n" + 
						"Go to thy death-bed:\r\n" + 
						"He never will come again.\r\n" + 
						"His beard was as white as snow,\r\n" + 
						"All flaxen was his poll:\r\n" + 
						"He is gone, he is gone,\r\n" + 
						"And we cast away moan:\r\n" + 
						"God ha' mercy on his soul!\r\n" + 
						"And of all Christian souls, I pray God. God be wi' ye.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"LAERTES\r\n" + 
						"Do you see this, O God?\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Laertes, I must commune with your grief,\r\n" + 
						"Or you deny me right. Go but apart,\r\n" + 
						"Make choice of whom your wisest friends you will.\r\n" + 
						"And they shall hear and judge 'twixt you and me:\r\n" + 
						"If by direct or by collateral hand\r\n" + 
						"They find us touch'd, we will our kingdom give,\r\n" + 
						"Our crown, our life, and all that we can ours,\r\n" + 
						"To you in satisfaction; but if not,\r\n" + 
						"Be you content to lend your patience to us,\r\n" + 
						"And we shall jointly labour with your soul\r\n" + 
						"To give it due content.\r\n" + 
						"LAERTES\r\n" + 
						"Let this be so;\r\n" + 
						"His means of death, his obscure funeral--\r\n" + 
						"No trophy, sword, nor hatchment o'er his bones,\r\n" + 
						"No noble rite nor formal ostentation--\r\n" + 
						"Cry to be heard, as 'twere from heaven to earth,\r\n" + 
						"That I must call't in question.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"So you shall;\r\n" + 
						"And where the offence is let the great axe fall.\r\n" + 
						"I pray you, go with me.\r\n" + 
						"Exeunt\r\n" + 
						"\r\n" + 
						"SCENE VI. Another room in the castle.\r\n" + 
						"Enter HORATIO and a Servant\r\n" + 
						"HORATIO\r\n" + 
						"What are they that would speak with me?\r\n" + 
						"Servant\r\n" + 
						"Sailors, sir: they say they have letters for you.\r\n" + 
						"HORATIO\r\n" + 
						"Let them come in.\r\n" + 
						"Exit Servant\r\n" + 
						"\r\n" + 
						"I do not know from what part of the world\r\n" + 
						"I should be greeted, if not from Lord Hamlet.\r\n" + 
						"Enter Sailors\r\n" + 
						"\r\n" + 
						"First Sailor\r\n" + 
						"God bless you, sir.\r\n" + 
						"HORATIO\r\n" + 
						"Let him bless thee too.\r\n" + 
						"First Sailor\r\n" + 
						"He shall, sir, an't please him. There's a letter for\r\n" + 
						"you, sir; it comes from the ambassador that was\r\n" + 
						"bound for England; if your name be Horatio, as I am\r\n" + 
						"let to know it is.\r\n" + 
						"HORATIO\r\n" + 
						"[Reads] 'Horatio, when thou shalt have overlooked\r\n" + 
						"this, give these fellows some means to the king:\r\n" + 
						"they have letters for him. Ere we were two days old\r\n" + 
						"at sea, a pirate of very warlike appointment gave us\r\n" + 
						"chase. Finding ourselves too slow of sail, we put on\r\n" + 
						"a compelled valour, and in the grapple I boarded\r\n" + 
						"them: on the instant they got clear of our ship; so\r\n" + 
						"I alone became their prisoner. They have dealt with\r\n" + 
						"me like thieves of mercy: but they knew what they\r\n" + 
						"did; I am to do a good turn for them. Let the king\r\n" + 
						"have the letters I have sent; and repair thou to me\r\n" + 
						"with as much speed as thou wouldst fly death. I\r\n" + 
						"have words to speak in thine ear will make thee\r\n" + 
						"dumb; yet are they much too light for the bore of\r\n" + 
						"the matter. These good fellows will bring thee\r\n" + 
						"where I am. Rosencrantz and Guildenstern hold their\r\n" + 
						"course for England: of them I have much to tell\r\n" + 
						"thee. Farewell.\r\n" + 
						"'He that thou knowest thine, HAMLET.'\r\n" + 
						"Come, I will make you way for these your letters;\r\n" + 
						"And do't the speedier, that you may direct me\r\n" + 
						"To him from whom you brought them.\r\n" + 
						"Exeunt\r\n" + 
						"\r\n" + 
						"SCENE VII. Another room in the castle.\r\n" + 
						"Enter KING CLAUDIUS and LAERTES\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Now must your conscience my acquaintance seal,\r\n" + 
						"And you must put me in your heart for friend,\r\n" + 
						"Sith you have heard, and with a knowing ear,\r\n" + 
						"That he which hath your noble father slain\r\n" + 
						"Pursued my life.\r\n" + 
						"LAERTES\r\n" + 
						"It well appears: but tell me\r\n" + 
						"Why you proceeded not against these feats,\r\n" + 
						"So crimeful and so capital in nature,\r\n" + 
						"As by your safety, wisdom, all things else,\r\n" + 
						"You mainly were stirr'd up.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"O, for two special reasons;\r\n" + 
						"Which may to you, perhaps, seem much unsinew'd,\r\n" + 
						"But yet to me they are strong. The queen his mother\r\n" + 
						"Lives almost by his looks; and for myself--\r\n" + 
						"My virtue or my plague, be it either which--\r\n" + 
						"She's so conjunctive to my life and soul,\r\n" + 
						"That, as the star moves not but in his sphere,\r\n" + 
						"I could not but by her. The other motive,\r\n" + 
						"Why to a public count I might not go,\r\n" + 
						"Is the great love the general gender bear him;\r\n" + 
						"Who, dipping all his faults in their affection,\r\n" + 
						"Would, like the spring that turneth wood to stone,\r\n" + 
						"Convert his gyves to graces; so that my arrows,\r\n" + 
						"Too slightly timber'd for so loud a wind,\r\n" + 
						"Would have reverted to my bow again,\r\n" + 
						"And not where I had aim'd them.\r\n" + 
						"LAERTES\r\n" + 
						"And so have I a noble father lost;\r\n" + 
						"A sister driven into desperate terms,\r\n" + 
						"Whose worth, if praises may go back again,\r\n" + 
						"Stood challenger on mount of all the age\r\n" + 
						"For her perfections: but my revenge will come.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Break not your sleeps for that: you must not think\r\n" + 
						"That we are made of stuff so flat and dull\r\n" + 
						"That we can let our beard be shook with danger\r\n" + 
						"And think it pastime. You shortly shall hear more:\r\n" + 
						"I loved your father, and we love ourself;\r\n" + 
						"And that, I hope, will teach you to imagine--\r\n" + 
						"Enter a Messenger\r\n" + 
						"\r\n" + 
						"How now! what news?\r\n" + 
						"Messenger\r\n" + 
						"Letters, my lord, from Hamlet:\r\n" + 
						"This to your majesty; this to the queen.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"From Hamlet! who brought them?\r\n" + 
						"Messenger\r\n" + 
						"Sailors, my lord, they say; I saw them not:\r\n" + 
						"They were given me by Claudio; he received them\r\n" + 
						"Of him that brought them.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Laertes, you shall hear them. Leave us.\r\n" + 
						"Exit Messenger\r\n" + 
						"\r\n" + 
						"Reads\r\n" + 
						"\r\n" + 
						"'High and mighty, You shall know I am set naked on\r\n" + 
						"your kingdom. To-morrow shall I beg leave to see\r\n" + 
						"your kingly eyes: when I shall, first asking your\r\n" + 
						"pardon thereunto, recount the occasion of my sudden\r\n" + 
						"and more strange return. 'HAMLET.'\r\n" + 
						"What should this mean? Are all the rest come back?\r\n" + 
						"Or is it some abuse, and no such thing?\r\n" + 
						"LAERTES\r\n" + 
						"Know you the hand?\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"'Tis Hamlets character. 'Naked!\r\n" + 
						"And in a postscript here, he says 'alone.'\r\n" + 
						"Can you advise me?\r\n" + 
						"LAERTES\r\n" + 
						"I'm lost in it, my lord. But let him come;\r\n" + 
						"It warms the very sickness in my heart,\r\n" + 
						"That I shall live and tell him to his teeth,\r\n" + 
						"'Thus didest thou.'\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"If it be so, Laertes--\r\n" + 
						"As how should it be so? how otherwise?--\r\n" + 
						"Will you be ruled by me?\r\n" + 
						"LAERTES\r\n" + 
						"Ay, my lord;\r\n" + 
						"So you will not o'errule me to a peace.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"To thine own peace. If he be now return'd,\r\n" + 
						"As checking at his voyage, and that he means\r\n" + 
						"No more to undertake it, I will work him\r\n" + 
						"To an exploit, now ripe in my device,\r\n" + 
						"Under the which he shall not choose but fall:\r\n" + 
						"And for his death no wind of blame shall breathe,\r\n" + 
						"But even his mother shall uncharge the practise\r\n" + 
						"And call it accident.\r\n" + 
						"LAERTES\r\n" + 
						"My lord, I will be ruled;\r\n" + 
						"The rather, if you could devise it so\r\n" + 
						"That I might be the organ.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"It falls right.\r\n" + 
						"You have been talk'd of since your travel much,\r\n" + 
						"And that in Hamlet's hearing, for a quality\r\n" + 
						"Wherein, they say, you shine: your sum of parts\r\n" + 
						"Did not together pluck such envy from him\r\n" + 
						"As did that one, and that, in my regard,\r\n" + 
						"Of the unworthiest siege.\r\n" + 
						"LAERTES\r\n" + 
						"What part is that, my lord?\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"A very riband in the cap of youth,\r\n" + 
						"Yet needful too; for youth no less becomes\r\n" + 
						"The light and careless livery that it wears\r\n" + 
						"Than settled age his sables and his weeds,\r\n" + 
						"Importing health and graveness. Two months since,\r\n" + 
						"Here was a gentleman of Normandy:--\r\n" + 
						"I've seen myself, and served against, the French,\r\n" + 
						"And they can well on horseback: but this gallant\r\n" + 
						"Had witchcraft in't; he grew unto his seat;\r\n" + 
						"And to such wondrous doing brought his horse,\r\n" + 
						"As he had been incorpsed and demi-natured\r\n" + 
						"With the brave beast: so far he topp'd my thought,\r\n" + 
						"That I, in forgery of shapes and tricks,\r\n" + 
						"Come short of what he did.\r\n" + 
						"LAERTES\r\n" + 
						"A Norman was't?\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"A Norman.\r\n" + 
						"LAERTES\r\n" + 
						"Upon my life, Lamond.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"The very same.\r\n" + 
						"LAERTES\r\n" + 
						"I know him well: he is the brooch indeed\r\n" + 
						"And gem of all the nation.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"He made confession of you,\r\n" + 
						"And gave you such a masterly report\r\n" + 
						"For art and exercise in your defence\r\n" + 
						"And for your rapier most especially,\r\n" + 
						"That he cried out, 'twould be a sight indeed,\r\n" + 
						"If one could match you: the scrimers of their nation,\r\n" + 
						"He swore, had had neither motion, guard, nor eye,\r\n" + 
						"If you opposed them. Sir, this report of his\r\n" + 
						"Did Hamlet so envenom with his envy\r\n" + 
						"That he could nothing do but wish and beg\r\n" + 
						"Your sudden coming o'er, to play with him.\r\n" + 
						"Now, out of this,--\r\n" + 
						"LAERTES\r\n" + 
						"What out of this, my lord?\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Laertes, was your father dear to you?\r\n" + 
						"Or are you like the painting of a sorrow,\r\n" + 
						"A face without a heart?\r\n" + 
						"LAERTES\r\n" + 
						"Why ask you this?\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Not that I think you did not love your father;\r\n" + 
						"But that I know love is begun by time;\r\n" + 
						"And that I see, in passages of proof,\r\n" + 
						"Time qualifies the spark and fire of it.\r\n" + 
						"There lives within the very flame of love\r\n" + 
						"A kind of wick or snuff that will abate it;\r\n" + 
						"And nothing is at a like goodness still;\r\n" + 
						"For goodness, growing to a plurisy,\r\n" + 
						"Dies in his own too much: that we would do\r\n" + 
						"We should do when we would; for this 'would' changes\r\n" + 
						"And hath abatements and delays as many\r\n" + 
						"As there are tongues, are hands, are accidents;\r\n" + 
						"And then this 'should' is like a spendthrift sigh,\r\n" + 
						"That hurts by easing. But, to the quick o' the ulcer:--\r\n" + 
						"Hamlet comes back: what would you undertake,\r\n" + 
						"To show yourself your father's son in deed\r\n" + 
						"More than in words?\r\n" + 
						"LAERTES\r\n" + 
						"To cut his throat i' the church.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"No place, indeed, should murder sanctuarize;\r\n" + 
						"Revenge should have no bounds. But, good Laertes,\r\n" + 
						"Will you do this, keep close within your chamber.\r\n" + 
						"Hamlet return'd shall know you are come home:\r\n" + 
						"We'll put on those shall praise your excellence\r\n" + 
						"And set a double varnish on the fame\r\n" + 
						"The Frenchman gave you, bring you in fine together\r\n" + 
						"And wager on your heads: he, being remiss,\r\n" + 
						"Most generous and free from all contriving,\r\n" + 
						"Will not peruse the foils; so that, with ease,\r\n" + 
						"Or with a little shuffling, you may choose\r\n" + 
						"A sword unbated, and in a pass of practise\r\n" + 
						"Requite him for your father.\r\n" + 
						"LAERTES\r\n" + 
						"I will do't:\r\n" + 
						"And, for that purpose, I'll anoint my sword.\r\n" + 
						"I bought an unction of a mountebank,\r\n" + 
						"So mortal that, but dip a knife in it,\r\n" + 
						"Where it draws blood no cataplasm so rare,\r\n" + 
						"Collected from all simples that have virtue\r\n" + 
						"Under the moon, can save the thing from death\r\n" + 
						"That is but scratch'd withal: I'll touch my point\r\n" + 
						"With this contagion, that, if I gall him slightly,\r\n" + 
						"It may be death.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Let's further think of this;\r\n" + 
						"Weigh what convenience both of time and means\r\n" + 
						"May fit us to our shape: if this should fail,\r\n" + 
						"And that our drift look through our bad performance,\r\n" + 
						"'Twere better not assay'd: therefore this project\r\n" + 
						"Should have a back or second, that might hold,\r\n" + 
						"If this should blast in proof. Soft! let me see:\r\n" + 
						"We'll make a solemn wager on your cunnings: I ha't.\r\n" + 
						"When in your motion you are hot and dry--\r\n" + 
						"As make your bouts more violent to that end--\r\n" + 
						"And that he calls for drink, I'll have prepared him\r\n" + 
						"A chalice for the nonce, whereon but sipping,\r\n" + 
						"If he by chance escape your venom'd stuck,\r\n" + 
						"Our purpose may hold there.\r\n" + 
						"Enter QUEEN GERTRUDE\r\n" + 
						"\r\n" + 
						"How now, sweet queen!\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"One woe doth tread upon another's heel,\r\n" + 
						"So fast they follow; your sister's drown'd, Laertes.\r\n" + 
						"LAERTES\r\n" + 
						"Drown'd! O, where?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"There is a willow grows aslant a brook,\r\n" + 
						"That shows his hoar leaves in the glassy stream;\r\n" + 
						"There with fantastic garlands did she come\r\n" + 
						"Of crow-flowers, nettles, daisies, and long purples\r\n" + 
						"That liberal shepherds give a grosser name,\r\n" + 
						"But our cold maids do dead men's fingers call them:\r\n" + 
						"There, on the pendent boughs her coronet weeds\r\n" + 
						"Clambering to hang, an envious sliver broke;\r\n" + 
						"When down her weedy trophies and herself\r\n" + 
						"Fell in the weeping brook. Her clothes spread wide;\r\n" + 
						"And, mermaid-like, awhile they bore her up:\r\n" + 
						"Which time she chanted snatches of old tunes;\r\n" + 
						"As one incapable of her own distress,\r\n" + 
						"Or like a creature native and indued\r\n" + 
						"Unto that element: but long it could not be\r\n" + 
						"Till that her garments, heavy with their drink,\r\n" + 
						"Pull'd the poor wretch from her melodious lay\r\n" + 
						"To muddy death.\r\n" + 
						"LAERTES\r\n" + 
						"Alas, then, she is drown'd?\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Drown'd, drown'd.\r\n" + 
						"LAERTES\r\n" + 
						"Too much of water hast thou, poor Ophelia,\r\n" + 
						"And therefore I forbid my tears: but yet\r\n" + 
						"It is our trick; nature her custom holds,\r\n" + 
						"Let shame say what it will: when these are gone,\r\n" + 
						"The woman will be out. Adieu, my lord:\r\n" + 
						"I have a speech of fire, that fain would blaze,\r\n" + 
						"But that this folly douts it.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Let's follow, Gertrude:\r\n" + 
						"How much I had to do to calm his rage!\r\n" + 
						"Now fear I this will give it start again;\r\n" + 
						"Therefore let's follow.\r\n" + 
						"Exeunt\r\n" + 
						"\r\n" + 
						"ACT V\r\n" + 
						"SCENE I. A churchyard.\r\n" + 
						"Enter two Clowns, with spades, & c\r\n" + 
						"First Clown\r\n" + 
						"Is she to be buried in Christian burial that\r\n" + 
						"wilfully seeks her own salvation?\r\n" + 
						"Second Clown\r\n" + 
						"I tell thee she is: and therefore make her grave\r\n" + 
						"straight: the crowner hath sat on her, and finds it\r\n" + 
						"Christian burial.\r\n" + 
						"First Clown\r\n" + 
						"How can that be, unless she drowned herself in her\r\n" + 
						"own defence?\r\n" + 
						"Second Clown\r\n" + 
						"Why, 'tis found so.\r\n" + 
						"First Clown\r\n" + 
						"It must be 'se offendendo;' it cannot be else. For\r\n" + 
						"here lies the point: if I drown myself wittingly,\r\n" + 
						"it argues an act: and an act hath three branches: it\r\n" + 
						"is, to act, to do, to perform: argal, she drowned\r\n" + 
						"herself wittingly.\r\n" + 
						"Second Clown\r\n" + 
						"Nay, but hear you, goodman delver,--\r\n" + 
						"First Clown\r\n" + 
						"Give me leave. Here lies the water; good: here\r\n" + 
						"stands the man; good; if the man go to this water,\r\n" + 
						"and drown himself, it is, will he, nill he, he\r\n" + 
						"goes,--mark you that; but if the water come to him\r\n" + 
						"and drown him, he drowns not himself: argal, he\r\n" + 
						"that is not guilty of his own death shortens not his own life.\r\n" + 
						"Second Clown\r\n" + 
						"But is this law?\r\n" + 
						"First Clown\r\n" + 
						"Ay, marry, is't; crowner's quest law.\r\n" + 
						"Second Clown\r\n" + 
						"Will you ha' the truth on't? If this had not been\r\n" + 
						"a gentlewoman, she should have been buried out o'\r\n" + 
						"Christian burial.\r\n" + 
						"First Clown\r\n" + 
						"Why, there thou say'st: and the more pity that\r\n" + 
						"great folk should have countenance in this world to\r\n" + 
						"drown or hang themselves, more than their even\r\n" + 
						"Christian. Come, my spade. There is no ancient\r\n" + 
						"gentleman but gardeners, ditchers, and grave-makers:\r\n" + 
						"they hold up Adam's profession.\r\n" + 
						"Second Clown\r\n" + 
						"Was he a gentleman?\r\n" + 
						"First Clown\r\n" + 
						"He was the first that ever bore arms.\r\n" + 
						"Second Clown\r\n" + 
						"Why, he had none.\r\n" + 
						"First Clown\r\n" + 
						"What, art a heathen? How dost thou understand the\r\n" + 
						"Scripture? The Scripture says 'Adam digged:'\r\n" + 
						"could he dig without arms? I'll put another\r\n" + 
						"question to thee: if thou answerest me not to the\r\n" + 
						"purpose, confess thyself--\r\n" + 
						"Second Clown\r\n" + 
						"Go to.\r\n" + 
						"First Clown\r\n" + 
						"What is he that builds stronger than either the\r\n" + 
						"mason, the shipwright, or the carpenter?\r\n" + 
						"Second Clown\r\n" + 
						"The gallows-maker; for that frame outlives a\r\n" + 
						"thousand tenants.\r\n" + 
						"First Clown\r\n" + 
						"I like thy wit well, in good faith: the gallows\r\n" + 
						"does well; but how does it well? it does well to\r\n" + 
						"those that do in: now thou dost ill to say the\r\n" + 
						"gallows is built stronger than the church: argal,\r\n" + 
						"the gallows may do well to thee. To't again, come.\r\n" + 
						"Second Clown\r\n" + 
						"'Who builds stronger than a mason, a shipwright, or\r\n" + 
						"a carpenter?'\r\n" + 
						"First Clown\r\n" + 
						"Ay, tell me that, and unyoke.\r\n" + 
						"Second Clown\r\n" + 
						"Marry, now I can tell.\r\n" + 
						"First Clown\r\n" + 
						"To't.\r\n" + 
						"Second Clown\r\n" + 
						"Mass, I cannot tell.\r\n" + 
						"Enter HAMLET and HORATIO, at a distance\r\n" + 
						"\r\n" + 
						"First Clown\r\n" + 
						"Cudgel thy brains no more about it, for your dull\r\n" + 
						"ass will not mend his pace with beating; and, when\r\n" + 
						"you are asked this question next, say 'a\r\n" + 
						"grave-maker: 'the houses that he makes last till\r\n" + 
						"doomsday. Go, get thee to Yaughan: fetch me a\r\n" + 
						"stoup of liquor.\r\n" + 
						"Exit Second Clown\r\n" + 
						"\r\n" + 
						"He digs and sings\r\n" + 
						"\r\n" + 
						"In youth, when I did love, did love,\r\n" + 
						"Methought it was very sweet,\r\n" + 
						"To contract, O, the time, for, ah, my behove,\r\n" + 
						"O, methought, there was nothing meet.\r\n" + 
						"HAMLET\r\n" + 
						"Has this fellow no feeling of his business, that he\r\n" + 
						"sings at grave-making?\r\n" + 
						"HORATIO\r\n" + 
						"Custom hath made it in him a property of easiness.\r\n" + 
						"HAMLET\r\n" + 
						"'Tis e'en so: the hand of little employment hath\r\n" + 
						"the daintier sense.\r\n" + 
						"First Clown\r\n" + 
						"[Sings]\r\n" + 
						"But age, with his stealing steps,\r\n" + 
						"Hath claw'd me in his clutch,\r\n" + 
						"And hath shipped me intil the land,\r\n" + 
						"As if I had never been such.\r\n" + 
						"Throws up a skull\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"That skull had a tongue in it, and could sing once:\r\n" + 
						"how the knave jowls it to the ground, as if it were\r\n" + 
						"Cain's jaw-bone, that did the first murder! It\r\n" + 
						"might be the pate of a politician, which this ass\r\n" + 
						"now o'er-reaches; one that would circumvent God,\r\n" + 
						"might it not?\r\n" + 
						"HORATIO\r\n" + 
						"It might, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Or of a courtier; which could say 'Good morrow,\r\n" + 
						"sweet lord! How dost thou, good lord?' This might\r\n" + 
						"be my lord such-a-one, that praised my lord\r\n" + 
						"such-a-one's horse, when he meant to beg it; might it not?\r\n" + 
						"HORATIO\r\n" + 
						"Ay, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Why, e'en so: and now my Lady Worm's; chapless, and\r\n" + 
						"knocked about the mazzard with a sexton's spade:\r\n" + 
						"here's fine revolution, an we had the trick to\r\n" + 
						"see't. Did these bones cost no more the breeding,\r\n" + 
						"but to play at loggats with 'em? mine ache to think on't.\r\n" + 
						"First Clown\r\n" + 
						"[Sings]\r\n" + 
						"A pick-axe, and a spade, a spade,\r\n" + 
						"For and a shrouding sheet:\r\n" + 
						"O, a pit of clay for to be made\r\n" + 
						"For such a guest is meet.\r\n" + 
						"Throws up another skull\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"There's another: why may not that be the skull of a\r\n" + 
						"lawyer? Where be his quiddities now, his quillets,\r\n" + 
						"his cases, his tenures, and his tricks? why does he\r\n" + 
						"suffer this rude knave now to knock him about the\r\n" + 
						"sconce with a dirty shovel, and will not tell him of\r\n" + 
						"his action of battery? Hum! This fellow might be\r\n" + 
						"in's time a great buyer of land, with his statutes,\r\n" + 
						"his recognizances, his fines, his double vouchers,\r\n" + 
						"his recoveries: is this the fine of his fines, and\r\n" + 
						"the recovery of his recoveries, to have his fine\r\n" + 
						"pate full of fine dirt? will his vouchers vouch him\r\n" + 
						"no more of his purchases, and double ones too, than\r\n" + 
						"the length and breadth of a pair of indentures? The\r\n" + 
						"very conveyances of his lands will hardly lie in\r\n" + 
						"this box; and must the inheritor himself have no more, ha?\r\n" + 
						"HORATIO\r\n" + 
						"Not a jot more, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"Is not parchment made of sheepskins?\r\n" + 
						"HORATIO\r\n" + 
						"Ay, my lord, and of calf-skins too.\r\n" + 
						"HAMLET\r\n" + 
						"They are sheep and calves which seek out assurance\r\n" + 
						"in that. I will speak to this fellow. Whose\r\n" + 
						"grave's this, sirrah?\r\n" + 
						"First Clown\r\n" + 
						"Mine, sir.\r\n" + 
						"Sings\r\n" + 
						"\r\n" + 
						"O, a pit of clay for to be made\r\n" + 
						"For such a guest is meet.\r\n" + 
						"HAMLET\r\n" + 
						"I think it be thine, indeed; for thou liest in't.\r\n" + 
						"First Clown\r\n" + 
						"You lie out on't, sir, and therefore it is not\r\n" + 
						"yours: for my part, I do not lie in't, and yet it is mine.\r\n" + 
						"HAMLET\r\n" + 
						"'Thou dost lie in't, to be in't and say it is thine:\r\n" + 
						"'tis for the dead, not for the quick; therefore thou liest.\r\n" + 
						"First Clown\r\n" + 
						"'Tis a quick lie, sir; 'twill away gain, from me to\r\n" + 
						"you.\r\n" + 
						"HAMLET\r\n" + 
						"What man dost thou dig it for?\r\n" + 
						"First Clown\r\n" + 
						"For no man, sir.\r\n" + 
						"HAMLET\r\n" + 
						"What woman, then?\r\n" + 
						"First Clown\r\n" + 
						"For none, neither.\r\n" + 
						"HAMLET\r\n" + 
						"Who is to be buried in't?\r\n" + 
						"First Clown\r\n" + 
						"One that was a woman, sir; but, rest her soul, she's dead.\r\n" + 
						"HAMLET\r\n" + 
						"How absolute the knave is! we must speak by the\r\n" + 
						"card, or equivocation will undo us. By the Lord,\r\n" + 
						"Horatio, these three years I have taken a note of\r\n" + 
						"it; the age is grown so picked that the toe of the\r\n" + 
						"peasant comes so near the heel of the courtier, he\r\n" + 
						"gaffs his kibe. How long hast thou been a\r\n" + 
						"grave-maker?\r\n" + 
						"First Clown\r\n" + 
						"Of all the days i' the year, I came to't that day\r\n" + 
						"that our last king Hamlet overcame Fortinbras.\r\n" + 
						"HAMLET\r\n" + 
						"How long is that since?\r\n" + 
						"First Clown\r\n" + 
						"Cannot you tell that? every fool can tell that: it\r\n" + 
						"was the very day that young Hamlet was born; he that\r\n" + 
						"is mad, and sent into England.\r\n" + 
						"HAMLET\r\n" + 
						"Ay, marry, why was he sent into England?\r\n" + 
						"First Clown\r\n" + 
						"Why, because he was mad: he shall recover his wits\r\n" + 
						"there; or, if he do not, it's no great matter there.\r\n" + 
						"HAMLET\r\n" + 
						"Why?\r\n" + 
						"First Clown\r\n" + 
						"'Twill, a not be seen in him there; there the men\r\n" + 
						"are as mad as he.\r\n" + 
						"HAMLET\r\n" + 
						"How came he mad?\r\n" + 
						"First Clown\r\n" + 
						"Very strangely, they say.\r\n" + 
						"HAMLET\r\n" + 
						"How strangely?\r\n" + 
						"First Clown\r\n" + 
						"Faith, e'en with losing his wits.\r\n" + 
						"HAMLET\r\n" + 
						"Upon what ground?\r\n" + 
						"First Clown\r\n" + 
						"Why, here in Denmark: I have been sexton here, man\r\n" + 
						"and boy, thirty years.\r\n" + 
						"HAMLET\r\n" + 
						"How long will a man lie i' the earth ere he rot?\r\n" + 
						"First Clown\r\n" + 
						"I' faith, if he be not rotten before he die--as we\r\n" + 
						"have many pocky corses now-a-days, that will scarce\r\n" + 
						"hold the laying in--he will last you some eight year\r\n" + 
						"or nine year: a tanner will last you nine year.\r\n" + 
						"HAMLET\r\n" + 
						"Why he more than another?\r\n" + 
						"First Clown\r\n" + 
						"Why, sir, his hide is so tanned with his trade, that\r\n" + 
						"he will keep out water a great while; and your water\r\n" + 
						"is a sore decayer of your whoreson dead body.\r\n" + 
						"Here's a skull now; this skull has lain in the earth\r\n" + 
						"three and twenty years.\r\n" + 
						"HAMLET\r\n" + 
						"Whose was it?\r\n" + 
						"First Clown\r\n" + 
						"A whoreson mad fellow's it was: whose do you think it was?\r\n" + 
						"HAMLET\r\n" + 
						"Nay, I know not.\r\n" + 
						"First Clown\r\n" + 
						"A pestilence on him for a mad rogue! a' poured a\r\n" + 
						"flagon of Rhenish on my head once. This same skull,\r\n" + 
						"sir, was Yorick's skull, the king's jester.\r\n" + 
						"HAMLET\r\n" + 
						"This?\r\n" + 
						"First Clown\r\n" + 
						"E'en that.\r\n" + 
						"HAMLET\r\n" + 
						"Let me see.\r\n" + 
						"Takes the skull\r\n" + 
						"\r\n" + 
						"Alas, poor Yorick! I knew him, Horatio: a fellow\r\n" + 
						"of infinite jest, of most excellent fancy: he hath\r\n" + 
						"borne me on his back a thousand times; and now, how\r\n" + 
						"abhorred in my imagination it is! my gorge rims at\r\n" + 
						"it. Here hung those lips that I have kissed I know\r\n" + 
						"not how oft. Where be your gibes now? your\r\n" + 
						"gambols? your songs? your flashes of merriment,\r\n" + 
						"that were wont to set the table on a roar? Not one\r\n" + 
						"now, to mock your own grinning? quite chap-fallen?\r\n" + 
						"Now get you to my lady's chamber, and tell her, let\r\n" + 
						"her paint an inch thick, to this favour she must\r\n" + 
						"come; make her laugh at that. Prithee, Horatio, tell\r\n" + 
						"me one thing.\r\n" + 
						"HORATIO\r\n" + 
						"What's that, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"Dost thou think Alexander looked o' this fashion i'\r\n" + 
						"the earth?\r\n" + 
						"HORATIO\r\n" + 
						"E'en so.\r\n" + 
						"HAMLET\r\n" + 
						"And smelt so? pah!\r\n" + 
						"Puts down the skull\r\n" + 
						"\r\n" + 
						"HORATIO\r\n" + 
						"E'en so, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"To what base uses we may return, Horatio! Why may\r\n" + 
						"not imagination trace the noble dust of Alexander,\r\n" + 
						"till he find it stopping a bung-hole?\r\n" + 
						"HORATIO\r\n" + 
						"'Twere to consider too curiously, to consider so.\r\n" + 
						"HAMLET\r\n" + 
						"No, faith, not a jot; but to follow him thither with\r\n" + 
						"modesty enough, and likelihood to lead it: as\r\n" + 
						"thus: Alexander died, Alexander was buried,\r\n" + 
						"Alexander returneth into dust; the dust is earth; of\r\n" + 
						"earth we make loam; and why of that loam, whereto he\r\n" + 
						"was converted, might they not stop a beer-barrel?\r\n" + 
						"Imperious Caesar, dead and turn'd to clay,\r\n" + 
						"Might stop a hole to keep the wind away:\r\n" + 
						"O, that that earth, which kept the world in awe,\r\n" + 
						"Should patch a wall to expel the winter flaw!\r\n" + 
						"But soft! but soft! aside: here comes the king.\r\n" + 
						"Enter Priest, & c. in procession; the Corpse of OPHELIA, LAERTES and Mourners following; KING CLAUDIUS, QUEEN GERTRUDE, their trains, & c\r\n" + 
						"\r\n" + 
						"The queen, the courtiers: who is this they follow?\r\n" + 
						"And with such maimed rites? This doth betoken\r\n" + 
						"The corse they follow did with desperate hand\r\n" + 
						"Fordo its own life: 'twas of some estate.\r\n" + 
						"Couch we awhile, and mark.\r\n" + 
						"Retiring with HORATIO\r\n" + 
						"\r\n" + 
						"LAERTES\r\n" + 
						"What ceremony else?\r\n" + 
						"HAMLET\r\n" + 
						"That is Laertes,\r\n" + 
						"A very noble youth: mark.\r\n" + 
						"LAERTES\r\n" + 
						"What ceremony else?\r\n" + 
						"First Priest\r\n" + 
						"Her obsequies have been as far enlarged\r\n" + 
						"As we have warrantise: her death was doubtful;\r\n" + 
						"And, but that great command o'ersways the order,\r\n" + 
						"She should in ground unsanctified have lodged\r\n" + 
						"Till the last trumpet: for charitable prayers,\r\n" + 
						"Shards, flints and pebbles should be thrown on her;\r\n" + 
						"Yet here she is allow'd her virgin crants,\r\n" + 
						"Her maiden strewments and the bringing home\r\n" + 
						"Of bell and burial.\r\n" + 
						"LAERTES\r\n" + 
						"Must there no more be done?\r\n" + 
						"First Priest\r\n" + 
						"No more be done:\r\n" + 
						"We should profane the service of the dead\r\n" + 
						"To sing a requiem and such rest to her\r\n" + 
						"As to peace-parted souls.\r\n" + 
						"LAERTES\r\n" + 
						"Lay her i' the earth:\r\n" + 
						"And from her fair and unpolluted flesh\r\n" + 
						"May violets spring! I tell thee, churlish priest,\r\n" + 
						"A ministering angel shall my sister be,\r\n" + 
						"When thou liest howling.\r\n" + 
						"HAMLET\r\n" + 
						"What, the fair Ophelia!\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Sweets to the sweet: farewell!\r\n" + 
						"Scattering flowers\r\n" + 
						"\r\n" + 
						"I hoped thou shouldst have been my Hamlet's wife;\r\n" + 
						"I thought thy bride-bed to have deck'd, sweet maid,\r\n" + 
						"And not have strew'd thy grave.\r\n" + 
						"LAERTES\r\n" + 
						"O, treble woe\r\n" + 
						"Fall ten times treble on that cursed head,\r\n" + 
						"Whose wicked deed thy most ingenious sense\r\n" + 
						"Deprived thee of! Hold off the earth awhile,\r\n" + 
						"Till I have caught her once more in mine arms:\r\n" + 
						"Leaps into the grave\r\n" + 
						"\r\n" + 
						"Now pile your dust upon the quick and dead,\r\n" + 
						"Till of this flat a mountain you have made,\r\n" + 
						"To o'ertop old Pelion, or the skyish head\r\n" + 
						"Of blue Olympus.\r\n" + 
						"HAMLET\r\n" + 
						"[Advancing] What is he whose grief\r\n" + 
						"Bears such an emphasis? whose phrase of sorrow\r\n" + 
						"Conjures the wandering stars, and makes them stand\r\n" + 
						"Like wonder-wounded hearers? This is I,\r\n" + 
						"Hamlet the Dane.\r\n" + 
						"Leaps into the grave\r\n" + 
						"\r\n" + 
						"LAERTES\r\n" + 
						"The devil take thy soul!\r\n" + 
						"Grappling with him\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"Thou pray'st not well.\r\n" + 
						"I prithee, take thy fingers from my throat;\r\n" + 
						"For, though I am not splenitive and rash,\r\n" + 
						"Yet have I something in me dangerous,\r\n" + 
						"Which let thy wiseness fear: hold off thy hand.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Pluck them asunder.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Hamlet, Hamlet!\r\n" + 
						"All\r\n" + 
						"Gentlemen,--\r\n" + 
						"HORATIO\r\n" + 
						"Good my lord, be quiet.\r\n" + 
						"The Attendants part them, and they come out of the grave\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"Why I will fight with him upon this theme\r\n" + 
						"Until my eyelids will no longer wag.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"O my son, what theme?\r\n" + 
						"HAMLET\r\n" + 
						"I loved Ophelia: forty thousand brothers\r\n" + 
						"Could not, with all their quantity of love,\r\n" + 
						"Make up my sum. What wilt thou do for her?\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"O, he is mad, Laertes.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"For love of God, forbear him.\r\n" + 
						"HAMLET\r\n" + 
						"'Swounds, show me what thou'lt do:\r\n" + 
						"Woo't weep? woo't fight? woo't fast? woo't tear thyself?\r\n" + 
						"Woo't drink up eisel? eat a crocodile?\r\n" + 
						"I'll do't. Dost thou come here to whine?\r\n" + 
						"To outface me with leaping in her grave?\r\n" + 
						"Be buried quick with her, and so will I:\r\n" + 
						"And, if thou prate of mountains, let them throw\r\n" + 
						"Millions of acres on us, till our ground,\r\n" + 
						"Singeing his pate against the burning zone,\r\n" + 
						"Make Ossa like a wart! Nay, an thou'lt mouth,\r\n" + 
						"I'll rant as well as thou.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"This is mere madness:\r\n" + 
						"And thus awhile the fit will work on him;\r\n" + 
						"Anon, as patient as the female dove,\r\n" + 
						"When that her golden couplets are disclosed,\r\n" + 
						"His silence will sit drooping.\r\n" + 
						"HAMLET\r\n" + 
						"Hear you, sir;\r\n" + 
						"What is the reason that you use me thus?\r\n" + 
						"I loved you ever: but it is no matter;\r\n" + 
						"Let Hercules himself do what he may,\r\n" + 
						"The cat will mew and dog will have his day.\r\n" + 
						"Exit\r\n" + 
						"\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"I pray you, good Horatio, wait upon him.\r\n" + 
						"Exit HORATIO\r\n" + 
						"\r\n" + 
						"To LAERTES\r\n" + 
						"\r\n" + 
						"Strengthen your patience in our last night's speech;\r\n" + 
						"We'll put the matter to the present push.\r\n" + 
						"Good Gertrude, set some watch over your son.\r\n" + 
						"This grave shall have a living monument:\r\n" + 
						"An hour of quiet shortly shall we see;\r\n" + 
						"Till then, in patience our proceeding be.\r\n" + 
						"Exeunt\r\n" + 
						"\r\n" + 
						"SCENE II. A hall in the castle.\r\n" + 
						"Enter HAMLET and HORATIO\r\n" + 
						"HAMLET\r\n" + 
						"So much for this, sir: now shall you see the other;\r\n" + 
						"You do remember all the circumstance?\r\n" + 
						"HORATIO\r\n" + 
						"Remember it, my lord?\r\n" + 
						"HAMLET\r\n" + 
						"Sir, in my heart there was a kind of fighting,\r\n" + 
						"That would not let me sleep: methought I lay\r\n" + 
						"Worse than the mutines in the bilboes. Rashly,\r\n" + 
						"And praised be rashness for it, let us know,\r\n" + 
						"Our indiscretion sometimes serves us well,\r\n" + 
						"When our deep plots do pall: and that should teach us\r\n" + 
						"There's a divinity that shapes our ends,\r\n" + 
						"Rough-hew them how we will,--\r\n" + 
						"HORATIO\r\n" + 
						"That is most certain.\r\n" + 
						"HAMLET\r\n" + 
						"Up from my cabin,\r\n" + 
						"My sea-gown scarf'd about me, in the dark\r\n" + 
						"Groped I to find out them; had my desire.\r\n" + 
						"Finger'd their packet, and in fine withdrew\r\n" + 
						"To mine own room again; making so bold,\r\n" + 
						"My fears forgetting manners, to unseal\r\n" + 
						"Their grand commission; where I found, Horatio,--\r\n" + 
						"O royal knavery!--an exact command,\r\n" + 
						"Larded with many several sorts of reasons\r\n" + 
						"Importing Denmark's health and England's too,\r\n" + 
						"With, ho! such bugs and goblins in my life,\r\n" + 
						"That, on the supervise, no leisure bated,\r\n" + 
						"No, not to stay the grinding of the axe,\r\n" + 
						"My head should be struck off.\r\n" + 
						"HORATIO\r\n" + 
						"Is't possible?\r\n" + 
						"HAMLET\r\n" + 
						"Here's the commission: read it at more leisure.\r\n" + 
						"But wilt thou hear me how I did proceed?\r\n" + 
						"HORATIO\r\n" + 
						"I beseech you.\r\n" + 
						"HAMLET\r\n" + 
						"Being thus be-netted round with villanies,--\r\n" + 
						"Ere I could make a prologue to my brains,\r\n" + 
						"They had begun the play--I sat me down,\r\n" + 
						"Devised a new commission, wrote it fair:\r\n" + 
						"I once did hold it, as our statists do,\r\n" + 
						"A baseness to write fair and labour'd much\r\n" + 
						"How to forget that learning, but, sir, now\r\n" + 
						"It did me yeoman's service: wilt thou know\r\n" + 
						"The effect of what I wrote?\r\n" + 
						"HORATIO\r\n" + 
						"Ay, good my lord.\r\n" + 
						"HAMLET\r\n" + 
						"An earnest conjuration from the king,\r\n" + 
						"As England was his faithful tributary,\r\n" + 
						"As love between them like the palm might flourish,\r\n" + 
						"As peace should stiff her wheaten garland wear\r\n" + 
						"And stand a comma 'tween their amities,\r\n" + 
						"And many such-like 'As'es of great charge,\r\n" + 
						"That, on the view and knowing of these contents,\r\n" + 
						"Without debatement further, more or less,\r\n" + 
						"He should the bearers put to sudden death,\r\n" + 
						"Not shriving-time allow'd.\r\n" + 
						"HORATIO\r\n" + 
						"How was this seal'd?\r\n" + 
						"HAMLET\r\n" + 
						"Why, even in that was heaven ordinant.\r\n" + 
						"I had my father's signet in my purse,\r\n" + 
						"Which was the model of that Danish seal;\r\n" + 
						"Folded the writ up in form of the other,\r\n" + 
						"Subscribed it, gave't the impression, placed it safely,\r\n" + 
						"The changeling never known. Now, the next day\r\n" + 
						"Was our sea-fight; and what to this was sequent\r\n" + 
						"Thou know'st already.\r\n" + 
						"HORATIO\r\n" + 
						"So Guildenstern and Rosencrantz go to't.\r\n" + 
						"HAMLET\r\n" + 
						"Why, man, they did make love to this employment;\r\n" + 
						"They are not near my conscience; their defeat\r\n" + 
						"Does by their own insinuation grow:\r\n" + 
						"'Tis dangerous when the baser nature comes\r\n" + 
						"Between the pass and fell incensed points\r\n" + 
						"Of mighty opposites.\r\n" + 
						"HORATIO\r\n" + 
						"Why, what a king is this!\r\n" + 
						"HAMLET\r\n" + 
						"Does it not, think'st thee, stand me now upon--\r\n" + 
						"He that hath kill'd my king and whored my mother,\r\n" + 
						"Popp'd in between the election and my hopes,\r\n" + 
						"Thrown out his angle for my proper life,\r\n" + 
						"And with such cozenage--is't not perfect conscience,\r\n" + 
						"To quit him with this arm? and is't not to be damn'd,\r\n" + 
						"To let this canker of our nature come\r\n" + 
						"In further evil?\r\n" + 
						"HORATIO\r\n" + 
						"It must be shortly known to him from England\r\n" + 
						"What is the issue of the business there.\r\n" + 
						"HAMLET\r\n" + 
						"It will be short: the interim is mine;\r\n" + 
						"And a man's life's no more than to say 'One.'\r\n" + 
						"But I am very sorry, good Horatio,\r\n" + 
						"That to Laertes I forgot myself;\r\n" + 
						"For, by the image of my cause, I see\r\n" + 
						"The portraiture of his: I'll court his favours.\r\n" + 
						"But, sure, the bravery of his grief did put me\r\n" + 
						"Into a towering passion.\r\n" + 
						"HORATIO\r\n" + 
						"Peace! who comes here?\r\n" + 
						"Enter OSRIC\r\n" + 
						"\r\n" + 
						"OSRIC\r\n" + 
						"Your lordship is right welcome back to Denmark.\r\n" + 
						"HAMLET\r\n" + 
						"I humbly thank you, sir. Dost know this water-fly?\r\n" + 
						"HORATIO\r\n" + 
						"No, my good lord.\r\n" + 
						"HAMLET\r\n" + 
						"Thy state is the more gracious; for 'tis a vice to\r\n" + 
						"know him. He hath much land, and fertile: let a\r\n" + 
						"beast be lord of beasts, and his crib shall stand at\r\n" + 
						"the king's mess: 'tis a chough; but, as I say,\r\n" + 
						"spacious in the possession of dirt.\r\n" + 
						"OSRIC\r\n" + 
						"Sweet lord, if your lordship were at leisure, I\r\n" + 
						"should impart a thing to you from his majesty.\r\n" + 
						"HAMLET\r\n" + 
						"I will receive it, sir, with all diligence of\r\n" + 
						"spirit. Put your bonnet to his right use; 'tis for the head.\r\n" + 
						"OSRIC\r\n" + 
						"I thank your lordship, it is very hot.\r\n" + 
						"HAMLET\r\n" + 
						"No, believe me, 'tis very cold; the wind is\r\n" + 
						"northerly.\r\n" + 
						"OSRIC\r\n" + 
						"It is indifferent cold, my lord, indeed.\r\n" + 
						"HAMLET\r\n" + 
						"But yet methinks it is very sultry and hot for my\r\n" + 
						"complexion.\r\n" + 
						"OSRIC\r\n" + 
						"Exceedingly, my lord; it is very sultry,--as\r\n" + 
						"'twere,--I cannot tell how. But, my lord, his\r\n" + 
						"majesty bade me signify to you that he has laid a\r\n" + 
						"great wager on your head: sir, this is the matter,--\r\n" + 
						"HAMLET\r\n" + 
						"I beseech you, remember--\r\n" + 
						"HAMLET moves him to put on his hat\r\n" + 
						"\r\n" + 
						"OSRIC\r\n" + 
						"Nay, good my lord; for mine ease, in good faith.\r\n" + 
						"Sir, here is newly come to court Laertes; believe\r\n" + 
						"me, an absolute gentleman, full of most excellent\r\n" + 
						"differences, of very soft society and great showing:\r\n" + 
						"indeed, to speak feelingly of him, he is the card or\r\n" + 
						"calendar of gentry, for you shall find in him the\r\n" + 
						"continent of what part a gentleman would see.\r\n" + 
						"HAMLET\r\n" + 
						"Sir, his definement suffers no perdition in you;\r\n" + 
						"though, I know, to divide him inventorially would\r\n" + 
						"dizzy the arithmetic of memory, and yet but yaw\r\n" + 
						"neither, in respect of his quick sail. But, in the\r\n" + 
						"verity of extolment, I take him to be a soul of\r\n" + 
						"great article; and his infusion of such dearth and\r\n" + 
						"rareness, as, to make true diction of him, his\r\n" + 
						"semblable is his mirror; and who else would trace\r\n" + 
						"him, his umbrage, nothing more.\r\n" + 
						"OSRIC\r\n" + 
						"Your lordship speaks most infallibly of him.\r\n" + 
						"HAMLET\r\n" + 
						"The concernancy, sir? why do we wrap the gentleman\r\n" + 
						"in our more rawer breath?\r\n" + 
						"OSRIC\r\n" + 
						"Sir?\r\n" + 
						"HORATIO\r\n" + 
						"Is't not possible to understand in another tongue?\r\n" + 
						"You will do't, sir, really.\r\n" + 
						"HAMLET\r\n" + 
						"What imports the nomination of this gentleman?\r\n" + 
						"OSRIC\r\n" + 
						"Of Laertes?\r\n" + 
						"HORATIO\r\n" + 
						"His purse is empty already; all's golden words are spent.\r\n" + 
						"HAMLET\r\n" + 
						"Of him, sir.\r\n" + 
						"OSRIC\r\n" + 
						"I know you are not ignorant--\r\n" + 
						"HAMLET\r\n" + 
						"I would you did, sir; yet, in faith, if you did,\r\n" + 
						"it would not much approve me. Well, sir?\r\n" + 
						"OSRIC\r\n" + 
						"You are not ignorant of what excellence Laertes is--\r\n" + 
						"HAMLET\r\n" + 
						"I dare not confess that, lest I should compare with\r\n" + 
						"him in excellence; but, to know a man well, were to\r\n" + 
						"know himself.\r\n" + 
						"OSRIC\r\n" + 
						"I mean, sir, for his weapon; but in the imputation\r\n" + 
						"laid on him by them, in his meed he's unfellowed.\r\n" + 
						"HAMLET\r\n" + 
						"What's his weapon?\r\n" + 
						"OSRIC\r\n" + 
						"Rapier and dagger.\r\n" + 
						"HAMLET\r\n" + 
						"That's two of his weapons: but, well.\r\n" + 
						"OSRIC\r\n" + 
						"The king, sir, hath wagered with him six Barbary\r\n" + 
						"horses: against the which he has imponed, as I take\r\n" + 
						"it, six French rapiers and poniards, with their\r\n" + 
						"assigns, as girdle, hangers, and so: three of the\r\n" + 
						"carriages, in faith, are very dear to fancy, very\r\n" + 
						"responsive to the hilts, most delicate carriages,\r\n" + 
						"and of very liberal conceit.\r\n" + 
						"HAMLET\r\n" + 
						"What call you the carriages?\r\n" + 
						"HORATIO\r\n" + 
						"I knew you must be edified by the margent ere you had done.\r\n" + 
						"OSRIC\r\n" + 
						"The carriages, sir, are the hangers.\r\n" + 
						"HAMLET\r\n" + 
						"The phrase would be more german to the matter, if we\r\n" + 
						"could carry cannon by our sides: I would it might\r\n" + 
						"be hangers till then. But, on: six Barbary horses\r\n" + 
						"against six French swords, their assigns, and three\r\n" + 
						"liberal-conceited carriages; that's the French bet\r\n" + 
						"against the Danish. Why is this 'imponed,' as you call it?\r\n" + 
						"OSRIC\r\n" + 
						"The king, sir, hath laid, that in a dozen passes\r\n" + 
						"between yourself and him, he shall not exceed you\r\n" + 
						"three hits: he hath laid on twelve for nine; and it\r\n" + 
						"would come to immediate trial, if your lordship\r\n" + 
						"would vouchsafe the answer.\r\n" + 
						"HAMLET\r\n" + 
						"How if I answer 'no'?\r\n" + 
						"OSRIC\r\n" + 
						"I mean, my lord, the opposition of your person in trial.\r\n" + 
						"HAMLET\r\n" + 
						"Sir, I will walk here in the hall: if it please his\r\n" + 
						"majesty, 'tis the breathing time of day with me; let\r\n" + 
						"the foils be brought, the gentleman willing, and the\r\n" + 
						"king hold his purpose, I will win for him an I can;\r\n" + 
						"if not, I will gain nothing but my shame and the odd hits.\r\n" + 
						"OSRIC\r\n" + 
						"Shall I re-deliver you e'en so?\r\n" + 
						"HAMLET\r\n" + 
						"To this effect, sir; after what flourish your nature will.\r\n" + 
						"OSRIC\r\n" + 
						"I commend my duty to your lordship.\r\n" + 
						"HAMLET\r\n" + 
						"Yours, yours.\r\n" + 
						"Exit OSRIC\r\n" + 
						"\r\n" + 
						"He does well to commend it himself; there are no\r\n" + 
						"tongues else for's turn.\r\n" + 
						"HORATIO\r\n" + 
						"This lapwing runs away with the shell on his head.\r\n" + 
						"HAMLET\r\n" + 
						"He did comply with his dug, before he sucked it.\r\n" + 
						"Thus has he--and many more of the same bevy that I\r\n" + 
						"know the dressy age dotes on--only got the tune of\r\n" + 
						"the time and outward habit of encounter; a kind of\r\n" + 
						"yesty collection, which carries them through and\r\n" + 
						"through the most fond and winnowed opinions; and do\r\n" + 
						"but blow them to their trial, the bubbles are out.\r\n" + 
						"Enter a Lord\r\n" + 
						"\r\n" + 
						"Lord\r\n" + 
						"My lord, his majesty commended him to you by young\r\n" + 
						"Osric, who brings back to him that you attend him in\r\n" + 
						"the hall: he sends to know if your pleasure hold to\r\n" + 
						"play with Laertes, or that you will take longer time.\r\n" + 
						"HAMLET\r\n" + 
						"I am constant to my purpose; they follow the king's\r\n" + 
						"pleasure: if his fitness speaks, mine is ready; now\r\n" + 
						"or whensoever, provided I be so able as now.\r\n" + 
						"Lord\r\n" + 
						"The king and queen and all are coming down.\r\n" + 
						"HAMLET\r\n" + 
						"In happy time.\r\n" + 
						"Lord\r\n" + 
						"The queen desires you to use some gentle\r\n" + 
						"entertainment to Laertes before you fall to play.\r\n" + 
						"HAMLET\r\n" + 
						"She well instructs me.\r\n" + 
						"Exit Lord\r\n" + 
						"\r\n" + 
						"HORATIO\r\n" + 
						"You will lose this wager, my lord.\r\n" + 
						"HAMLET\r\n" + 
						"I do not think so: since he went into France, I\r\n" + 
						"have been in continual practise: I shall win at the\r\n" + 
						"odds. But thou wouldst not think how ill all's here\r\n" + 
						"about my heart: but it is no matter.\r\n" + 
						"HORATIO\r\n" + 
						"Nay, good my lord,--\r\n" + 
						"HAMLET\r\n" + 
						"It is but foolery; but it is such a kind of\r\n" + 
						"gain-giving, as would perhaps trouble a woman.\r\n" + 
						"HORATIO\r\n" + 
						"If your mind dislike any thing, obey it: I will\r\n" + 
						"forestall their repair hither, and say you are not\r\n" + 
						"fit.\r\n" + 
						"HAMLET\r\n" + 
						"Not a whit, we defy augury: there's a special\r\n" + 
						"providence in the fall of a sparrow. If it be now,\r\n" + 
						"'tis not to come; if it be not to come, it will be\r\n" + 
						"now; if it be not now, yet it will come: the\r\n" + 
						"readiness is all: since no man has aught of what he\r\n" + 
						"leaves, what is't to leave betimes?\r\n" + 
						"Enter KING CLAUDIUS, QUEEN GERTRUDE, LAERTES, Lords, OSRIC, and Attendants with foils, & c\r\n" + 
						"\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Come, Hamlet, come, and take this hand from me.\r\n" + 
						"KING CLAUDIUS puts LAERTES' hand into HAMLET's\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"Give me your pardon, sir: I've done you wrong;\r\n" + 
						"But pardon't, as you are a gentleman.\r\n" + 
						"This presence knows,\r\n" + 
						"And you must needs have heard, how I am punish'd\r\n" + 
						"With sore distraction. What I have done,\r\n" + 
						"That might your nature, honour and exception\r\n" + 
						"Roughly awake, I here proclaim was madness.\r\n" + 
						"Was't Hamlet wrong'd Laertes? Never Hamlet:\r\n" + 
						"If Hamlet from himself be ta'en away,\r\n" + 
						"And when he's not himself does wrong Laertes,\r\n" + 
						"Then Hamlet does it not, Hamlet denies it.\r\n" + 
						"Who does it, then? His madness: if't be so,\r\n" + 
						"Hamlet is of the faction that is wrong'd;\r\n" + 
						"His madness is poor Hamlet's enemy.\r\n" + 
						"Sir, in this audience,\r\n" + 
						"Let my disclaiming from a purposed evil\r\n" + 
						"Free me so far in your most generous thoughts,\r\n" + 
						"That I have shot mine arrow o'er the house,\r\n" + 
						"And hurt my brother.\r\n" + 
						"LAERTES\r\n" + 
						"I am satisfied in nature,\r\n" + 
						"Whose motive, in this case, should stir me most\r\n" + 
						"To my revenge: but in my terms of honour\r\n" + 
						"I stand aloof; and will no reconcilement,\r\n" + 
						"Till by some elder masters, of known honour,\r\n" + 
						"I have a voice and precedent of peace,\r\n" + 
						"To keep my name ungored. But till that time,\r\n" + 
						"I do receive your offer'd love like love,\r\n" + 
						"And will not wrong it.\r\n" + 
						"HAMLET\r\n" + 
						"I embrace it freely;\r\n" + 
						"And will this brother's wager frankly play.\r\n" + 
						"Give us the foils. Come on.\r\n" + 
						"LAERTES\r\n" + 
						"Come, one for me.\r\n" + 
						"HAMLET\r\n" + 
						"I'll be your foil, Laertes: in mine ignorance\r\n" + 
						"Your skill shall, like a star i' the darkest night,\r\n" + 
						"Stick fiery off indeed.\r\n" + 
						"LAERTES\r\n" + 
						"You mock me, sir.\r\n" + 
						"HAMLET\r\n" + 
						"No, by this hand.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Give them the foils, young Osric. Cousin Hamlet,\r\n" + 
						"You know the wager?\r\n" + 
						"HAMLET\r\n" + 
						"Very well, my lord\r\n" + 
						"Your grace hath laid the odds o' the weaker side.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"I do not fear it; I have seen you both:\r\n" + 
						"But since he is better'd, we have therefore odds.\r\n" + 
						"LAERTES\r\n" + 
						"This is too heavy, let me see another.\r\n" + 
						"HAMLET\r\n" + 
						"This likes me well. These foils have all a length?\r\n" + 
						"They prepare to play\r\n" + 
						"\r\n" + 
						"OSRIC\r\n" + 
						"Ay, my good lord.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Set me the stoops of wine upon that table.\r\n" + 
						"If Hamlet give the first or second hit,\r\n" + 
						"Or quit in answer of the third exchange,\r\n" + 
						"Let all the battlements their ordnance fire:\r\n" + 
						"The king shall drink to Hamlet's better breath;\r\n" + 
						"And in the cup an union shall he throw,\r\n" + 
						"Richer than that which four successive kings\r\n" + 
						"In Denmark's crown have worn. Give me the cups;\r\n" + 
						"And let the kettle to the trumpet speak,\r\n" + 
						"The trumpet to the cannoneer without,\r\n" + 
						"The cannons to the heavens, the heavens to earth,\r\n" + 
						"'Now the king dunks to Hamlet.' Come, begin:\r\n" + 
						"And you, the judges, bear a wary eye.\r\n" + 
						"HAMLET\r\n" + 
						"Come on, sir.\r\n" + 
						"LAERTES\r\n" + 
						"Come, my lord.\r\n" + 
						"They play\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"One.\r\n" + 
						"LAERTES\r\n" + 
						"No.\r\n" + 
						"HAMLET\r\n" + 
						"Judgment.\r\n" + 
						"OSRIC\r\n" + 
						"A hit, a very palpable hit.\r\n" + 
						"LAERTES\r\n" + 
						"Well; again.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Stay; give me drink. Hamlet, this pearl is thine;\r\n" + 
						"Here's to thy health.\r\n" + 
						"Trumpets sound, and cannon shot off within\r\n" + 
						"\r\n" + 
						"Give him the cup.\r\n" + 
						"HAMLET\r\n" + 
						"I'll play this bout first; set it by awhile. Come.\r\n" + 
						"They play\r\n" + 
						"\r\n" + 
						"Another hit; what say you?\r\n" + 
						"LAERTES\r\n" + 
						"A touch, a touch, I do confess.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Our son shall win.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"He's fat, and scant of breath.\r\n" + 
						"Here, Hamlet, take my napkin, rub thy brows;\r\n" + 
						"The queen carouses to thy fortune, Hamlet.\r\n" + 
						"HAMLET\r\n" + 
						"Good madam!\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Gertrude, do not drink.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"I will, my lord; I pray you, pardon me.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"[Aside] It is the poison'd cup: it is too late.\r\n" + 
						"HAMLET\r\n" + 
						"I dare not drink yet, madam; by and by.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"Come, let me wipe thy face.\r\n" + 
						"LAERTES\r\n" + 
						"My lord, I'll hit him now.\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"I do not think't.\r\n" + 
						"LAERTES\r\n" + 
						"[Aside] And yet 'tis almost 'gainst my conscience.\r\n" + 
						"HAMLET\r\n" + 
						"Come, for the third, Laertes: you but dally;\r\n" + 
						"I pray you, pass with your best violence;\r\n" + 
						"I am afeard you make a wanton of me.\r\n" + 
						"LAERTES\r\n" + 
						"Say you so? come on.\r\n" + 
						"They play\r\n" + 
						"\r\n" + 
						"OSRIC\r\n" + 
						"Nothing, neither way.\r\n" + 
						"LAERTES\r\n" + 
						"Have at you now!\r\n" + 
						"LAERTES wounds HAMLET; then in scuffling, they change rapiers, and HAMLET wounds LAERTES\r\n" + 
						"\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"Part them; they are incensed.\r\n" + 
						"HAMLET\r\n" + 
						"Nay, come, again.\r\n" + 
						"QUEEN GERTRUDE falls\r\n" + 
						"\r\n" + 
						"OSRIC\r\n" + 
						"Look to the queen there, ho!\r\n" + 
						"HORATIO\r\n" + 
						"They bleed on both sides. How is it, my lord?\r\n" + 
						"OSRIC\r\n" + 
						"How is't, Laertes?\r\n" + 
						"LAERTES\r\n" + 
						"Why, as a woodcock to mine own springe, Osric;\r\n" + 
						"I am justly kill'd with mine own treachery.\r\n" + 
						"HAMLET\r\n" + 
						"How does the queen?\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"She swounds to see them bleed.\r\n" + 
						"QUEEN GERTRUDE\r\n" + 
						"No, no, the drink, the drink,--O my dear Hamlet,--\r\n" + 
						"The drink, the drink! I am poison'd.\r\n" + 
						"Dies\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"O villany! Ho! let the door be lock'd:\r\n" + 
						"Treachery! Seek it out.\r\n" + 
						"LAERTES\r\n" + 
						"It is here, Hamlet: Hamlet, thou art slain;\r\n" + 
						"No medicine in the world can do thee good;\r\n" + 
						"In thee there is not half an hour of life;\r\n" + 
						"The treacherous instrument is in thy hand,\r\n" + 
						"Unbated and envenom'd: the foul practise\r\n" + 
						"Hath turn'd itself on me lo, here I lie,\r\n" + 
						"Never to rise again: thy mother's poison'd:\r\n" + 
						"I can no more: the king, the king's to blame.\r\n" + 
						"HAMLET\r\n" + 
						"The point!--envenom'd too!\r\n" + 
						"Then, venom, to thy work.\r\n" + 
						"Stabs KING CLAUDIUS\r\n" + 
						"\r\n" + 
						"All\r\n" + 
						"Treason! treason!\r\n" + 
						"KING CLAUDIUS\r\n" + 
						"O, yet defend me, friends; I am but hurt.\r\n" + 
						"HAMLET\r\n" + 
						"Here, thou incestuous, murderous, damned Dane,\r\n" + 
						"Drink off this potion. Is thy union here?\r\n" + 
						"Follow my mother.\r\n" + 
						"KING CLAUDIUS dies\r\n" + 
						"\r\n" + 
						"LAERTES\r\n" + 
						"He is justly served;\r\n" + 
						"It is a poison temper'd by himself.\r\n" + 
						"Exchange forgiveness with me, noble Hamlet:\r\n" + 
						"Mine and my father's death come not upon thee,\r\n" + 
						"Nor thine on me.\r\n" + 
						"Dies\r\n" + 
						"\r\n" + 
						"HAMLET\r\n" + 
						"Heaven make thee free of it! I follow thee.\r\n" + 
						"I am dead, Horatio. Wretched queen, adieu!\r\n" + 
						"You that look pale and tremble at this chance,\r\n" + 
						"That are but mutes or audience to this act,\r\n" + 
						"Had I but time--as this fell sergeant, death,\r\n" + 
						"Is strict in his arrest--O, I could tell you--\r\n" + 
						"But let it be. Horatio, I am dead;\r\n" + 
						"Thou livest; report me and my cause aright\r\n" + 
						"To the unsatisfied.\r\n" + 
						"HORATIO\r\n" + 
						"Never believe it:\r\n" + 
						"I am more an antique Roman than a Dane:\r\n" + 
						"Here's yet some liquor left.\r\n" + 
						"HAMLET\r\n" + 
						"As thou'rt a man,\r\n" + 
						"Give me the cup: let go; by heaven, I'll have't.\r\n" + 
						"O good Horatio, what a wounded name,\r\n" + 
						"Things standing thus unknown, shall live behind me!\r\n" + 
						"If thou didst ever hold me in thy heart\r\n" + 
						"Absent thee from felicity awhile,\r\n" + 
						"And in this harsh world draw thy breath in pain,\r\n" + 
						"To tell my story.\r\n" + 
						"March afar off, and shot within\r\n" + 
						"\r\n" + 
						"What warlike noise is this?\r\n" + 
						"OSRIC\r\n" + 
						"Young Fortinbras, with conquest come from Poland,\r\n" + 
						"To the ambassadors of England gives\r\n" + 
						"This warlike volley.\r\n" + 
						"HAMLET\r\n" + 
						"O, I die, Horatio;\r\n" + 
						"The potent poison quite o'er-crows my spirit:\r\n" + 
						"I cannot live to hear the news from England;\r\n" + 
						"But I do prophesy the election lights\r\n" + 
						"On Fortinbras: he has my dying voice;\r\n" + 
						"So tell him, with the occurrents, more and less,\r\n" + 
						"Which have solicited. The rest is silence.\r\n" + 
						"Dies\r\n" + 
						"\r\n" + 
						"HORATIO\r\n" + 
						"Now cracks a noble heart. Good night sweet prince:\r\n" + 
						"And flights of angels sing thee to thy rest!\r\n" + 
						"Why does the drum come hither?\r\n" + 
						"March within\r\n" + 
						"\r\n" + 
						"Enter FORTINBRAS, the English Ambassadors, and others\r\n" + 
						"\r\n" + 
						"PRINCE FORTINBRAS\r\n" + 
						"Where is this sight?\r\n" + 
						"HORATIO\r\n" + 
						"What is it ye would see?\r\n" + 
						"If aught of woe or wonder, cease your search.\r\n" + 
						"PRINCE FORTINBRAS\r\n" + 
						"This quarry cries on havoc. O proud death,\r\n" + 
						"What feast is toward in thine eternal cell,\r\n" + 
						"That thou so many princes at a shot\r\n" + 
						"So bloodily hast struck?\r\n" + 
						"First Ambassador\r\n" + 
						"The sight is dismal;\r\n" + 
						"And our affairs from England come too late:\r\n" + 
						"The ears are senseless that should give us hearing,\r\n" + 
						"To tell him his commandment is fulfill'd,\r\n" + 
						"That Rosencrantz and Guildenstern are dead:\r\n" + 
						"Where should we have our thanks?\r\n" + 
						"HORATIO\r\n" + 
						"Not from his mouth,\r\n" + 
						"Had it the ability of life to thank you:\r\n" + 
						"He never gave commandment for their death.\r\n" + 
						"But since, so jump upon this bloody question,\r\n" + 
						"You from the Polack wars, and you from England,\r\n" + 
						"Are here arrived give order that these bodies\r\n" + 
						"High on a stage be placed to the view;\r\n" + 
						"And let me speak to the yet unknowing world\r\n" + 
						"How these things came about: so shall you hear\r\n" + 
						"Of carnal, bloody, and unnatural acts,\r\n" + 
						"Of accidental judgments, casual slaughters,\r\n" + 
						"Of deaths put on by cunning and forced cause,\r\n" + 
						"And, in this upshot, purposes mistook\r\n" + 
						"Fall'n on the inventors' reads: all this can I\r\n" + 
						"Truly deliver.\r\n" + 
						"PRINCE FORTINBRAS\r\n" + 
						"Let us haste to hear it,\r\n" + 
						"And call the noblest to the audience.\r\n" + 
						"For me, with sorrow I embrace my fortune:\r\n" + 
						"I have some rights of memory in this kingdom,\r\n" + 
						"Which now to claim my vantage doth invite me.\r\n" + 
						"HORATIO\r\n" + 
						"Of that I shall have also cause to speak,\r\n" + 
						"And from his mouth whose voice will draw on more;\r\n" + 
						"But let this same be presently perform'd,\r\n" + 
						"Even while men's minds are wild; lest more mischance\r\n" + 
						"On plots and errors, happen.\r\n" + 
						"PRINCE FORTINBRAS\r\n" + 
						"Let four captains\r\n" + 
						"Bear Hamlet, like a soldier, to the stage;\r\n" + 
						"For he was likely, had he been put on,\r\n" + 
						"To have proved most royally: and, for his passage,\r\n" + 
						"The soldiers' music and the rites of war\r\n" + 
						"Speak loudly for him.\r\n" + 
						"Take up the bodies: such a sight as this\r\n" + 
						"Becomes the field, but here shows much amiss.\r\n" + 
						"Go, bid the soldiers shoot.\r\n" + 
						"A dead march. Exeunt, bearing off the dead bodies; after which a peal of ordnance is shot off");
				System.out.println(e.decodeImage(bi));
				File outputFile = new File("hamlet.jpg");
			    ImageIO.write(bi, "jpg", outputFile);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
