package com.aspose.slides.internal.c0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.e1.z1;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.e1x.u6;
import com.aspose.slides.internal.e1x.v4;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.n2d.k7;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.s3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.t9;

public class s7 extends l6 {
   private final n5 u3;
   private final a0 a6;
   private final v4 u9;

   public s7(com.aspose.slides.internal.z4.c8 var1, int var2, i1 var3, int var4, int var5) {
      super(var1, var2, var3, var4);
      this.u3 = new n5(var1, this);
      this.a6 = new a0(var1);
      this.n5(com.aspose.slides.internal.b8.h0.n5(var5, 4));
      this.u9 = new v4(var3, this.m1(), !this.m1() && var1.l6().x8() == 0);
      this.u9.n5(65);
   }

   public final boolean n5(z1 var1, String var2, s3 var3) {
      boolean var4;
      if (this.n5(var2) && this.n5.s3() != null) {
         var4 = this.n5(var2, var3, var1);
      } else {
         var3.n5("[");
         var3.n5("(");
         var4 = this.n5(var2, var3, var1.n5());
         var3.l6(")");
         var3.l6("]");
         var3.l6("TJ");
      }

      return var4;
   }

   public final boolean n5(String var1, s3 var2, boolean var3) {
      boolean var4 = false;
      double var5 = 0.0;
      int var7 = Integer.MIN_VALUE;

      for (int var8 = 0; var8 < var1.length(); var8++) {
         int var9 = var1.charAt(var8);
         if (t9.a6(var1.charAt(var8))) {
            var9 = t9.n5(var1.charAt(var8), var1.charAt(var8 + 1));
            var8++;
         }

         int var10 = this.n5.h0().l6(var9).l6();
         int var11 = this.u9.n5(var9);
         if (var11 >= 0) {
            if (var7 != Integer.MIN_VALUE && var3 && this.n5.d5() != null) {
               var5 = this.n5.n5(var7 & 4294967295L, var10 & 4294967295L);
            }

            if (var5 != 0.0) {
               var2.n5(d1.n5(") {0} (", new Object[]{-com.aspose.slides.internal.v6g.k5.u3(var5 / this.n5.t2() * 1000.0, 14)}));
            }

            var2.n5(var11);
         }

         if (var11 <= 0) {
            var4 = true;
         }

         var7 = var10;
      }

      return var4;
   }

   public final boolean n5(String var1, s3 var2, z1 var3) {
      float var4 = var3.l6().c8();
      float var5 = var3.t4();
      boolean var6 = false;
      double var7 = 0.0;
      int var9 = Integer.MIN_VALUE;
      int var10 = Integer.MIN_VALUE;
      float var11 = 0.0F;
      float var12 = 0.0F;
      float var13 = 0.0F;
      float var14 = 0.0F;
      float var15 = 0.0F;
      float var16 = 0.0F;

      for (int var17 = 0; var17 < var1.length(); var17++) {
         int var18 = var1.charAt(var17);
         if (t9.a6(var1.charAt(var17))) {
            var18 = t9.n5(var1.charAt(var17), var1.charAt(var17 + 1));
            var17++;
         }

         int var19 = this.n5.h0().l6(var18).l6();
         int var20 = this.u9.n5(var18);
         if (var20 >= 0) {
            if (var17 > 0) {
               var7 = var5;
            }

            if (this.n5.d5() != null) {
               var7 += this.n5.n5(var9 & 4294967295L, var19 & 4294967295L) / this.n5.t2() * var4;
            }

            if (this.n5.s3() != null && this.n5.s3().n5().containsKey(var19 & 4294967295L)) {
               if (var9 == Integer.MIN_VALUE) {
                  var2.n5("(");
                  var2.n5(var20);
                  var2.n5(")Tj ");
               } else {
                  float var21 = this.n5.n5(var10, var4);
                  if (var21 > 0.0F) {
                     var16 = var21;
                  }

                  Dictionary var22 = this.n5.s3().n5().get_Item(var19 & 4294967295L);
                  int var23 = 0;

                  while (!var22.containsKey(var23) && var22.size() > 0) {
                     var23++;
                  }

                  if (this.n5.s3().l6().containsKey(var9 & 4294967295L)) {
                     Dictionary var24 = this.n5.s3().l6().get_Item(var9 & 4294967295L);
                     j5 var25 = new j5();
                     if (!var24.containsKey(var23)) {
                        var11 = 0.0F;
                        var12 = 0.0F;
                        var13 = var15 - var21;
                        var14 = 0.0F;
                     } else {
                        ((j5)var24.get_Item(var23)).k5(var25);
                        var11 = (float)(var25.n5() - ((j5)var22.get_Item(var23)).n5()) / this.n5.t2() * var4;
                        var12 = (float)(var25.l6() - ((j5)var22.get_Item(var23)).l6()) / this.n5.t2() * var4;
                        var13 = var11 + var15 - var21;
                        var14 = var12;
                     }
                  } else {
                     var14 = (var22.containsKey(0) ? 150.0F : -150.0F) / this.n5.t2() * var4 * ((this.n5.c8() & 1) != 0 ? 2.0F : 1.0F);
                     if (var21 == 0.0F) {
                        var13 = var15;
                     } else {
                        var13 = var15 - var21 + this.n5.n5(var10, var4) / 2.0F;
                        var13 -= (float)((j5)var22.get_Item(var23)).n5() / this.n5.t2() * var4;
                     }

                     var12 += var14;
                     var11 += var13 - var15 + var21;
                  }

                  var2.n5(d1.n5(d1.n5("{0} {1} Td ", q1.n5((double)(var13), (int)(1)), q1.n5((double)(var14), (int)(1))), ",", "."));
                  var2.n5("(");
                  var2.n5(var20);
                  var2.n5(")Tj ");
                  var15 = 0.0F;
               }
            } else {
               if (var11 != 0.0F || var12 != 0.0F) {
                  var2.n5(d1.n5(d1.n5("{0} {1} Td ", q1.n5((double)(var16 - var11 + var7), (int)(1)), q1.n5((double)(-var12), (int)(1))), ",", "."));
                  var12 = 0.0F;
                  var11 = 0.0F;
                  var7 = 0.0;
                  var15 = 0.0F;
               } else if (var7 != 0.0) {
                  var2.n5(d1.n5(d1.n5("{0} {1} Td ", q1.n5(var15 + var7, 1), 0), ",", "."));
                  var15 = 0.0F;
               }

               var2.n5("(");
               var2.n5(var20);
               var2.n5(")Tj ");
            }
         }

         if (var20 <= 0) {
            var6 = true;
         }

         var9 = var19;
         var10 = var18;
         var15 += this.n5.n5(var10, var4);
      }

      return var6;
   }

