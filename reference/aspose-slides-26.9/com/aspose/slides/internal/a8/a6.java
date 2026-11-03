package com.aspose.slides.internal.a8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.f5.d5;
import com.aspose.slides.internal.f5.r4;
import com.aspose.slides.internal.w8.e9;
import com.aspose.slides.internal.w8.z6;
import com.aspose.slides.ms.System.IDisposable;

class a6 {
   private com.aspose.slides.internal.w5.a6 n5;
   private x8 l6;
   private com.aspose.slides.internal.w5.k5 k5;
   private c8 u3;

   public a6(c8 var1, com.aspose.slides.internal.w5.k5 var2, com.aspose.slides.internal.w5.a6 var3, x8 var4) {
      this.k5 = var2;
      this.n5 = var3;
      this.l6 = var4;
      this.u3 = var1;
   }

   public final void n5() {
      a6$n5 var1 = new a6$n5(this.k5);
      var1.h0();
      if (var1.n5() != null && var1.n5().a3().n3() == 0) {
         var1.n5().n5(this.n5);
      }

      t2 var2 = new t2(this.u3);
      var2.o2(this.k5.a3().y0() == 1 ? "auto" : "fixed");
      if (!this.k5.a3().f5().h0()) {
         var2.i8(this.k5.a3().f5().toString());
      }

      this.l6.u9(this.k5, var2);
      if (this.k5.a3().y0() == 0) {
         IGenericEnumerator var3 = var1.k5(this.k5).iterator();

         try {
            while (var3.hasNext()) {
               e9 var4 = (e9)var3.next();
               this.n5.n5(var4);
               this.n5.l6(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         for (int var156 = 0; var156 < var1.c8().size(); var156++) {
            a6$n5$n5 var5 = var1.c8().get_Item(var156);
            var2 = new t2(this.u3);
            if (var5 != null && var5.l6() && var5.n5() != null) {
               var2.a3(var5.n5().toString());
            }
         }
      }

      if (var1.l6() != null) {
         this.l6.t4();
         IGenericEnumerator var154 = var1.a6().iterator();

         try {
            for (; var154.hasNext(); this.l6.l6()) {
               com.aspose.slides.internal.w5.k5 var157 = (com.aspose.slides.internal.w5.k5)var154.next();
               this.l6.u9(var157);
               IGenericList var160 = var1.n5(var157);
               if (var160.size() == 0) {
                  this.l6.m1().l6();
               } else {
                  IGenericEnumerator var6 = var160.iterator();

                  try {
                     while (var6.hasNext()) {
                        com.aspose.slides.internal.w5.k5 var7 = (com.aspose.slides.internal.w5.k5)var6.next();
                        z6 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, z6.class);
                        if (var8 != null && "TH".equals(var8.a6())) {
                           this.n5.t9(var8);
                        } else {
                           this.n5.y4(var7);
                        }

                        IGenericEnumerator var9 = var7.y1().iterator();

                        try {
                           while (var9.hasNext()) {
                              r4 var10 = (r4)var9.next();
                              if (var10.n3() == 1) {
                                 ((com.aspose.slides.internal.w5.k5)var10).n5(this.n5);
                              } else if (var10.n3() == 3) {
                                 this.n5.n5((d5)var10);
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                              var9.dispose();
                           }
                        }

                        this.n5.e2(var7);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                        var6.dispose();
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var154, IDisposable.class)) {
               var154.dispose();
            }
         }

         this.l6.l6();
      }

      IGenericEnumerator var155 = var1.u3().iterator();

      try {
         for (; var155.hasNext(); this.l6.l6()) {
            com.aspose.slides.internal.w5.k5 var158 = (com.aspose.slides.internal.w5.k5)var155.next();
            this.l6.t4();
            IGenericEnumerator var161 = var1.l6(var158).iterator();

            try {
               for (; var161.hasNext(); this.l6.l6()) {
                  com.aspose.slides.internal.w5.k5 var163 = (com.aspose.slides.internal.w5.k5)var161.next();
                  this.l6.u9(var163);
                  IGenericList var165 = var1.n5(var163);
                  if (var165.size() == 0) {
                     this.l6.m1().l6();
                  } else {
                     IGenericEnumerator var167 = var165.iterator();

                     try {
                        while (var167.hasNext()) {
                           com.aspose.slides.internal.w5.k5 var169 = (com.aspose.slides.internal.w5.k5)var167.next();
                           boolean var171 = var169.a3().k7().h0() == 14;
                           if (var171) {
                              if ("TH".equals(var169.a6())) {
                                 this.n5.t9(var169);
                              } else {
                                 this.n5.y4(var169);
                              }
                           } else {
                              this.l6.m1().a6();
                              var169.n5(this.n5);
                              this.l6.l6().l6();
                           }

                           if (var171) {
                              IGenericEnumerator var11 = var169.y1().iterator();

                              try {
                                 while (var11.hasNext()) {
                                    r4 var12 = (r4)var11.next();
                                    if (var12.n3() == 1) {
                                       ((com.aspose.slides.internal.w5.k5)var12).n5(this.n5);
                                    } else if (var12.n3() == 3) {
                                       this.n5.n5((d5)var12);
                                    }
                                 }
                              } finally {
                                 if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                                    var11.dispose();
                                 }
                              }

                              this.n5.e2(var169);
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var167, IDisposable.class)) {
                           var167.dispose();
                        }
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var161, IDisposable.class)) {
                  var161.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var155, IDisposable.class)) {
            var155.dispose();
         }
      }

      if (var1.k5() != null) {
         this.l6.t4();
         IGenericEnumerator var159 = var1.u9().iterator();

         try {
            for (; var159.hasNext(); this.l6.l6()) {
               com.aspose.slides.internal.w5.k5 var162 = (com.aspose.slides.internal.w5.k5)var159.next();
               this.l6.u9(var162);
               IGenericList var164 = var1.n5(var162);
               if (var164.size() == 0) {
                  this.l6.m1().l6();
               } else {
                  IGenericEnumerator var166 = var164.iterator();

                  try {
                     while (var166.hasNext()) {
                        com.aspose.slides.internal.w5.k5 var168 = (com.aspose.slides.internal.w5.k5)var166.next();
                        z6 var170 = com.aspose.slides.internal.v6g.k5.n5(var168, z6.class);
                        if (var170 != null && "TH".equals(var170.a6())) {
                           this.n5.t9(var170);
                        } else {
                           this.n5.y4(var168);
                        }

                        IGenericEnumerator var172 = var168.y1().iterator();

                        try {
                           while (var172.hasNext()) {
                              r4 var173 = (r4)var172.next();
                              if (var173.n3() == 1) {
                                 ((com.aspose.slides.internal.w5.k5)var173).n5(this.n5);
                              } else if (var173.n3() == 3) {
                                 this.n5.n5((d5)var173);
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var172, IDisposable.class)) {
                              var172.dispose();
                           }
                        }

                        this.n5.e2(var168);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var166, IDisposable.class)) {
                        var166.dispose();
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var159, IDisposable.class)) {
               var159.dispose();
            }
         }

         this.l6.l6();
      }

      this.l6.l6();
      if (var1.n5() != null && var1.n5().a3().n3() == 1) {
         var1.n5().n5(this.n5);
      }
   }
}
