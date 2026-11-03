package com.aspose.slides.internal.b8n;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.t9;
import com.aspose.slides.internal.b5j.x8;
import com.aspose.slides.internal.b5j.y4;
import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.m3;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.y2;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.z3;

public class u3 {
   private n3 n5;
   private x8 l6;
   private l6 k5;
   private final t9 u3;
   private final n5 a6;
   private final Dictionary<Integer, Float> u9 = new Dictionary<>();
   private k5 h0;
   private t2 c8;
   private Dictionary<Integer, Float> t2 = new Dictionary<>();
   private final List<Integer> s7 = new List<>(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5(new int[]{9, 10, 11, 12, 13, 14, 15, 16})));
   private final List<Integer> x8 = new List<>(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5(new int[]{0, 1})));
   private final List<Integer> n3 = new List<>(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5(new int[]{10, 18, 6, 4, 1, 14, 12, 16, 8})));
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "x1", "y1", "x2", "y2", "circle", "ellipse", "path", "polygon", "rect", "polyline"
   );

   public final l6 n5() {
      return this.k5;
   }

   public final t2 l6() {
      return this.c8;
   }

   public u3(t2 var1, x8 var2, n3 var3, com.aspose.slides.internal.b5j.u9 var4, n5 var5) {
      this.c8 = var1;
      this.n5 = var3;
      this.l6 = var2;
      this.k5 = new l6(var3, var5);
      this.a6 = var5;
      this.u3 = var5.n5();
      this.h0 = new k5(this, this.l6, this.n5, this.u3, var4, this.a6);
   }

   public final r4 n5(com.aspose.slides.internal.d0e.t2 var1, f2 var2) {
      r4 var3 = new r4();
      List var4 = ((com.aspose.slides.internal.z9u.l6)var1).l6(this.n5, var2.a6());
      if (var4 != null && var4.size() != 0) {
         this.t2.clear();
         float var5 = 0.0F;
         float var6 = 0.0F;
         int var7 = 0;
         c4 var8 = new c4();
         var3.n5(var8);

         for (int var9 = 0; var9 < var4.size(); var9++) {
            this.u9.clear();
            com.aspose.slides.internal.b5j.c8 var10 = null;

            try {
               com.aspose.slides.internal.b5j.c8 var11 = (com.aspose.slides.internal.b5j.c8)var4.get_Item(var9);
               com.aspose.slides.internal.b5j.c8 var12 = null;
               if (var9 < var4.size() - 1) {
                  var12 = (com.aspose.slides.internal.b5j.c8)var4.get_Item(var9 + 1);
               }

               if (var9 > 0) {
                  var10 = (com.aspose.slides.internal.b5j.c8)var4.get_Item(var9 - 1);
               }

               if (var11.n5 != 0 && var11.n5 != 1) {
                  if (var11.n5 == 3) {
                     if (var10 != null && this.t2.size() == 0) {
                        this.t2.addItem(this.t2.size(), var5);
                        this.t2.addItem(this.t2.size(), var6);
                     }

                     for (int var25 = 0; var25 < var11.l6.size(); var25++) {
                        this.t2.addItem(this.t2.size(), var11.l6.get_Item(var25));
                        var11.k5.addItem(this.t2.size() - 1, this.t2.get_Item(this.t2.size() - 1));
                     }

                     var5 = this.t2.get_Item(this.t2.size() - 2);
                     var6 = this.t2.get_Item(this.t2.size() - 1);
                  } else if (var11.n5 == 4) {
                     float var24 = var5;
                     float var30 = var6;
                     if (var10 != null && this.t2.size() == 0) {
                        this.t2.addItem(this.t2.size(), var5);
                        this.t2.addItem(this.t2.size(), var6);
                     }

                     for (int var33 = 0; var33 < var11.l6.size(); var33 += 2) {
                        this.t2.addItem(this.t2.size(), var24 + var11.l6.get_Item(var33));
                        var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                        this.t2.addItem(this.t2.size(), var30 + var11.l6.get_Item(var33 + 1));
                        var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                        var24 = this.t2.get_Item(this.t2.size() - 2);
                        var30 = this.t2.get_Item(this.t2.size() - 1);
                     }

                     var5 = this.t2.get_Item(this.t2.size() - 2);
                     var6 = this.t2.get_Item(this.t2.size() - 1);
                  } else if (var11.n5 == 5) {
                     if (var10 != null && this.t2.size() == 0) {
                        this.t2.addItem(this.t2.size(), var5);
                        this.t2.addItem(this.t2.size(), var6);
                     }

                     for (int var23 = 0; var23 < var11.l6.size(); var23++) {
                        this.t2.addItem(this.t2.size(), var11.l6.get_Item(var23));
                        var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                        this.t2.addItem(this.t2.size(), var6);
                        var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                     }

                     var5 = this.t2.get_Item(this.t2.size() - 2);
                     var6 = this.t2.get_Item(this.t2.size() - 1);
                  } else if (var11.n5 == 6) {
                     if (var10 != null) {
                        float var22 = var6;
                        float var28 = var5;
                        this.t2.addItem(this.t2.size(), var28);
                        this.t2.addItem(this.t2.size(), var22);

                        for (int var32 = 0; var32 < var11.l6.size(); var32++) {
                           var28 += var11.l6.get_Item(var32);
                           this.t2.addItem(this.t2.size(), var28);
                           var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                           this.t2.addItem(this.t2.size(), var22);
                           var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                           var28 = this.t2.get_Item(this.t2.size() - 2);
                           var22 = this.t2.get_Item(this.t2.size() - 1);
                        }

                        var5 = this.t2.get_Item(this.t2.size() - 2);
                        var6 = this.t2.get_Item(this.t2.size() - 1);
                     }
                  } else if (var11.n5 == 7) {
                     if (var10 != null) {
                        this.t2.addItem(this.t2.size(), var5);
                        this.t2.addItem(this.t2.size(), var6);

                        for (int var21 = 0; var21 < var11.l6.size(); var21++) {
                           this.t2.addItem(this.t2.size(), var5);
                           var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                           this.t2.addItem(this.t2.size(), var11.l6.get_Item(var21));
                           var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                        }

                        var5 = this.t2.get_Item(this.t2.size() - 2);
                        var6 = this.t2.get_Item(this.t2.size() - 1);
                     }
                  } else if (var11.n5 == 8) {
                     if (var10 != null) {
                        float var19 = var6;
                        float var27 = var5;
                        this.t2.addItem(this.t2.size(), var27);
                        this.t2.addItem(this.t2.size(), var19);

                        for (int var31 = 0; var31 < var11.l6.size(); var31++) {
                           var19 += var11.l6.get_Item(var31);
                           this.t2.addItem(this.t2.size(), var27);
                           var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                           this.t2.addItem(this.t2.size(), var19);
                           var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                           var27 = this.t2.get_Item(this.t2.size() - 2);
                           var19 = this.t2.get_Item(this.t2.size() - 1);
                        }

                        var5 = this.t2.get_Item(this.t2.size() - 2);
                        var6 = this.t2.get_Item(this.t2.size() - 1);
                     }
                  } else if (var11.n5 != 17 && var11.n5 != 18) {
                     if (this.s7.containsItem(var11.n5)) {
                        if (this.t2.size() > 3) {
                           var8.n5(this.k5.n5(var1, this.t2, false));
                        }

                        com.aspose.slides.internal.b5j.c8[] var18 = new com.aspose.slides.internal.b5j.c8[]{var11};
                        com.aspose.slides.internal.e1.a6 var26 = this.k5.n5(var1, var18, var10, true, var5, var6);
                        var11 = var18[0];
                        var8.n5(var26);
                        if (var12 != null && this.x8.containsItem(var12.n5)) {
                           var11 = new com.aspose.slides.internal.b5j.c8(2);
                        }

                        this.t2 = new Dictionary<>();
                        var5 = var26.n5().u3().l6();
                        var6 = var26.n5().u3().k5();
                     }
                  } else {
                     if (this.t2.size() > 3) {
                        var8.n5(this.k5.n5(var1, this.t2, false));
                     }

                     for (int var17 = 0; var17 < var11.l6.size(); var17 += 7) {
                        float var14 = 0.0F;
                        float var15 = 0.0F;
                        if (var11.n5 == 18) {
                           var14 = var5;
                           var15 = var6;
                        }

                        com.aspose.slides.internal.b8n.l6.n5(
                           new w1(var5, var6),
                           new w1(var11.l6.get_Item(var17 + 5) + var14, var11.l6.get_Item(var17 + 6) + var15),
                           new f2(var11.l6.get_Item(var17 + 0), var11.l6.get_Item(var17 + 1)),
                           var11.l6.get_Item(var17 + 2),
                           var11.l6.get_Item(var17 + 3) != 0.0F,
                           var11.l6.get_Item(var17 + 4) != 0.0F,
                           var8
                        );
                        var5 = var11.l6.get_Item(var17 + 5) + var14;
                        var6 = var11.l6.get_Item(var17 + 6) + var15;
                     }

                     this.t2 = new Dictionary<>();
                  }
               } else {
                  if (this.t2.size() > 3) {
                     var8.n5(this.k5.n5(var1, this.t2, false));
                     var8.n5(true);
                     this.t2 = new Dictionary<>();
                     var8 = new c4();
                     var3.n5(var8);
                  }

                  if (var11.n5 == 0) {
                     var5 = 0.0F;
                     var6 = 0.0F;
                  }

                  for (int var13 = 0; var13 < var11.l6.size(); var13 += 2) {
                     this.t2.addItem(this.t2.size(), var5 + var11.l6.get_Item(var13));
                     var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                     this.t2.addItem(this.t2.size(), var6 + var11.l6.get_Item(var13 + 1));
                     var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                  }

                  var5 = this.t2.get_Item(this.t2.size() - 2);
                  var6 = this.t2.get_Item(this.t2.size() - 1);
               }

               if (var11.n5 == 2) {
                  this.t2.addItem(this.t2.size(), var5);
                  this.t2.addItem(this.t2.size(), var6);
                  this.t2.addItem(this.t2.size(), ((com.aspose.slides.internal.b5j.c8)var4.get_Item(var7)).k5.get_Item(0));
                  var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                  this.t2.addItem(this.t2.size(), ((com.aspose.slides.internal.b5j.c8)var4.get_Item(var7)).k5.get_Item(1));
                  var11.k5.addItem(var11.k5.size(), this.t2.get_Item(this.t2.size() - 1));
                  if (this.t2.size() > 3) {
                     var8.n5(this.k5.n5(var1, this.t2, false));
                     var8.n5(true);
                     var8 = new c4();
                     var3.n5(var8);
                  }

                  var5 = this.t2.get_Item(this.t2.size() - 2);
                  var6 = this.t2.get_Item(this.t2.size() - 1);
                  this.t2 = new Dictionary<>();
                  if (var9 < var4.size() - 1) {
                     var7 = var9 + 1;
                  }
               }
            } catch (RuntimeException var16) {
               if (!com.aspose.slides.internal.n1n.n5.n5) {
                  throw var16;
               }
            }
         }

         if (this.t2.size() > 3) {
            var8.n5(this.k5.n5(var1, this.t2, false));
         }

         if (var1.l6.n5("transform")) {
            this.a6.n5(var1, var3, var2.a6());
         }

         return var3;
      } else {
         return var3;
      }
   }

   public final void n5(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.e1.t2 var2, f2 var3) {
      try {
         String var4 = d1.n5;
         if (var1.l6.n5("x") || var1.l6.n5("y")) {
            float var5 = 0.0F;
            float var6 = 0.0F;
            if (var1.l6.n5("x")) {
               var5 = this.n5.n5(var1.l6.k5("x").toString(), "x", var1);
            }

            if (var1.l6.n5("y")) {
               var6 = this.n5.n5(var1.l6.k5("y").toString(), "y", var1);
            }

            var4 = d1.n5(new String[]{" translate(", n1.u9(var5), ", ", n1.u9(var6), ")"});
            if (var1.l6.n5("transform")) {
               var1.l6.l6("transform", var1.l6.k5("transform") + var4);
            } else {
               var1.l6.n5("transform", var4);
            }
         }

         r4 var58 = this.n5(var1, var3.a6());
         if (var1.l6.n5("clip-path") || var1.l6.n5("view-clip-id")) {
            var58.n5(this.n5(var3.a6(), var1));
         }

         this.h0.n5(var58, var1, var3.a6(), var2);
         if (var1.l6.n5("filter")) {
            String var59 = var1.l6.k5("filter");
            if (d1.l6(var59, "url(#")) {
               String var7 = com.aspose.slides.internal.b5j.y4.k5(var59);
               if (this.l6.l6().containsKey(var7)) {
                  com.aspose.slides.internal.d0e.t2 var8 = this.l6.l6().get_Item(var7);
                  IGenericEnumerator var9 = var8.j5().iterator();

                  try {
                     while (var9.hasNext()) {
                        KeyValuePair var10 = (KeyValuePair)var9.next();
                        if ("feGaussianBlur".equals(((com.aspose.slides.internal.d0e.t2)var10.getValue()).u9)) {
                           com.aspose.slides.internal.m2.l6 var11 = new com.aspose.slides.internal.m2.l6();
                           var11.l6(var58);
                           y1 var12 = var11.l6()
                              .n5(com.aspose.slides.internal.j7.c8.n5(var58.u3() == null ? new com.aspose.slides.internal.w0.c8() : var58.u3()))
                              .y4();
                           y1 var13 = var12.y4();
                           float var14 = var12.s7() * var12.k5();
                           if (var14 > 4000000.0F) {
                              break;
                           }

                           com.aspose.slides.internal.m2.k5 var15 = new com.aspose.slides.internal.m2.k5();
                           float var16 = 1.25F;
                           float var17 = 1.25F;
                           float var18 = 1.0F;
                           com.aspose.slides.internal.d0e.t2 var19 = (com.aspose.slides.internal.d0e.t2)var10.getValue();
                           if (var19.l6.n5("stdDeviation")) {
                              var18 = com.aspose.slides.internal.v6g.k5.c8(
                                 com.aspose.slides.ms.System.c4.l6(var19.l6.k5("stdDeviation"), com.aspose.slides.internal.x7n.l6.k5()), 15
                              );
                           }

                           var13.n5(var18, var18);
                           com.aspose.slides.internal.o9b.l6 var20 = new com.aspose.slides.internal.o9b.l6(
                              com.aspose.slides.internal.v6g.k5.u3(var13.s7() * 1.25F, 13),
                              com.aspose.slides.internal.v6g.k5.u3(var13.k5() * 1.25F, 13),
                              2498570
                           );

                           try {
                              var20.n5(120.0F, 120.0F);
                              z1 var21 = z1.n5(var20);

                              try {
                                 com.aspose.slides.internal.o9b.u3 var22 = new i1(com.aspose.slides.internal.o9b.c8.n5(1, 255, 255, 255).o8());
                                 com.aspose.slides.internal.w0.n3 var23 = com.aspose.slides.internal.v6g.k5.n5(
                                    var58.k5(), com.aspose.slides.internal.w0.n3.class
                                 );
                                 if (var23 != null) {
                                    i1 var62 = (i1)com.aspose.slides.internal.j7.k5.n5(var23);
                                    var62.n5(com.aspose.slides.internal.o9b.c8.n5(1, var62.h0().x8() & 255, var62.h0().n3() & 255, var62.h0().y4() & 255).o8());
                                    var22 = var62;
                                 } else {
                                    com.aspose.slides.internal.w0.h0 var24 = com.aspose.slides.internal.v6g.k5.n5(
                                       var58.k5(), com.aspose.slides.internal.w0.h0.class
                                    );
                                    if (var24 != null) {
                                       int[] var25 = new int[var24.l6().length];

                                       for (int var26 = 0; var26 < var24.l6().length; var26++) {
                                          com.aspose.slides.internal.w0.u9 var27 = var24.l6()[var26];
                                          var25[var26] = var27.n5().l6();
                                          var27.n5(com.aspose.slides.internal.p1s.n5.n5(0, var27.n5().k5(), var27.n5().u3(), var27.n5().a6()));
                                       }

                                       var22 = com.aspose.slides.internal.j7.k5.n5(var24);

                                       for (int var65 = 0; var65 < var24.l6().length; var65++) {
                                          com.aspose.slides.internal.w0.u9 var67 = var24.l6()[var65];
                                          var67.n5(com.aspose.slides.internal.p1s.n5.n5(var25[var65], var67.n5().k5(), var67.n5().u3(), var67.n5().a6()));
                                       }
                                    }
                                 }

                                 var21.l6(var22, new y1(0.0F, 0.0F, var20.e2(), var20.h0()));
                                 var21.l6(new m1(0.75F, 0.0F, 0.0F, 0.75F, -var13.x8() * 0.75F, -var13.n3() * 0.75F));
                                 var15.n5(var58, var21);
                              } finally {
                                 if (var21 != null) {
                                    var21.dispose();
                                 }
                              }

                              float var60 = 1.0F;
                              if (var1.l6.n5("opacity")) {
                                 var60 = com.aspose.slides.internal.v6g.k5.c8(
                                    com.aspose.slides.ms.System.c4.l6(var1.l6.k5("opacity"), com.aspose.slides.internal.x7n.l6.k5()), 15
                                 );
                              } else if (var1.l6.n5("fill-opacity")) {
                                 var60 = com.aspose.slides.internal.v6g.k5.c8(
                                    com.aspose.slides.ms.System.c4.l6(var1.l6.k5("fill-opacity"), com.aspose.slides.internal.x7n.l6.k5()), 15
                                 );
                              }

                              byte var61;
                              if (var12.s7() < 10.0F || var12.k5() < 10.0F) {
                                 var61 = 3;
                              } else if (var14 > 1000000.0F) {
                                 var61 = 3;
                              } else if (var14 > 5000000.0F) {
                                 var61 = 15;
                              } else {
                                 var61 = 17;
                              }

                              com.aspose.slides.internal.o9b.l6 var63 = com.aspose.slides.internal.b9j.l6.n5(
                                 var20, com.aspose.slides.internal.b9j.l6.n5(var61, var18), var60
                              );

                              try {
                                 e2 var64 = new e2();
                                 var63.n5(var64, com.aspose.slides.internal.j9e.x8.s7());
                                 byte[] var66 = var64.toArray();
                                 k7 var68 = new k7(var13.u9().u3(), var13.c8().a6(), var66);
                                 var2.n5(var68);
                                 return;
                              } finally {
                                 if (var63 != null) {
                                    var63.dispose();
                                 }
                              }
                           } finally {
                              if (var20 != null) {
                                 var20.dispose();
                              }
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                        var9.dispose();
                     }
                  }
               }
            }
         }

         var2.n5(var58);
      } catch (RuntimeException var56) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var56;
         }
      }
   }

   public final void l6(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.e1.t2 var2, f2 var3) {
      try {
         var1.z3();
         r4 var4 = new r4();
         var2.n5(var4);
         var4.n5(this.k5.n5(var1, var3.a6()));
         if (var1.l6.n5("clip-path") || var1.l6.n5("view-clip-id")) {
            var4.n5(this.n5(var3.a6(), var1));
         }

         if (var1.l6.n5("transform")) {
            this.a6.n5(var1, var4, var3.a6());
         }

         this.h0.n5(var4, var1, var3.a6(), var2);
      } catch (RuntimeException var5) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var5;
         }
      }
   }

   public final void n5(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.e1.t2 var2, f2 var3, boolean var4) {
      try {
         c4 var5 = this.k5.l6(var1, var3.a6(), var4);
         r4 var6 = new r4();
         var6.n5(var5);
         this.h0.n5(var6, var1, var3.a6(), var2);
         var2.n5(var6);
         if (var1.l6.n5("clip-path") || var1.l6.n5("view-clip-id")) {
            var6.n5(this.n5(var3.a6(), var1));
         }
      } catch (RuntimeException var7) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var7;
         }
      }
   }

   public final void l6(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.e1.t2 var2, f2 var3, boolean var4) {
      try {
         r4 var5 = this.k5.n5(var1, var3.a6(), var4);
         if (var1.l6.n5("clip-path") || var1.l6.n5("view-clip-id")) {
            var5.n5(this.n5(var3.a6(), var1));
         }

         this.h0.n5(var5, var1, var3.a6(), var2);
         var2.n5(var5);
      } catch (RuntimeException var6) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var6;
         }
      }
   }

   public final void k5(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.e1.t2 var2, f2 var3) {
      try {
         r4 var4 = new r4();
         var4.n5(this.k5.l6(var1, var3.a6()));
         if (var1.l6.n5("clip-path") || var1.l6.n5("view-clip-id")) {
            var4.n5(this.n5(var3.a6(), var1));
         }

         if (var1.l6.n5("transform")) {
            this.a6.n5(var1, var4, var3.a6());
         }

         this.h0.n5(var4, var1, var3.a6(), var2);
         var2.n5(var4);
      } catch (RuntimeException var5) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var5;
         }
      }
   }

   public final void u3(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.e1.t2 var2, f2 var3) {
      try {
         r4 var4 = new r4();
         float[] var5 = new float[4];
         IGenericEnumerator var6 = var1.l6.iterator();

         try {
            while (var6.hasNext()) {
               KeyValuePair var7 = (KeyValuePair)var6.next();
               switch (y4.n5((String)var7.getKey())) {
                  case 0:
                     var5[0] = this.n5.n5(var1.l6.k5("x1"), "x1", var1);
                     break;
                  case 1:
                     var5[1] = this.n5.n5(var1.l6.k5("y1"), "y1", var1);
                     break;
                  case 2:
                     var5[2] = this.n5.n5(var1.l6.k5("x2"), "x2", var1);
                     break;
                  case 3:
                     var5[3] = this.n5.n5(var1.l6.k5("y2"), "y2", var1);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         y2 var13 = new y2(var5);
         c4 var8 = new c4();
         var8.n5(var13);
         var4.n5(var8);
         if (var1.l6.n5("transform")) {
            this.a6.n5(var1, var4, var3.a6());
         }

         if (var1.l6.n5("clip-path") || var1.l6.n5("view-clip-id")) {
            var4.n5(this.n5(var3.a6(), var1));
         }

         this.h0.n5(var4, var1, var3.a6(), var2);
         var2.n5(var4);
      } catch (RuntimeException var12) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var12;
         }
      }
   }

   public final r4 n5(f2 var1, com.aspose.slides.internal.d0e.t2 var2) {
      r4 var3 = null;
      List var4 = new List<>(com.aspose.slides.ms.System.u3.n5(new String[]{"circle", "ellipse", "path", "polygon", "rect"}));
      if (var2.l6.n5("clip-path")) {
         String[] var5 = d1.n5(var2.l6.k5("clip-path").toString(), new String[]{";"}, 1);

         for (String var9 : var5) {
            String var10 = com.aspose.slides.internal.b5j.y4.k5(var9);
            com.aspose.slides.internal.u3t.n5 var11 = com.aspose.slides.internal.v6g.k5.n5(this.l6.n5(var10), com.aspose.slides.internal.u3t.n5.class);
            if (var11 != null) {
               boolean var12 = var11.d2();
               y1 var13 = new y1();
               if (var12) {
                  this.l6(var2, var1.a6()).a6(var13);
               }

               var3 = new r4();
               IGenericEnumerator var14 = var11.j5().iterator();

               try {
                  while (var14.hasNext()) {
                     KeyValuePair var15 = (KeyValuePair)var14.next();
                     com.aspose.slides.internal.d0e.t2 var16 = (com.aspose.slides.internal.d0e.t2)var15.getValue();
                     if (var12 && var4.containsItem(var16.u9)) {
                        com.aspose.slides.internal.d0e.t2[] var17 = new com.aspose.slides.internal.d0e.t2[]{var16};
                        this.n5(var17, var13.y4());
                        var16 = var17[0];
                     }

                     switch (y4.n5(var16.u9)) {
                        case 4:
                           var3.n5(this.n5().n5(var16, var1.a6()));
                           break;
                        case 5:
                           var3.n5(this.n5().l6(var16, var1.a6()));
                           break;
                        case 6:
                           var3 = this.n5(var16, var1.a6());
                           break;
                        case 7:
                           var3 = this.n5().n5(var16, var1.a6(), true);
                           break;
                        case 8:
                           var3.n5(this.n5().l6(var16, var1.a6(), true));
                     }

                     if (var3 != null) {
                        if (var11.y2()) {
                           this.a6.n5(var11, var3, var1.a6());
                        }

                        if (var3.u3() != null) {
                           var3.l6(var3.u3());
                           var3.n5((com.aspose.slides.internal.w0.c8)null);
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
                     var14.dispose();
                  }
               }
            }
         }
      }

      if (var2.l6.n5("view-clip-id")) {
      }

      return var3 != null && var3.t2() != 0 ? var3 : null;
   }

   private void n5(com.aspose.slides.internal.d0e.t2[] var1, y1 var2) {
      List var3 = new List<>(com.aspose.slides.ms.System.u3.n5(new String[]{"x", "cx", "r", "width"}));
      List var4 = new List<>(com.aspose.slides.ms.System.u3.n5(new String[]{"y", "cy", "height"}));
      Dictionary var5 = new Dictionary();
      IGenericEnumerator var6 = var1[0].l6.iterator();

      try {
         while (var6.hasNext()) {
            KeyValuePair var7 = (KeyValuePair)var6.next();
            if (var3.containsItem(var7.getKey()) || var4.containsItem(var7.getKey())) {
               float var8 = com.aspose.slides.internal.v6g.k5.c8(z3.y4((String)var7.getValue(), com.aspose.slides.internal.x7n.l6.k5()), 15);
               if (var3.containsItem(var7.getKey())) {
                  var8 *= var2.s7();
               }

               if (var4.containsItem(var7.getKey())) {
                  var8 *= var2.k5();
               }

               var5.addItem(var7.getKey(), d1.n5(new String[]{n1.u9(var8), "pt"}));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      var1[0].l6 = new com.aspose.slides.internal.d0e.k5(var5);
   }

   public final y1 l6(com.aspose.slides.internal.d0e.t2 var1, f2 var2) {
      y1 var3 = new y1();
      switch (y4.n5(var1.u9)) {
         case 4:
            r4 var4 = new r4();
            var4.n5(this.n5().n5(var1, var2.a6()));
            var3.l6(this.n5(var4).c8().a6());
            break;
         case 5:
            r4 var5 = new r4();
            var5.n5(this.n5().l6(var1, var2.a6()));
            var3.l6(this.n5(var5).c8().a6());
            break;
         case 6:
            r4 var6 = this.n5(var1, var2.a6());
            var3.l6(this.n5(var6).c8().a6());
            break;
         case 7:
            r4 var7 = this.n5().n5(var1, var2.a6(), true);
            var3.l6(this.n5(var7).c8().a6());
            break;
         case 8:
            c4 var9 = this.n5().l6(var1, var2.a6(), true);
            var3.l6(this.n5(var9).c8().a6());
            break;
         case 9:
            r4 var8 = this.n5().n5(var1, var2.a6(), true);
            var3.l6(this.n5(var8).c8().a6());
      }

      return var3;
   }

   public final y1 n5(m3 var1) {
      com.aspose.slides.internal.e1.h0 var2 = new com.aspose.slides.internal.e1.h0();
      return var2.n5(var1);
   }
}
