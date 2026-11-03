package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.ms.System.IDisposable;

public class d2n extends s7k {
   public boolean n5;
   public List<Integer> l6 = new List<>();
   private List<byte[]> k5 = new List<>();
   private Dictionary<String, Integer> u3 = new Dictionary<>();

   public d2n(d7u var1, u0a var2) {
      super(var1, var2);
   }

   public d2n(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
   }

   public k6 n5(int var1) {
      return this.l6(var1);
   }

   public final void n5(int var1, n0 var2) {
      f3c var3 = new f3c(this.y1().n5(var1));

      try {
         long var4 = this.y2().u9().n5().n5(var1);
         long var6 = this.y2().u9().n5().n5(var1 + 1);
         if (com.aspose.slides.ms.System.q1.n5((int)var6 - (int)var4) <= 0) {
            return;
         }

         var3.n5((this.d2() & 4294967295L) + (var4 & 4294967295L) & 4294967295L);
         short var8 = var3.t2();
         if (var8 >= 0) {
            return;
         }

         var3.n5(var3.n5() + 8L);

         int var9;
         do {
            var9 = var3.n3();
            k2 var10 = new k2(var3.n3() & 65535);
            if (!var2.l6(var10)) {
               var2.n5(var10);
            }

            if ((var9 & 65535 & 32) == 0) {
               return;
            }

            byte var11;
            if ((var9 & 65535 & 1) != 0) {
               var11 = 4;
            } else {
               var11 = 2;
            }

            if ((var9 & 65535 & 8) != 0) {
               var11 += 2;
            } else if ((var9 & 65535 & 64) != 0) {
               var11 += 4;
            }

            if ((var9 & 65535 & 128) != 0) {
               var11 += 8;
            }

            var3.n5(var3.n5() + var11);
         } while ((var9 & 65535 & 32) != 0);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private k6 l6(int var1) {
      k6 var2 = null;
      z4 var3;
      if (!this.a0()) {
         var3 = this.y1().n5(var1);
      } else {
         var3 = new m3(this.k5.get_Item(var1));
      }

      f3c var4 = new f3c(var3);

      try {
         int var5 = 0;
         k6[] var6 = new k6[]{var2};
         int[] var7 = new int[]{0};
         this.n5(var4, var1, var6, var7);
         var2 = var6[0];
         var5 = var7[0];
         var2.l6((int)this.y2().k5().l6());
      } catch (EndOfStreamException var11) {
         j1.n5(com.aspose.slides.ms.System.d1.n5("parsing of glyph#{0} failed. exception: {1}",new Object[]{ var1, var11.toString()}));
         var2 = new k6();
         var2.l6((int)this.y2().k5().l6());
         var2.n5(1);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      return var2;
   }

   private void n5(f3c var1, int var2, k6[] var3, int[] var4) {
      long var5;
      long var7;
      if (com.aspose.slides.internal.v6g.k5.l6(this.y1(), p2.class)) {
         var5 = 0L;
         var7 = var1.l6() & 4294967295L;
      } else if (!this.a0()) {
         var5 = this.y2().u9().n5().n5(var2);
         var7 = this.y2().u9().n5().n5(var2 + 1);
      } else {
         var5 = 0L;
         var7 = var1.l6() & 4294967295L;
      }

      double var9 = 0.0;
      double var11 = 0.0;
      double var13 = 0.0;
      double var15 = 0.0;
      z9 var17 = new z9();
      var9 = 0.0;
      var11 = 0.0;
      if (this.y2().s7() != null) {
         if (this.y2().s7().n5().n5() == 1) {
            var13 = this.y2().s7().n5().n5(0).n5() & 65535;
            if (this.y2().s7().l6().length > 0) {
               var9 = this.y2().s7().l6()[0];
            }
         } else if (var2 <= this.y2().s7().n5().n5() - 1) {
            var13 = this.y2().s7().n5().n5(var2).n5() & 65535;
            var9 = this.y2().s7().n5().n5(var2).l6();
         } else if (this.y2().t2() != null) {
            var13 = this.y2().t2().l6() & 65535;
            int var18 = var2 - this.y2().s7().n5().n5();
            if (var18 >= 0 && var18 < this.y2().s7().l6().length) {
               var9 = this.y2().s7().l6()[var18];
            }
         }
      }

      if (com.aspose.slides.ms.System.q1.n5((int)var7 - (int)var5) > 0) {
         var1.n5((this.d2() & 4294967295L) + (var5 & 4294967295L) & 4294967295L);
         short var26 = var1.t2();
         short var19 = var1.u9();
         short var20 = var1.u9();
         short var21 = var1.u9();
         short var22 = var1.u9();
         var17 = new z9();
         var17.n5(var19);
         var17.k5(var21);
         var17.l6(var20);
         var17.u3(var22);
         var15 = var20;
         if (var26 > -1) {
            var3[0] = new k6();
            this.n5(var1, var2, var3[0], var5, var26);
         } else {
            q1 var23 = new q1();
            var3[0] = var23;
            this.n5(var1, var2, var4, var23);
            if (var4[0] >= 50) {
               var3[0].n5(1);
            }
         }
      } else {
         var3[0] = new k6();
         var3[0].n5(new k6$n5(this.y1(), new k2(var2), new byte[0]));
         v2x var27 = v2x.l6();
         var3[0].n5(var27);
      }

      var3[0].n5(var9);
      var3[0].l6(var11);
      var3[0].k5(var13);
      var3[0].u3(var15);
      var3[0].n5(var17);
   }

   private void n5(f3c var1, int var2, k6 var3, long var4, short var6) {
      if (var6 == 0) {
         v2x var17 = v2x.l6();
         var3.n5(var17);
      } else {
         v2x var7 = v2x.k5();
         var3.n5(var7);
         var7.n5 = var6;
         var7.l6 = new int[var6];

         for (int var8 = 0; var8 < var6; var8++) {
            var7.l6[var8] = var1.n3();
         }

         int var18 = var1.n3();
         byte[] var9 = new byte[var18 & 65535];

         for (int var10 = 0; var10 < (var18 & 65535); var10++) {
            var9[var10] = var1.x8();
         }

         var7.u3 = 0;

         for (int var13 : var7.l6) {
            if (var7.u3 < (var13 & 65535)) {
               var7.u3 = var13 & 65535;
            }
         }

         var7.u3++;
         var7.h0 = new boolean[var7.u3];
         var7.c8 = new boolean[var7.u3];
         var7.k5 = new byte[var7.u3];

         for (int var20 = 0; var20 < var7.u3; var20++) {
            byte var22 = var1.x8();
            var7.k5[var20] = var22;
            if ((var22 & 255 & 8) != 0) {
               int var25 = var1.x8() & 255;

               for (int var27 = 0; var27 < var25; var27++) {
                  var7.k5[++var20] = var22;
               }
            }
         }

         short[] var21 = new short[var7.u3];
         var7.a6 = new double[var7.u3];

         for (int var23 = 0; var23 < var7.u3; var23++) {
            if ((var7.k5[var23] & 255 & 2) != 0) {
               if ((var7.k5[var23] & 255 & 16) != 0) {
                  var21[var23] = (short)(var1.x8() & 0xFF);
               } else {
                  var21[var23] = (short)(-(var1.x8() & 255));
               }
            } else if ((var7.k5[var23] & 255 & 16) != 0) {
               var21[var23] = 0;
            } else {
               var21[var23] = var1.t2();
            }

            if (var23 == 0) {
               var7.a6[var23] = var21[var23];
            } else {
               var7.a6[var23] = var21[var23] + var7.a6[var23 - 1];
            }
         }

         short[] var24 = new short[var7.u3];
         var7.u9 = new double[var7.u3];

         for (int var26 = 0; var26 < var7.u3; var26++) {
            if ((var7.k5[var26] & 255 & 4) != 0) {
               if ((var7.k5[var26] & 255 & 32) != 0) {
                  var24[var26] = (short)(var1.x8() & 0xFF);
               } else {
                  var24[var26] = (short)(-(var1.x8() & 255));
               }
            } else if ((var7.k5[var26] & 255 & 32) != 0) {
               var24[var26] = 0;
            } else {
               var24[var26] = var1.t2();
            }

            if (var26 == 0) {
               var7.u9[var26] = var24[var26];
            } else {
               var7.u9[var26] = var24[var26] + var7.u9[var26 - 1];
            }
         }

         long var14 = var1.n5() & 4294967295L;
         var1.n5((this.d2() & 4294967295L) + (var4 & 4294967295L) & 4294967295L);
         byte[] var16 = var1.n5((int)((var14 & 4294967295L) - ((this.d2() & 4294967295L) + (var4 & 4294967295L) & 4294967295L)));
         var3.n5(new k6$n5(this.y1(), new k2(var2), var16));
      }
   }

   public final boolean n5(k6 var1) {
      if (var1.u3() != k6$n5.n5) {
         String var2 = u3(var1);
         return this.u3.containsKey(var2);
      } else {
         return false;
      }
   }

   public final int l6(k6 var1) {
      String var2 = u3(var1);
      return this.u3.get_Item(var2);
   }

   public final r9 k5(k6 var1) {
      return var1.u3().l6();
   }

   private void n5(f3c var1, int var2, int[] var3, q1 var4) {
      var3[0]++;

      int var5;
      do {
         var5 = var1.n3();
         int var6 = var1.n3();
         v2 var7 = new v2();
         short var8;
         short var9;
         if ((var5 & 65535 & 1) != 0) {
            var8 = var1.t2();
            var9 = var1.t2();
         } else {
            var8 = var1.h0();
            var9 = var1.h0();
         }

         if ((var5 & 65535 & 8) != 0) {
            var7.n5(var1.c8());
            var7.u3(var7.n5());
         } else if ((var5 & 65535 & 64) != 0) {
            var7.n5(var1.c8());
            var7.u3(var1.c8());
         } else if ((var5 & 65535 & 128) != 0) {
            var7.n5(var1.c8());
            var7.l6(var1.c8());
            var7.k5(var1.c8());
            var7.u3(var1.c8());
         }

         var7.a6(com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.n5(var7.n5()), com.aspose.slides.ms.System.q1.n5(var7.l6())));
         var7.u9(com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.n5(var7.k5()), com.aspose.slides.ms.System.q1.n5(var7.u3())));
         if (com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.n5(var7.n5()) - com.aspose.slides.ms.System.q1.n5(var7.k5())) <= 0.0) {
            var7.a6(2.0 * var7.a6());
         }

         if (com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.n5(var7.k5()) - com.aspose.slides.ms.System.q1.n5(var7.u3())) <= 0.0) {
            var7.u9(2.0 * var7.u9());
         }

         if ((var5 & 65535 & 2) != 0) {
            var7.a6(var7.a6() * var8);
            var7.u9(var7.u9() * var9);
         }

         long var10 = var1.n5();
         if (var3[0] >= 50) {
            break;
         }

         if (var2 != (var6 & 65535)) {
            k6 var12 = null;
            if (com.aspose.slides.internal.v6g.k5.l6(this.y1(), p2.class)) {
               z4 var13 = ((p2)this.y1()).n5(var6 & 65535);
               if (var13 != null) {
                  f3c var14 = new f3c(var13);
                  k6[] var15 = new k6[]{var12};
                  this.n5(var14, var6 & 65535, var15, var3);
                  var12 = var15[0];
               }
            } else {
               k6[] var21 = new k6[]{var12};
               this.n5(var1, var6 & 65535, var21, var3);
               var12 = var21[0];
            }

            if (var12 != null) {
               var4.l6().n5(new u5(var12, var7));
            }
         }

         var1.n5(var10);
      } while ((var5 & 65535 & 32) != 0);

