package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class j9g {
   public static String n5(com.aspose.slides.internal.z0k.t4 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("mathMlStream");
      }

      if (!var0.canRead()) {
         throw new ArgumentException("Stream must be readable.", "mathMlStream");
      }

      long var1 = 0L;
      if (var0.canSeek()) {
         var1 = var0.getPosition();
         var0.setPosition(0L);
      }

      XmlDocument var3 = new XmlDocument();

      try {
         var3.load(var0);
      } finally {
         if (var0.canSeek()) {
            var0.setPosition(var1);
         }
      }

      if (var3.getDocumentElement() == null) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
      com.aspose.slides.ms.System.Xml.m8 var5 = var3.getDocumentElement();

      for (int var6 = 0; var6 < var5.getChildNodes().n5(); var6++) {
         n5(var5.getChildNodes().k5(var6), var4);
      }

      String var9 = var4.toString();
      var9 = l6(var9);
      var9 = k5(var9);
      var9 = u3(var9);
      var9 = a6(var9);
      var9 = u9(var9);
      return com.aspose.slides.ms.System.d1.l6(var9);
   }

   private static void n5(com.aspose.slides.ms.System.Xml.l0 var0, com.aspose.slides.internal.l7h.a5 var1) {
      if (var0 != null) {
         String var2 = var0.getLocalName();
         if ("mi".equals(var2) || "mn".equals(var2)) {
            var1.n5(var0.getInnerText()).n5(' ');
         } else if ("mo".equals(var2)) {
            String var3 = n5(var0.getInnerText());
            if (!com.aspose.slides.ms.System.d1.n5(var3)) {
               var1.n5(var3).n5(' ');
            }
         } else if ("mrow".equals(var2)) {
            l6(var0, var1);
         } else if ("mfrac".equals(var2)) {
            k5(var0, var1);
         } else if ("msup".equals(var2)) {
            u3(var0, var1);
         } else if ("msub".equals(var2)) {
            a6(var0, var1);
         } else if ("msqrt".equals(var2)) {
            u9(var0, var1);
         } else if ("mroot".equals(var2)) {
            h0(var0, var1);
         } else if ("munderover".equals(var2)) {
            c8(var0, var1);
         } else if ("semantics".equals(var2)) {
            if (var0.getChildNodes().n5() > 0) {
               n5(var0.getChildNodes().k5(0), var1);
            }
         } else {
            l6(var0, var1);
         }
      }
   }

   private static void l6(com.aspose.slides.ms.System.Xml.l0 var0, com.aspose.slides.internal.l7h.a5 var1) {
      for (int var2 = 0; var2 < var0.getChildNodes().n5(); var2++) {
         n5(var0.getChildNodes().k5(var2), var1);
      }
   }

   private static void k5(com.aspose.slides.ms.System.Xml.l0 var0, com.aspose.slides.internal.l7h.a5 var1) {
      if (var0.getChildNodes().n5() >= 2) {
         com.aspose.slides.ms.System.Xml.u8 var2 = var0.getAttributes().n5("linethickness");
         boolean var3 = false;
         if (var2 != null) {
            String var4 = com.aspose.slides.ms.System.d1.l6(var2.getValue());
            if ("0".equals(var4) || "0px".equals(var4)) {
               var3 = true;
            }
         }

         com.aspose.slides.ms.System.Xml.l0 var8 = var0.getChildNodes().n5() > 0 ? var0.getChildNodes().k5(0) : null;
         com.aspose.slides.ms.System.Xml.l0 var5 = var0.getChildNodes().n5() > 1 ? var0.getChildNodes().k5(1) : null;
         if (var3) {
            var1.n5("binomial coefficient ");
            com.aspose.slides.internal.l7h.a5 var6 = new com.aspose.slides.internal.l7h.a5();
            com.aspose.slides.internal.l7h.a5 var7 = new com.aspose.slides.internal.l7h.a5();
            n5(var8, var6);
            n5(var5, var7);
            var1.n5(com.aspose.slides.ms.System.d1.l6(var6.toString()));
            var1.n5(" choose ");
            var1.n5(com.aspose.slides.ms.System.d1.l6(var7.toString()));
            var1.n5(' ');
         } else {
            var1.n5("fraction with numerator ");
            n5(var8, var1);
            var1.n5(" and denominator ");
            n5(var5, var1);
         }
      }
   }

   private static void u3(com.aspose.slides.ms.System.Xml.l0 var0, com.aspose.slides.internal.l7h.a5 var1) {
      if (var0.getChildNodes().n5() >= 2) {
         n5(var0.getChildNodes().k5(0), var1);
         String var2 = var0.getChildNodes().k5(1).getInnerText();
         if ("2".equals(var2)) {
            var1.n5("squared ");
         } else if ("3".equals(var2)) {
            var1.n5("cubed ");
         } else {
            var1.n5("to the power of ");
            var1.n5(var2).n5(' ');
         }
      }
   }

   private static void a6(com.aspose.slides.ms.System.Xml.l0 var0, com.aspose.slides.internal.l7h.a5 var1) {
      if (var0.getChildNodes().n5() >= 2) {
         n5(var0.getChildNodes().k5(0), var1);
         var1.n5("with subscript ");
         n5(var0.getChildNodes().k5(1), var1);
      }
   }

   private static void u9(com.aspose.slides.ms.System.Xml.l0 var0, com.aspose.slides.internal.l7h.a5 var1) {
      var1.n5("square root of ");
      l6(var0, var1);
   }

   private static void h0(com.aspose.slides.ms.System.Xml.l0 var0, com.aspose.slides.internal.l7h.a5 var1) {
      if (var0.getChildNodes().n5() >= 2) {
         var1.n5("root of degree ");
         n5(var0.getChildNodes().k5(1), var1);
         var1.n5("of ");
         n5(var0.getChildNodes().k5(0), var1);
      }
   }

   private static void c8(com.aspose.slides.ms.System.Xml.l0 var0, com.aspose.slides.internal.l7h.a5 var1) {
      if (var0.getChildNodes().n5() < 3) {
         l6(var0, var1);
      } else {
         String var2 = com.aspose.slides.ms.System.d1.l6(var0.getChildNodes().k5(0).getInnerText());
         com.aspose.slides.ms.System.Xml.l0 var3 = var0.getChildNodes().k5(1);
         com.aspose.slides.ms.System.Xml.l0 var4 = var0.getChildNodes().k5(2);
         if ("∑".equals(var2)) {
            var1.n5("sum from ");
            var1.n5(var3.getInnerText()).n5(" to ");
            var1.n5(var4.getInnerText()).n5(" of ");
         } else if ("∫".equals(var2)) {
            var1.n5("integral from ");
            var1.n5(var3.getInnerText()).n5(" to ");
            var1.n5(var4.getInnerText()).n5(" of ");
         } else {
            l6(var0, var1);
         }
      }
   }

   private static String n5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return com.aspose.slides.ms.System.d1.n5;
      } else {
         var0 = com.aspose.slides.ms.System.d1.l6(var0);
         if ("+".equals(var0)) {
            return "plus";
         } else if ("-".equals(var0) || "−".equals(var0)) {
            return "minus";
         } else if ("=".equals(var0)) {
            return "equals";
         } else if ("*".equals(var0) || "×".equals(var0)) {
            return "multiplied by";
         } else if ("/".equals(var0) || "÷".equals(var0)) {
            return "divided by";
         } else if ("<".equals(var0)) {
            return "less than";
         } else if (">".equals(var0)) {
            return "greater than";
         } else if ("≤".equals(var0)) {
            return "less than or equal to";
         } else {
            return "≥".equals(var0) ? "greater than or equal to" : com.aspose.slides.ms.System.d1.n5;
         }
      }
   }

   private static String l6(String var0) {
      String var1 = var0;
      if (var1 == null) {
         var1 = com.aspose.slides.ms.System.d1.n5;
      }

      return com.aspose.slides.ms.System.d1.l6(com.aspose.slides.internal.r7c.c8.n5(var1, "\\s+", " "));
   }

   private static String k5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return var0;
      }

      var0 = com.aspose.slides.ms.System.d1.n5(var0, "∞", "infinity ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "≈", "approximately ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "±", "plus or minus ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "∂", "partial ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "∑", "sum ");
      return com.aspose.slides.ms.System.d1.n5(var0, "∫", "integral ");
   }

   private static String u3(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return var0;
      }

      var0 = com.aspose.slides.ms.System.d1.n5(var0, "α", "alpha ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "β", "beta ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "γ", "gamma ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "δ", "delta ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "ε", "epsilon ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "θ", "theta ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "λ", "lambda ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "μ", "mu ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "π", "pi ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "σ", "sigma ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "φ", "phi ");
      return com.aspose.slides.ms.System.d1.n5(var0, "ω", "omega ");
   }

   private static String a6(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return var0;
      }

      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc4e", "a ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc4f", "b ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc50", "c ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc51", "d ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc52", "e ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc53", "f ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc54", "g ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "ℎ", "h ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc56", "i ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc57", "j ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc58", "k ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc59", "l ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc5a", "m ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc5b", "n ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc5c", "o ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc5d", "p ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc5e", "q ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc5f", "r ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc60", "s ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc61", "t ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc62", "u ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc63", "v ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc64", "w ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc65", "x ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc66", "y ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc67", "z ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc34", "A");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc35", "B ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc36", "C ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc37", "D ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc38", "E ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc39", "F ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc3a", "G ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc3b", "H ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc3c", "I ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc3d", "J ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc3e", "K ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc3f", "L ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc40", "M ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc41", "N ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc42", "O ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc43", "P ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc44", "Q ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc45", "R ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc46", "S ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc47", "T ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc48", "U ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc49", "V ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc4a", "W ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc4b", "X ");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc4c", "Y ");
      return com.aspose.slides.ms.System.d1.n5(var0, "\ud835\udc4d", "Z ");
   }

   private static String u9(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return var0;
      }

      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(var0.length());

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if ((var3 < 'A' || var3 > 'Z')
            && (var3 < 'a' || var3 > 'z')
            && (var3 < '0' || var3 > '9')
            && var3 != ' '
            && var3 != '.'
            && var3 != ','
            && var3 != '-'
            && var3 != '('
            && var3 != ')') {
            var1.n5(' ');
         } else {
            var1.n5(var3);
         }
      }

      return var1.toString();
   }
}
