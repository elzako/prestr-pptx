package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;

public class p4 extends z1 implements x6 {
   private a1 a6;
   private Stack<Double> u9;

   public p4(u7 var1, z1 var2, boolean var3, boolean var4) {
      super(var1, var2);
      super.l6 = new byte[][]{com.aspose.slides.internal.l7h.j5.e2().u3("/")};
      super.n5 = new byte[][]{
         com.aspose.slides.internal.l7h.j5.e2().u3("end"),
         com.aspose.slides.internal.l7h.j5.e2().u3("def"),
         com.aspose.slides.internal.l7h.j5.e2().u3("readonly def"),
         com.aspose.slides.internal.l7h.j5.e2().u3("executeonly def"),
         com.aspose.slides.internal.l7h.j5.e2().u3("noaccess def"),
         com.aspose.slides.internal.l7h.j5.e2().u3("ND\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("ND\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3("|-\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("|-\n")
      };
      List var5 = new List();
      var5.addItem(new q3(this, var1.n5()));
      var5.addItem(new i5(var1, this));
      var5.addItem(new i4(this, var1.n5()));
      var5.addItem(new n7(this, var1.n5()));
      var5.addItem(new l5(this, var1.n5()));
      var5.addItem(new y4(var1, this));
      var5.addItem(new y6(this, var1.n5()));
      var5.addItem(new q2(this, var1.n5()));
      if (var3) {
         var5.addItem(new d9(var1, this, var4));
      }

      var5.addItem(new d6(this, var1.n5()));
      super.n5(var5.toArray(new t9[0]));
   }

   public final a1 n5() {
      return this.a6;
   }

   @Override
   public final Stack<Double> l6() {
      return this.u9;
   }

   @Override
   public void k5() {
      this.a6 = new a1();
      this.u9 = new Stack<>();
      ((q3)super.c8()[0]).n5(true);
      super.k5();
   }

   @Override
   protected void n5(int var1) {
      super.n5(var1);
   }

   @Override
   public void n5(Object var1) {
      q3 var2;
      if ((var2 = com.aspose.slides.internal.v6g.k5.n5(var1, q3.class)) != null) {
         this.a6.n5(var2.n5());
      } else {
         y6 var3;
         if ((var3 = com.aspose.slides.internal.v6g.k5.n5(var1, y6.class)) != null) {
            this.a6.n5((Object)var3.n5());
            this.a6.n5(0);
         } else {
            l5 var4;
            if ((var4 = com.aspose.slides.internal.v6g.k5.n5(var1, l5.class)) != null) {
               this.a6.n5((Object)var4.n5());
               this.a6.n5(0);
            } else {
               d6 var5;
               if ((var5 = com.aspose.slides.internal.v6g.k5.n5(var1, d6.class)) != null) {
                  this.a6.n5((Object)var5.n5());
                  this.a6.n5(0);
               } else {
                  i4 var6;
                  if ((var6 = com.aspose.slides.internal.v6g.k5.n5(var1, i4.class)) != null) {
                     this.a6.n5((Object)var6.n5());
                     this.a6.n5(5);
                  } else {
                     n7 var7;
                     if ((var7 = com.aspose.slides.internal.v6g.k5.n5(var1, n7.class)) != null) {
                        this.a6.n5((Object)var7.n5());
                        this.a6.n5(5);
                     } else {
                        q2 var8;
                        if ((var8 = com.aspose.slides.internal.v6g.k5.n5(var1, q2.class)) != null) {
                           this.a6.n5(var8.n5());
                           this.a6.n5(2);
                           this.l6().push(var8.n5());
                           if ("lenIV".equals(this.a6.n5())) {
                              this.z1().n5(com.aspose.slides.internal.v6g.k5.u3(var8.n5(), 14));
                           }
                        } else {
                           y4 var9;
                           if ((var9 = com.aspose.slides.internal.v6g.k5.n5(var1, y4.class)) != null) {
                              this.a6.n5(var9.n5());
                              this.a6.n5(4);
                           } else {
                              d9 var10;
                              if ((var10 = com.aspose.slides.internal.v6g.k5.n5(var1, d9.class)) != null) {
                                 this.a6.n5(var10.n5());
                                 this.a6.n5(3);
                              } else {
                                 i5 var11;
                                 if ((var11 = com.aspose.slides.internal.v6g.k5.n5(var1, i5.class)) != null) {
                                    this.a6.n5(var11.t4());
                                    this.a6.n5(8);
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      super.n5(var1);
   }
}
