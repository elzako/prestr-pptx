package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

public class r6i extends b2 {
   public static final int[] k5 = new int[]{0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};

   @Override
   public void n5() {
      u0a var1 = (u0a)this.n5;
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();
      j2p var3 = new j2p(var2, false);

      try {
         Dictionary var4 = new Dictionary();
         List var5 = new List();
         var4.addItem("cvt", n5("cvt", var1.l6().e2()));
         var4.addItem("fpgm", n5("fpgm", var1.l6().t9()));
         var4.addItem("glyf", n5("glyf", var1.l6().h0()));
         var4.addItem("head", n5("head", var1.l6().k5()));
         var4.addItem("hhea", n5("hhea", var1.l6().t2()));
         var4.addItem("hmtx", n5("hmtx", var1.l6().s7()));
         var4.addItem("loca", n5("loca", var1.l6().u9()));
         var4.addItem("maxp", n5("maxp", var1.l6().a6()));
         var4.addItem("prep", n5("prep", var1.l6().z1()));
         var4.addItem("name", n5("name", var1.l6().u3()));
         var4.addItem("cmap", n5("cmap", var1.l6().c8()));
         var4.addItem("post", n5("post", var1.l6().x8()));
         var4.addItem("OS/2", n5("OS/2", var1.l6().t4()));
         var4.addItem("GDEF", n5("GDEF", var1.l6().m1()));
         var4.addItem("GSUB", n5("GSUB", var1.l6().z3()));
         var4.addItem("GPOS", n5("GPOS", var1.l6().q0()));
         SortedList var6 = new SortedList<>(com.aspose.slides.ms.System.p6.k5());
         List$Enumerator var7 = var1.l6().n5.iterator();

         try {
            while (var7.hasNext()) {
               String var8 = (String)var7.next();
               Dictionary$KeyCollection$Enumerator var9 = var4.getKeys().iterator();

               try {
                  while (var9.hasNext()) {
                     String var10 = (String)var9.next();
                     if (com.aspose.slides.ms.System.d1.a6(var10, var8)) {
                        var6.addItem(var10, var10);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                     var9.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         IGenericEnumerator var101 = var6.iterator();

         try {
            while (var101.hasNext()) {
               KeyValuePair var102 = (KeyValuePair)var101.next();
               r6i$n5 var103 = (r6i$n5)var4.get_Item(var102.getKey());
               if (var103.l6) {
                  var5.addItem(var103);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var101, IDisposable.class)) {
               var101.dispose();
            }
         }

         long var14 = 16 * var5.size() + 12 & 4294967295L;
         var3.k5(65536L);
         var3.n5(var5.size() & 65535);
         int var11 = k5[var5.size()];
         var3.n5((1 << (var11 & 65535)) * 16 & 65535);
         var3.n5(var11);
         var3.n5((var5.size() - (1 << (var11 & 65535))) * 16 & 65535);
         List$Enumerator var12 = var5.iterator();

         try {
            while (var12.hasNext()) {
               r6i$n5 var13 = (r6i$n5)var12.next();
               String var16 = var13.n5;
               var16 = "os/2".equals(var16) ? "OS/2" : var16;
               var16 = var16.length() == 4 ? var16 : com.aspose.slides.ms.System.d1.n5(new String[]{var16, " "});
               var3.n5(var16);
               var3.k5(var13.u3);
               var3.k5(var14);
               var3.k5(var13.a6);
               var14 = (var14 & 4294967295L) + (var13.k5.length & 4294967295L) & 4294967295L;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
               var12.dispose();
            }
         }

         long var18 = 0L;
         List$Enumerator var17 = var5.iterator();

         try {
            while (var17.hasNext()) {
               r6i$n5 var20 = (r6i$n5)var17.next();
               if ("head".equals(var20.n5)) {
                  var18 = var3.n5() + var1.l6().k5().n5;
               }

               var3.n5(var20.k5);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
               var17.dispose();
            }
         }

         var2.close();
         byte[] var106 = var2.toArray();
         if (var18 != 0L) {
            for (int var21 = 0; var21 < 4; var21++) {
               var106[(int)(var18 + var21)] = 0;
            }

            long var22 = 2981146554L - (s7k.n5(var106) & 4294967295L) & 4294967295L;
            com.aspose.slides.internal.z0k.e2 var24 = new com.aspose.slides.internal.z0k.e2(var106);

            try {
               var24.setPosition(var18);
               j2p var25 = new j2p(var24, false);

               try {
                  var25.l6(var22);
               } finally {
                  if (var25 != null) {
                     var25.dispose();
                  }
               }

               var24.close();
            } finally {
               if (var24 != null) {
                  var24.dispose();
               }
            }
         }

         this.l6.write(var106, 0, var106.length);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private static r6i$n5 n5(String var0, s7k var1) {
      r6i$n5 var2 = new r6i$n5();
      var2.n5 = var0;
      if (var1 != null) {
         var2.l6 = true;
         byte[][] var3 = new byte[][]{var2.k5};
         long[] var4 = new long[]{var2.a6};
         long[] var5 = new long[]{var2.u3};
         var1.n5(var3, var4, var5);
         var2.k5 = var3[0];
         var2.a6 = var4[0];
         var2.u3 = var5[0];
      }

      return var2;
   }
}
