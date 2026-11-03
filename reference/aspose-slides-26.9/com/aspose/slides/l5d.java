package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.ms.System.IDisposable;

class l5d {
   public static String n5(ITextFrame var0, s8z var1) {
      return n5(var0, var1, false, (byte)1);
   }

   public static String n5(ITextFrame var0, s8z var1, boolean var2, byte var3) {
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();

      for (int var5 = 0; var5 < var0.getParagraphs().getCount(); var5++) {
         IParagraph var6 = var0.getParagraphs().get_Item(var5);
         boolean var7 = var5 == var0.getParagraphs().getCount() - 1;
         String var8 = n5(var1, var6, var2, var3, var7);
         if (!com.aspose.slides.ms.System.d1.n5(var8)) {
            var4.n5(var5 < var0.getParagraphs().getCount() - 1 ? var1.u3(var8) : var8);
         }
      }

      return var4.toString();
   }

   private static String n5(s8z var0, IParagraph var1, String var2, byte var3) {
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
      List var5 = new List<>(l6(var2));
      List$Enumerator var6 = var5.iterator();

      try {
         while (var6.hasNext()) {
            String var7 = (String)var6.next();
            if (com.aspose.slides.ms.System.d1.n5(var7)) {
               var4.n5(var0.k5());
            } else {
               boolean var8 = false;
               boolean[] var9 = new boolean[]{false};
               String var10 = var0.n5(var7, var3, var9);
               var8 = var9[0];
               if (var1.getParagraphFormat().getBullet() != null
                  && var1.getParagraphFormat().getBullet().getType() != 0
                  && var1.getParagraphFormat().getBullet().getType() != -1) {
                  switch (var1.getParagraphFormat().getBullet().getType()) {
                     case 2:
                        var10 = var0.n5(var7, var1.getParagraphFormat().getDepth());
                        break;
                     default:
                        var10 = var0.l6(var7, var1.getParagraphFormat().getDepth());
                  }
               }

               if (var8 && var5.size() > 1) {
                  var4.n5(var0.k5());
               }

               var4.n5(var10);
               if (var8 && var5.size() > 1) {
                  var4.n5(var0.k5());
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      return var4.toString();
   }

   private static String n5(s8z var0, IPortionCollection var1, boolean var2) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      String var4 = com.aspose.slides.ms.System.d1.n5;

      for (int var5 = 0; var5 < var1.getCount(); var5++) {
         IPortion var6 = var1.get_Item(var5);
         var4 = n5(var0, var6.getPortionFormat().getHyperlinkClick(), var4, var3);
         String var7 = n5(var0, var6, var2);
         var3.n5(var7);
         if (var5 == var1.getCount() - 1 && !com.aspose.slides.ms.System.d1.a6(var4, com.aspose.slides.ms.System.d1.n5)) {
            var3.n5(var0.u9(var4));
            var4 = null;
         }
      }

      return var3.toString();
   }

   private static String n5(s8z var0, IMathPortion var1, boolean var2) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      IGenericEnumerator var4 = var1.getMathParagraph().iterator();

      try {
         while (var4.hasNext()) {
            IMathBlock var5 = (IMathBlock)var4.next();
            IGenericEnumerator var6 = var5.iterator();

            try {
               while (var6.hasNext()) {
                  IMathElement var7 = (IMathElement)var6.next();
                  String var8 = null;
                  MathSuperscriptElement var9 = com.aspose.slides.internal.v6g.k5.n5(var7, MathSuperscriptElement.class);
                  if (var9 != null && var0.n5(4)) {
                     var8 = n5(var0, var9, var2);
                  }

                  MathSubscriptElement var10 = com.aspose.slides.internal.v6g.k5.n5(var7, MathSubscriptElement.class);
                  if (var10 != null && var0.n5(8)) {
                     var8 = n5(var0, var10, var2);
                  }

                  if (!com.aspose.slides.ms.System.d1.n5(var8)) {
                     var3.n5(var8);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3.toString();
   }

   private static String n5(s8z var0, MathSubscriptElement var1, boolean var2) {
      MathematicalText var3 = com.aspose.slides.internal.v6g.k5.n5(var1.getBase(), MathematicalText.class);
      MathematicalText var4 = com.aspose.slides.internal.v6g.k5.n5(var1.getSubscript(), MathematicalText.class);
      if (var3 == null) {
         throw new InvalidCastException("Subscript text element has wrong type of base element.");
      }

      if (var4 == null) {
         throw new InvalidCastException("Subscript text element has wrong type of subscript element.");
      }

      String var5 = n5(var0, var3.getFormat(), var3.getValue(), var2);
      String var6 = n5(var0, var4.getFormat(), var4.getValue(), var2);
      return var0.k5(var5, var6);
   }

   private static String n5(s8z var0, MathSuperscriptElement var1, boolean var2) {
      MathematicalText var3 = com.aspose.slides.internal.v6g.k5.n5(var1.getBase(), MathematicalText.class);
      MathematicalText var4 = com.aspose.slides.internal.v6g.k5.n5(var1.getSuperscript(), MathematicalText.class);
      if (var3 == null) {
         throw new InvalidCastException("Subscript text element has wrong type of base element.");
      }

      if (var4 == null) {
         throw new InvalidCastException("Subscript text element has wrong type of subscript element.");
      }

      String var5 = n5(var0, var3.getFormat(), var3.getValue(), var2);
      String var6 = n5(var0, var4.getFormat(), var4.getValue(), var2);
      return var0.u3(var5, var6);
   }

   private static String n5(s8z var0, IParagraph var1, boolean var2, byte var3, boolean var4) {
      String var5 = n5(var0, var1.getPortions(), var2);
      if (!var2) {
         return var5;
      }

      if (com.aspose.slides.ms.System.d1.n5(var5)) {
         return !var4 ? com.aspose.slides.ms.System.d1.n5("{0}{1}{0}",new Object[]{ var0.k5(), "&nbsp;"}) : com.aspose.slides.ms.System.d1.n5("{0}{1}",new Object[]{ var0.k5(), "&nbsp;"});
      }

      String var6 = n5(var0, var1, var5, var3);
      return k5(var6, var0);
   }

   private static String n5(s8z var0, IPortion var1, boolean var2) {
      IMathPortion var3 = com.aspose.slides.internal.v6g.k5.n5(var1, IMathPortion.class);
      String var4 = var1.getText();
      if (var3 != null) {
         var4 = n5(var0, var3, var2);
      }

      if (com.aspose.slides.ms.System.d1.n5(var4)) {
         return var4;
      }

      com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();
      IGenericEnumerator var6 = l6(var4).iterator();

      try {
         while (var6.hasNext()) {
            String var7 = (String)var6.next();
            if (com.aspose.slides.ms.System.d1.n5(var7)) {
               var5.n5(var0.k5());
            } else {
               String var8 = n5(var0, var1.getPortionFormat(), var7, var2);
               var5.n5(var8);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      return var5.toString();
   }

   private static String n5(s8z var0, IPortionFormat var1, String var2, boolean var3) {
      if (com.aspose.slides.ms.System.d1.n5(var2)) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      String var4 = var2;
      boolean var5 = com.aspose.slides.ms.System.d1.k5(var2, " ");
      boolean var6 = com.aspose.slides.ms.System.d1.l6(var2, " ");
      int var7 = 0;
      int var8 = 0;
      if (var5) {
         var4 = com.aspose.slides.ms.System.d1.a6(var4, new char[]{});
         var8 = var2.length() - var4.length();
      }

      if (var6) {
         var4 = com.aspose.slides.ms.System.d1.k5(var4);
         var7 = var2.length() - var4.length() - var8;
      }

      var4 = var0.c8(var4);
      if (com.aspose.slides.ms.System.d1.n5(var4)) {
         return var3 ? n5(var2, var0) : com.aspose.slides.ms.System.d1.n5;
      }

      var4 = l6(var4, var0);
      if (var1.getStrikethroughType() != 0 && var1.getStrikethroughType() != -1 && var0.n5(2)) {
         var4 = var0.k5(var4);
      }

      if (var1.getFontItalic() == 1) {
         var4 = var0.l6(var4);
      }

      if (var1.getFontUnderline() != 0 && var1.getFontUnderline() != -1 && var0.n5(16)) {
         var4 = var0.a6(var4);
      }

      if (var1.getFontBold() == 1) {
         var4 = var0.n5(var4);
      }

      var4 = var0.n5(var4, var7, var8);
      return !var3 && n5(var4) ? com.aspose.slides.ms.System.d1.n5 : n5(var4, var0);
   }

   private static boolean n5(String var0) {
      return var0 == null || com.aspose.slides.ms.System.d1.l6(var0).length() == 0;
   }

   private static String n5(s8z var0, IHyperlink var1, String var2, com.aspose.slides.internal.l7h.a5 var3) {
      if (var1 != null) {
         if (var0.n5.m1() && ((Hyperlink)var1).k5(false)) {
            return com.aspose.slides.ms.System.d1.n5;
         }

         if (com.aspose.slides.ms.System.d1.n5(var2)) {
            var3.n5(var0.l6());
            return var1.getExternalUrl();
         }

         if (com.aspose.slides.ms.System.d1.a6(var2, var1.getExternalUrl())) {
            return var2;
         }

         var3.n5(var0.u9(var2));
         var3.n5(var0.l6());
         return var1.getExternalUrl();
      } else {
         if (com.aspose.slides.ms.System.d1.n5(var2)) {
            return com.aspose.slides.ms.System.d1.n5;
         }

         var3.n5(var0.u9(var2));
         return com.aspose.slides.ms.System.d1.n5;
      }
   }

   private static String n5(String var0, s8z var1) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return var0;
      }

      int var2 = var1.n5.n5();
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      boolean var4 = false;
      boolean var5 = false;

      for (int var6 = 0; var6 < var0.length(); var6++) {
         char var7 = var0.charAt(var6);
         if (com.aspose.slides.ms.System.d1.u3("     ", var7) >= 0) {
            var3.n5("&nbsp;");
            var4 = false;
            var5 = false;
         } else if (com.aspose.slides.ms.System.d1.u3("  ", var7) >= 0) {
            var3.n5("&nbsp;");
            var3.n5("&nbsp;");
            var4 = false;
            var5 = false;
         } else if (var7 == ' ') {
            switch (var2) {
               case 0:
               default:
                  var3.n5(' ');
                  var5 = true;
                  break;
               case 1:
                  if (var4) {
                     var3.n5("&nbsp;");
                  } else {
                     var3.n5(' ');
                  }

                  var4 = !var4;
                  var5 = true;
                  break;
               case 2:
                  if (var5) {
                     var3.n5("&nbsp;");
                  } else {
                     var3.n5(' ');
                     var5 = true;
                  }
            }
         } else {
            var3.n5(var7);
            var4 = false;
            var5 = false;
         }
      }

      return var3.toString();
   }

   private static String l6(String var0, s8z var1) {
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\u000b", var1.k5());
      return com.aspose.slides.ms.System.d1.n5(var0, "\t", com.aspose.slides.ms.System.d1.n5(' ', 4));
   }

   private static String k5(String var0, s8z var1) {
      String var2 = var1.k5();
      String var3 = "&nbsp;";
      String var4 = com.aspose.slides.ms.System.d1.n5;
      com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();
      int var6 = var2.length();

      for (int var7 = 0; var7 < var0.length(); var7++) {
         int var8 = var7 + var6;
         if (var8 > var0.length() - 1) {
            var5.n5(var0.charAt(var7));
         } else {
            String var9 = com.aspose.slides.ms.System.d1.l6(var0, var7, var6);
            if (com.aspose.slides.ms.System.d1.a6(var9, var2)) {
               if (com.aspose.slides.ms.System.d1.a6(var4, var2)) {
                  var5.n5(
                     var8 == var0.length() - 1
                        ? com.aspose.slides.ms.System.d1.n5("{0}{1}{0}",new Object[]{ var2, var3})
                        : com.aspose.slides.ms.System.d1.n5("{0}{1}{0}{0}",new Object[]{ var2, var3})
                  );
                  var4 = var3;
                  var7 += var6 - 1;
               } else if (com.aspose.slides.ms.System.d1.a6(var4, var3)) {
                  var5.n5(
                     var8 == var0.length() - 1
                        ? com.aspose.slides.ms.System.d1.n5("{0}{1}",new Object[]{ var3, var2})
                        : com.aspose.slides.ms.System.d1.n5("{0}{1}{1}",new Object[]{ var3, var2})
                  );
                  var4 = var3;
                  var7 += var6 - 1;
               } else {
                  var4 = var2;
                  var5.n5(var9);
                  var7 += var6 - 1;
               }
            } else {
               var4 = com.aspose.slides.ms.System.t9.q0(var0.charAt(var7));
               var5.n5(var0.charAt(var7));
            }
         }
      }

      return var5.toString();
   }

   private static IGenericEnumerable<String> l6(String var0) {
      if (com.aspose.slides.ms.System.d1.t2(var0, "\r\n")) {
         var0 = com.aspose.slides.ms.System.d1.n5(var0, "\r\n", "\n");
      }

      if (com.aspose.slides.ms.System.d1.t2(var0, "\n\r")) {
         var0 = com.aspose.slides.ms.System.d1.n5(var0, "\r\n", "\n");
      }

      if (com.aspose.slides.ms.System.d1.t2(var0, "\n")) {
         return com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.d1.n5(var0, '\n'));
      }

      if (com.aspose.slides.ms.System.d1.t2(var0, "\r")) {
         return com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.d1.n5(var0, '\r'));
      }

      if (com.aspose.slides.ms.System.d1.t2(var0, "\u000b")) {
         return com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.d1.n5(var0, '\u000b'));
      }

      List var1 = new List();
      var1.addItem(var0);
      return var1;
   }
}
