package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;

final class w8e {
   private long[] t9;
   private j2x z1;
   private List<r8e> t4;
   private byte[] q0;
   int n5;
   int l6;
   int k5;
   int u3;
   int a6;
   com.aspose.slides.internal.k0r.b2 u9;
   com.aspose.slides.internal.k0r.b2 h0;
   com.aspose.slides.internal.k0r.b2 c8;
   com.aspose.slides.internal.k0r.b2 t2;
   com.aspose.slides.internal.k0r.b2 s7;
   long x8;
   long n3;
   long y4;
   long e2;

   final j2x n5() {
      return this.z1;
   }

   final void n5(j2x var1) {
      this.z1 = var1;
   }

   final List<r8e> l6() {
      return this.t4;
   }

   final void n5(List<r8e> var1) {
      this.t4 = var1;
   }

   final byte[] k5() {
      return this.q0;
   }

   final void n5(byte[] var1) {
      this.q0 = var1;
   }

   w8e(j2x var1, com.aspose.slides.internal.k0r.q5 var2) {
      this.n5(var1);
      com.aspose.slides.internal.k0r.r3 var3 = var2.a6();
      int var4 = 0;
      int var5 = 0;
      this.n5 = 21600;
      this.l6 = 21600;
      com.aspose.slides.internal.k0r.z5 var6 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(322), com.aspose.slides.internal.k0r.z5.class);
      if (var6 != null) {
         this.n5 = (int)var6.j5();
      }

