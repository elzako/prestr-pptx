package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class i3h {
   private static final Dictionary<String, i3h$n5> n5 = new Dictionary<>();

   public static void n5(Paragraph var0, TextFrame var1, com.aspose.slides.internal.k4y.u1x var2, h6j var3, h2k var4) {
      if (var0 == null) {
         throw new ArgumentNullException("paragraph");
      }

      if (var2 == null) {
         throw new ArgumentNullException("pElementData");
      }

      var0.getPortions().clear();
      if (t2f.n5(var4)) {
         n7n.n5(var0, var4.n5(), var3);
      }

      if (t2f.k5(var2.n5())) {
         n7n.n5(var0, var2.n5(), var3);
      }

      List$Enumerator var5 = var2.k5().iterator();

      try {
         while (var5.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var6 = (com.aspose.slides.internal.k4y.g7)var5.next();
            if (n5.containsKey(var6.n5())) {
               Portion var7 = new Portion();
               if (n5.containsKey(var6.n5())) {
                  var0.getPortions().add(var7);
               }

               if (n5.get_Item(var6.n5()).n5(var7, var2, var6, var3, var4) && var1 != null) {
                  IParagraphFormat var8 = var1.s7().h0().getDefaultParagraphFormat();
                  n5(var0, var7, var8);
                  n5(var7, (PortionFormat)var0.getParagraphFormat().getDefaultPortionFormat(), var1);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if (!com.aspose.slides.ms.System.d1.n5(var2.l6()) && !var3.c8().containsKey(var2.l6())) {
         var3.c8().addItem(var2.l6(), var0);
      }
   }

   private static void n5(Paragraph var0, Portion var1, IParagraphFormat var2) {
      if (var1.getPortionFormat().getHyperlinkClick() == null
         && var1.getPortionFormat().getHyperlinkMouseOver() == null
         && var1.getPortionFormat().getFillFormat().getFillType() == -1
         && var2.getDefaultPortionFormat().getFillFormat().getFillType() == -1
         && var0.getParagraphFormat().getDefaultPortionFormat().getFillFormat().getFillType() == -1) {
         var1.getPortionFormat().getFillFormat().setFillType((byte)1);
         ((ColorFormat)var1.getPortionFormat().getFillFormat().getSolidFillColor()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      }
   }

   private static void n5(Portion var0, PortionFormat var1, TextFrame var2) {
      var0.getPortionFormat().setLatinFont(u7e.n5(var0, var1, null, var2));
   }

   private static boolean h0(Portion var0, com.aspose.slides.internal.k4y.u1x var1, com.aspose.slides.internal.k4y.g7 var2, h6j var3, h2k var4) {
      if (var2 == null) {
         throw new ArgumentNullException("element");
      }

      com.aspose.slides.internal.k4y.w5k var5 = com.aspose.slides.internal.v6g.k5.n5(var2.l6(), com.aspose.slides.internal.k4y.w5k.class);
      if (var5 == null) {
         throw new InvalidOperationException();
      }

      a3l.n5(var0, var5, var3, h2k.l6());
      return true;
   }

   private static boolean c8(Portion var0, com.aspose.slides.internal.k4y.u1x var1, com.aspose.slides.internal.k4y.g7 var2, h6j var3, h2k var4) {
      if (var2 == null) {
         throw new ArgumentNullException("element");
      }

      String var5 = com.aspose.slides.internal.v6g.k5.n5(var2.k5(), String.class);
      if (var5 == null) {
         throw new InvalidOperationException();
      }

      if (t2f.t9(var5)) {
         return false;
      }

      if (t2f.n5(var4) && var4.k5() != 10) {
         n7n.n5(var0, var4.n5(), var3);
      }

      var0.n5(var5);
      return true;
   }

   private static boolean t2(Portion var0, com.aspose.slides.internal.k4y.u1x var1, com.aspose.slides.internal.k4y.g7 var2, h6j var3, h2k var4) {
      if (var2 == null) {
         throw new ArgumentNullException("element");
      }

      var0.n5("\u000b");
      return true;
   }

   private static boolean s7(Portion var0, com.aspose.slides.internal.k4y.u1x var1, com.aspose.slides.internal.k4y.g7 var2, h6j var3, h2k var4) {
      if (var2 == null) {
         throw new ArgumentNullException("element");
      }

      com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();
      com.aspose.slides.internal.k4y.t6t var6 = (com.aspose.slides.internal.k4y.t6t)var2.l6();
      List$Enumerator var7 = var6.l6().iterator();

      try {
         while (var7.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var8 = (com.aspose.slides.internal.k4y.g7)var7.next();
            if ("_TEXT".equals(var8.n5())) {
               var5.n5((String)var8.k5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      a3l.n5(var0.getPortionFormat(), var6, var3);
      var0.n5(var5.toString());
      return true;
   }

   private static boolean x8(Portion var0, com.aspose.slides.internal.k4y.u1x var1, com.aspose.slides.internal.k4y.g7 var2, h6j var3, h2k var4) {
      if (var2 == null) {
         throw new ArgumentNullException("element");
      }

      if (t2f.n5(var4) && var4.k5() != 10) {
         n7n.n5(var0, var4.n5(), var3);
      }

      var0.addField("slidenum");
      ((Field)var0.getField()).n5(new com.aspose.slides.ms.System.o0("93AE1883-0942-4AA3-9DB2-9C7C3A0314B1"));
      var0.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"‹", "#", "›"}));
      return true;
   }

   private static boolean n3(Portion var0, com.aspose.slides.internal.k4y.u1x var1, com.aspose.slides.internal.k4y.g7 var2, h6j var3, h2k var4) {
      if (var2 == null) {
         throw new ArgumentNullException("element");
      }

      if (t2f.n5(var4) && var4.k5() != 10) {
         n7n.n5(var0, var4.n5(), var3);
      }

      com.aspose.slides.internal.k4y.p3f var5 = (com.aspose.slides.internal.k4y.p3f)var2.l6();
      if (var5.n5() != 1) {
         var0.addField(FieldType.getDateTime());
         ((Field)var0.getField()).n5(new com.aspose.slides.ms.System.o0("E8FD0B7A-F5DD-4F40-B4CB-3B2C354B893A"));
      } else if (!com.aspose.slides.ms.System.d1.n5(var5.l6())) {
         var0.n5(var5.l6());
      }

      return true;
   }

   // $VF: synthetic method
   static boolean n5(Portion var0, com.aspose.slides.internal.k4y.u1x var1, com.aspose.slides.internal.k4y.g7 var2, h6j var3, h2k var4) {
      return c8(var0, var1, var2, var3, var4);
   }

   // $VF: synthetic method
   static boolean l6(Portion var0, com.aspose.slides.internal.k4y.u1x var1, com.aspose.slides.internal.k4y.g7 var2, h6j var3, h2k var4) {
      return h0(var0, var1, var2, var3, var4);
   }

   // $VF: synthetic method
   static boolean k5(Portion var0, com.aspose.slides.internal.k4y.u1x var1, com.aspose.slides.internal.k4y.g7 var2, h6j var3, h2k var4) {
      return t2(var0, var1, var2, var3, var4);
   }

   // $VF: synthetic method
   static boolean u3(Portion var0, com.aspose.slides.internal.k4y.u1x var1, com.aspose.slides.internal.k4y.g7 var2, h6j var3, h2k var4) {
      return s7(var0, var1, var2, var3, var4);
   }

   // $VF: synthetic method
   static boolean a6(Portion var0, com.aspose.slides.internal.k4y.u1x var1, com.aspose.slides.internal.k4y.g7 var2, h6j var3, h2k var4) {
      return x8(var0, var1, var2, var3, var4);
   }

   // $VF: synthetic method
   static boolean u9(Portion var0, com.aspose.slides.internal.k4y.u1x var1, com.aspose.slides.internal.k4y.g7 var2, h6j var3, h2k var4) {
      return n3(var0, var1, var2, var3, var4);
   }

   static {
      n5.set_Item("_TEXT", new i3h$1());
      n5.set_Item("text:span", new i3h$2());
      n5.set_Item(a3l.k5, new i3h$3());
      n5.set_Item(a3l.n5, new i3h$4());
      n5.set_Item(a3l.u3, new i3h$5());
      n5.set_Item(a3l.a6, new i3h$6());
   }
}
