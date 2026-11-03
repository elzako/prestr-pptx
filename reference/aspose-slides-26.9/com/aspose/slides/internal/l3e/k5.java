package com.aspose.slides.internal.l3e;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.b7s.p3;
import com.aspose.slides.internal.b7s.t4;
import com.aspose.slides.internal.b7s.v0;
import com.aspose.slides.internal.b7s.y0;
import com.aspose.slides.internal.b7s.z1;
import com.aspose.slides.internal.b7s.z6;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.g7;
import com.aspose.slides.internal.r1x.q0;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.r1x.y4;
import com.aspose.slides.internal.t7p.n3;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class k5 extends q0 {
   private short[][] n5;
   private y2 l6 = new y2();
   private List<com.aspose.slides.internal.l4w.n5> k5 = new List<>();
   private n3 u3;
   private List<com.aspose.slides.internal.j8o.k5> a6 = new List<>();
   private boolean u9;
   private com.aspose.slides.internal.g7e.n5 h0;
   private z1 c8;
   private int t2;
   private int s7 = 1;
   private int x8 = 1;
   private int n3 = 0;
   private List<y0> y4 = new List<>();
   private List<v3> e2 = new List<>();
   private List<v0> t9 = new List<>();
   private List<k5$n5> z1 = new List<>();
   private com.aspose.slides.internal.e8b.u9 t4;
   private int q0 = 0;
   private int z3 = 0;
   private boolean m1 = false;

   public k5(y2 var1, com.aspose.slides.internal.g7e.n5 var2, y0 var3, v4 var4, int var5, List<com.aspose.slides.internal.b7s.u3[]> var6) {
      this(var1.n3(), var2, var4, var5, var6);
      this.c8.n5(new v0(var3));
   }

   public k5(y2 var1, com.aspose.slides.internal.g7e.n5 var2, v4 var3, int var4, List<com.aspose.slides.internal.b7s.u3[]> var5) {
      var1.u3(this.l6);
      this.n3 = var4;
      this.n5(var2, var5);
      this.n5(new short[var3.z3()][]);
      int var6 = var2.x8();
      int var7 = this.c8.a6().h0() * this.k5().x8() * 64 * com.aspose.slides.internal.v6g.k5.n5(7);
      int var8 = var7 * var3.z3();
      long var9 = var7;
      boolean var11 = false;

      while (!var11) {
         try {
            var9 = this.k5().u3() * this.k5().x8() * 64 * com.aspose.slides.internal.v6g.k5.n5(7);
            long var12 = var9 * var3.z3();
            long var14 = com.aspose.slides.internal.r1x.y4.n5(var12, var6);
            if (var14 > 1L) {
               this.x8 = q1.n5(1, this.k5().u3() / ((int)var14 * this.c8.a6().h0()));
               this.s7 = this.c8.a6().h0() * this.x8;
               var9 = this.s7 * this.k5().x8() * 64;
            } else {
               this.x8 = this.k5().u3();
               this.s7 = this.c8.a6().h0() * this.x8;
               var9 = this.s7 * this.k5().x8() * 64;
            }

            for (int var16 = 0; var16 < var3.z3(); var16++) {
               this.u3()[var16] = new short[(int)var9];
            }

            var11 = true;
         } catch (OutOfMemoryError var18) {
            if (this.x8 == 1 || var9 == var7) {
               throw new com.aspose.slides.internal.z3b.k5("Not enough memory to process jpeg file.", var18);
            }

            var6 = q1.n5(var6 >> 1, var8);
         }
      }
   }

   public final List<com.aspose.slides.internal.b7s.u3[]> n5() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.k5().s7().size(); var2++) {
         com.aspose.slides.internal.b7s.u3[] var3 = this.z1.get_Item(var2).u3;
         if (var3 != null) {
            com.aspose.slides.internal.b7s.u3[] var4 = new com.aspose.slides.internal.b7s.u3[var3.length];
            int var5 = var3.length;

            for (int var6 = 0; var6 < var5; var6++) {
               var4[var6] = var3[var6].n3();
            }

            var1.addItem(var4);
         }
      }

      return var1;
   }

   public final int l6() {
      return this.s7;
   }

   public final z1 k5() {
      return this.c8;
   }

   public final short[][] u3() {
      return this.n5;
   }

   public final void n5(short[][] var1) {
      this.n5 = var1;
   }

   public final y2 u9() {
      return this.l6;
   }

   public final com.aspose.slides.internal.g7e.n5 h0() {
      return this.h0;
   }

   public final void n5(y0 var1) {
      int var2 = com.aspose.slides.internal.n5p.h0.n5(this.c8.a6().t2() & 65535, 8);

      for (this.c8.n5 = 0; this.c8.n5 < this.c8.s7().size(); this.c8.n5++) {
         this.a0();
         if (this.n3 == 1) {
            p3 var3 = this.c8.s7().get_Item(this.c8.n5);
            com.aspose.slides.internal.l4w.n5 var4 = this.k5.get_Item(this.c8.n5);
            com.aspose.slides.internal.j8o.k5 var5 = this.a6.get_Item(this.c8.n5);
            if (!this.m1) {
               var4.l6();
               var5.k5();
               y0 var6 = this.y4.get_Item(this.c8.n5);
               p3.n5(var6, this.k5().a6(), this.k5().s7().get_Item(this.c8.n5));
            }

            k5$n5 var16 = this.z1.get_Item(this.c8.n5);
            int var7 = var16.k5 + this.x8 > this.t2 ? this.t2 - var16.k5 : this.x8;
            int var8 = var16.l6 + this.s7 > var2 ? var2 - var16.l6 : this.s7;
            boolean var9 = var3.l6.length > 1;
            if (!var9 && this.c8.a6().a6()) {
               com.aspose.slides.internal.b7s.n3 var10 = this.c8.a6().l6()[var3.l6[0]];
               int var11 = this.c8.x8() / var10.n5;
               int var12 = this.c8.u3() / var10.a6();
               if (var12 > 1) {
                  var9 = true;
               }
            }

            int var17 = var9 ? var16.k5 : var16.l6;
            int var18 = var9 ? var17 + var7 : var17 + var8;

            for (int var19 = var17; var19 < var18; var19++) {
               for (int var13 = 0; var13 < this.c8.a6().u9(); var13++) {
                  short[][] var14 = this.n5(var13, var19);
                  short[][] var15 = var4.n5(var14);
                  var5.n5(var15);
               }
            }

            var16.n5 = var16.n5 + var8 * this.k5().x8() * 64;
            var16.k5 += var7;
            var16.l6 += var8;
            if (var16.l6 == var2) {
               var5.l6();
            }
         }
      }

      this.m1 = true;
      if (this.z1.get_Item(0).l6 == var2) {
         this.z1();
      }
   }

   public final com.aspose.slides.internal.e8b.k5 x8() {
      int var1 = com.aspose.slides.ms.System.u3.n5(this.u3(), 1, true).a6(0);
      this.c8.u9().z3().n5(var1);
      if (this.t4 == null) {
         this.t4 = new com.aspose.slides.internal.e8b.u9(this.c8.u9().z3());
      }

      com.aspose.slides.internal.o7b.k5 var2 = new com.aspose.slides.internal.o7b.k5();
      int var3 = this.z3 + this.s7 > this.k5().u3() ? this.k5().u3() - this.z3 : this.s7;
      int var4 = this.z3 + var3;
      int var5 = this.z3;

      for (int var6 = 0; var6 < this.c8.u9().z3().u9(); var6++) {
         for (int var7 = var5; var7 < var4; var7++) {
            int var8 = var7 * 8;

            for (int var9 = 0; var9 < this.c8.x8(); var9++) {
               int var10 = var9 * 8;
               short[] var11 = this.n5(var6, var10, var8);
               double[] var12 = var2.n5(var11);
               this.t4.n5(var6, var12);
            }
         }
      }

      this.q0 = this.q0 + var3 * this.k5().x8() * 64;
      this.z3 += var3;
      if (this.z3 == this.k5().u3() && this.t4 != null) {
         int var13 = this.c8.x8() * this.c8.u3();
         return this.t4.n5(var13, var13 * 64);
      } else {
         return null;
      }
   }

   public final void n5(com.aspose.slides.internal.g7e.n5 var1, List<com.aspose.slides.internal.b7s.u3[]> var2) {
      this.h0 = var1;
      this.c8 = new z1();
      this.c8
         .n5(
            com.aspose.slides.internal.v6g.k5.n5(this.h0, com.aspose.slides.internal.g7e.l6.class) != null
               ? com.aspose.slides.internal.v6g.k5.n5(this.h0, com.aspose.slides.internal.g7e.l6.class)
               : new com.aspose.slides.internal.g7e.l6(this.h0)
         );
      int var3 = var1.z1() == 4 && var1.n3() != null ? 1 : var1.z1();
      label205:
      switch (var3) {
         case 0:
            switch (this.h0.t9()) {
               case 0:
                  this.n5(true);
                  if ((var1.t4() & 255) == 8) {
                     this.c8.n5(new t4((byte)-64, t9()));
                     this.z8();
                     this.u9 = false;
                  } else {
                     if ((var1.t4() & 255) != 12) {
                        throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
                     }

                     this.c8.n5(new t4((byte)-63, t9()));
                     this.u9 = true;
                  }

                  this.c8.a6().n5(var1.t4());
                  this.c8.n5(this.c4());
                  this.n5(this.c8.s7().size());
                  int var17 = 0;

                  while (true) {
                     if (var17 >= this.c8.s7().size()) {
                        break label205;
                     }

                     v0 var27 = this.t9.get_Item(var17);
                     this.a6.addItem(new com.aspose.slides.internal.j8o.n5(this.k5(), var27));
                     var17++;
                  }
               case 1:
                  this.n5(false);
                  this.c8.n5(new t4((byte)-62, t9()));
                  this.c8.a6().n5(var1.t4());
                  this.c8.n5(this.y2());
                  this.u9 = true;
                  this.n5(this.c8.s7().size());
                  int var16 = 0;

                  while (true) {
                     if (var16 >= this.c8.s7().size()) {
                        break label205;
                     }

                     v0 var26 = this.t9.get_Item(var16);
                     this.a6.addItem(new com.aspose.slides.internal.j8o.h0(this.c8, var26));
                     var16++;
                  }
               default:
                  throw new ArgumentOutOfRangeException("CompressionType");
            }
         case 1:
            switch (this.h0.t9()) {
               case 0:
                  this.n5(true);
                  if ((var1.t4() & 255) == 8) {
                     this.c8.n5(new t4((byte)-64, e2()));
                     this.z8();
                     this.u9 = false;
                  } else {
                     if ((var1.t4() & 255) != 12) {
                        throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
                     }

                     this.c8.n5(new t4((byte)-63, e2()));
                     this.u9 = true;
                  }

                  this.c8.a6().n5(var1.t4());
                  this.c8.n5(this.j5());
                  this.n5(this.k5().s7().size());
                  int var15 = 0;

                  while (true) {
                     if (var15 >= this.k5().s7().size()) {
                        break label205;
                     }

                     v0 var25 = this.t9.get_Item(var15);
                     this.a6.addItem(new com.aspose.slides.internal.j8o.n5(this.k5(), var25));
                     var15++;
                  }
               case 1:
                  this.n5(false);
                  this.c8.n5(new t4((byte)-62, e2()));
                  this.c8.a6().n5(var1.t4());
                  this.c8.n5(this.y1());
                  this.u9 = true;
                  this.n5(this.k5().s7().size());
                  int var14 = 0;

                  while (true) {
                     if (var14 >= this.k5().s7().size()) {
                        break label205;
                     }

                     v0 var24 = this.t9.get_Item(var14);
                     this.a6.addItem(new com.aspose.slides.internal.j8o.h0(this.k5(), var24));
                     var14++;
                  }
               default:
                  throw new ArgumentOutOfRangeException("CompressionType");
            }
         case 2:
            this.w1();
            this.u9 = true;
            switch (this.h0.t9()) {
               case 0:
                  if ((var1.t4() & 255) == 8) {
                     this.c8.n5(new t4((byte)-64, n3()));
                  } else {
                     if ((var1.t4() & 255) != 12) {
                        throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
                     }

                     this.c8.n5(new t4((byte)-63, n3()));
                  }

                  this.c8.a6().n5(var1.t4());
                  this.c8.n5(this.q0());
                  this.n5(this.k5().s7().size());
                  int var13 = 0;

                  while (true) {
                     if (var13 >= this.k5().s7().size()) {
                        break label205;
                     }

                     v0 var23 = this.t9.get_Item(var13);
                     this.a6.addItem(new com.aspose.slides.internal.j8o.n5(this.k5(), var23));
                     var13++;
                  }
               case 1:
                  this.c8.n5(new t4((byte)-62, n3()));
                  this.c8.a6().n5(var1.t4());
                  this.c8.n5(this.m1());
                  this.n5(this.k5().s7().size());
                  int var12 = 0;

                  while (true) {
                     if (var12 >= this.k5().s7().size()) {
                        break label205;
                     }

                     v0 var22 = this.t9.get_Item(var12);
                     this.a6.addItem(new com.aspose.slides.internal.j8o.h0(this.k5(), var22));
                     var12++;
                  }
               default:
                  throw new ArgumentOutOfRangeException("CompressionType");
            }
         case 3:
            if (this.h0.m1() == null || this.h0.k7() == null) {
               throw new ArgumentException("Icc profiles needed to perform saving in CMYK format.");
            }

            this.r4();
            this.u9 = true;
            switch (this.h0.t9()) {
               case 0:
                  if ((var1.t4() & 255) == 8) {
                     this.c8.n5(new t4((byte)-64, n3()));
                  } else {
                     if ((var1.t4() & 255) != 12) {
                        throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
                     }

                     this.c8.n5(new t4((byte)-63, n3()));
                  }

                  this.c8.a6().n5(var1.t4());
                  this.c8.n5(this.q0());
                  this.n5(this.k5().s7().size());
                  int var11 = 0;

                  while (true) {
                     if (var11 >= this.k5().s7().size()) {
                        break label205;
                     }

                     v0 var21 = this.t9.get_Item(var11);
                     this.a6.addItem(new com.aspose.slides.internal.j8o.n5(this.k5(), var21));
                     var11++;
                  }
               case 1:
                  this.c8.n5(new t4((byte)-62, n3()));
                  this.c8.a6().n5(var1.t4());
                  this.c8.n5(this.m1());
                  this.n5(this.k5().s7().size());
                  int var10 = 0;

                  while (true) {
                     if (var10 >= this.k5().s7().size()) {
                        break label205;
                     }

                     v0 var20 = this.t9.get_Item(var10);
                     this.a6.addItem(new com.aspose.slides.internal.j8o.h0(this.k5(), var20));
                     var10++;
                  }
               default:
                  throw new ArgumentOutOfRangeException("CompressionType");
            }
         case 4:
            this.m3();
            this.u9 = true;
            switch (this.h0.t9()) {
               case 0:
                  if ((var1.t4() & 255) == 8) {
                     this.c8.n5(new t4((byte)-64, y4()));
                  } else {
                     if ((var1.t4() & 255) != 12) {
                        throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
                     }

                     this.c8.n5(new t4((byte)-63, y4()));
                  }

                  this.c8.a6().n5(var1.t4());
                  this.c8.n5(this.z3());
                  this.n5(this.k5().s7().size());
                  int var9 = 0;

                  while (true) {
                     if (var9 >= this.k5().s7().size()) {
                        break label205;
                     }

                     v0 var19 = this.t9.get_Item(var9);
                     this.a6.addItem(new com.aspose.slides.internal.j8o.n5(this.k5(), var19));
                     var9++;
                  }
               case 1:
                  this.c8.n5(new t4((byte)-62, y4()));
                  this.c8.a6().n5(var1.t4());
                  this.c8.n5(this.k7());
                  this.n5(this.k5().s7().size());
                  int var4 = 0;

                  while (true) {
                     if (var4 >= this.k5().s7().size()) {
                        break label205;
                     }

                     v0 var5 = this.t9.get_Item(var4);
                     this.a6.addItem(new com.aspose.slides.internal.j8o.h0(this.k5(), var5));
                     var4++;
                  }
               default:
                  throw new ArgumentOutOfRangeException("CompressionType");
            }
         default:
            throw new ArgumentOutOfRangeException("ColorType");
      }

      t4 var18 = this.c8.a6();
      var18.u3(this.u9().t2() & 65535);
      var18.a6(this.u9().l6() & 65535);

      for (com.aspose.slides.internal.b7s.n3 var8 : var18.l6()) {
         var18.n5(q1.n5(var18.u3(), var8.u3() & 255));
         var18.k5(q1.n5(var18.h0(), var8.n3() & 255));
      }

      for (com.aspose.slides.internal.b7s.n3 var35 : var18.l6()) {
         var35.n5 = com.aspose.slides.internal.n5p.h0.n5((var18.c8() & 65535) * (var35.u3() & 255), var18.u3() * 8);
         var35.l6(com.aspose.slides.internal.n5p.h0.n5((var18.t2() & 65535) * (var35.n3() & 255), var18.h0() * 8));
      }

      this.t2 = com.aspose.slides.internal.n5p.h0.n5(var18.t2() & 65535, var18.h0() * 8);
      int var30 = com.aspose.slides.internal.n5p.h0.k5(var18.t2() & 65535, var18.h0() * 8);
      int var32 = com.aspose.slides.internal.n5p.h0.k5(var18.c8() & 65535, var18.u3() * 8);
      this.c8.l6(var30 / 8);
      this.c8.u3(var32 / 8);

      for (int var34 = 0; var34 < this.c8.s7().size(); var34++) {
         this.k5.addItem(new com.aspose.slides.internal.l4w.n5(this.k5()));
         com.aspose.slides.internal.b7s.u3[] var36 = null;
         if (var2 != null && var2.size() == this.c8.s7().size()) {
            var36 = (com.aspose.slides.internal.b7s.u3[])var2.get_Item(var34);
         }

         this.z1.addItem(new k5$n5(var36));
      }
   }

   public static boolean n5(com.aspose.slides.internal.g7e.n5 var0) {
      boolean var1 = false;
      int var2 = var0.z1() == 4 && var0.n3() != null ? 1 : var0.z1();
      switch (var2) {
         case 0:
         case 1:
            switch (var0.t9()) {
               case 0:
                  if ((var0.t4() & 255) == 8) {
                     var1 = false;
                  } else {
                     if ((var0.t4() & 255) != 12) {
                        throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
                     }

                     var1 = true;
                  }

                  return var1;
               case 1:
                  var1 = true;
                  return var1;
               default:
                  return var1;
            }
         case 2:
         case 3:
         case 4:
            var1 = true;
      }

      return var1;
   }

   @Override
   protected void a6() {
      for (int var1 = 0; var1 < this.k5().s7().size(); var1++) {
         y0 var2 = this.y4.get_Item(var1);
         if (var2 != null && !var2.c8()) {
            var2.dispose();
            Object var5 = null;
         }

         v3 var3 = this.e2.get_Item(var1);
         if (var3 != null && !var3.c8()) {
            var3.dispose();
            Object var7 = null;
         }
      }

      int var4 = com.aspose.slides.ms.System.u3.n5(this.u3(), 1, true).a6(0);

      for (int var6 = 0; var6 < var4; var6++) {
         this.u3()[var6] = null;
      }

      if (this.c8.u9() != null) {
         this.c8.u9().dispose();
         this.c8.n5((com.aspose.slides.internal.g7e.l6)null);
      }

      this.t9.clear();
      this.y4.clear();
      this.e2.clear();
      this.z1.clear();
      this.a6.clear();
      this.t9 = null;
      this.e2 = null;
      this.y4 = null;
      this.n5 = (short[][])null;
      this.c8 = null;
      this.z1 = null;
      this.a6 = null;
      this.u3 = null;
      super.a6();
   }

   private static com.aspose.slides.internal.b7s.n3[] n3() {
      return new com.aspose.slides.internal.b7s.n3[]{
         new com.aspose.slides.internal.b7s.n3((byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0),
         new com.aspose.slides.internal.b7s.n3((byte)2, (byte)1, (byte)1, (byte)0, (byte)1, (byte)1),
         new com.aspose.slides.internal.b7s.n3((byte)3, (byte)1, (byte)1, (byte)0, (byte)1, (byte)1),
         new com.aspose.slides.internal.b7s.n3((byte)4, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0)
      };
   }

   private static com.aspose.slides.internal.b7s.n3[] y4() {
      return new com.aspose.slides.internal.b7s.n3[]{
         new com.aspose.slides.internal.b7s.n3((byte)0, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0),
         new com.aspose.slides.internal.b7s.n3((byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0),
         new com.aspose.slides.internal.b7s.n3((byte)2, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0)
      };
   }

   private static com.aspose.slides.internal.b7s.n3[] e2() {
      return new com.aspose.slides.internal.b7s.n3[]{
         new com.aspose.slides.internal.b7s.n3((byte)1, (byte)2, (byte)2, (byte)0, (byte)0, (byte)0),
         new com.aspose.slides.internal.b7s.n3((byte)2, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1),
         new com.aspose.slides.internal.b7s.n3((byte)3, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1)
      };
   }

   private static com.aspose.slides.internal.b7s.n3[] t9() {
      return new com.aspose.slides.internal.b7s.n3[]{new com.aspose.slides.internal.b7s.n3((byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0)};
   }

   private short[][] n5(int var1, int var2) {
      p3 var3 = this.c8.s7().get_Item(this.c8.n5);
      int var4 = var3.u3();
      int var5 = var3.a6();
      int var6 = this.z1.get_Item(this.c8.n5).n5;
      int var7 = 0;
      boolean var8 = var3.l6.length != 1;
      short[][] var9 = new short[this.c8.n5()][];
      int var10 = this.c8.x8() * 8;

      for (int var11 = 0; var11 < var3.l6.length; var11++) {
         int var12 = 0;
         int var13 = var3.l6[var11];
         com.aspose.slides.internal.b7s.n3 var14 = this.c8.a6().l6()[var13];
         com.aspose.slides.internal.t7p.c8 var15 = this.u3.n5(var11);
         if (!var8) {
            var4 = this.c8.x8() / var14.n5;
            var5 = this.c8.u3() / var14.a6();
         }

         int var16 = 8 * var5;
         int var17 = 8 * var4;
         int var18 = var2 * var16;
         int var19 = var18 * var10 + var1 * var17 - var6;
         short[] var20 = new short[var4 * var5 * 64];

         for (int var21 = 0; var21 < var16; var21++) {
            System.arraycopy(this.n5[var13], var19, var20, var12, var17);
            var12 += var17;
            var19 += var10;
         }

         if (var4 == 1 && var5 == 1) {
            var9[var7++] = var20;
         } else {
            int var30 = var4 * 8;
            var15.n5(var20, var30);
            int var22 = var14.t2() * 8;
            int var23 = var14.s7() * 8;

            for (int var24 = 0; var24 < var22; var24 += 8) {
               for (int var25 = 0; var25 < var23; var25 += 8) {
                  short[] var26 = new short[64];
                  int var27 = var30 * var24 + var25;
                  byte var28 = 0;

                  for (int var29 = 0; var29 < 8; var29++) {
                     System.arraycopy(var20, var27, var26, var28, 8);
                     var27 += var30;
                     var28 += 8;
                  }

                  var9[var7++] = var26;
               }
            }
         }
      }

      return var9;
   }

   private void z1() {
      if (this.n3 == 1) {
         y0 var1 = this.k5().c8().n5();

         for (int var2 = 0; var2 < this.c8.s7().size(); var2++) {
            com.aspose.slides.internal.z0k.t4 var3 = this.y4.get_Item(var2).k5();
            var3.setPosition(0L);
            g7.n5(var3, var1);
         }
      }
   }

   private com.aspose.slides.internal.b7s.u3[] t4() {
      com.aspose.slides.internal.l4w.n5 var1 = this.k5.get_Item(this.c8.n5);
      com.aspose.slides.internal.j8o.k5 var2 = this.a6.get_Item(this.c8.n5);
      if (!var1.n5()) {
         var1.l6();
      }

      if (!var2.a6()) {
         var2.u3();
      }

      p3 var3 = this.c8.l6();
      k5$n5 var4 = this.z1.get_Item(this.c8.n5);
      int var5 = com.aspose.slides.internal.n5p.h0.n5(this.c8.a6().t2() & 65535, 8);
      int var6 = var4.k5 + this.x8 > this.t2 ? this.t2 - var4.k5 : this.x8;
      int var7 = var4.l6 + this.s7 > var5 ? var5 - var4.l6 : this.s7;
      boolean var8 = var3.l6.length > 1;
      if (!var8 && this.c8.a6().a6()) {
         com.aspose.slides.internal.b7s.n3 var9 = this.c8.a6().l6()[var3.l6[0]];
         int var10 = this.c8.x8() / var9.n5;
         int var11 = this.c8.u3() / var9.a6();
         if (var11 > 1) {
            var8 = true;
         }
      }

      int var15 = var8 ? var4.k5 : var4.l6;
      int var16 = var8 ? var15 + var6 : var15 + var7;

      for (int var17 = var15; var17 < var16; var17++) {
         for (int var12 = 0; var12 < this.c8.a6().u9(); var12++) {
            short[][] var13 = this.n5(var12, var17);
            short[][] var14 = var1.n5(var13);
            var2.l6(var14);
         }
      }

      var4.n5 = var4.n5 + var7 * this.k5().x8() * 64;
      var4.k5 += var6;
      var4.l6 += var7;
      return var4.l6 == var5 ? var2.n5() : null;
   }

   private List<p3> q0() {
      List var1 = new List();
      p3 var2 = new p3();
      var2.l6 = new int[]{0, 1, 2, 3};
      var1.addItem(var2);
      return var1;
   }

   private List<p3> z3() {
      List var1 = new List();
      p3 var2 = new p3();
      var2.l6 = new int[]{0, 1, 2};
      var1.addItem(var2);
      return var1;
   }

   private List<p3> m1() {
      List var1 = new List();

      for (int var2 = 0; var2 < 4; var2++) {
         p3 var3 = new p3((byte)0, (byte)0, 0, 1, 1);
         var3.l6 = new int[]{var2};
         var1.addItem(var3);
      }

      for (int var4 = 0; var4 < 4; var4++) {
         p3 var9 = new p3((byte)1, (byte)5, 0, 2, 1);
         var9.l6 = new int[]{var4};
         var1.addItem(var9);
      }

      for (int var5 = 0; var5 < 4; var5++) {
         p3 var10 = new p3((byte)6, (byte)63, 0, 2, 1);
         var10.l6 = new int[]{var5};
         var1.addItem(var10);
      }

      for (int var6 = 0; var6 < 4; var6++) {
         p3 var11 = new p3((byte)1, (byte)63, 2, 1, 1);
         var11.l6 = new int[]{var6};
         var1.addItem(var11);
      }

      for (int var7 = 0; var7 < 4; var7++) {
         p3 var12 = new p3((byte)0, (byte)0, 1, 0, 1);
         var12.l6 = new int[]{var7};
         var1.addItem(var12);
      }

      for (int var8 = 0; var8 < 4; var8++) {
         p3 var13 = new p3((byte)1, (byte)63, 1, 0, 1);
         var13.l6 = new int[]{var8};
         var1.addItem(var13);
      }

      return var1;
   }

   private List<p3> k7() {
      List var1 = new List();

      for (int var2 = 0; var2 < 3; var2++) {
         p3 var3 = new p3((byte)0, (byte)0, 0, 1, 1);
         var3.l6 = new int[]{var2};
         var1.addItem(var3);
      }

      for (int var4 = 0; var4 < 3; var4++) {
         p3 var9 = new p3((byte)1, (byte)5, 0, 2, 1);
         var9.l6 = new int[]{var4};
         var1.addItem(var9);
      }

      for (int var5 = 0; var5 < 3; var5++) {
         p3 var10 = new p3((byte)6, (byte)63, 0, 2, 1);
         var10.l6 = new int[]{var5};
         var1.addItem(var10);
      }

      for (int var6 = 0; var6 < 3; var6++) {
         p3 var11 = new p3((byte)1, (byte)63, 2, 1, 1);
         var11.l6 = new int[]{var6};
         var1.addItem(var11);
      }

      for (int var7 = 0; var7 < 3; var7++) {
         p3 var12 = new p3((byte)0, (byte)0, 1, 0, 1);
         var12.l6 = new int[]{var7};
         var1.addItem(var12);
      }

      for (int var8 = 0; var8 < 3; var8++) {
         p3 var13 = new p3((byte)1, (byte)63, 1, 0, 1);
         var13.l6 = new int[]{var8};
         var1.addItem(var13);
      }

      return var1;
   }

   private void m3() {
      this.k5().l6(new Dictionary<>());
      this.k5().n5(new Dictionary<>());
      this.k5().h0().set_Item((byte)0, z6.n5((byte)0, com.aspose.slides.internal.n5p.l6.s7, this.h0.q0(), true).k5());
   }

   private void z8() {
      this.k5()
         .k5()
         .set_Item((byte)0, new com.aspose.slides.internal.b7s.u3((byte)0, (byte)0, com.aspose.slides.internal.n5p.l6.c8, com.aspose.slides.internal.n5p.l6.t2));
      this.k5()
         .k5()
         .set_Item((byte)1, new com.aspose.slides.internal.b7s.u3((byte)1, (byte)0, com.aspose.slides.internal.n5p.l6.k5, com.aspose.slides.internal.n5p.l6.u3));
      this.k5()
         .k5()
         .set_Item(
            (byte)16, new com.aspose.slides.internal.b7s.u3((byte)0, (byte)1, com.aspose.slides.internal.n5p.l6.u9, com.aspose.slides.internal.n5p.l6.h0)
         );
      this.k5()
         .k5()
         .set_Item(
            (byte)17, new com.aspose.slides.internal.b7s.u3((byte)1, (byte)1, com.aspose.slides.internal.n5p.l6.n5, com.aspose.slides.internal.n5p.l6.l6)
         );
   }

   private List<p3> j5() {
      List var1 = new List();
      p3 var2 = new p3();
      var2.l6 = new int[]{0, 1, 2};
      var1.addItem(var2);
      return var1;
   }

   private void w1() {
      this.k5().l6(new Dictionary<>());
      this.k5().n5(new Dictionary<>());
      this.k5().h0().set_Item((byte)0, z6.n5((byte)0, com.aspose.slides.internal.n5p.n5.n5, this.h0.q0(), true).k5());
      this.k5().h0().set_Item((byte)1, z6.n5((byte)1, com.aspose.slides.internal.n5p.n5.l6, this.h0.q0(), true).k5());
   }

   private void r4() {
      this.k5().l6(new Dictionary<>());
      this.k5().n5(new Dictionary<>());
      this.k5().h0().set_Item((byte)0, z6.n5((byte)0, com.aspose.slides.internal.n5p.k5.n5, this.h0.q0(), true).k5());
      this.k5().h0().set_Item((byte)1, z6.n5((byte)1, com.aspose.slides.internal.n5p.k5.l6, this.h0.q0(), true).k5());
   }

   private List<p3> c4() {
      List var1 = new List();
      p3 var2 = new p3();
      var2.l6 = new int[]{0};
      var1.addItem(var2);
      return var1;
   }

   private List<p3> y2() {
      List var1 = new List();
      p3 var2 = new p3((byte)0, (byte)0, 0, 1, new int[]{0});
      var1.addItem(var2);
      var1.addItem(new p3((byte)1, (byte)5, 0, 2, new int[]{0}));
      var1.addItem(new p3((byte)6, (byte)63, 0, 2, new int[]{0}));
      var1.addItem(new p3((byte)1, (byte)63, 2, 1, new int[]{0}));
      var1.addItem(new p3((byte)0, (byte)0, 1, 0, new int[]{0}));
      var1.addItem(new p3((byte)1, (byte)63, 1, 0, new int[]{0}));
      return var1;
   }

   private void n5(boolean var1) {
      this.k5().l6(new Dictionary<>());
      this.k5().n5(new Dictionary<>());
      this.k5().h0().set_Item((byte)0, z6.n5((byte)0, com.aspose.slides.internal.n5p.l6.s7, this.h0.q0(), var1).k5());
      this.k5().h0().set_Item((byte)1, z6.n5((byte)1, com.aspose.slides.internal.n5p.l6.a6, this.h0.q0(), var1).k5());
   }

   private List<p3> y1() {
      List var1 = new List(10);
      var1.addItem(new p3((byte)0, (byte)0, 0, 1, new int[]{0, 1, 2}));
      var1.addItem(new p3((byte)1, (byte)5, 0, 2, new int[]{0}));
      var1.addItem(new p3((byte)1, (byte)63, 0, 1, new int[]{2}));
      var1.addItem(new p3((byte)1, (byte)63, 0, 1, new int[]{1}));
      var1.addItem(new p3((byte)6, (byte)63, 0, 2, new int[]{0}));
      var1.addItem(new p3((byte)1, (byte)63, 2, 1, new int[]{0}));
      var1.addItem(new p3((byte)0, (byte)0, 1, 0, new int[]{0, 1, 2}));
      var1.addItem(new p3((byte)1, (byte)63, 1, 0, new int[]{2}));
      var1.addItem(new p3((byte)1, (byte)63, 1, 0, new int[]{1}));
      var1.addItem(new p3((byte)1, (byte)63, 1, 0, new int[]{0}));
      return var1;
   }

   private void a0() {
      p3 var1 = this.c8.s7().get_Item(this.c8.n5);
      k5$n5 var2 = this.z1.get_Item(this.c8.n5);
      if (var1.l6.length == 1) {
         com.aspose.slides.internal.b7s.n3 var3 = this.c8.a6().l6()[var1.l6[0]];
         this.c8.a6().l6(var3.n5);
         this.c8.k5(var3.a6());
         this.c8.a6().l6()[var1.l6[0]].h0(1);
         this.c8.a6().l6()[var1.l6[0]].u9(1);
         this.c8.a6().l6()[var1.l6[0]].a6(1);
         this.c8.a6().l6()[var1.l6[0]].c8(var3.n3() & 255);
         this.c8.a6().l6()[var1.l6[0]].k5(1);
         this.c8.a6().l6()[var1.l6[0]].u3(1);
         var1.n5(new int[1]);
         var1.k5()[0] = var1.l6[0];
         this.c8.n5(1);
         var1.k5(1);
         var1.u3(1);
      } else {
         this.c8.a6().l6(com.aspose.slides.internal.n5p.h0.n5(this.c8.a6().c8() & 65535, this.c8.a6().u3() * 8));
         this.c8.k5(com.aspose.slides.internal.n5p.h0.n5(this.c8.a6().t2() & 65535, this.c8.a6().h0() * 8));
         this.c8.n5(0);
         var1.k5(0);
         var1.u3(0);

         for (int var11 = 0; var11 < var1.l6.length; var11++) {
            com.aspose.slides.internal.b7s.n3 var4 = this.c8.a6().l6()[var1.l6[var11]];
            var4.h0(var4.u3() & 255);
            var4.u9(var4.n3() & 255);
            var1.k5(q1.n5(var1.u3(), var4.u3() & 255));
            var1.u3(q1.n5(var1.a6(), var4.n3() & 255));
            var4.a6(var4.t2() * var4.s7());
            var4.n5 = com.aspose.slides.internal.n5p.h0.n5((this.c8.a6().c8() & 65535) * (var4.u3() & 255), this.c8.a6().u3() * 8);
            var4.l6(com.aspose.slides.internal.n5p.h0.n5((this.c8.a6().t2() & 65535) * (var4.n3() & 255), this.c8.a6().h0() * 8));
            int var5 = var4.n5 % var4.s7();
            if (var5 == 0) {
               var5 = var4.s7();
            }

            var4.k5(var5);
            var5 = var4.a6() % var4.t2();
            if (var5 == 0) {
               var5 = var4.t2();
            }

            var4.u3(var5);
            int var6 = var4.c8();

            while (var6-- > 0) {
               int var7 = this.c8.n5();
               this.c8.n5(var7 + 1);
               var1.k5()[var7] = var1.l6[var11];
            }
         }
      }

      this.u3 = new n3(this.c8.l6().l6, this.c8.a6());
      if (this.u9 && this.n3 == 0) {
         var2.u3 = this.t4();
      }

      if (this.n3 == 1) {
         if (this.u9 && var2.u3 != null) {
            for (com.aspose.slides.internal.b7s.u3 var19 : var2.u3) {
               this.c8.k5().set_Item(var19.n5, var19);
            }
         }

         Dictionary$ValueCollection$Enumerator var13 = this.c8.k5().getValues().iterator();

         try {
            while (var13.hasNext()) {
               com.aspose.slides.internal.b7s.u3 var15 = (com.aspose.slides.internal.b7s.u3)var13.next();
               if (!var15.t2()) {
                  v0 var18 = this.t9.get_Item(this.k5().n5);
                  com.aspose.slides.internal.b7s.u3.n5(var18.n5(), new com.aspose.slides.internal.b7s.u3[]{var15});
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }
      }
   }

   private short[] n5(int var1, int var2, int var3) {
      short[] var4 = new short[64];
      int var5 = var3;

      for (int var6 = 0; var6 < 8; var6++) {
         int var7 = var2;

         for (int var8 = 0; var7 < var2 + 8; var8++) {
            var4[var8 + var6 * 8] = this.u3()[var1][var5 * this.c8.x8() * 8 + var7 - this.q0];
            var7++;
         }

         var5++;
      }

      return var4;
   }

   private void n5(int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         v3 var3 = com.aspose.slides.internal.r1x.c8.n5(0L);
         this.e2.addItem(var3);
         y0 var4 = new y0(var3.k5());
         this.y4.addItem(var4);
         v0 var5 = new v0(var4);
         this.t9.addItem(var5);
      }
   }
}
