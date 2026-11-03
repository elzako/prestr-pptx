package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class u3 implements IGenericEnumerable<l6> {
   private List<l6> n5 = new List<>();

   public final IGenericEnumerable<k5> n5() {
      return new u3$n5(this.n5);
   }

   public final IGenericEnumerable<a6> l6() {
      return new u3$k5(this.n5);
   }

   public u3(p8 var1, float var2) {
      this.n5(var1, var2);
      if (this.n5.size() == 0) {
         throw new InvalidOperationException("Invalid data in the ProcessedContour.");
      }

      float var3 = this.h0();
      float var4 = var3 / 100.0F;
      this.n5(var4);
      this.a6(var3);
      this.a6();
      this.u9();
      this.l6(var4);
      this.k5(var4);
   }

   private void n5(p8 var1, float var2) {
      if (var1.l6()) {
         this.n5.addItem(new l6(var1, var2));
      }

      List$Enumerator var3 = var1.x8().iterator();

      try {
         while (var3.hasNext()) {
            p8 var4 = (p8)var3.next();
            this.n5(var4, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private void a6() {
      List$Enumerator var1 = this.n5.iterator();

      try {
         while (var1.hasNext()) {
            l6 var2 = (l6)var1.next();
            var2.n5();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   private void n5(float var1) {
      IGenericEnumerable var2 = this.n5();
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            k5 var4 = (k5)var3.next();
            List$Enumerator var5 = this.n5.iterator();

            try {
               while (var5.hasNext()) {
                  l6 var6 = (l6)var5.next();
                  List var7 = var6.l6();

                  for (int var8 = 0; var8 < var7.size(); var8++) {
                     k5 var9 = (k5)var7.get_Item(var8);
                     k5 var10 = (k5)var7.get_Item((var8 + 1) % var7.size());
                     if (var4 != var9 && var4 != var10) {
                        s0 var11 = new s0();
                        s0 var12 = s0.n5(var4.h0(), var1).a6();
                        s0[] var13 = new s0[]{var11};
                        boolean var14 = w2.n5(var4.l6().a6(), s0.n5(var4.k5(), var12).a6(), var9.l6().a6(), var10.l6().a6(), var13);
                        var13[0].n5(var11);
                        if (var14) {
                           var4.l6(s0.l6(var11, var12).a6());
                        }
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      List$Enumerator var43 = this.n5.iterator();

      try {
         while (var43.hasNext()) {
            l6 var44 = (l6)var43.next();
            List var45 = var44.l6();

            for (int var46 = 0; var46 < var45.size(); var46++) {
               k5 var47 = (k5)var45.get_Item(var46);
               k5 var48 = (k5)var45.get_Item((var46 + 1) % var45.size());
               List$Enumerator var49 = this.n5.iterator();

               try {
                  while (var49.hasNext()) {
                     l6 var50 = (l6)var49.next();
                     List var51 = var50.l6();

                     for (int var52 = 0; var52 < var51.size(); var52++) {
                        k5 var53 = (k5)var51.get_Item(var52);
                        k5 var15 = (k5)var51.get_Item((var52 + 1) % var51.size());
                        if (var47 != var53 && var47 != var15 && var48 != var53 && var48 != var15) {
                           s0 var16 = new s0();
                           s0[] var17 = new s0[]{var16};

                           while (w2.n5(var53.k5().a6(), var15.k5().a6(), var47.l6().a6(), var48.l6().a6(), var17)) {
                              var16 = var17[0];
                              k5 var18 = var53.a6() > var15.a6() ? var53 : var15;
                              float var19 = var18.a6() - var1;
                              if (var19 < 0.0F) {
                                 break;
                              }

                              s0 var20 = s0.n5(var18.l6(), s0.n5(var18.h0(), var19)).a6();
                              if (var18.k5().n5() == var20.n5() && var18.k5().l6() == var20.l6()) {
                                 break;
                              }

                              var18.l6(var20.a6());
                           }
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var49, IDisposable.class)) {
                     var49.dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
            var43.dispose();
         }
      }
   }

   private void u9() {
      IGenericEnumerable var1 = this.l6();

      for (int var2 = 0; var2 < 2; var2++) {
         IGenericEnumerator var3 = var1.iterator();

         try {
            while (var3.hasNext()) {
               a6 var4 = (a6)var3.next();
               com.aspose.slides.internal.f8y.n5.n5(var4.k5());
               k5 var5 = var4.l6();
               var4.l6(var5.k5().a6());
               List$Enumerator var6 = this.n5.iterator();

               try {
                  while (var6.hasNext()) {
                     l6 var7 = (l6)var6.next();
                     List var8 = var7.k5();

                     for (int var9 = 0; var9 < var8.size(); var9++) {
                        a6 var10 = (a6)var8.get_Item(var9);
                        a6 var11 = (a6)var8.get_Item((var9 + 1) % var8.size());
                        if (var4 != var10 && var4 != var11) {
                           s0 var12 = new s0();
                           s0[] var13 = new s0[]{var12};
                           boolean var14 = w2.n5(var4.l6().l6().a6(), var4.u3().a6(), var10.l6().k5().a6(), var11.l6().k5().a6(), var13);
                           var13[0].n5(var12);
                           if (var14) {
                              var4.l6(var12.a6());
                           }
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     var6.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         IGenericEnumerator var50 = var1.iterator();

         try {
            while (var50.hasNext()) {
               a6 var51 = (a6)var50.next();
               com.aspose.slides.internal.f8y.n5.n5(var51.k5());
               k5 var53 = var51.l6();
               var51.k5(var53.k5().a6());
               List$Enumerator var55 = this.n5.iterator();

               try {
                  while (var55.hasNext()) {
                     l6 var57 = (l6)var55.next();
                     List var59 = var57.k5();

                     for (int var60 = 0; var60 < var59.size(); var60++) {
                        a6 var61 = (a6)var59.get_Item(var60);
                        a6 var62 = (a6)var59.get_Item((var60 + 1) % var59.size());
                        if (var51 != var61 && var51 != var62) {
                           s0 var63 = new s0();
                           s0[] var64 = new s0[]{var63};
                           boolean var15 = w2.n5(var51.l6().l6().a6(), var51.a6().a6(), var61.u3().a6(), var62.u3().a6(), var64);
                           var64[0].n5(var63);
                           if (var15) {
                              var51.k5(var63.a6());
                           }
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var55, IDisposable.class)) {
                     var55.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var50, IDisposable.class)) {
               var50.dispose();
            }
         }

         IGenericEnumerator var52 = var1.iterator();

         try {
            while (var52.hasNext()) {
               a6 var54 = (a6)var52.next();
               float var56 = 0.6F;
               s0 var58 = s0.n5(s0.n5(var54.u3(), 1.0F - var56), s0.n5(var54.a6(), var56)).a6();
               var54.n5(var58.a6());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var52, IDisposable.class)) {
               var52.dispose();
            }
         }
      }
   }

   private void l6(float var1) {
      IGenericEnumerable var2 = this.l6();
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            a6 var4 = (a6)var3.next();
            var4.n5(false);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      boolean var35 = false;
      boolean var5 = true;

      while (var5) {
         var2 = this.l6();
         IGenericEnumerator var6 = var2.iterator();

         try {
            while (var6.hasNext()) {
               a6 var7 = (a6)var6.next();
               k5 var8 = var7.l6();
               List$Enumerator var9 = this.n5.iterator();

               try {
                  while (var9.hasNext()) {
                     l6 var10 = (l6)var9.next();
                     List var11 = var10.k5();

                     for (int var12 = 0; var12 < var11.size(); var12++) {
                        a6 var13 = (a6)var11.get_Item(var12);
                        a6 var14 = (a6)var11.get_Item((var12 + 1) % var11.size());
                        if (var7 != var13 && var7 != var14) {
                           k5 var15 = var13.l6();
                           k5 var16 = var14.l6();
                           s0 var17 = new s0();
                           s0[] var18 = new s0[]{var17};
                           boolean var19 = w2.n5(var8.l6().a6(), var8.k5().a6(), var15.k5().a6(), var16.k5().a6(), var18);
                           var18[0].n5(var17);
                           if (var19) {
                              var7.n5(true);
                              break;
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
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         var5 = this.u3(var1);
      }
   }

   private void k5(float var1) {
      IGenericEnumerable var2 = this.l6();
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            a6 var4 = (a6)var3.next();
            var4.n5(false);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      boolean var40 = false;
      boolean var5 = true;

      while (var5) {
         List$Enumerator var6 = this.n5.iterator();

         try {
            while (var6.hasNext()) {
               l6 var7 = (l6)var6.next();
               List var8 = var7.k5();

               for (int var9 = 0; var9 < var8.size(); var9++) {
                  a6 var10 = (a6)var8.get_Item(var9);
                  a6 var11 = (a6)var8.get_Item((var9 + 1) % var8.size());
                  if (!var10.u9() || !var11.u9()) {
                     k5 var12 = var10.l6();
                     k5 var13 = var11.l6();
                     boolean var14 = false;
                     List$Enumerator var15 = this.n5.iterator();

                     try {
                        while (var15.hasNext()) {
                           l6 var16 = (l6)var15.next();
                           List var17 = var16.k5();

                           for (int var18 = 0; var18 < var17.size(); var18++) {
                              a6 var19 = (a6)var17.get_Item(var18);
                              a6 var20 = (a6)var17.get_Item((var18 + 1) % var17.size());
                              if (var10 != var19 && var10 != var20 && var11 != var19 && var11 != var20) {
                                 k5 var21 = var19.l6();
                                 k5 var22 = var20.l6();
                                 s0 var23 = new s0();
                                 s0[] var24 = new s0[]{var23};
                                 boolean var25 = w2.n5(var12.k5().a6(), var13.k5().a6(), var21.k5().a6(), var22.k5().a6(), var24);
                                 var24[0].n5(var23);
                                 if (var25) {
                                    var10.n5(true);
                                    var11.n5(true);
                                    var19.n5(true);
                                    var20.n5(true);
                                    var14 = true;
                                    break;
                                 }
                              }
                           }

                           if (var14) {
                              break;
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
                           var15.dispose();
                        }
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         var5 = this.u3(var1);
      }
   }

   private boolean u3(float var1) {
      boolean var2 = false;
      IGenericEnumerable var3 = this.l6();
      IGenericEnumerator var4 = var3.iterator();

      try {
         while (var4.hasNext()) {
            a6 var5 = (a6)var4.next();
            if (var5.u9()) {
               var5.n5(false);
               k5 var6 = var5.l6();
               float var7 = var6.a6() - var1;
               if (var7 > 0.0F) {
                  s0 var8 = s0.n5(var6.l6(), s0.n5(var6.h0(), var7)).a6();
                  var5.n5(var8.a6());
                  var2 = true;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var2;
   }

   private float h0() {
      List var1 = new List();
      IGenericEnumerable var2 = this.n5();
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            k5 var4 = (k5)var3.next();
            s0 var5 = s0.n5(var4.l6(), s0.n5(var4.h0(), 99999.99F)).a6();
            List$Enumerator var6 = this.n5.iterator();

            try {
               while (var6.hasNext()) {
                  l6 var7 = (l6)var6.next();
                  List var8 = var7.l6();

                  for (int var9 = 0; var9 < var8.size(); var9++) {
                     k5 var10 = (k5)var8.get_Item(var9);
                     k5 var11 = (k5)var8.get_Item((var9 + 1) % var8.size());
                     if (var4 != var10 && var4 != var11) {
                        s0 var12 = new s0();
                        s0[] var13 = new s0[]{var12};
                        boolean var14 = w2.n5(var4.l6().a6(), var5.a6(), var10.l6().a6(), var11.l6().a6(), var13);
                        var13[0].n5(var12);
                        if (var14) {
                           var12.n5(var5);
                        }
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }

            var1.addItem(s0.l6(var5, var4.l6()).k5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var1.sort();
      int var23 = var1.size() / 2;
      return var1.size() % 2 == 1 ? (Float)var1.get_Item(var23) : ((Float)var1.get_Item(var23) + (Float)var1.get_Item(var23 - 1)) / 2.0F;
   }

   private void a6(float var1) {
      IGenericEnumerable var2 = this.n5();
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            k5 var4 = (k5)var3.next();
            if (var4.a6() > var1) {
               var4.l6(s0.n5(var4.l6(), s0.n5(var4.h0(), var1)).a6());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   @Override
   public final IGenericEnumerator<l6> iterator() {
      return this.n5.iterator();
   }

   public final f2 k5() {
      return this.n5.size() > 0 ? this.n5.get_Item(0).u3().y4() : null;
   }

   public final boolean u3() {
      return this.n5.size() == 0;
   }
}
