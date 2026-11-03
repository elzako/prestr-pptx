package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class a3l {
   public static final String n5 = com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "a"});
   private static final String h0 = com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "s"});
   public static final String l6 = com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "tab"});
   public static final String k5 = com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "line-break"});
   public static final String u3 = com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-number"});
   public static final String a6 = com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "date"});
   public static final String u9 = com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "span"});

   public static void n5(Portion var0, com.aspose.slides.internal.k4y.w5k var1, h6j var2, h2k var3) {
      if (var0 == null) {
         throw new ArgumentNullException("portion");
      }

      if (var1 == null) {
         throw new ArgumentNullException("spanElementData");
      }

      if (var1.l6() != null && var1.l6().size() != 0) {
         l6(var0, var1, var2, var3);
      } else {
         var0.n5("");
         n5(var0, var1.n5(), var2, var3);
      }
   }

   private static void l6(Portion var0, com.aspose.slides.internal.k4y.w5k var1, h6j var2, h2k var3) {
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
      List$Enumerator var5 = var1.l6().iterator();

      try {
         while (var5.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var6 = (com.aspose.slides.internal.k4y.g7)var5.next();
            String var7 = null;
            if (n5.equals(var6.n5())) {
               com.aspose.slides.internal.k4y.t6t var8 = (com.aspose.slides.internal.k4y.t6t)var6.l6();
               List$Enumerator var9 = var8.l6().iterator();

               try {
                  while (var9.hasNext()) {
                     com.aspose.slides.internal.k4y.g7 var10 = (com.aspose.slides.internal.k4y.g7)var9.next();
                     if ("_TEXT".equals(var10.n5())) {
                        var7 = (String)var10.k5();
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                     var9.dispose();
                  }
               }

               n5(var0.getPortionFormat(), var8, var2);
            } else if (k5.equals(var6.n5())) {
               var4.n5("\u000b");
            } else if (h0.equals(var6.n5())) {
               com.aspose.slides.internal.k4y.h3w var19 = (com.aspose.slides.internal.k4y.h3w)var6.l6();
               int var22 = (int)var19.n5();
               if (var22 > 0) {
                  var4.n5(' ', var22);
               } else if (var4.l6() == 0) {
                  var4.n5(' ');
               }
            } else if (l6.equals(var6.n5())) {
               var4.n5("\t");
            } else if (u3.equals(var6.n5())) {
               var0.addField("slidenum");
               ((Field)var0.getField()).n5(new com.aspose.slides.ms.System.o0("93AE1883-0942-4AA3-9DB2-9C7C3A0314B1"));
               var4.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"‹", "#", "›"}));
            } else if (a6.equals(var6.n5())) {
               com.aspose.slides.internal.k4y.p3f var20 = (com.aspose.slides.internal.k4y.p3f)var6.l6();
               if (var20.n5() != 1) {
                  var0.addField(FieldType.getDateTime());
                  ((Field)var0.getField()).n5(new com.aspose.slides.ms.System.o0("E8FD0B7A-F5DD-4F40-B4CB-3B2C354B893A"));
               } else if (!com.aspose.slides.ms.System.d1.n5(var20.l6())) {
                  var4.n5(var20.l6());
               }
            } else if (u9.equals(var6.n5())) {
               com.aspose.slides.internal.k4y.w5k var21 = (com.aspose.slides.internal.k4y.w5k)var6.k5();
               l6(var0, var21, var2, var3);
            } else {
               var7 = t2f.n5(var6);
            }

            if (var7 != null) {
               var4.n5(var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      var0.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var0.u9(), var4.toString()}));
      n5(var0, var1.n5(), var2, var3);
   }

   public static void n5(Portion var0, String var1, h6j var2, h2k var3) {
      if (t2f.n5(var3)) {
         n7n.n5(var0, var3.n5(), var2);
      }

      if (t2f.k5(var1)) {
         n7n.n5(var0, var1, var2);
      }
   }

   public static void n5(IPortionFormat var0, com.aspose.slides.internal.k4y.t6t var1, h6j var2) {
      if (var1 == null) {
         throw new ArgumentNullException("aElement");
      }

      String var3 = var1.n5();
      if (!com.aspose.slides.ms.System.d1.n5(var3)) {
         if (com.aspose.slides.ms.System.d1.l6(var3, "#")) {
            var0.setHyperlinkClick(new Hyperlink(false, var3, 8));
            var2.n5().h0().addItem((Hyperlink)var0.getHyperlinkClick());
         } else {
            var0.setHyperlinkClick(new Hyperlink(true, var3, 1));
         }
      }
   }
}
