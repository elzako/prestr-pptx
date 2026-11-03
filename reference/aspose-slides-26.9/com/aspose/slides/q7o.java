package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

class q7o {
   private static final com.aspose.slides.internal.r7c.c8 n5 = new com.aspose.slides.internal.r7c.c8("ppt\\/charts\\/chart(\\d+?\\.xml)", 0);
   private static final com.aspose.slides.internal.r7c.c8 l6 = new com.aspose.slides.internal.r7c.c8("ppt\\/diagrams\\/data(\\d+?\\.xml)", 0);
   private static final com.aspose.slides.internal.r7c.c8 k5 = new com.aspose.slides.internal.r7c.c8("ppt\\/notesMasters\\/notesMaster(\\d+?\\.xml)", 0);
   private static final com.aspose.slides.internal.r7c.c8 u3 = new com.aspose.slides.internal.r7c.c8("ppt\\/notesSlides\\/notesSlide(\\d+?\\.xml)", 0);
   private static final com.aspose.slides.internal.r7c.c8 a6 = new com.aspose.slides.internal.r7c.c8("ppt\\/comments\\/comment(\\d+?\\.xml)", 0);
   private static final com.aspose.slides.internal.r7c.c8 u9 = new com.aspose.slides.internal.r7c.c8("modernComment.*?(\\d+)[^/]*\\.xml", 0);
   private static final com.aspose.slides.internal.r7c.c8 h0 = new com.aspose.slides.internal.r7c.c8("ppt\\/slideLayouts\\/slideLayout(\\d+?\\.xml)", 0);
   private static final com.aspose.slides.internal.r7c.c8 c8 = new com.aspose.slides.internal.r7c.c8("ppt\\/slideMasters\\/slideMaster(\\d+?\\.xml)", 0);
   private static final com.aspose.slides.internal.r7c.c8 t2 = new com.aspose.slides.internal.r7c.c8("ppt\\/slides\\/slide(\\d+\\.xml)");
   private static final Dictionary<com.aspose.slides.internal.r7c.c8, Byte> s7 = new Dictionary<>();

   public static boolean n5(String var0, int[] var1, byte[] var2) {
      Dictionary$Enumerator var3 = s7.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            com.aspose.slides.internal.r7c.u3 var5 = ((com.aspose.slides.internal.r7c.c8)var4.getKey()).l6(var0);
            if (var5.u3()) {
               var2[0] = (Byte)var4.getValue();
               if (var2[0] == 9) {
                  var1[0] = com.aspose.slides.ms.System.a3.n5(var5.a6().n5(1).k5());
               } else {
                  var1[0] = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.n5(var5.a6().n5(1).k5(), var5.a6().n5(1).k5().length() - 4, 4));
               }

               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var1[0] = -1;
      var2[0] = 0;
      return false;
   }

   public static boolean n5(String var0, int[] var1, boolean[] var2) {
      if (com.aspose.slides.ms.System.d1.l6(var0, "ppt/slides/_rels/slide")) {
         var1[0] = n5("ppt/slides/_rels/slide".length(), var0);
         var2[0] = true;
         return true;
      } else if (n5(var0)) {
         var1[0] = l6(var0);
         var2[0] = false;
         return true;
      } else {
         var1[0] = -1;
         var2[0] = false;
         return false;
      }
   }

   public static boolean n5(String var0) {
      return com.aspose.slides.ms.System.d1.l6(var0, "ppt/slideLayouts/_rels/slideLayout");
   }

   public static int n5(int var0, String var1) {
      int var2 = com.aspose.slides.ms.System.d1.l6(var1, '.', var0);
      return com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.l6(var1, var0, var2 - var0));
   }

   public static int l6(String var0) {
      int var1 = com.aspose.slides.ms.System.d1.l6(var0, '.', "ppt/slideLayouts/_rels/slideLayout".length());
      return com.aspose.slides.ms.System.a3.n5(
         com.aspose.slides.ms.System.d1.l6(var0, "ppt/slideLayouts/_rels/slideLayout".length(), var1 - "ppt/slideLayouts/_rels/slideLayout".length())
      );
   }

   static {
      s7.addItem(n5, (byte)6);
      s7.addItem(l6, (byte)2);
      s7.addItem(u3, (byte)5);
      s7.addItem(a6, (byte)8);
      s7.addItem(u9, (byte)9);
      s7.addItem(h0, (byte)4);
      s7.addItem(c8, (byte)3);
      s7.addItem(t2, (byte)1);
   }
}
