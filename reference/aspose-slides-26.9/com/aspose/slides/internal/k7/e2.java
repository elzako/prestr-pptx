package com.aspose.slides.internal.k7;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.k5.l6$n5;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class e2 extends n5 {
   private boolean n5;
   private boolean l6;
   private List<e2$n5> k5;

   public e2(com.aspose.slides.internal.k5.u9 var1, com.aspose.slides.internal.k5.u9 var2) {
      super(var1);
      com.aspose.slides.internal.k5.h0 var3 = null;
      if (var2 == l6$n5.a0) {
         var3 = new com.aspose.slides.internal.k5.h0(new com.aspose.slides.internal.y4.t9(d1.n5), new com.aspose.slides.internal.y4.t9(d1.n5));
      } else {
         var3 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.k5.h0.class);
      }

      if (l6$n5.a0 == var1) {
         this.n5 = true;
      } else if (l6$n5.d2 == var1) {
         this.l6 = true;
      } else {
         this.k5 = new List<>();

         for (com.aspose.slides.internal.k5.u9 var5 : (com.aspose.slides.internal.k5.h0)var1) {
            if (l6$n5.y9w == var5) {
               int var6 = com.aspose.slides.internal.t9.u3.n5();
               com.aspose.slides.internal.t9.u3.k5(var6 + 1);
               this.t2().addItem(new e2$n5(4, this.n5(var3, var6)));
            } else if (l6$n5.i0e == var5) {
               if (com.aspose.slides.internal.t9.u3.n5() != 0) {
                  int var8 = com.aspose.slides.internal.t9.u3.n5() - 1;
                  com.aspose.slides.internal.t9.u3.k5(var8);
                  this.t2().addItem(new e2$n5(5, this.l6(var3, var8)));
               } else {
                  this.t2().addItem(new e2$n5(5));
               }
            } else if (l6$n5.f6z == var5) {
               com.aspose.slides.internal.t9.u3.k5(com.aspose.slides.internal.t9.u3.n5() + 1);
               this.t2().addItem(new e2$n5(6));
            } else if (l6$n5.u1s == var5) {
               if (com.aspose.slides.internal.t9.u3.n5() != 0) {
                  com.aspose.slides.internal.t9.u3.k5(com.aspose.slides.internal.t9.u3.n5() - 1);
               }

               this.t2().addItem(new e2$n5(7));
            } else {
               com.aspose.slides.internal.k5.u3 var9 = (com.aspose.slides.internal.k5.u3)var5;
               switch (var9.n5()) {
                  case 19:
                     this.t2().addItem(new e2$n5(0, var5));
                     break;
                  case 20:
                     this.t2().addItem(new e2$n5(1, var5));
                  case 21:
                  default:
                     break;
                  case 22:
                     this.t2().addItem(new e2$n5(3, var5));
                     break;
                  case 23:
                     this.t2().addItem(new e2$n5(2, var5));
               }
            }
         }
      }
   }

   public final boolean h0() {
      return this.n5;
   }

   public final boolean c8() {
      return this.l6;
   }

   public final IGenericList<e2$n5> t2() {
      return this.k5;
   }

   @Override
   public String u3() {
      if (!this.h0() && !this.c8()) {
         a5 var1 = new a5();

         for (int var2 = 0; var2 < this.k5.size(); var2++) {
            var1.n5(this.k5.get_Item(var2).k5());
         }

         return var1.toString();
      } else {
         return d1.n5;
      }
   }

   private String n5(com.aspose.slides.internal.k5.h0 var1, int var2) {
      return var2 * 2 >= var1.n5() ? var1.n5(var1.n5() - 2).u9() : var1.n5(var2 * 2).u9();
   }

   private String l6(com.aspose.slides.internal.k5.h0 var1, int var2) {
      return var2 * 2 + 1 >= var1.n5() ? var1.n5(var1.n5() - 1).u9() : var1.n5(var2 * 2 + 1).u9();
   }
}
