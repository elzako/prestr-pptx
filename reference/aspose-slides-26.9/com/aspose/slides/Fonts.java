package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.ms.System.IDisposable;

public class Fonts implements IFonts {
   private a6w k5;
   final com.aspose.slides.internal.v6g.n5<a6w> n5 = new Fonts$1(this);
   private final v6v u3;
   private com.aspose.slides.ms.System.o5<Integer> a6 = new com.aspose.slides.ms.System.o5<>();
   private com.aspose.slides.ms.System.o5<Integer> u9 = new com.aspose.slides.ms.System.o5<>();
   private com.aspose.slides.ms.System.o5<Integer> h0 = new com.aspose.slides.ms.System.o5<>();
   private a6k c8 = new a6k();
   private long t2;
   static final IGenericDictionary<String, Fonts$n5> l6 = n5(
      new Fonts$n5("ar-SA", "Arab", 2),
      new Fonts$n5("bg-BG", "Cyrl", 0),
      new Fonts$n5("ca-ES", "Latn", 0),
      new Fonts$n5("zh-TW", "Hant", 1),
      new Fonts$n5("cs-CZ", "Latn", 0),
      new Fonts$n5("da-DK", "Latn", 0),
      new Fonts$n5("de-DE", "Latn", 0),
      new Fonts$n5("el-GR", "Grek", 0),
      new Fonts$n5("en-US", "Latn", 0),
      new Fonts$n5("fi-FI", "Latn", 0),
      new Fonts$n5("fr-FR", "Latn", 0),
      new Fonts$n5("he-IL", "Hebr", 2),
      new Fonts$n5("hu-HU", "Latn", 0),
      new Fonts$n5("is-IS", "Latn", 0),
      new Fonts$n5("it-IT", "Latn", 0),
      new Fonts$n5("ja-JP", "Jpan", 1),
      new Fonts$n5("ko-KP", "Hang", 1),
      new Fonts$n5("ko-KR", "Hang", 1),
      new Fonts$n5("nl-NL", "Latn", 0),
      new Fonts$n5("nb-NO", "Latn", 0),
      new Fonts$n5("pl-PL", "Latn", 0),
      new Fonts$n5("pt-BR", "Latn", 0),
      new Fonts$n5("ro-RO", "Latn", 0),
      new Fonts$n5("ru-RU", "Cyrl", 0),
      new Fonts$n5("hr-HR", "Latn", 0),
      new Fonts$n5("sk-SK", "Latn", 0),
      new Fonts$n5("sq-AL", "Latn", 0),
      new Fonts$n5("sv-SE", "Latn", 0),
      new Fonts$n5("th-TH", "Thai", 2),
      new Fonts$n5("tr-TR", "Latn", 0),
      new Fonts$n5("ur-PK", "Arab", 2),
      new Fonts$n5("id-ID", "Latn", 0),
      new Fonts$n5("uk-UA", "Cyrl", 0),
      new Fonts$n5("be-BY", "Cyrl", 0),
      new Fonts$n5("sl-SI", "Latn", 0),
      new Fonts$n5("et-EE", "Latn", 0),
      new Fonts$n5("lv-LV", "Latn", 0),
      new Fonts$n5("lt-LT", "Latn", 0),
      new Fonts$n5("fa-IR", "Arab", 2),
      new Fonts$n5("hy-AM", "Armn", 0),
      new Fonts$n5("az-Latn-AZ", "Latn", 0),
      new Fonts$n5("eu-ES", "Latn", 0),
      new Fonts$n5("mk-MK", "Cyrl", 0),
      new Fonts$n5("af-ZA", "Latn", 0),
      new Fonts$n5("ka-GE", "Geor", 0),
      new Fonts$n5("fo-FO", "Latn", 0),
      new Fonts$n5("hi-IN", "Deva", 2),
      new Fonts$n5("ms-MY", "Latn", 0),
      new Fonts$n5("kk-KZ", "Cyrl", 0),
      new Fonts$n5("ky-KG", "Cyrl", 0),
      new Fonts$n5("sw-KE", "Latn", 0),
      new Fonts$n5("uz-Latn-UZ", "Latn", 0),
      new Fonts$n5("tt-RU", "Cyrl", 0),
      new Fonts$n5("pa-IN", "Guru", 2),
      new Fonts$n5("gu-IN", "Gujr", 2),
      new Fonts$n5("ta-IN", "Taml", 2),
      new Fonts$n5("te-IN", "Telu", 2),
      new Fonts$n5("kn-IN", "Knda", 2),
      new Fonts$n5("mr-IN", "Deva", 2),
      new Fonts$n5("sa-IN", "Deva", 2),
      new Fonts$n5("mn-MN", "Cyrl", 0),
      new Fonts$n5("gl-ES", "Latn", 0),
      new Fonts$n5("kok-IN", "Deva", 2),
      new Fonts$n5("syr-SY", "Syrc", 2),
      new Fonts$n5("dv-MV", "Thaa", 2),
      new Fonts$n5("ar-IQ", "Arab", 2),
      new Fonts$n5("zh-CN", "Hans", 1),
      new Fonts$n5("de-CH", "Latn", 0),
      new Fonts$n5("en-GB", "Latn", 0),
      new Fonts$n5("es-MX", "Latn", 0),
      new Fonts$n5("fr-BE", "Latn", 0),
      new Fonts$n5("it-CH", "Latn", 0),
      new Fonts$n5("nl-BE", "Latn", 0),
      new Fonts$n5("nn-NO", "Latn", 0),
      new Fonts$n5("pt-PT", "Latn", 0),
      new Fonts$n5("sr-Latn-CS", "Latn", 0),
      new Fonts$n5("sv-FI", "Latn", 0),
      new Fonts$n5("az-Cyrl-AZ", "Cyrl", 0),
      new Fonts$n5("ms-BN", "Latn", 0),
      new Fonts$n5("uz-Cyrl-UZ", "Cyrl", 0),
      new Fonts$n5("ar-EG", "Arab", 2),
      new Fonts$n5("zh-HK", "Hant", 1),
      new Fonts$n5("de-AT", "Latn", 0),
      new Fonts$n5("en-AU", "Latn", 0),
      new Fonts$n5("es-ES", "Latn", 0),
      new Fonts$n5("fr-CA", "Latn", 0),
      new Fonts$n5("sr-Cyrl-CS", "Cyrl", 0),
      new Fonts$n5("ar-LY", "Arab", 2),
      new Fonts$n5("zh-SG", "Hans", 1),
      new Fonts$n5("de-LU", "Latn", 0),
      new Fonts$n5("en-CA", "Latn", 0),
      new Fonts$n5("es-GT", "Latn", 0),
      new Fonts$n5("fr-CH", "Latn", 0),
      new Fonts$n5("ar-DZ", "Arab", 2),
      new Fonts$n5("zh-MO", "Hant", 1),
      new Fonts$n5("de-LI", "Latn", 0),
      new Fonts$n5("en-NZ", "Latn", 0),
      new Fonts$n5("es-CR", "Latn", 0),
      new Fonts$n5("fr-LU", "Latn", 0),
      new Fonts$n5("ar-MA", "Arab", 2),
      new Fonts$n5("en-IE", "Latn", 0),
      new Fonts$n5("es-PA", "Latn", 0),
      new Fonts$n5("fr-MC", "Latn", 0),
      new Fonts$n5("ar-TN", "Arab", 2),
      new Fonts$n5("en-ZA", "Latn", 0),
      new Fonts$n5("es-DO", "Latn", 0),
      new Fonts$n5("ar-OM", "Arab", 2),
      new Fonts$n5("en-JM", "Latn", 0),
      new Fonts$n5("es-VE", "Latn", 0),
      new Fonts$n5("ar-YE", "Arab", 2),
      new Fonts$n5("en-029", "Latn", 0),
      new Fonts$n5("es-CO", "Latn", 0),
      new Fonts$n5("ar-SY", "Arab", 2),
      new Fonts$n5("en-BZ", "Latn", 0),
      new Fonts$n5("es-PE", "Latn", 0),
      new Fonts$n5("ar-JO", "Arab", 2),
      new Fonts$n5("en-TT", "Latn", 0),
      new Fonts$n5("es-AR", "Latn", 0),
      new Fonts$n5("ar-LB", "Arab", 2),
      new Fonts$n5("en-ZW", "Latn", 0),
      new Fonts$n5("es-EC", "Latn", 0),
      new Fonts$n5("ar-KW", "Arab", 2),
      new Fonts$n5("en-PH", "Latn", 0),
      new Fonts$n5("es-CL", "Latn", 0),
      new Fonts$n5("ar-AE", "Arab", 2),
      new Fonts$n5("es-UY", "Latn", 0),
      new Fonts$n5("ar-BH", "Arab", 2),
      new Fonts$n5("es-PY", "Latn", 0),
      new Fonts$n5("ar-QA", "Arab", 2),
      new Fonts$n5("es-BO", "Latn", 0),
      new Fonts$n5("es-SV", "Latn", 0),
      new Fonts$n5("es-HN", "Latn", 0),
      new Fonts$n5("es-NI", "Latn", 0),
      new Fonts$n5("es-PR", "Latn", 0),
      new Fonts$n5("am-ET", "Ethi", 0),
      new Fonts$n5("tzm-Latn-DZ", "Latn", 0),
      new Fonts$n5("iu-Latn-CA", "Latn", 0),
      new Fonts$n5("sma-NO", "Latn", 0),
      new Fonts$n5("mn-Mong-CN", "Mong", 2),
      new Fonts$n5("gd-GB", "Latn", 0),
      new Fonts$n5("en-MY", "Latn", 0),
      new Fonts$n5("prs-AF", "Arab", 2),
      new Fonts$n5("bn-BD", "Beng", 2),
      new Fonts$n5("wo-SN", "Latn", 0),
      new Fonts$n5("rw-RW", "Latn", 0),
      new Fonts$n5("qut-GT", "Latn", 0),
      new Fonts$n5("sah-RU", "Cyrl", 0),
      new Fonts$n5("gsw-FR", "Latn", 0),
      new Fonts$n5("co-FR", "Latn", 0),
      new Fonts$n5("oc-FR", "Latn", 0),
      new Fonts$n5("mi-NZ", "Latn", 0),
      new Fonts$n5("ga-IE", "Latn", 0),
      new Fonts$n5("se-SE", "Latn", 0),
      new Fonts$n5("br-FR", "Latn", 0),
      new Fonts$n5("smn-FI", "Latn", 0),
      new Fonts$n5("moh-CA", "Latn", 0),
      new Fonts$n5("arn-CL", "Latn", 0),
      new Fonts$n5("ii-CN", "Yiii", 1),
      new Fonts$n5("dsb-DE", "Latn", 0),
      new Fonts$n5("ig-NG", "Latn", 0),
      new Fonts$n5("kl-GL", "Latn", 0),
      new Fonts$n5("lb-LU", "Latn", 0),
      new Fonts$n5("ba-RU", "Cyrl", 0),
      new Fonts$n5("nso-ZA", "Latn", 0),
      new Fonts$n5("quz-BO", "Latn", 0),
      new Fonts$n5("yo-NG", "Latn", 0),
      new Fonts$n5("ha-Latn-NG", "Latn", 0),
      new Fonts$n5("fil-PH", "Latn", 0),
      new Fonts$n5("ps-AF", "Arab", 2),
      new Fonts$n5("fy-NL", "Latn", 0),
      new Fonts$n5("ne-NP", "Deva", 2),
      new Fonts$n5("se-NO", "Latn", 0),
      new Fonts$n5("iu-Cans-CA", "Cans", 0),
      new Fonts$n5("sr-Latn-RS", "Latn", 0),
      new Fonts$n5("si-LK", "Sinh", 2),
      new Fonts$n5("sr-Cyrl-RS", "Cyrl", 0),
      new Fonts$n5("lo-LA", "Laoo", 2),
      new Fonts$n5("km-KH", "Khmr", 2),
      new Fonts$n5("cy-GB", "Latn", 0),
      new Fonts$n5("bo-CN", "Tibt", 2),
      new Fonts$n5("sms-FI", "Latn", 0),
      new Fonts$n5("as-IN", "Beng", 2),
      new Fonts$n5("ml-IN", "Mlym", 2),
      new Fonts$n5("en-IN", "Latn", 0),
      new Fonts$n5("or-IN", "Orya", 2),
      new Fonts$n5("bn-IN", "Beng", 2),
      new Fonts$n5("tk-TM", "Latn", 0),
      new Fonts$n5("bs-Latn-BA", "Latn", 0),
      new Fonts$n5("mt-MT", "Latn", 0),
      new Fonts$n5("sr-Cyrl-ME", "Cyrl", 0),
      new Fonts$n5("se-FI", "Latn", 0),
      new Fonts$n5("zu-ZA", "Latn", 0),
      new Fonts$n5("xh-ZA", "Latn", 0),
      new Fonts$n5("tn-ZA", "Latn", 0),
      new Fonts$n5("hsb-DE", "Latn", 0),
      new Fonts$n5("bs-Cyrl-BA", "Cyrl", 0),
      new Fonts$n5("tg-Cyrl-TJ", "Cyrl", 0),
      new Fonts$n5("sr-Latn-BA", "Latn", 0),
      new Fonts$n5("smj-NO", "Latn", 0),
      new Fonts$n5("rm-CH", "Latn", 0),
      new Fonts$n5("smj-SE", "Latn", 0),
      new Fonts$n5("quz-EC", "Latn", 0),
      new Fonts$n5("quz-PE", "Latn", 0),
      new Fonts$n5("hr-BA", "Latn", 0),
      new Fonts$n5("sr-Latn-ME", "Latn", 0),
      new Fonts$n5("sma-SE", "Latn", 0),
      new Fonts$n5("en-SG", "Latn", 0),
      new Fonts$n5("sr-Cyrl-BA", "Cyrl", 0),
      new Fonts$n5("es-US", "Latn", 0)
   );