      var6 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(323), com.aspose.slides.internal.k0r.z5.class);
      if (var6 != null) {
         this.l6 = (int)var6.j5();
      }

      var6 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(320), com.aspose.slides.internal.k0r.z5.class);
      if (var6 != null) {
         var4 = (int)var6.j5();
      }

      var6 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(321), com.aspose.slides.internal.k0r.z5.class);
      if (var6 != null) {
         var5 = (int)var6.j5();
      }

      var6 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(339), com.aspose.slides.internal.k0r.z5.class);
      if (var6 != null) {
         this.k5 = (int)var6.j5();
      } else {
         this.k5 = -1;
      }

      var6 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(340), com.aspose.slides.internal.k0r.z5.class);
      if (var6 != null) {
         this.u3 = (int)var6.j5();
      } else {
         this.u3 = -1;
      }

      this.x8 = var4 != 0 ? this.n5(var4) : 0L;
      this.n3 = var5 != 0 ? this.n5(var5) : 0L;
      this.y4 = this.n5(this.n5) - this.x8;
      this.e2 = this.n5(this.l6) - this.n3;
      if (this.k5 > -1 && this.u3 > -1 && this.y4 == this.e2) {
         long var7 = this.y4;
         long var9 = this.e2;
         if (var2.t2() != null) {
            var7 = var2.t2().u3();
            var9 = var2.t2().a6();
         } else if (var2.c8() != null) {
            var7 = var2.c8().u3();
            var9 = var2.c8().a6();
         }

         if (var7 < var9) {
            this.e2 = this.y4 * var9 / var7;
         } else {
            this.y4 = this.e2 * var7 / var9;
         }
      }

      this.a6 = 4;
      var6 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(324), com.aspose.slides.internal.k0r.z5.class);
      if (var6 != null) {
         this.a6 = (int)var6.j5();
      }

      this.u9 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(325), com.aspose.slides.internal.k0r.b2.class);
      this.h0 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(326), com.aspose.slides.internal.k0r.b2.class);
      this.c8 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(342), com.aspose.slides.internal.k0r.b2.class);
      this.t2 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(343), com.aspose.slides.internal.k0r.b2.class);
      this.s7 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(337), com.aspose.slides.internal.k0r.b2.class);
      this.u3();
   }

   w8e(j2x var1, AutoShapeImp var2, com.aspose.slides.internal.k0r.r3 var3) {
      this.n5(var1);
      this.y4 = var2.h0();
      this.e2 = var2.c8();
      boolean var4 = var3 != null;
      if (var4) {
         int var5 = 0;
         int var6 = 0;
         com.aspose.slides.internal.k0r.z5 var7 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(320), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            var5 = (int)var7.j5();
            this.x8 = var5 != 0 ? this.n5(var5) : 0L;
         }

         var7 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(321), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            var6 = (int)var7.j5();
            this.n3 = var6 != 0 ? this.n5(var6) : 0L;
         }

         var7 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(322), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            this.n5 = (int)var7.j5();
            this.y4 = this.n5(this.n5) - this.x8;
         }

         var7 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(323), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            this.l6 = (int)var7.j5();
            this.e2 = this.n5(this.l6) - this.n3;
         }

         var7 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(339), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            this.k5 = (int)var7.j5();
         } else {
            this.k5 = -1;
         }

         var7 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(340), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            this.u3 = (int)var7.j5();
         } else {
            this.u3 = -1;
         }

         if (this.k5 > -1 && this.u3 > -1 && this.y4 == this.e2) {
            if (var2.h0() < var2.c8()) {
               this.e2 = this.y4 * var2.c8() / var2.h0();
            } else {
               this.y4 = this.e2 * var2.h0() / var2.c8();
            }
         }

         this.a6 = 4;
         var7 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(324), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            this.a6 = (int)var7.j5();
         }
      }

      if (var4 && var3.l6().n5(325) != null) {
         this.u9 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(325), com.aspose.slides.internal.k0r.b2.class);
      } else {
         this.u9 = var2.k5();
      }

      this.h0 = var2.l6();
      this.c8 = var2.a6();
      this.t2 = var2.u9();
      if (var4 && var3.l6().n5(337) != null) {
         this.s7 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(337), com.aspose.slides.internal.k0r.b2.class);
      } else {
         this.s7 = var2.u3();
      }

      this.u3();
   }

   private void u3() {
      this.n5().n5(0);
      this.a6();
      this.u9();
      this.h0();
      this.c8();
      this.n5().n5((r8e[])this.l6().toArray(new r8e[0]));
      this.t2();
      this.s7();
      this.x8();
   }

   private void a6() {
      if (this.u9 != null) {
         if ((this.u9.a6() & 65535) != 4 && (this.u9.a6() & 65535) != 8 && (this.u9.a6() & 65535) != 65520) {
            this.t9 = null;
         } else {
            this.t9 = new long[(this.u9.u3() & 65535) * 2];
            if ((this.u9.a6() & 65535) != 4 && (this.u9.a6() & 65535) != 65520) {
               for (int var4 = 0; var4 < (this.u9.u3() & 65535); var4++) {
                  long var5 = this.u9.l6(var4);
                  this.t9[2 * var4] = this.n5((int)(var5 & 4294967295L));
                  this.t9[2 * var4 + 1] = this.n5((int)(var5 >> 32));
               }
            } else {
               for (int var1 = 0; var1 < (this.u9.u3() & 65535); var1++) {
                  long var2 = this.u9.l6(var1) & 4294967295L;
                  this.t9[2 * var1] = this.n5((int)(var2 & 4294967295L & 65535L));
                  this.t9[2 * var1 + 1] = this.n5((int)((var2 & 4294967295L) >> 16));
               }
            }
         }
      }
   }

   private void u9() {
      this.n5(new List<>());
      if (this.c8 != null && (this.c8.u3() & 65535) != 0) {
         int var1 = -1;
         if ((this.c8.a6() & 65535) != 8) {
            throw new PptReadException("Wrong SG structure size in IMsoArray.");
         }

         for (int var2 = 0; var2 < (this.c8.u3() & 65535); var2++) {
            this.l6().addItem(null);
         }

         for (int var16 = 0; var16 < (this.c8.u3() & 65535); var16++) {
            com.aspose.slides.internal.k0r.n1 var3 = new com.aspose.slides.internal.k0r.n1(this.c8.k5(var16));
            int[] var4 = new int[]{var1};
            long var5 = var3.l6() ? this.n5(var3.a6() & 65535, var4) : var3.a6() & 65535;
            var1 = var4[0];
            var4[0] = var1;
            long var7 = var3.k5() ? this.n5(var3.u9() & 65535, var4) : var3.u9() & 65535;
            var1 = var4[0];
            var4[0] = var1;
            long var9 = var3.u3() ? this.n5(var3.h0() & 65535, var4) : var3.h0() & 65535;
            var1 = var4[0];
            String var11 = com.aspose.slides.ms.System.d1.n5(new String[]{"G", com.aspose.slides.ms.System.a3.l6(var16)});
            switch (var3.n5()) {
               case 0:
                  this.l6().set_Item(var16, new r8e(var11, (byte)1, var5, var7, var9));
                  break;
               case 1:
                  if (var9 == 0L) {
                     var9 = 1L;
                  }

                  this.l6().set_Item(var16, new r8e(var11, (byte)0, var5, var7, var9));
                  break;
               case 2:
                  this.l6().set_Item(var16, new r8e(var11, (byte)2, var5, var7, 2L));
                  break;
               case 3:
                  this.l6().set_Item(var16, new r8e(var11, (byte)4, var5, 0L, 0L));
                  break;
               case 4:
                  this.l6().set_Item(var16, new r8e(var11, (byte)9, var5, var7, 0L));
                  break;
               case 5:
                  this.l6().set_Item(var16, new r8e(var11, (byte)8, var5, var7, 0L));
                  break;
               case 6:
                  this.l6().set_Item(var16, new r8e(var11, (byte)3, var5, var7, var9));
                  break;
               case 7:
                  this.l6().set_Item(var16, new r8e(var11, (byte)10, var5, var7, var9));
                  break;
               case 8:
                  this.l6().set_Item(var16, new r8e(var11, (byte)0, this.n5(this.l6(), (byte)5, var5, var7, 0L), 65536L, 60000L));
                  break;
               case 9:
                  this.l6().set_Item(var16, new r8e(var11, (byte)13, var5, this.n5(this.l6(), (byte)0, var7, 60000L, 65536L), 0L));
                  break;
               case 10:
                  this.l6().set_Item(var16, new r8e(var11, (byte)7, var5, this.n5(this.l6(), (byte)0, var7, 60000L, 65536L), 0L));
                  break;
               case 11:
                  this.l6().set_Item(var16, new r8e(var11, (byte)6, var5, var7, var9));
                  break;
               case 12:
                  this.l6().set_Item(var16, new r8e(var11, (byte)12, var5, var7, var9));
                  break;
               case 13:
                  this.l6().set_Item(var16, new r8e(var11, (byte)14, var5, 0L, 0L));
                  break;
               case 14:
                  this.l6()
                     .set_Item(var16, new r8e(var11, (byte)1, var5, this.n5(this.l6(), (byte)0, 65536L, this.n5(this.l6(), (byte)1, var7, 0L, var9), 1L), 0L));
                  break;
               case 15:
                  long var12 = this.n5(this.l6(), (byte)0, var5, 1L, var7);
                  this.l6()
                     .set_Item(
                        var16,
                        new r8e(
                           var11,
                           (byte)0,
                           var9,
                           this.n5(this.l6(), (byte)14, this.n5(this.l6(), (byte)1, 1L, 0L, this.n5(this.l6(), (byte)0, var12, var12, 1L)), 0L, 0L),
                           1L
                        )
                     );
                  break;
               case 16:
                  this.l6().set_Item(var16, new r8e(var11, (byte)15, var5, this.n5(this.l6(), (byte)0, var7, 60000L, 65536L), 0L));
            }
         }

         if (var1 >= 0) {
            this.n5().n5(new y2[var1 + 1]);
         }
      }
   }

   private void h0() {
      if (this.t9 != null) {
         List var1 = new List();
         List var2 = new List(this.t9.length + 16);
         List var3 = new List();
         byte var4 = 1;
         boolean var5 = true;
         boolean var6 = true;
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         boolean var10 = true;
         int var11 = 0;
         if (this.h0 != null && (this.h0.u3() & 65535) != 0) {
            while (var9 < (this.h0.u3() & 65535)) {
               try {
                  com.aspose.slides.internal.k0r.b5 var12 = com.aspose.slides.internal.k0r.b5.n5((int)(this.h0.l6(var9++) & 65535L));
                  if (var8 >= this.t9.length - 1 && (var12.k5() & 255) > 0 && var12.u3() < 3) {
                     var2.clear();
                     var1.clear();
                     break;
                  }

                  switch (var12.u3()) {
                     case 0:
                        if (var3.size() > 1 && (Byte)var3.get_Item(var3.size() - 1) == 4) {
                           break;
                        }

                        if (var10) {
                           var3.addItem((byte)1);
                           this.t9[var8] = this.x8 == 0L ? this.t9[var8] : this.n5(this.l6(), (byte)1, this.t9[var8], 0L, this.x8);
                           this.t9[var8 + 1] = this.n3 == 0L ? this.t9[var8 + 1] : this.n5(this.l6(), (byte)1, this.t9[var8 + 1], 0L, this.n3);
                           this.n5(var2, this.t9, var8, 2);
                           var8 += 2;
                           var10 = false;
                        }

                        this.n5((byte)2, var3, var2, this.t9, var12.k5() & 255, var8, 2, false);
                        var8 += (var12.k5() & 255) * 2;
                        break;
                     case 1:
                        if (var10) {
                           var3.addItem((byte)1);
                           this.t9[var8] = this.x8 == 0L ? this.t9[var8] : this.n5(this.l6(), (byte)1, this.t9[var8], 0L, this.x8);
                           this.t9[var8 + 1] = this.n3 == 0L ? this.t9[var8 + 1] : this.n5(this.l6(), (byte)1, this.t9[var8 + 1], 0L, this.n3);
                           this.n5(var2, this.t9, var8, 2);
                           var8 += 2;
                           var10 = false;
                        }

                        this.n5((byte)5, var3, var2, this.t9, var12.k5() & 255, var8, 6, false);
                        var8 += (var12.k5() & 255) * 6;
                        break;
                     case 2:
                        var3.addItem((byte)1);
                        this.t9[var8] = this.x8 == 0L ? this.t9[var8] : this.n5(this.l6(), (byte)1, this.t9[var8], 0L, this.x8);
                        this.t9[var8 + 1] = this.n3 == 0L ? this.t9[var8 + 1] : this.n5(this.l6(), (byte)1, this.t9[var8 + 1], 0L, this.n3);
                        this.n5(var2, this.t9, var8, 2);
                        var8 += 2;
                        var10 = false;
                        break;
                     case 3:
                        if (var8 < this.t9.length - 2 && (var9 == (this.h0.u3() & 65535) - 1 || (int)(this.h0.l6(var9 + 1) >> 13) == 4)) {
                           while (var8 < this.t9.length - 1) {
                              this.n5((byte)2, var3, var2, this.t9, 1, var8, 2, false);
                              var8 += 2;
                           }
                        }

                        var3.addItem((byte)0);
                        break;
                     case 4:
                        if (var3.size() > 0 && var2.size() > 0) {
                           var1.addItem(new q7g(com.aspose.slides.internal.n8e.v4.l6(var3), var2, 0, var2.size(), this.y4, this.e2, var4, var5, var6));
                        }

                        var4 = 1;
                        var5 = true;
                        var6 = true;
                        var3.clear();
                        var2.clear();
                        var7 = var2.size();
                        var10 = true;
                        break;
                     case 5:
                     case 6:
                        com.aspose.slides.internal.k0r.k8 var13 = (com.aspose.slides.internal.k0r.k8)var12;
                        switch (var13.n5()) {
                           case 1:
                           case 2:
                              if ((var13.k5() & 255) != 0 && (var13.k5() & 255) % 3 == 0) {
                                 for (int var63 = var13.k5() & 255; var63 > 0; var63 -= 3) {
                                    long var67 = this.x8 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.x8);
                                    long var71 = this.n3 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.n3);
                                    long var76 = this.x8 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.x8);
                                    long var81 = this.n3 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.n3);
                                    long var85 = this.t9[var8++];
                                    long var89 = this.t9[var8++];
                                    if (var10) {
                                       var3.addItem((byte)1);
                                       var10 = false;
                                    } else {
                                       var3.addItem((byte)2);
                                    }

                                    var2.addItem(var67);
                                    var2.addItem(var71);
                                    var3.addItem((byte)3);
                                    var2.addItem(var76);
                                    var2.addItem(var81);
                                    var2.addItem(com.aspose.slides.internal.v6g.k5.u9((Math.PI / 180.0) * var85, 14));
                                    var2.addItem(com.aspose.slides.internal.v6g.k5.u9((Math.PI / 180.0) * var89, 14));
                                 }
                              }
                              break;
                           case 3:
                           case 4:
                           case 5:
                           case 6:
                              if ((var13.k5() & 255) == 2) {
                                 long var66 = this.x8 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.x8);
                                 long var70 = this.n3 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.n3);
                                 long var75 = this.x8 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.x8);
                                 long var80 = this.n3 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.n3);
                                 var3.addItem((byte)1);
                                 var2.addItem(var75);
                                 var2.addItem(this.n5(this.l6(), (byte)2, var70, var80, 2L));
                                 var3.addItem((byte)3);
                                 long var84 = this.n5(this.l6(), (byte)1, var75, 0L, var66);
                                 long var88 = this.n5(this.l6(), (byte)1, var75, 0L, var66);
                                 var2.addItem(this.n5(this.l6(), (byte)0, var84, 1L, 2L));
                                 var2.addItem(this.n5(this.l6(), (byte)0, var88, 1L, 2L));
                                 var2.addItem(0L);
                                 var2.addItem(21600000L);
                                 break;
                              }

                              if ((var13.k5() & 255) % 4 != 0) {
                                 throw new Exception("Invalid data autoshape segment" + var13);
                              }

                              var11 = var13.k5() & 255;

                              for (; var11 > 0; var11 -= 4) {
                                 long var65 = this.x8 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.x8);
                                 long var69 = this.n3 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.n3);
                                 long var74 = this.x8 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.x8);
                                 long var79 = this.n3 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.n3);
                                 long var83 = this.x8 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.x8);
                                 long var87 = this.n3 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.n3);
                                 long var90 = this.x8 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.x8);
                                 long var91 = this.n3 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.n3);
                                 if (var10) {
                                    var3.addItem((byte)1);
                                    var10 = false;
                                 } else {
                                    var3.addItem((byte)2);
                                 }

                                 var2.addItem(var83);
                                 var2.addItem(var87);
                                 var3.addItem((byte)3);
                                 long var92 = this.n5(this.l6(), (byte)1, var74, 0L, var65);
                                 long var93 = this.n5(this.l6(), (byte)1, var79, 0L, var69);
                                 var2.addItem(this.n5(this.l6(), (byte)0, var92, 1L, 2L));
                                 var2.addItem(this.n5(this.l6(), (byte)0, var93, 1L, 2L));
                                 long var94 = this.n5(this.l6(), (byte)2, var65, var74, 2L);
                                 long var36 = this.n5(this.l6(), (byte)2, var69, var79, 2L);
                                 long var38 = this.n5(this.l6(), (byte)1, var83, 0L, var94);
                                 long var40 = this.n5(this.l6(), (byte)1, var87, 0L, var36);
                                 long var42 = this.n5(this.l6(), (byte)1, var90, 0L, var94);
                                 long var44 = this.n5(this.l6(), (byte)1, var91, 0L, var36);
                                 long var46 = this.n5(this.l6(), (byte)5, var38, var40, 0L);
                                 long var48 = this.n5(this.l6(), (byte)5, var42, var44, 0L);
                                 var2.addItem(var46);
                                 long var50 = this.n5(this.l6(), (byte)1, var48, 0L, var46);
                                 if (var50 == 0L) {
                                    long var52 = var50;
                                    var2.addItem(var52);
                                 } else if (var13.n5() != 5 && var13.n5() != 6) {
                                    long var96 = this.n5(this.l6(), (byte)3, var50, this.n5(this.l6(), (byte)1, var50, 0L, 21600000L), var50);
                                    var2.addItem(var96);
                                 } else {
                                    long var95 = this.n5(this.l6(), (byte)3, var50, var50, this.n5(this.l6(), (byte)1, var50, 21600000L, 0L));
                                    var2.addItem(var95);
                                 }
                              }
                              break;
                           case 7:
                           case 8:
                           default:
                              if ((var13.k5() & 255) == 0) {
                                 break;
                              }

                              if (var10) {
                                 var3.addItem((byte)1);
                                 this.n5(var2, this.t9, var8, 2);
                                 var8 += 2;
                                 var10 = false;
                              }

                              long var64 = this.t9[var8 - 2];
                              long var68 = this.t9[var8 - 1];
                              long var72 = this.t9[var8];
                              long var77 = this.t9[var8 + 1];
                              long var22 = this.n5(this.l6(), (byte)1, var72, 0L, var64);
                              long var24 = this.n5(this.l6(), (byte)1, var77, 0L, var68);
                              long var26 = var13.n5() != 7 ? 1L : -1L;
                              long var28 = this.n5(this.l6(), (byte)3, this.n5(this.l6(), (byte)0, var22, var24, 1L), var26, -var26);
                              var11 = var13.k5() & 255;

                              while (var11-- > 0) {
                                 var72 = this.t9[var8++];
                                 var77 = this.t9[var8++];
                                 var22 = this.n5(this.l6(), (byte)1, var72, 0L, var64);
                                 var24 = this.n5(this.l6(), (byte)1, var77, 0L, var68);
                                 long var30 = this.n5(this.l6(), (byte)0, var22, var24, var28);
                                 long var32 = this.n5(this.l6(), (byte)0, var22, 1L, 2L);
                                 long var34 = this.n5(this.l6(), (byte)0, var24, 1L, 2L);
                                 var3.addItem((byte)5);
                                 var2.addItem(this.n5(this.l6(), (byte)3, var30, var64, this.n5(this.l6(), (byte)1, var64, var32, 0L)));
                                 var2.addItem(this.n5(this.l6(), (byte)3, var30, this.n5(this.l6(), (byte)1, var68, var34, 0L), var68));
                                 var2.addItem(this.n5(this.l6(), (byte)3, var30, this.n5(this.l6(), (byte)1, var72, 0L, var32), var72));
                                 var2.addItem(this.n5(this.l6(), (byte)3, var30, var77, this.n5(this.l6(), (byte)1, var77, 0L, var34)));
                                 var2.addItem(var72);
                                 var2.addItem(var77);
                              }
                              break;
                           case 9:
                              if ((var13.k5() & 255) == 0) {
                                 break;
                              }

                              var11 = var13.k5() & 255;

                              while (var11-- > 0) {
                                 long var14 = this.x8 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.x8);
                                 long var16 = this.n3 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.n3);
                                 long var18 = this.x8 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.x8);
                                 long var20 = this.n3 == 0L ? this.t9[var8++] : this.n5(this.l6(), (byte)1, this.t9[var8++], 0L, this.n3);
                                 var3.addItem((byte)4);
                                 var2.addItem(var14);
                                 var2.addItem(var16);
                                 var2.addItem(var18);
                                 var2.addItem(var20);
                              }
                              break;
                           case 10:
                              var4 = 0;
                              break;
                           case 11:
                              var5 = false;
                        }
                  }
               } catch (RuntimeException var54) {
                  com.aspose.slides.internal.n8e.v4.n5(var54);
               }
            }
         } else {
            if (this.t9.length < 4) {
               return;
            }

            var3.addItem((byte)1);
            var2.addItem(this.x8 == 0L ? this.t9[var8] : this.n5(this.l6(), (byte)1, this.t9[var8], 0L, this.x8));
            var2.addItem(this.n3 == 0L ? this.t9[var8 + 1] : this.n5(this.l6(), (byte)1, this.t9[var8 + 1], 0L, this.n3));
            var8 += 2;
            switch (this.a6) {
               case 0:
                  var11 = (this.t9.length - var8) / 2;
                  this.n5((byte)2, var3, var2, this.t9, var11, var8, 2, false);
                  break;
               case 1:
                  var11 = (this.t9.length - var8) / 2;
                  this.n5((byte)2, var3, var2, this.t9, var11, var8, 2, true);
                  break;
               case 2:
                  var11 = (this.t9.length - var8) / 6;
                  this.n5((byte)5, var3, var2, this.t9, var11, var8, 6, false);
                  break;
               case 3:
                  var11 = (this.t9.length - var8) / 6;
                  this.n5((byte)5, var3, var2, this.t9, var11, var8, 6, true);
                  break;
               default:
                  var3.setCapacity(this.t9.length / 2);
            }

            if (this.a6 != 4) {
               var1.addItem(new q7g(com.aspose.slides.internal.n8e.v4.l6(var3), var2, 0, var2.size(), this.y4, this.e2, var4, var5, var6));
               var3.clear();
               var2.clear();
               var7 = var2.size();
            }
         }

         if (var7 < var2.size()) {
            var1.addItem(new q7g(com.aspose.slides.internal.n8e.v4.l6(var3), var2, 0, var2.size(), this.y4, this.e2, var4, var5, var6));
         }

         this.n5().n5((q7g[])var1.toArray(new q7g[0]));
      }
   }

   private void c8() {
      this.n5(new byte[this.l6().size() + 11]);
      int var1 = 0;
      int var2 = -1;

      for (int var3 = 0; var3 < 11; var3++) {
         this.k5()[var3] = 16;
      }

      byte[] var10000 = this.k5();
      var10000[7] = (byte)(var10000[7] | 1);
      var10000 = this.k5();
      var10000[8] = (byte)(var10000[8] | 4);
      var10000 = this.k5();
      var10000[9] = (byte)(var10000[9] | 2);
      var10000 = this.k5();
      var10000[10] = (byte)(var10000[10] | 8);
      int var12 = 10;

      while (var12 > 0 && var1 < this.k5().length) {
         var2 = var1;
         var1 = this.k5().length;
         var12 = 0;

         for (int var4 = com.aspose.slides.ms.System.q1.n5(var2, 11); var4 < this.k5().length; var4++) {
            if ((this.k5()[var4] & 16) != 16) {
               r8e var5 = this.l6().get_Item(var4 - 11);
               byte var6 = this.n5(this.k5(), var5.k5());
               byte var7 = this.n5(this.k5(), var5.u3());
               byte var8 = this.n5(this.k5(), var5.a6());
               if ((var6 & 16) == 16 && (var7 & 16) == 16 && (var8 & 16) == 16) {
                  this.k5()[var4] = (byte)(var6 | var7 | var8);
                  var12++;
                  var5.n5(this.n5(this.l6(), var5.k5(), this.y4, this.e2));
                  var5.l6(this.n5(this.l6(), var5.u3(), this.y4, this.e2));
                  var5.k5(this.n5(this.l6(), var5.a6(), this.y4, this.e2));
               } else if (var4 < var1) {
                  var1 = var4;
               }
            }
         }
      }

      byte var9 = 15;
      q7g[] var11 = this.n5().u9();
      if (var11 != null) {
         for (int var13 = 0; var13 < var11.length; var13++) {
            long[] var14 = var11[var13].n5();
            boolean var15 = var11[var13].l6() < -27273042329600L || var11[var13].k5() < -27273042329600L;
            if (!var15) {
               for (int var16 = 0; var16 < var14.length; var16++) {
                  if (var14[var16] < -27273042329600L) {
                     int var17 = (int)(-27273042329600L - var14[var16] - 1L);
                     if (var17 < this.k5().length && (this.k5()[var17] & var9) != 0) {
                        var15 = true;
                        break;
                     }
                  }
               }
            }

            if (var15 && (this.k5 <= -1 || this.u3 <= -1 || this.y4 == this.e2)) {
               var11[var13].n5(this.l6(), this.k5());
            }
         }
      }
   }

   private void t2() {
      if (this.t2 != null && (this.t2.u3() & 65535) != 0) {
         if ((this.t2.a6() & 65535) != 8 && (this.t2.a6() & 65535) != 16) {
            throw new PptReadException("Wront element size in IMsoArray p_Inscape_complex property.");
         }

         this.n5().n5(new y1[this.t2.u3()]);
         this.n5().l6(new y1[this.t2.u3()]);
         a6m var1 = new a6m(this.y4, this.e2);
         List var2 = new List<>(com.aspose.slides.ms.System.u3.n5(this.n5().a6()));

         for (int var3 = 0; var3 < (this.t2.u3() & 65535); var3++) {
            byte[] var4 = this.t2.k5(var3);
            int var5;
            int var6;
            int var7;
            int var8;
            if ((this.t2.a6() & 65535) == 8) {
               var5 = com.aspose.slides.internal.n8e.y2.n5(var4, 0);
               var6 = com.aspose.slides.internal.n8e.y2.n5(var4, 2);
               var7 = com.aspose.slides.internal.n8e.y2.n5(var4, 4);
               var8 = com.aspose.slides.internal.n8e.y2.n5(var4, 6);
            } else {
               var5 = com.aspose.slides.internal.n8e.y2.k5(var4, 0);
               var6 = com.aspose.slides.internal.n8e.y2.k5(var4, 4);
               var7 = com.aspose.slides.internal.n8e.y2.k5(var4, 8);
               var8 = com.aspose.slides.internal.n8e.y2.k5(var4, 12);
            }

            long var9 = var1.n5(var2, this.n5(var5), this.k5());
            long var11 = var1.l6(var2, this.n5(var6), this.k5());
            if (this.n5().h0() != null) {
               this.n5().h0()[var3] = new y1(var9, var11);
            }

            var9 = var1.n5(var2, this.n5(var7), this.k5());
            var11 = var1.l6(var2, this.n5(var8), this.k5());
            if (this.n5().c8() != null) {
               this.n5().c8()[var3] = new y1(var9, var11);
            }

            this.n5().n5((r8e[])var2.toArray(new r8e[0]));
         }
      }
   }

   private void s7() {
      if (this.s7 != null) {
         if ((this.s7.a6() & 65535) != 4 && (this.s7.a6() & 65535) != 8 && (this.s7.a6() & 65535) != 65520) {
            this.n5().n5(new i4w[0]);
         } else {
            y1[] var1 = new y1[this.s7.u3()];
            if ((this.s7.a6() & 65535) != 4 && (this.s7.a6() & 65535) != 65520) {
               for (int var9 = 0; var9 < (this.s7.u3() & 65535); var9++) {
                  long var12 = this.s7.l6(var9);
                  var1[var9] = new y1(this.n5((int)(var12 & 4294967295L)), this.n5((int)(var12 >> 32)));
               }
            } else {
               for (int var2 = 0; var2 < (this.s7.u3() & 65535); var2++) {
                  long var3 = this.s7.l6(var2) & 4294967295L;
                  var1[var2] = new y1(this.n5((short)(var3 & 4294967295L & 65535L)), this.n5((short)((var3 & 4294967295L) >> 16)));
               }
            }

            if (this.l6().size() == 0) {
               List var10 = new List();

               for (y1 var8 : var1) {
                  if (var8.n5() > -27273042329612L && var8.l6() > -27273042329612L) {
                     var10.addItem(var8);
                  }
               }

               var1 = (y1[])var10.toArray(new y1[0]);
            }

            this.n5().n5(new i4w[var1.length]);

            for (int var11 = 0; var11 < var1.length; var11++) {
               this.n5().k5()[var11] = new i4w(var1[var11].n5(), var1[var11].l6(), 0L);
            }
         }
      }
   }

   private long n5(int var1) {
      if (var1 < -2147479552) {
         int var2 = var1 & 2147483647;
         return -27273042329600L - var2 - 11L - 1L;
      } else {
         return var1;
      }
   }

   private long n5(int var1, int[] var2) {
      if (var1 >= 1024 && var1 <= 1151) {
         int var5 = var1 - 1024;
         return -27273042329600L - var5 - 11L - 1L;
      }

      if (var1 >= 327 && var1 <= 334) {
         int var4 = var1 - 327;
         if (var4 > var2[0]) {
            var2[0] = var4;
         }

         return var4 + 27273042316900L + 1L;
      } else if (var1 >= 320 && var1 <= 323) {
         int var3 = var1 - 320 + 7;
         return -27273042329600L - var3 - 1L;
      } else {
         return var1;
      }
   }

   private void x8() {
      byte[] var1 = new byte[this.n5().a6().length + 11];
      int[] var2 = new int[this.n5().a6().length + 11];
      r8e[] var3 = new r8e[this.n5().a6().length];
      int var4 = 0;
      int var5 = 0;
      int var6 = -1;

      for (int var7 = 0; var7 < 11; var2[var7] = var7++) {
         var1[var7] = 16;
      }

      int var15 = 10;
      int var8 = 0;

      while (var15 > 0 && var5 < var1.length) {
         var8++;
         var6 = var5;
         var5 = var1.length;
         var15 = 0;

         for (int var9 = com.aspose.slides.ms.System.q1.n5(var6, 11); var9 < var1.length; var9++) {
            if ((var1[var9] & 16) != 16) {
               r8e var10 = this.n5().a6()[var9 - 11];
               byte var11 = this.n5(var1, var10.k5());
               byte var12 = this.n5(var1, var10.u3());
               byte var13 = this.n5(var1, var10.a6());
               if ((var11 & 16) == 16 && (var12 & 16) == 16 && (var13 & 16) == 16) {
                  var1[var9] = (byte)(var11 | var12 | var13);
                  var2[var9] = var4 + 11;
                  var3[var4++] = var10;
                  var15++;
               } else if (var9 < var5) {
                  var5 = var9;
               }
            }
         }
      }

      if (var4 < var3.length) {
         for (int var16 = 11; var16 < var1.length; var16++) {
            if ((var1[var16] & 16) != 16) {
               r8e var23 = this.n5().a6()[var16 - 11];
               var2[var16] = var4 + 11;
               var3[var4++] = var23;
            }
         }
      }

      if (var8 != 1) {
         this.n5().n5(var3);

         for (int var17 = 0; var17 < this.n5().a6().length; var17++) {
            r8e var24 = this.n5().a6()[var17];
            var24.n5(this.n5(var2, var24.k5()));
            var24.l6(this.n5(var2, var24.u3()));
            var24.k5(this.n5(var2, var24.a6()));
         }

         for (int var18 = 0; var18 < this.n5().u9().length; var18++) {
            long[] var25 = this.n5().u9()[var18].n5();

            for (int var26 = 0; var26 < var25.length; var26++) {
               var25[var26] = this.n5(var2, var25[var26]);
            }
         }

         if (this.n5().h0() != null) {
            for (int var19 = 0; var19 < this.n5().h0().length; var19++) {
               this.n5().h0()[var19].n5(this.n5(var2, this.n5().h0()[var19].n5()));
               this.n5().h0()[var19].l6(this.n5(var2, this.n5().h0()[var19].l6()));
            }
         }

         if (this.n5().c8() != null) {
            for (int var20 = 0; var20 < this.n5().c8().length; var20++) {
               this.n5().c8()[var20].n5(this.n5(var2, this.n5().c8()[var20].n5()));
               this.n5().c8()[var20].l6(this.n5(var2, this.n5().c8()[var20].l6()));
            }
         }

         if (this.n5().k5() != null) {
            for (int var21 = 0; var21 < this.n5().k5().length; var21++) {
               this.n5().k5()[var21].n5().n5(this.n5(var2, this.n5().k5()[var21].n5().n5()));
               this.n5().k5()[var21].n5().l6(this.n5(var2, this.n5().k5()[var21].n5().l6()));
               this.n5().k5()[var21].n5(this.n5(var2, this.n5().k5()[var21].l6()));
            }
         }

         if (this.n5().u3() != null) {
            for (int var22 = 0; var22 < this.n5().u3().length; var22++) {
               this.n5().u3()[var22].c8.n5(this.n5(var2, this.n5().u3()[var22].c8.n5()));
               this.n5().u3()[var22].c8.l6(this.n5(var2, this.n5().u3()[var22].c8.l6()));
               this.n5().u3()[var22].l6 = this.n5(var2, this.n5().u3()[var22].l6);
               this.n5().u3()[var22].a6 = this.n5(var2, this.n5().u3()[var22].a6);
               this.n5().u3()[var22].k5 = this.n5(var2, this.n5().u3()[var22].k5);
               this.n5().u3()[var22].u9 = this.n5(var2, this.n5().u3()[var22].u9);
               this.n5().u3()[var22].u3 = this.n5(var2, this.n5().u3()[var22].u3);
               this.n5().u3()[var22].h0 = this.n5(var2, this.n5().u3()[var22].h0);
            }
         }
      }
   }

   private long n5(List<r8e> var1, long var2, long var4, long var6) {
      long var8 = -27273042329608L;
      long var10 = -27273042329609L;
      long var12 = -27273042329610L;
      long var14 = -27273042329611L;
      if (var2 >= -27273042329611L && var2 <= -27273042329608L) {
         if (var2 == -27273042329608L || var2 == -27273042329609L) {
            var2 = 0L;
         } else if (var2 == -27273042329610L) {
            var2 = var4;
         } else if (var2 == -27273042329611L) {
            var2 = var6;
         }
      }

      if (var2 > 27273042316900L) {
         var2 = this.n5(var1, (byte)0, var2, 21600L, 100000L);
      }

      return var2;
   }

   private byte n5(byte[] var1, long var2) {
      if (var2 > 27273042316900L) {
         return 16;
      } else if (var2 < -27273042329600L) {
         int var4 = (int)(-27273042329600L - var2 - 1L);
         return var1[var4];
      } else {
         return 16;
      }
   }

   private long n5(int[] var1, long var2) {
      if (var2 < -27273042329600L) {
         int var4 = (int)(-27273042329601L - var2);
         var4 = var1[var4];
         return -27273042329601L - var4;
      } else {
         return var2;
      }
   }

   private long n5(List<r8e> var1, byte var2, long var3, long var5, long var7) {
      return u3k.n5(var1, var2, var3, var5, var7);
   }

   private void n5(List<Long> var1, long[] var2, int var3, int var4) {
      int var5 = var3 + var4;

      while (var3 < var5) {
         var1.addItem(var2[var3++]);
      }
   }

   private void n5(byte var1, List<Byte> var2, List<Long> var3, long[] var4, int var5, int var6, int var7, boolean var8) {
      for (int var9 = 0; var9 < var5; var9++) {
         var2.addItem(var1);
         if (this.x8 != 0L || this.n3 != 0L) {
            for (byte var10 = 0; var10 < var7; var10 += 2) {
               var4[var6 + var7 * var9 + var10] = this.n5(this.l6(), (byte)1, var4[var6 + var7 * var9 + var10], 0L, this.x8);
               var4[var6 + var7 * var9 + 1 + var10] = this.n5(this.l6(), (byte)1, var4[var6 + var7 * var9 + 1 + var10], 0L, this.n3);
            }
         }
      }

      this.n5(var3, var4, var6, var5 * var7);
      if (var8) {
         var2.addItem((byte)0);
      }
   }
}
