package com.aspose.slides.internal.e5;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;

public class e5 {
   private boolean n5 = false;
   private boolean l6 = true;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private boolean h0;
   private boolean c8;
   private r4 t2;
   private List<e5$l6> s7;
   private Stack<com.aspose.slides.internal.v4.h0> x8 = new Stack<>();
   private k5 n3;

   public final void n5(z1 var1, t2 var2, t2 var3) {
      com.aspose.slides.internal.v4.h0 var4 = null;
      int var5 = var1.z3();
      switch (var5) {
         case 3:
            var4 = (com.aspose.slides.internal.v4.h0)var1;
            if (this.x8.size() != 0 && var1 == this.x8.peek()) {
               if (var3 == null) {
                  this.x8.pop();
               }
            } else if (var3 != null) {
               this.x8.push(var4);
            }
            break;
         case 64:
            t2 var6 = var1;

            do {
               var6 = var6.s_();
            } while (var6.z3() != 3 && var6.z3() != 70);

            if (var6.z3() == 3) {
               var4 = (com.aspose.slides.internal.v4.h0)var6;
               this.x8.push(var4);
            }
            break;
         default:
            if (this.x8.size() != 0) {
               var4 = this.x8.peek();
            }
      }

      if (var4 != null) {
         this.u3 = var4.j4();
         this.u9 = var4.f5();
         this.a6 = var4.i9();
      } else {
         this.u3 = 147;
         this.u9 = 149;
         this.a6 = 63;
      }

      this.h0 = var3 == null && var1 == var4;
      if (var2 == null) {
         this.l6 = var1 == var4 && var1.u3 == null;
         this.k5 = 0;
         if (this.h0) {
            this.k5();
         }
      } else {
         this.t2 = new r4(var1, var2);
         this.n5 = false;
         if (var1 == var4 || var4 == null || var5 == 64 && var1.s_() == var4) {
            if (var2 == var1.u3) {
               this.l6 = true;
            } else {
               int var8 = var2.l6.l6.z3();
               this.l6 = var8 == 3 || var8 == 72 || var8 == 71 || var8 == 40 || var8 == 4;
            }
         }

         if (var5 == 81) {
            t2 var9 = var1.n5;

            int var7;
            for (var7 = var9.z3(); var7 == 81; var7 = var9.z3()) {
               var9 = var9.n5;
            }

            if (var7 == 16 || var7 == 70 || var7 == 4 || var7 == 75) {
               this.h0 = var3 == null;
            }
         }

         if (var3 != null) {
            int var10 = var3.z3();
            this.c8 = var10 == 3 || var10 == 72 || var10 == 71 || var10 == 40 || var10 == 4;
         } else {
            this.c8 = false;
         }

         this.l6();
         if (var1 == var4 && (this.h0 || this.c8)) {
            this.k5();
         }

         if (var3 == null) {
            if (var1 != var4) {
               if (this.k5 > 0 && this.s7 != null) {
                  this.s7.clear();
               }

               if (this.n5) {
                  this.n5(var1);
               }
            } else {
               if (this.x8.size() != 0) {
                  this.x8.pop();
               }

               this.t2 = null;
               this.n3 = null;
            }
         }
      }
   }

   public final void n5() {
      if (this.s7 != null) {
         this.s7.clear();
      }

      this.x8.clear();
      this.t2 = null;
      this.n3 = null;
   }

   private void l6() {
      e5$n5 var1 = new e5$n5(this.t2, this);
      this.k5 = 0;

      while (this.t2.l6()) {
         if (!this.n5) {
            this.n3 = this.t2.h0();
         }

         char var2 = this.t2.u3();
         int var3 = com.aspose.slides.internal.v3.l6.n5(var2);
         if (var3 == 1 && this.u3 == 147) {
            var2 = ' ';
            this.t2.n5(' ');
            var3 = com.aspose.slides.internal.v3.l6.n5(var2);
         }

         switch (com.aspose.slides.internal.v3.l6.n5(var2)) {
            case 1:
               switch (this.u3) {
                  case 60:
                     this.t2.n5();
                     continue;
                  case 108:
                     var1.l6();
                     this.n5 = false;
                     this.l6 = true;
                     continue;
                  case 148:
                     this.t2.n5('\u200b');
                     this.n5 = false;
                  default:
                     continue;
               }
            case 2:
            case 3:
            default:
               this.n5 = false;
               this.l6 = false;
               this.k5++;
               var1.l6();
               break;
            case 4:
               if (this.n5 && this.u9 == 149) {
                  this.t2.n5();
               } else {
                  boolean var4 = false;
                  switch (this.a6) {
                     case 60:
                        var4 = true;
                        break;
                     case 61:
                        var4 = this.l6;
                        break;
                     case 62:
                        var4 = var1.n5();
                        break;
                     case 63:
                        var4 = this.l6 || var1.n5();
                     case 108:
                  }

                  if (var4) {
                     this.t2.n5();
                  } else {
                     this.n5 = true;
                     if (var2 != ' ') {
                        this.t2.n5(' ');
                     }
                  }
               }
         }
      }
   }

   private void n5(z1 var1) {
      if (this.s7 == null) {
         this.s7 = new List<>(5);
      }

      this.s7.addItem(new e5$l6(var1, this.n3));
   }

   private void k5() {
      if (this.s7 != null && this.s7.size() != 0) {
         if (this.k5 == 0) {
            int var1 = this.s7.size();

            while (--var1 >= 0) {
               e5$l6 var2 = this.s7.get_Item(var1);
               this.t2 = (r4)var2.n5;
               this.l6();
               this.s7.removeItem(var2);
            }
         } else {
            this.s7.clear();
         }
      }
   }

   // $VF: synthetic method
   static int n5(e5 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static boolean l6(e5 var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static boolean k5(e5 var0) {
      return var0.h0;
   }
}