   Fonts(v6v fontsList) {
      this.u3 = fontsList;
      this.a6 = new com.aspose.slides.ms.System.o5<>(this.u3.n5(0, new FontData("Arial")));
      this.u9 = new com.aspose.slides.ms.System.o5<>(this.u3.n5(1, new FontData("Arial")));
      this.h0 = new com.aspose.slides.ms.System.o5<>(this.u3.n5(2, new FontData("Arial")));
   }

   @Override
   public final Dictionary<String, String> getScriptFontMap() {
      return new Dictionary<>(this.c8.n5());
   }

   @Override
   public final String getScriptFont(String script) {
      return this.c8.n5().containsKey(script) ? this.c8.n5().get_Item(script) : null;
   }

   @Override
   public final void setScriptFont(String script, String fontName) {
      if (this.c8.n5().containsKey(script)) {
         this.c8.n5().set_Item(script, fontName);
      } else {
         this.c8.n5().addItem(script, fontName);
      }
   }

   @Override
   public final void removeScriptFont(String script) {
      if (this.c8.n5().containsKey(script)) {
         this.c8.n5().removeItemByKey(script);
      }
   }

   final a6k n5() {
      return this.c8;
   }

   @Override
   public final IFontData getLatinFont() {
      return !this.a6.l6() ? null : this.u3.n5(this.a6.n5() & 65535).l6();
   }

