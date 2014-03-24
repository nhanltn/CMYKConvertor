package com.nsoft.utils;

import java.io.File;

public class Constant {
	public static final String TMP_EPUB_FILE="input/1111.epub";
	public static final String TMP_EXTRACT_PATH="extract/";
	public static final String TMP_OUTPUT_PATH="output/";

	public static final String LINEBREAK="\r\n";
	public static final String SPLASH_SIGN=File.separator;
	public static final int SIZE_ZERO=0;
	public static final String DOT = ".";
	public static final String PIPELINE = "\\|";
	public static final String BLANK = " ";
	public static final String SEMICOLON = ";";
	public static final String JPG_EXT = "jpg";
	public static final String UTF_8 = "UTF-8";
	public static final String PARENT_DIR = "../";
	public static final String HTML = "html";
	public static final String UNDERBAR = "_";

	//command params
	public static final String SHOW_ERR_PARAM = "-debug";
	///
	public static class mess {
		public static final String UTIL_CANNOT_RETRIEVE_THUMBNAIL = "Connot retrieve thumbnail";
		public static final String EPUB_FILE_NOT_EXISTED = "Epub file is not existed";
		public static final String NO_TITLE = "Filename has no title: ";
		public static final String WRONG_FORMAT_TITLE = "Title must have this format: Unitxx | lessonxx | lesson title. Filename: ";
		public static final String CREATE_FILENAME = "Created filename: ";
		public static final String SHORT_MANUAL = "Usage: nos_converter.jar epub_file.epub output_dir/";
		public static final String CANNOT_MAKE_OUTPUT_PATH = "Cannot create ouput folder. Please check write permission.";
		public static final String CONVERTING_ERROR = "Converting has some errors. No output file was created.";
	}
	public static class epub {
		public static final String EPUB_EXT=".epub";
		public static final String XML_EXT=".xml";
		public static final String OGG_EXT=".ogg";

		public static final String EPUB_PATH="EPUB/";
		public static final String XHTML_PATH=EPUB_PATH;
		public static final String OPF_FILEPATH=EPUB_PATH+"package.opf";

		public static final String ITEMREF_TAG="itemref";
		public static final String ITEM_TAG="item";
		public static final String ID_ATTR="id";
		public static final String HREF_ATTR="href";
		public static final String IDREF_ATTR="idref";
		public static final String DC_TITLE_TAG="dc:title";
		//folder name
		public static final String CSS_FOLDER_NAME="css";
		public static final String JS_FOLDER_NAME="js";
		public static final String MEDIA_FOLDER_NAME="media";
		public static final String IMAGES_FOLDER_NAME="images";

		//css files need to copy 
		public static final String[] NEED_2_COPY_CSS_FILES = {"export_fixed_layout.css", "jquery.crossword.css", "font.css", "Helvetica.ttf"};

		public static final String[] NEED_2_DEL_CSS_FILES = {};
		public static final String[] NEED_2_DEL_JS_FILES = {"js/export_anim_control.js","js/jquery.color.js"};
		//js files need to copy
		public static final String[] NEED_2_COPY_JS_FILES = {"jquery.js","export_common.js","jquery-ui.custom.js",
						"xml_parser.js","qa_controller.js", "jquery.crossword.js","jquery.jqscribble.js", "drawing_controller.js"};

	}
	public static class nos {
		public static final int THUMBNAIL_W=100;
		public static final int THUMBNAIL_H=131;
		
		public static final String COMPASS_FILES_FOLDER_NAME="compass_files";	//contains files of compass media
		
		public static final String COVER_FNAME="cover.html";
		public static final String MP3_FOLDER_NAME="mp3";
		public static final String MP3_ODAB_FNAME="odab.mp3";
		public static final String MP3_OK_FNAME="ok.mp3";
		public static final String BOOK_JSON="book.json";
		public static final String BOOK_JSON_CONTENTS_KEY="contents";
		public static final String ZIP_EXT=".zip";
		public static final String REL_JS_PATH="../js/";
		public static final String REL_CSS_PATH="../css/";
		public static final String COMMON_JS_FNAME="common.js";
		public static final String FONT_CSS_FNAME="font.css";
		public static final String COMPASS_CSS_FNAME="compass.css";
		public static final String EXTRA_CSS_FNAME="extra.css";

