package com.aspose.slides.internal.z6z;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.g7.c0;
import com.aspose.slides.internal.g7.d3;
import com.aspose.slides.internal.g7.i2;
import com.aspose.slides.internal.g7.n2;
import com.aspose.slides.internal.g7.r9;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.n2d.m3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;

public abstract class u3 {
   private int n5;
   private int l6;
   private final a5 k5 = new a5();
   private final String u3;
   private final Dictionary<Integer, s7> a6 = new Dictionary<>();
   private final Dictionary<Integer, byte[]> u9 = new Dictionary<>();
   private final m3<d3> h0 = new m3<>();
   private final Dictionary<o0, String> c8 = new Dictionary<>();
   private final Dictionary<String, String> t2 = new Dictionary<>();
   private com.aspose.slides.internal.b8.u9 s7 = new com.aspose.slides.internal.b8.u9();
   private List<com.aspose.slides.internal.b8.n3> x8 = new List<>();

   protected u3(String var1) {
      this.u3 = var1;
   }

   public String n5(i1 var1) {
      return this.k5(var1);
   }

   public s7 n5(byte[] var1, com.aspose.slides.internal.s5.c8 var2) {
      var1 = this.n5(var1);
      int var3 = com.aspose.slides.internal.s5.c8.n5(var1, var2);
      s7 var4 = null;
      s7[] var5 = new s7[]{var4};
      boolean var6 = !this.a6.tryGetValue(var3, var5);
      var4 = var5[0];
      if (var6) {
         if (var2 != null && var2.l6()) {
            com.aspose.slides.internal.j7.n5 var7 = var2.n5(var1);

            try {
               var1 = com.aspose.slides.internal.z6z.x8.n5(var7);
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }
         }

         var4 = new s7(this.l6(var1), com.aspose.slides.internal.k4d.a6.z3(var1), var1);
         this.a6.set_Item(var3, var4);
      }

      return var4;
   }

   public void n5() {
   }

   public final String n5(String var1) {
      String var2 = null;
      String[] var3 = new String[]{var2};
      boolean var4 = this.t2.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         return var2;
      }