   @Override
   public final void setLatinFont(IFontData value) {
      if (value != null) {
         this.a6 = new com.aspose.slides.ms.System.o5<>(this.u3.n5(0, value));
      }

      this.u3();
   }

   @Override
   public final IFontData getEastAsianFont() {
      return !this.u9.l6() ? null : this.u3.n5(this.u9.n5() & 65535).l6();
   }

   @Override
   public final void setEastAsianFont(IFontData value) {
      if (value != null) {
         this.u9 = new com.aspose.slides.ms.System.o5<>(this.u3.n5(1, value));
      }

      this.u3();
   }

   @Override
   public final IFontData getComplexScriptFont() {
      return !this.h0.l6() ? null : this.u3.n5(this.h0.n5() & 65535).l6();
   }

   @Override
   public final void setComplexScriptFont(IFontData value) {
      if (value != null) {
         this.h0 = new com.aspose.slides.ms.System.o5<>(this.u3.n5(2, value));
      }

      this.u3();
   }

   final boolean l6() {
      return com.aspose.slides.ms.System.o5.n5(this.h0, new com.aspose.slides.ms.System.o5<>(65535));
   }

   static String n5(String var0) {
      String var1 = "Latn";
      Fonts$n5 var2 = null;
      Fonts$n5[] var3 = new Fonts$n5[]{var2};
      boolean var4 = !com.aspose.slides.ms.System.d1.n5(var0) && l6.tryGetValue(var0, var3);
      var2 = var3[0];
      if (var4) {
         var1 = var2.l6;
      }

      return var1;
   }