		public static final String UI_CUSTOM_JS_FNAME="jquery-ui.custom.js";
		public static final String TOUCH_PUNCH_JS_FNAME="jquery.ui.touch-punch.min.js";
		public static final String ICC_PROFILE_FNAME="ISOcoated_v2_300_eci.icc";

		public static final String DOUBLE_SQUARE_OPEN="[[";
		public static final String DOUBLE_SQUARE_CLOSE="]]";
		public static final String SINGLE_SQUARE_OPEN="[";
		public static final String SINGLE_SQUARE_CLOSE="]";

		public static final String DATA_AUDIO_ATTR="data-audio";
		public static final String JUKEBOX_CLASSNAME = "jukebox";
		public static final String TRANSPARENT_HIGHLIGHT = "* {-webkit-tap-highlight-color: rgba(0, 0, 0, 0);}";
		
		public static final String[] NEED_2_DEL_ATTRS = {"tabindex","aria-disabled","aria-label","role","spellcheck","title"};
		public static final String[] NEED_2_DEL_CLASSES = {"pointer","cursor_move","ui-draggable","cke_editable","cke_editable_inline",
									"cke_contents_ltr","cke_show_borders", "ui-draggable-disabled", "ui-state-disabled", "cke_focus", "un_draggable"};
		public static final String[] NEED_2_DEL_CSS = {		//default css
			"background:rgba(255, 255, 255, 0)",
			"filter:alpha(opacity=100)",
			"-ms-filter:progid:DXImageTransform.Microsoft.Alpha(Opacity=100)",
			"transform:perspective(600px) rotateX(0deg) rotateY(0deg) rotateZ(0deg)",
			"-ms-transform:perspective(600px) rotateX(0deg) rotateY(0deg) rotateZ(0deg)",
			"-webkit-transform:perspective(600px) rotateX(0deg) rotateY(0deg) rotateZ(0deg)",
			"-moz-transform:perspective(600px) rotateX(0deg) rotateY(0deg) rotateZ(0deg)",
			"-o-transform:perspective(600px) rotateX(0deg) rotateY(0deg) rotateZ(0deg)",
			"background-position: initial initial",
			"background-repeat: initial initial"};
	}
	public static class xhtml {
		public static final String DOCTYPE_TAG = "<!DOCTYPE html>";
		public static final String EXT = "xhtml";
		public static final String UNIT_PREFIX_NAME = "Unit";
		//tags
		public static final String TITLE_TAG = "title";
		public static final String LINK_TAG = "link";
		public static final String META_TAG = "meta";
		public static final String SCRIPT_TAG = "script";
		public static final String IMG_TAG = "img";
		public static final String HEAD_TAG = "head";
		public static final String BODY_TAG = "body";
		public static final String DIV_TAG = "div";
		public static final String AUDIO_TAG = "audio";
		public static final String SOURCE_TAG = "source";
		public static final String STYLE_TAG = "style";

		//attributes name
		public static final String ID_ATTR="id";
		public static final String CLASS_ATTR="class";
		public static final String CONTENT_ATTR="content";
		public static final String TYPE_ATTR="type";
		public static final String HREF_ATTR="href";
		public static final String SRC_ATTR="src";
		public static final String STYLE_ATTR="style";
		public static final String CONTROLS_ATTR="controls";	//html5 audio

		public static final String SERIES_ATTR="series";
		public static final String BOOK_ATTR="book";
		public static final String UNIT_ATTR="unit";
		public static final String LESSON_ATTR="lesson";

		//values of attributes
		public static final String VIEWPORT_VAL = "viewport";
		public static final String INITIAL_SCALE_VAL = ", initial-scale=1.0,minimum-scale=0.25,maximum-scale=4.0,user-scalable=yes";
		public static final String CSS_TYPE_VAL = "text/css";
		public static final String JS_TYPE_VAL = "text/javascript";
		//
		public static final String UI_DRAGGABLE_REPLACEBLE = "ui-draggable";
		public static final String PREFIX_AUDIO_ID = "aud_tag";
	}
	
	public static class license {
		public static final String LICENSE_FILENAME = "license.nsoft";
		public static final String TIME_SERVER = "time.nist.gov";
		public static final String NO_INTERNET_CONNECTION = "The program requires Internet connection";
		public static final String INVALID_LICENSE = "The current license is invalid";
	}
}