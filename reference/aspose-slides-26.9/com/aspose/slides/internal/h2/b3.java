package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;

public class b3 extends a5 implements com.aspose.slides.internal.f2.l6 {
   private a5 n5;
   private a5 l6;
   private a5 k5;
   private int u3 = 0;
   private boolean a6 = false;

   public final com.aspose.slides.internal.v8.u9 n5(com.aspose.slides.internal.f2.u9 var1) {
      int var2 = this.l6(var1).t4() ? 0 : this.l6(var1).c8().l6(var1);
      int var3 = this.u3(var1).t4() ? var2 : this.u3(var1).c8().l6(var1);
      int var4 = this.k5(var1).t4() ? Integer.MAX_VALUE : this.k5(var1).c8().l6(var1);
      return com.aspose.slides.internal.v8.u9.n5(var2, var3, var4);
   }

   @Override
   public void n5(int var1, a5 var2, boolean var3) {
      if (var1 == 3072) {
         this.n5(var2, var3);
      } else if (var1 == 3584) {
         this.k5(var2, var3);
      } else if (var1 == 2560) {
         this.l6(var2, var3);
      }
   }

   @Override
   public a5 n5(int var1) {
      if (var1 == 3072) {
         return this.l6(null);
      } else if (var1 == 3584) {
         return this.u3(null);
      } else {
         return var1 == 2560 ? this.k5(null) : null;
      }
   }

   protected final void n5(a5 var1, boolean var2) {
      this.n5 = var1;
      if (!var2) {
         this.u3 |= 1;
      }

      this.a6 = false;
   }

   protected final void l6(a5 var1, boolean var2) {
      this.k5 = var1;
      if (!var2) {
         this.u3 |= 4;
      }

      this.a6 = false;
   }

   protected final void k5(a5 var1, boolean var2) {
      this.l6 = var1;
      if (!var2) {
         this.u3 |= 2;
      }

      this.a6 = false;
   }

   private void a6(com.aspose.slides.internal.f2.u9 var1) {
      if (!this.a6) {
         if (var1 != null) {
            if (!this.n5.t4() && !this.k5.t4() && this.n5.c8().l6(var1) > this.k5.c8().l6(var1)) {
               if ((this.u3 & 1) != 0) {
                  if ((this.u3 & 4) != 0) {
                  }

                  this.k5 = this.n5;
               } else {
                  this.n5 = this.k5;
               }
            }

            if (!this.l6.t4() && !this.k5.t4() && this.l6.c8().l6(var1) > this.k5.c8().l6(var1)) {
               if ((this.u3 & 2) != 0) {
                  if ((this.u3 & 4) != 0) {
                     this.l6 = this.k5;
                  } else {
                     this.k5 = this.l6;
                  }
               } else {
                  this.l6 = this.k5;
               }
            } else if (!this.l6.t4() && !this.n5.t4() && this.l6.c8().l6(var1) < this.n5.c8().l6(var1)) {
               if ((this.u3 & 1) != 0) {
                  if ((this.u3 & 2) != 0) {
                  }

                  this.l6 = this.n5;
               } else {
                  this.n5 = this.l6;
               }
            }

            if (this.l6.t4() && this.n5.t4() && (this.u3 & 4) != 0) {
               this.l6 = this.k5;
            }

            if (this.l6.t4() && this.k5.t4() && (this.u3 & 1) != 0) {
               this.l6 = this.n5;
            }

            this.a6 = true;
         }
      }
   }

   public final a5 l6(com.aspose.slides.internal.f2.u9 var1) {
      this.a6(var1);
      return this.n5;
   }

   public final a5 k5(com.aspose.slides.internal.f2.u9 var1) {
      this.a6(var1);
      return this.k5;
   }

   public final a5 u3(com.aspose.slides.internal.f2.u9 var1) {
      this.a6(var1);
      return this.l6;
   }

   @Override
   public String toString() {
      return d1.n5(new Object[]{"LengthRange[", "min:", this.l6(null).g_(), ", max:", this.k5(null).g_(), ", opt:", this.u3(null).g_(), "]"});
   }

   @Override
   public b3 k_() {
      return this;
   }

   @Override
   public Object g_() {
      return this;
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      var2 = var1 * var2 + this.u3;
      var2 = var1 * var2 + (this.a6 ? 1231 : 1237);
      var2 = var1 * var2 + com.aspose.slides.internal.v3.u3.n5(this.n5);
      var2 = var1 * var2 + com.aspose.slides.internal.v3.u3.n5(this.l6);
      return var1 * var2 + com.aspose.slides.internal.v3.u3.n5(this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      b3 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, b3.class);
      return var2 == null
         ? false
         : this.u3 == var2.u3
            && this.a6 == var2.a6
            && com.aspose.slides.internal.v3.u3.n5(this.n5, var2.n5)
            && com.aspose.slides.internal.v3.u3.n5(this.l6, var2.l6)
            && com.aspose.slides.internal.v3.u3.n5(this.k5, var2.k5);
   }

   // $VF: synthetic method
   static int n5(b3 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static int n5(b3 var0, int var1) {
      return var0.u3 = var1;
   }
}