   private static IGenericDictionary<String, Fonts$n5> n5(Fonts$n5... var0) {
      Dictionary var1 = new Dictionary<>(com.aspose.slides.ms.System.p6.l6());

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1.addItem(var0[var2].n5, var0[var2]);
      }

      return var1;
   }

   final void n5(Fonts var1) {
      var1.a6.n5(this.a6);
      var1.u9.n5(this.u9);
      var1.h0.n5(this.h0);
      if (var1.c8.l6() != null) {
         this.c8.n5(var1.c8.l6().u3());
      }

      this.u3();
   }

   final void n5(IFontsEffectiveData var1) {
      this.a6 = new com.aspose.slides.ms.System.o5<>(this.u3.n5(0, var1.getLatinFont()));
      this.u9 = new com.aspose.slides.ms.System.o5<>(this.u3.n5(1, var1.getEastAsianFont()));
      this.h0 = new com.aspose.slides.ms.System.o5<>(this.u3.n5(2, var1.getComplexScriptFont()));
      if (com.aspose.slides.internal.v6g.k5.l6(var1, c5z.class)) {
         c5z var2 = (c5z)var1;
         this.c8.n5().clear();
         Dictionary$KeyCollection$Enumerator var3 = var2.n5.n5().getKeys().iterator();

         try {
            while (var3.hasNext()) {
               String var4 = (String)var3.next();
               this.c8.n5().addItem(var4, var2.n5.n5().get_Item(var4));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         if (var2.n5.l6() != null) {
            this.c8.n5(var2.n5.l6().u3());
         }
      }

      this.u3();
   }

   private void u3() {
      this.t2++;
      this.a6();
   }

   private void a6() {
      a6w var1 = this.k5;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   final long k5() {
      return this.t2;
   }

   // $VF: synthetic method
   static a6w n5(Fonts var0, a6w var1) {
      return var0.k5 = var1;
   }
}
