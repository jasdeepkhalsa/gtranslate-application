/**
 * Language.java
 *
 * Copyright (C) 2007,  Richard Midwinter
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.google.api.translate;

/**
 * Defines language information for the Google Translate API.
 *
 * @author Richard Midwinter
 * @author alosii
 * @author bjkuczynski
 */
public enum Language {
	AUTO_DETECT(""),
	AFRIKAANS("af"),
        ALBANIAN("sq"),
        AMHARIC("am"),
        ARABIC("ar"),
        ARMENIAN("hy"),
        AZERBAIJANI("az"),
        BASQUE("eu"),
        BELARUSIAN("be"),
        BENGALI("bn"),
        BIHARI("bh"),
        BRETON("br"),
        BULGARIAN("bg"),
        BURMESE("my"),
        CATALAN("ca"),
        CHEROKEE("chr"),
        CHINESE("zh"),
        CHINESE_SIMPLIFIED("zh-CN"),
        CHINESE_TRADITIONAL("zh-TW"),
        CORSICAN("co"),
        CROATIAN("hr"),
        CZECH("cs"),
        DANISH("da"),
        DHIVEHI("dv"),
        DUTCH("nl"),
        ENGLISH("en"),
        ESPERANTO("eo"),
        ESTONIAN("et"),
        FAROESE("fo"),
        FILIPINO("tl"),
        FINNISH("fi"),
        FRENCH("fr"),
        FRISIAN("fy"),
        GALICIAN("gl"),
        GEORGIAN("ka"),
        GERMAN("de"),
        GREEK("el"),
        GUJARATI("gu"),
        HAITIAN_CREOLE("ht"),
        HEBREW("iw"),
        HINDI("hi"),
        HUNGARIAN("hu"),
        ICELANDIC("is"),
        INDONESIAN("id"),
        INUKTITUT("iu"),
        IRISH("ga"),
        ITALIAN("it"),
        JAPANESE("ja"),
        JAVANESE("jw"),
        KANNADA("kn"),
        KAZAKH("kk"),
        KHMER("km"),
        KOREAN("ko"),
        KURDISH("ku"),
        KYRGYZ("ky"),
        LAO("lo"),
        LATIN("la"),
        LATVIAN("lv"),
        LITHUANIAN("lt"),
        LUXEMBOURGISH("lb"),
        MACEDONIAN("mk"),
        MALAY("ms"),
        MALAYALAM("ml"),
        MALTESE("mt"),
        MAORI("mi"),
        MARATHI("mr"),
        MONGOLIAN("mn"),
        NEPALI("ne"),
        NORWEGIAN("no"),
        OCCITAN("oc"),
        ORIYA("or"),
        PASHTO("ps"),
        PERSIAN("fa"),
        POLISH("pl"),
        PORTUGUESE("pt"),
        PORTUGUESE_PORTUGAL("pt-PT"),
        PUNJABI("pa"),
        QUECHUA("qu"),
        ROMANIAN("ro"),
        RUSSIAN("ru"),
        SANSKRIT("sa"),
        SCOTS_GAELIC("gd"),
        SERBIAN("sr"),
        SINDHI("sd"),
        SINHALESE("si"),
        SLOVAK("sk"),
        SLOVENIAN("sl"),
        SPANISH("es"),
        SUNDANESE("su"),
        SWAHILI("sw"),
        SWEDISH("sv"),
        SYRIAC("syr"),
        TAJIK("tg"),
        TAMIL("ta"),
        TATAR("tt"),
        TELUGU("te"),
        THAI("th"),
        TIBETAN("bo"),
        TONGA("to"),
        TURKISH("tr"),
        UKRAINIAN("uk"),
        URDU("ur"),
        UZBEK("uz"),
        UIGHUR("ug"),
        VIETNAMESE("vi"),
        WELSH("cy"),
        YIDDISH("yi"),
        YORUBA("yo");
	
	/**
	 * Google's String representation of this language.
	 */
	private final String language;
	
	/**
	 * Enum constructor.
	 * @param pLanguage The language identifier.
	 */
	private Language(final String pLanguage) {
		language = pLanguage;
	}
	
	public static Language fromString(final String pLanguage) {
		for (Language l : values()) {
			if (pLanguage.equals(l.toString())) {
				return l;
			}
		}
		return null;
	}
	
	/**
	 * Returns the String representation of this language.
	 * @return The String representation of this language.
	 */
	@Override
	public String toString() {
		return language;
	}
}