      var2 = d1.n5("bookmark_{0}", new Object[]{this.n5++});
      this.t2.set_Item(var1, var2);
      return var2;
   }

   public final String n5(i1 var1, String var2, r9[][] var3) {
      d3 var4 = this.l6(var1);
      this.k5.n5(0);
      r9[] var5 = var4.k5(var2);

      for (int var6 = 0; var6 < var5.length; var6++) {
         if (!var4.y4().l6(var5[var6])) {
            var4.y4().n5(var5[var6]);
         }
      }

      for (int var7 = 0; var7 < var2.length(); var7++) {
         if (var2.charAt(var7) < 8234 || var2.charAt(var7) > 8238) {
            this.k5.n5(var2.charAt(var7));
         }
      }

      var3[0] = var5;
      return this.k5.toString();
   }

   public final void n5(int var1, String var2) {
      this.x8.addItem(new com.aspose.slides.internal.b8.n3(var1, var2));
   }

   private byte[] n5(byte[] var1) {
      int var2 = com.aspose.slides.ms.System.u3.n5((Object)(var1)).hashCode();
      byte[] var3 = null;
      byte[][] var4 = new byte[][]{(byte[])var3};
      boolean var5 = !this.u9.tryGetValue(var2, var4);
      var3 = var4[0];
      if (var5) {
         var3 = com.aspose.slides.internal.z6z.x8.n5(var1);
         this.u9.set_Item(var2, (byte[])var3);
      }

      return (byte[])var3;
   }

   private d3 l6(i1 var1) {
      String var2 = this.k5(var1);
      d3 var3 = null;
      d3[] var4 = new d3[]{var3};
      boolean var5 = !this.h0.tryGetValue(var2, var4);
      var3 = var4[0];
      if (var5) {
         com.aspose.slides.internal.z0k.t4 var6 = var1.y1().l6();

         try {
            byte[] var7 = com.aspose.slides.internal.n2d.t4.l6(var6);
            c0 var8 = new c0(new com.aspose.slides.internal.g7.m3(var7));
            n2 var9 = null;

            try {
               n2[] var10 = var8.n5();

               for (n2 var14 : var10) {
                  if (d1.a6(var1.u3(), var14.n5())) {
                     var9 = var14;
                  }
               }
            } catch (RuntimeException var18) {
               var9 = new n2(0, new com.aspose.slides.internal.g7.m3(var7));
            }

            i2 var21 = i2.n5(var9);
            var3 = var21.n3();
            this.h0.set_Item(var2, var3);
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      }

      return var3;
   }

   private String l6(byte[] var1) {
      int var2 = com.aspose.slides.internal.k4d.a6.l6(var1);
      String var3 = d1.n5("image{0}.{1}",new Object[]{ this.l6(), com.aspose.slides.internal.k4d.a6.n5(var2)});
      return this.l6(var3);
   }

   private String k5(i1 var1) {
      o0 var2 = this.u3(var1).k5();
      String var3 = null;
      String[] var4 = new String[]{var3};
      boolean var5 = !this.c8.tryGetValue(var2.k5(), var4);
      var3 = var4[0];
      if (var5) {
         String var6 = var2.n5("D");
         String var7 = "odttf";
         var3 = this.l6(d1.n5("{0}.{1}",new Object[]{ var6, "odttf"}));
         this.c8.addItem(var2.k5(), var3);
      }

      return var3;
   }

   private o0 u3(i1 var1) {
      byte[] var2 = new byte[16];
      String var3 = var1.n5();
      if (var3 == null) {
         var3 = d1.n5;
      }

      com.aspose.slides.internal.n2d.t4.n5(k5(var3), var2, 0);
      String var4 = var1.u3();
      if (var4 == null) {
         var4 = d1.n5;
      }

      String var5 = !d1.n5(var1.a6()) ? var1.a6() : var4;
      com.aspose.slides.internal.n2d.t4.n5(k5(var5), var2, 4);
      String var6 = var1.u3();
      if (var6 == null) {
         var6 = d1.n5;
      }

      com.aspose.slides.internal.n2d.t4.n5(k5(var6), var2, 8);
      int var7 = 0;
      var7 ^= (byte)var1.c8() & 255;
      if (var1.d2() != null && var1.d2().length >= 4) {
         var7 ^= com.aspose.slides.ms.System.x8.a6(var1.d2(), 0);
      }

      com.aspose.slides.internal.n2d.t4.n5(var7, var2, 12);
      return new o0(var2);
   }

   private String l6(String var1) {
      return com.aspose.slides.internal.b8.x8.n5(this.u3, var1);
   }

   private static int k5(String var0) {
      int var1 = 352654597;
      int var2 = var1;
      byte var3 = 0;

      for (int var4 = var0.length(); var4 > 0; var4 -= 4) {
         char var5 = var0.charAt(var3);
         char var6 = 0;
         if (var4 > 1) {
            var6 = var0.charAt(var3 + 1);
         }

         char var7 = 0;
         if (var4 > 2) {
            var7 = var0.charAt(var3 + 2);
         }

         char var8 = 0;
         if (var4 > 3) {
            var8 = var0.charAt(var3 + 3);
         }

         int var9 = var6;
         var9 <<= 16;
         var9 += var5;
         int var10 = var8;
         var10 <<= 16;
         var10 += var7;
         var1 = (var1 << 5) + var1 + (var1 >> 27) ^ var9;
         if (var4 <= 2) {
            break;
         }

         var2 = (var2 << 5) + var2 + (var2 >> 27) ^ var10;
         var3 += 4;
      }

      return var1 + var2 * 1566083941;
   }

   private int l6() {
      return ++this.l6;
   }

   public final com.aspose.slides.internal.b8.u9 u3() {
      return this.s7;
   }

   public final void n5(com.aspose.slides.internal.b8.u9 var1) {
      this.s7 = var1;
   }

   public final m3<d3> a6() {
      return this.h0;
   }

   public final IGenericList<com.aspose.slides.internal.b8.n3> u9() {
      return this.x8;
   }

   protected final Dictionary<Integer, s7> h0() {
      return this.a6;
   }
}
