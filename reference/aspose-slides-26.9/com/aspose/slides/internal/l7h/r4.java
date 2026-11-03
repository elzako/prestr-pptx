package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public abstract class r4 extends w1 {
   private String n5;
   private String l6;

   protected r4(int var1) {
      super(var1);
   }

   protected r4(int var1, q0 var2, t2 var3) {
      super(var1, var2, var3);
   }

   public final void l6(k7 var1, boolean var2) {
      if (var1 == null || var1.u3 || var2) {
         if (var1 != null && var1.k5()) {
            var1.l6().u3();
         }

         this.y2();
      }

      var1.c8();
   }

   public final void l6(x8 var1, boolean var2) {
      if (var1 == null || var1.u3 || var2) {
         if (var1 != null && var1.a6()) {
            var1.u3().k5();
         }

         this.y1();
      }

      var1.h0();
   }

   public final void y2() {
      throw new ArgumentException(
         o0.n5("The output byte buffer is too small to contain the encoded data, encoding '{0}' fallback '{1}'.", this.t2(), j8.n5(this.x8())), "bytes"
      );
   }

   public final void y1() {
      throw new ArgumentException(
         o0.n5("The output char buffer is too small to contain the decoded characters, encoding '{0}' fallback '{1}'.", this.t2(), j8.n5(this.n3())), "chars"
      );
   }

   @Override
   public String t2() {
      if (this.n5 == null) {
         this.n5 = k5(this.t9());
         if (this.n5 == null) {
            throw new NotSupportedException(o0.n5("Could not find a resource entry for the encoding codepage '{0} - {1}'", this.s7(), this.t9()));
         }

         if (d1.n5(this.n5, "Globalization_cp_", (short)5)) {
            this.n5 = y1.k5(this.t9());
            if (this.n5 == null) {
               throw new NotSupportedException(o0.n5("Could not find a resource entry for the encoding codepage '{0} - {1}'", this.s7(), this.t9()));
            }
         }
      }

      return this.n5;
   }

   private static String k5(int var0) {
      switch (var0) {
         case 37:
            return "IBM EBCDIC (US-Canada)";
         case 437:
            return "OEM United States";
         case 500:
            return "IBM EBCDIC (International)";
         case 708:
            return "Arabic (ASMO 708)";
         case 720:
            return "Arabic (DOS)";
         case 737:
            return "Greek (DOS)";
         case 775:
            return "Baltic (DOS)";
         case 850:
            return "Western European (DOS)";
         case 852:
            return "Central European (DOS)";
         case 855:
            return "OEM Cyrillic";
         case 857:
            return "Turkish (DOS)";
         case 858:
            return "OEM Multilingual Latin I";
         case 860:
            return "Portuguese (DOS)";
         case 861:
            return "Icelandic (DOS)";
         case 862:
            return "Hebrew (DOS)";
         case 863:
            return "French Canadian (DOS)";
         case 864:
            return "Arabic (864)";
         case 865:
            return "Nordic (DOS)";
         case 866:
            return "Cyrillic (DOS)";
         case 869:
            return "Greek, Modern (DOS)";
         case 870:
            return "IBM EBCDIC (Multilingual Latin-2)";
         case 874:
            return "Thai (Windows)";
         case 875:
            return "IBM EBCDIC (Greek Modern)";
         case 932:
            return "Japanese (Shift-JIS)";
         case 936:
            return "Chinese Simplified (GB2312)";
         case 949:
            return "Korean";
         case 950:
            return "Chinese Traditional (Big5)";
         case 1026:
            return "IBM EBCDIC (Turkish Latin-5)";
         case 1047:
            return "IBM Latin-1";
         case 1140:
            return "IBM EBCDIC (US-Canada-Euro)";
         case 1141:
            return "IBM EBCDIC (Germany-Euro)";
         case 1142:
            return "IBM EBCDIC (Denmark-Norway-Euro)";
         case 1143:
            return "IBM EBCDIC (Finland-Sweden-Euro)";
         case 1144:
            return "IBM EBCDIC (Italy-Euro)";
         case 1145:
            return "IBM EBCDIC (Spain-Euro)";
         case 1146:
            return "IBM EBCDIC (UK-Euro)";
         case 1147:
            return "IBM EBCDIC (France-Euro)";
         case 1148:
            return "IBM EBCDIC (International-Euro)";
         case 1149:
            return "IBM EBCDIC (Icelandic-Euro)";
         case 1250:
            return "Central European (Windows)";
         case 1251:
            return "Cyrillic (Windows)";
         case 1252:
            return "Western European (Windows)";
         case 1253:
            return "Greek (Windows)";
         case 1254:
            return "Turkish (Windows)";
         case 1255:
            return "Hebrew (Windows)";
         case 1256:
            return "Arabic (Windows)";
         case 1257:
            return "Baltic (Windows)";
         case 1258:
            return "Vietnamese (Windows)";
         case 1361:
            return "Korean (Johab)";
         case 10000:
            return "Western European (Mac)";
         case 10001:
            return "Japanese (Mac)";
         case 10002:
            return "Chinese Traditional (Mac)";
         case 10003:
            return "Korean (Mac)";
         case 10004:
            return "Arabic (Mac)";
         case 10005:
            return "Hebrew (Mac)";
         case 10006:
            return "Greek (Mac)";
         case 10007:
            return "Cyrillic (Mac)";
         case 10008:
            return "Chinese Simplified (Mac)";
         case 10010:
            return "Romanian (Mac)";
         case 10017:
            return "Ukrainian (Mac)";
         case 10021:
            return "Thai (Mac)";
         case 10029:
            return "Central European (Mac)";
         case 10079:
            return "Icelandic (Mac)";
         case 10081:
            return "Turkish (Mac)";
         case 10082:
            return "Croatian (Mac)";
         case 20000:
            return "Chinese Traditional (CNS)";
         case 20001:
            return "TCA Taiwan";
         case 20002:
            return "Chinese Traditional (Eten)";
         case 20003:
            return "IBM5550 Taiwan";
         case 20004:
            return "TeleText Taiwan";
         case 20005:
            return "Wang Taiwan";
         case 20105:
            return "Western European (IA5)";
         case 20106:
            return "German (IA5)";
         case 20107:
            return "Swedish (IA5)";
         case 20108:
            return "Norwegian (IA5)";
         case 20261:
            return "T.61";
         case 20269:
            return "ISO-6937";
         case 20273:
            return "IBM EBCDIC (Germany)";
         case 20277:
            return "IBM EBCDIC (Denmark-Norway)";
         case 20278:
            return "IBM EBCDIC (Finland-Sweden)";
         case 20280:
            return "IBM EBCDIC (Italy)";
         case 20284:
            return "IBM EBCDIC (Spain)";
         case 20285:
            return "IBM EBCDIC (UK)";
         case 20290:
            return "IBM EBCDIC (Japanese katakana)";
         case 20297:
            return "IBM EBCDIC (France)";
         case 20420:
            return "IBM EBCDIC (Arabic)";
         case 20423:
            return "IBM EBCDIC (Greek)";
         case 20424:
            return "IBM EBCDIC (Hebrew)";
         case 20833:
            return "IBM EBCDIC (Korean Extended)";
         case 20838:
            return "IBM EBCDIC (Thai)";
         case 20866:
            return "Cyrillic (KOI8-R)";
         case 20871:
            return "IBM EBCDIC (Icelandic)";
         case 20880:
            return "IBM EBCDIC (Cyrillic Russian)";
         case 20905:
            return "IBM EBCDIC (Turkish)";
         case 20924:
            return "IBM Latin-1";
         case 20932:
            return "Japanese (JIS 0208-1990 and 0212-1990)";
         case 20936:
            return "Chinese Simplified (GB2312-80)";
         case 20949:
            return "Korean Wansung";
         case 21025:
            return "IBM EBCDIC (Cyrillic Serbian-Bulgarian)";
         case 21027:
            return "Ext Alpha Lowercase";
         case 21866:
            return "Cyrillic (KOI8-U)";
         case 28592:
            return "Central European (ISO)";
         case 28593:
            return "Latin 3 (ISO)";
         case 28594:
            return "Baltic (ISO)";
         case 28595:
            return "Cyrillic (ISO)";
         case 28596:
            return "Arabic (ISO)";
         case 28597:
            return "Greek (ISO)";
         case 28598:
            return "Hebrew (ISO-Visual)";
         case 28599:
            return "Turkish (ISO)";
         case 28603:
            return "Estonian (ISO)";
         case 28605:
            return "Latin 9 (ISO)";
         case 29001:
            return "Europa";
         case 38598:
            return "Hebrew (ISO-Logical)";
         case 50000:
            return "User Defined";
         case 50220:
            return "Japanese (JIS)";
         case 50221:
            return "Japanese (JIS-Allow 1 byte Kana)";
         case 50222:
            return "Japanese (JIS-Allow 1 byte Kana - SO/SI)";
         case 50225:
            return "Korean (ISO)";
         case 50227:
            return "Chinese Simplified (ISO-2022)";
         case 50229:
            return "Chinese Traditional (ISO-2022)";
         case 50930:
            return "IBM EBCDIC (Japanese and Japanese Katakana)";
         case 50931:
            return "IBM EBCDIC (Japanese and US-Canada)";
         case 50933:
            return "IBM EBCDIC (Korean and Korean Extended)";
         case 50935:
            return "IBM EBCDIC (Simplified Chinese)";
         case 50937:
            return "IBM EBCDIC (Traditional Chinese)";
         case 50939:
            return "IBM EBCDIC (Japanese and Japanese-Latin)";
         case 51932:
            return "Japanese (EUC)";
         case 51936:
            return "Chinese Simplified (EUC)";
         case 51949:
            return "Korean (EUC)";
         case 52936:
            return "Chinese Simplified (HZ)";
         case 54936:
            return "Chinese Simplified (GB18030)";
         case 57002:
            return "ISCII Devanagari";
         case 57003:
            return "ISCII Bengali";
         case 57004:
            return "ISCII Tamil";
         case 57005:
            return "ISCII Telugu";
         case 57006:
            return "ISCII Assamese";
         case 57007:
            return "ISCII Oriya";
         case 57008:
            return "ISCII Kannada";
         case 57009:
            return "ISCII Malayalam";
         case 57010:
            return "ISCII Gujarati";
         case 57011:
            return "ISCII Punjabi";
         default:
            return null;
      }
   }

   @Override
   public String s7() {
      if (this.l6 == null) {
         this.l6 = y1.l6(this.t9());
         if (this.l6 == null) {
            throw new NotSupportedException(
               o0.n5(
                  "No data is available for encoding {0}. For information on defining a custom encoding, see the documentation for the Encoding.RegisterProvider method.",
                  this.t9()
               )
            );
         }
      }

      return this.l6;
   }
}