      if ((var5 & 65535 & 256) != 0) {
         byte[] var17 = new byte[var1.t2()];

         for (int var18 = 0; var18 < var17.length; var18++) {
            var17[var18] = var1.x8();
         }

         ((v2x)var4.k5()).t2 = var17;

         try {
            if (this.y1().k5().n5()) {
               j5 var19 = new j5(this.y2().z1().n5(), this.y2().z1().y1());
               var19.l6();
               var19.n5.n5(var4);
               var19 = new j5(var4, this.y1(), var19.n5);
               var19.l6();
            }
         } catch (RuntimeException var16) {
            if (r6.n5().k5() != 1) {
               throw var16;
            }

            w5.n5().l6().n5().n5(var16);
         }
      }

      var4.n5(new k6$n5(this.y1(), new k2(var2), null));
   }

   public final void n5(k6 var1, byte[][] var2, boolean[] var3) {
      String var4 = u3(var1);
      if (var4 != null && this.u3.containsKey(var4)) {
         int var139 = this.u3.get_Item(var4);
         var2[0] = this.k5.get_Item(var139 & 65535);
         var3[0] = false;
      } else {
         if (var1.a6() == 1) {
            var2[0] = new byte[0];
            this.k5.addItem(var2[0]);
            var3[0] = true;
            if (var4 != null) {
               this.u3.set_Item(var4, this.k5.size() - 1 & 65535);
            }

            return;
         }

         List var5 = new List();
         d2n$l6 var6 = null;
         int var7 = 0;
         int var8 = 0;
         q1 var9 = com.aspose.slides.internal.v6g.k5.n5(var1, q1.class);
         if (var9 == null && this.y1().u3() != null && var1.u3() != k6$n5.n5 && this.y1().u3() == var1.u3().n5()) {
            com.aspose.slides.internal.z0k.e2 var159 = new com.aspose.slides.internal.z0k.e2();

            try {
               j2p var146 = new j2p(var159);

               try {
                  var2[0] = var1.u3().k5();
                  var146.n5(var2[0]);
               } finally {
                  if (var146 != null) {
                     var146.dispose();
                  }
               }
            } finally {
               if (var159 != null) {
                  var159.dispose();
               }
            }
         } else if (var9 != null && var9.l6().size() > 0) {
            com.aspose.slides.internal.z0k.e2 var145 = new com.aspose.slides.internal.z0k.e2();

            try {
               j2p var148 = new j2p(var145);

               try {
                  var148.n5((short)-1);
                  var148.n5(com.aspose.slides.internal.v6g.k5.l6(var1.n3().n5(), 14));
                  var148.n5(com.aspose.slides.internal.v6g.k5.l6(var1.n3().l6(), 14));
                  var148.n5(com.aspose.slides.internal.v6g.k5.l6(var1.n3().k5(), 14));
                  var148.n5(com.aspose.slides.internal.v6g.k5.l6(var1.n3().u3(), 14));

                  for (int var150 = 0; var150 < var9.l6().size(); var150++) {
                     u5 var153 = var9.l6().n5(var150);
                     int var155 = 0;
                     var155 = (var155 & 65535 | 1) & 65535;
                     var155 = (var155 & 65535 | 128) & 65535;
                     var155 = (var155 & 65535 | 2) & 65535;
                     if (var150 < var9.l6().size() - 1) {
                        var155 = (var155 & 65535 | 32) & 65535;
                     }

                     var148.n5(var155);
                     String var165 = u3(var9.l6().n5(var150).n5());
                     int var170;
                     if (var9.l6().n5(var150).n5().u3().k5() == null) {
                        var170 = this.u3.get_Item(var165);
                     } else {
                        var170 = this.y1().k5().l6(var9.l6().n5(var150).n5().u3().l6()) & 65535;
                     }

                     var148.n5(var170);
                     int var174 = com.aspose.slides.internal.v6g.k5.u3(var153.l6().a6(), 14);
                     int var177 = com.aspose.slides.internal.v6g.k5.u3(var153.l6().u9(), 14);
                     var148.n5((short)var174);
                     var148.n5((short)var177);
                     var148.n5(var153.l6().n5());
                     var148.n5(var153.l6().l6());
                     var148.n5(var153.l6().k5());
                     var148.n5(var153.l6().u3());
                  }
               } finally {
                  if (var148 != null) {
                     var148.dispose();
                  }
               }

               var145.close();
               var2[0] = var145.toArray();
            } finally {
               if (var145 != null) {
                  var145.dispose();
               }
            }
         } else {
            for (Object recoveredElement$var10$16155 : var1.u9().n5()) {
               q9 var10 = (q9)recoveredElement$var10$16155;
               if (com.aspose.slides.internal.v6g.k5.l6(var10, b5.class)) {
                  var6 = null;
               } else {
                  if (var6 == null) {
                     var6 = new d2n$l6(null);
                     var5.addItem(var6);
                  }

                  j0 var11;
                  if ((var11 = com.aspose.slides.internal.v6g.k5.n5(var10, j0.class)) != null) {
                     int[] var16 = new int[]{var7};
                     int[] var15 = new int[]{var8};
                     n5(var6, com.aspose.slides.internal.v6g.k5.u3(var11.n5(), 14), com.aspose.slides.internal.v6g.k5.u3(var11.l6(), 14), (byte)1, var16, var15);
                     var7 = var16[0];
                     var8 = var15[0];
                  } else {
                     f7 var12;
                     if ((var12 = com.aspose.slides.internal.v6g.k5.n5(var10, f7.class)) != null) {
                        int[] var166 = new int[]{var7};
                        int[] var160 = new int[]{var8};
                        n5(
                           var6,
                           com.aspose.slides.internal.v6g.k5.u3(var12.n5(), 14),
                           com.aspose.slides.internal.v6g.k5.u3(var12.l6(), 14),
                           (byte)1,
                           var166,
                           var160
                        );
                        var7 = var166[0];
                        var8 = var160[0];
                     } else {
                        z5 var13;
                        if ((var13 = com.aspose.slides.internal.v6g.k5.n5(var10, z5.class)) != null) {
                           int var167 = var7;
                           int var161 = var8;
                           int[] var17 = new int[]{var7};
                           int[] var18 = new int[]{var8};
                           n5(
                              var6,
                              com.aspose.slides.internal.v6g.k5.u3((var13.n5() * 3.0 + var167) / 4.0, 14),
                              com.aspose.slides.internal.v6g.k5.u3((var13.l6() * 3.0 + var161) / 4.0, 14),
                              (byte)0,
                              var17,
                              var18
                           );
                           var7 = var17[0];
                           var8 = var18[0];
                           var17[0] = var7;
                           var18[0] = var8;
                           n5(
                              var6,
                              com.aspose.slides.internal.v6g.k5.u3((var13.u3() * 3.0 + var13.u9()) / 4.0, 14),
                              com.aspose.slides.internal.v6g.k5.u3((var13.a6() * 3.0 + var13.h0()) / 4.0, 14),
                              (byte)0,
                              var17,
                              var18
                           );
                           var7 = var17[0];
                           var8 = var18[0];
                           var17[0] = var7;
                           var18[0] = var8;
                           n5(
                              var6,
                              com.aspose.slides.internal.v6g.k5.u3(var13.u9(), 14),
                              com.aspose.slides.internal.v6g.k5.u3(var13.h0(), 14),
                              (byte)1,
                              var17,
                              var18
                           );
                           var7 = var17[0];
                           var8 = var18[0];
                        }
                     }
                  }
               }
            }

            com.aspose.slides.internal.z0k.e2 var154 = new com.aspose.slides.internal.z0k.e2();

            try {
               j2p var144 = new j2p(var154);

               try {
                  if (var5.size() > 0) {
                     var144.n5((short)var5.size());
                     var144.n5(com.aspose.slides.internal.v6g.k5.l6(var1.n3().n5(), 14));
                     var144.n5(com.aspose.slides.internal.v6g.k5.l6(var1.n3().l6(), 14));
                     var144.n5(com.aspose.slides.internal.v6g.k5.l6(var1.n3().k5(), 14));
                     var144.n5(com.aspose.slides.internal.v6g.k5.l6(var1.n3().u3(), 14));
                     int var147 = 0;
                     List$Enumerator var149 = var5.iterator();

                     try {
                        while (var149.hasNext()) {
                           d2n$l6 var151 = (d2n$l6)var149.next();
                           var147 += var151.n5();
                           var144.n5(var147 - 1 & 65535);
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var149, IDisposable.class)) {
                           var149.dispose();
                        }
                     }

                     var144.n5(0);
                     List$Enumerator var152 = var5.iterator();

                     try {
                        while (var152.hasNext()) {
                           d2n$l6 var168 = (d2n$l6)var152.next();

                           for (int var162 = 0; var162 < var168.n5(); var162++) {
                              d2n$n5 var171 = var168.n5(var162).n5();
                              var144.l6(var171.n5);
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var152, IDisposable.class)) {
                           var152.dispose();
                        }
                     }

                     List$Enumerator var169 = var5.iterator();

                     try {
                        while (var169.hasNext()) {
                           d2n$l6 var163 = (d2n$l6)var169.next();

                           for (int var172 = 0; var172 < var163.n5(); var172++) {
                              d2n$n5 var175 = var163.n5(var172).n5();
                              var144.n5((short)var175.l6);
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var169, IDisposable.class)) {
                           var169.dispose();
                        }
                     }

                     List$Enumerator var164 = var5.iterator();

                     try {
                        while (var164.hasNext()) {
                           d2n$l6 var173 = (d2n$l6)var164.next();

                           for (int var176 = 0; var176 < var173.n5(); var176++) {
                              d2n$n5 var19 = var173.n5(var176).n5();
                              var144.n5((short)var19.k5);
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var164, IDisposable.class)) {
                           var164.dispose();
                        }
                     }
                  }
               } finally {
                  if (var144 != null) {
                     var144.dispose();
                  }
               }

               var154.close();
               var2[0] = var154.toArray();
            } finally {
               if (var154 != null) {
                  var154.dispose();
               }
            }
         }

         this.k5.addItem(var2[0]);
         var3[0] = true;
         if (var4 != null) {
            this.u3.set_Item(var4, this.k5.size() - 1 & 65535);
         }
      }
   }

   private static String u3(k6 var0) {
      if (var0.u3() != k6$n5.n5) {
         int var1 = var0.u3().n5().hashCode();
         int var2 = ((k2)var0.u3().l6()).n5();
         return com.aspose.slides.ms.System.d1.n5("{0}-{1}",new Object[]{ var1, var2});
      } else {
         return null;
      }
   }

   private static void n5(d2n$l6 var0, int var1, int var2, byte var3, int[] var4, int[] var5) {
      d2n$n5 var6 = new d2n$n5();
      var6.n5 = (byte)(var6.n5 & 0xFF | var3 & 0xFF);
      var6.l6 = var1 - var4[0];
      var6.k5 = var2 - var5[0];
      var0.n5(var6.n5());
      var4[0] = var1;
      var5[0] = var2;
   }

   @Override
   public void n5(byte[][] var1, long[] var2, long[] var3) {
      if (!this.a0() && !this.n5) {
         super.n5(var1, var2, var3);
      } else {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            j2p var5 = new j2p(var4, true);

            try {
               if (this.n5) {
                  f3c var44 = new f3c(this.y1().n5());

                  try {
                     var44.n5(this.d2() & 4294967295L);
                     var5.n5(var44.n5((int)this.d5()));
                     List$Enumerator var45 = this.k5.iterator();

                     try {
                        while (var45.hasNext()) {
                           byte[] var8 = (byte[])var45.next();
                           var5.n5(var8);
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var45, IDisposable.class)) {
                           var45.dispose();
                        }
                     }
                  } finally {
                     if (var44 != null) {
                        var44.dispose();
                     }
                  }
               } else {
                  List$Enumerator var6 = this.k5.iterator();

                  try {
                     while (var6.hasNext()) {
                        byte[] var7 = (byte[])var6.next();
                        var5.n5(var7);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                        var6.dispose();
                     }
                  }
               }

               this.n5(var5, var4, var1, var2, var3);
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      }
   }
}