   public final boolean n5(int[] var1, s3 var2) {
      boolean var3 = false;

      for (int var7 : var1) {
         u6 var8 = this.u9.k5().h0().u3(var7);
         int var9 = this.u9.n5(var8, var8.n5());
         if (this.n5(var2, var9)) {
            var3 = true;
         }
      }

      return var3;
   }

   private boolean n5(s3 var1, int var2) {
      if (var2 >= 0) {
         var1.n5(var2);
      }

      return var2 <= 0;
   }

   private boolean n5(String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         int var3 = var1.charAt(var2);
         if (t9.a6(var1.charAt(var2))) {
            var3 = t9.n5(var1.charAt(var2), var1.charAt(var2 + 1));
            var2++;
         }

         if (this.n5.h0().l6(var3).k5() == 0) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void n5(t4 var1) {
      this.u9.n5(var1, false, this.m1());
   }

   @Override
   public byte[] n5() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(q1.l6(this.u9.l6().n5() / 8.0), 14);
      byte[] var2 = new byte[var1];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = -1;
      }

      return var2;
   }

   public final String l6(int var1) {
      a5 var2 = new a5();
      var2.n5("[");

      for (int var3 = 0; var3 < this.u9.l6().n5(); var3++) {
         int var4 = this.u9.l6().u3(var3);
         int var5 = com.aspose.slides.internal.v6g.k5.u3(this.u9.l6().k5(var3), int.class);
         u6 var6 = this.n5.h0().l6(var4);
         int var7 = this.n5(var6.k5());
         if (var7 != var1 && var7 < 32767) {
            var2.n5(com.aspose.slides.internal.t6j.u3.n5(var5));
            var2.n5("[");
            var2.n5(com.aspose.slides.internal.t6j.u3.n5(var7));
            var2.n5("]");
         }
      }

      var2.n5("]");
      return var2.toString();
   }

   @Override
   public void n5(com.aspose.slides.internal.z4.t4 var1) {
      this.l6(var1);
      this.u3.n5(var1);
      this.k5(var1);
   }

   private void l6(com.aspose.slides.internal.z4.t4 var1) {
      var1.n5(this);
      var1.c8();
      var1.k5("/Type", "/Font");
      var1.k5("/Subtype", "/Type0");
      var1.k5("/Encoding", "/Identity-H");
      var1.k5("/BaseFont", d1.n5("/{0}", new Object[]{this.u3()}));
      var1.k5("/DescendantFonts", d1.n5("[{0}]", new Object[]{this.u3.t2()}));
      var1.k5("/ToUnicode", this.a6.t2());
      var1.t2();
      var1.l6();
   }

   private void k5(com.aspose.slides.internal.z4.t4 var1) {
      this.a6.l6("/CIDInit /ProcSet findresource begin");
      this.a6.l6("11 dict begin");
      this.a6.l6("begincmap");
      this.a6.l6("/CIDSystemInfo");
      this.a6.l6("<< /Registry (Adobe)");
      this.a6.l6("/Ordering (UCS)");
      this.a6.l6("/Supplement 0");
      this.a6.l6(">> def");
      this.a6.l6("/CMapName /Adobe-Identity-UCS def");
      this.a6.l6("/CMapType 2 def");
      this.a6.l6("1 begincodespacerange");
      this.a6.l6("<0000><FFFF>");
      this.a6.l6("endcodespacerange");
      this.z8();
      this.a6.l6("endcmap");
      this.a6.l6("CMapName currentdict /CMap defineresource pop");
      this.a6.l6("end");
      this.a6.l6("end");
      this.a6.n5(var1);
   }

   private void z8() {
      k7 var1 = this.j5();
      this.a6.l6("{0} beginbfchar", com.aspose.slides.internal.t6j.u3.n5(var1.n5()));

      for (int var2 = 0; var2 < var1.n5(); var2++) {
         int var3 = var1.u3(var2);
         int var4 = com.aspose.slides.internal.v6g.k5.u3(var1.k5(var2), int.class);
         this.a6.l6("<{0}><{1}>", com.aspose.slides.internal.t6j.u3.k5(var3), com.aspose.slides.internal.t6j.u3.k5(var4));
      }

      this.a6.l6("endbfchar");
   }

   private k7 j5() {
      k7 var1 = new k7();

      for (int var2 = 0; var2 < this.u9.l6().n5(); var2++) {
         int var3 = this.u9.l6().u3(var2);
         int var4 = com.aspose.slides.internal.v6g.k5.u3(this.u9.l6().k5(var2), int.class);
         var1.l6(var4, var3);
      }

      return var1;
   }
}
