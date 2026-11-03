package com.aspose.slides.internal.a7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.f5.t2;
import com.aspose.slides.internal.j3.c4;
import com.aspose.slides.internal.j3.c8;
import com.aspose.slides.internal.j3.h0;
import com.aspose.slides.internal.j3.k7;
import com.aspose.slides.internal.j3.m1;
import com.aspose.slides.internal.j3.q0;
import com.aspose.slides.internal.j3.r4;
import com.aspose.slides.internal.j3.s7;
import com.aspose.slides.internal.j3.w1;
import com.aspose.slides.internal.j3.z3;
import com.aspose.slides.internal.j3.z8;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.p6.a6;
import com.aspose.slides.internal.p6.k5;
import com.aspose.slides.internal.p6.u9;
import com.aspose.slides.internal.w8.n1;
import com.aspose.slides.internal.z0k.a0;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.p8;

public abstract class n5 implements a6 {
   private com.aspose.slides.internal.p6.n5 n5;
   private c8 l6;
   private s7 k5;
   private u9 u3;
   private boolean a6;
   private String u9;
   private k5 h0;
   private com.aspose.slides.internal.f5.k5 c8;

   protected n5(com.aspose.slides.internal.f5.k5 var1) {
      this.c8 = var1;
      this.n5 = com.aspose.slides.internal.v6g.k5.n5(var1.n5().u9(), com.aspose.slides.internal.p6.n5.class);
      this.l6 = var1.n5().z8();
      this.k5 = com.aspose.slides.internal.v6g.k5.n5(this.l6.n5("error-handler"), s7.class);
      this.a6 = com.aspose.slides.internal.v6g.k5.u3(this.l6.n5("format-pretty-print"), boolean.class);
      this.u9 = p8.k5();
   }

   protected final a0 n5() {
      return this.h0.n5();
   }

   public final boolean n5(z8 var1, k5 var2) {
      if (var2 == null) {
         this.n5("no-output-specified");
      }

      this.h0 = var2;
      boolean var3 = this.l6(var1);
      if (var3) {
         this.n5().k5();
      }

      return var3;
   }

   private boolean l6(z8 var1) {
      switch (var1.n3()) {
         case 1:
            n1 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, n1.class);
            if (this.u3 != null) {
               if ((this.u3.n5() & 1L) == 0L) {
                  return false;
               }

               switch (this.u3.n5(var1)) {
                  case 2:
                     return false;
                  case 3:
                     if (var2 == null) {
                        this.k5(var1);
                     } else {
                        this.l6(var2.z6());
                     }

                     return true;
                  default:
                     this.n5((z3)var1);
                     if (var2 == null) {
                        this.k5(var1);
                     } else {
                        this.l6(var2.z6());
                     }

                     this.l6((z3)var1);
               }
            } else {
               this.n5((z3)var1);
               if (var2 == null) {
                  this.k5(var1);
               } else {
                  this.l6(var2.z6());
               }

               this.l6((z3)var1);
            }
         case 2:
         default:
            break;
         case 3:
            if (this.u3 != null) {
               if ((this.u3.n5() & 4L) == 0L) {
                  return false;
               }

               switch (this.u3.n5(var1)) {
                  case 2:
                  case 3:
                     return false;
                  default:
                     this.n5((c4)var1);
               }
            } else {
               this.n5((c4)var1);
            }
            break;
         case 4:
            if (this.u3 != null) {
               if ((this.u3.n5() & 8L) == 0L) {
                  return false;
               }

               switch (this.u3.n5(var1)) {
                  case 2:
                  case 3:
                     return false;
                  default:
                     this.n5((com.aspose.slides.internal.j3.a6)var1);
               }
            } else {
               this.n5((com.aspose.slides.internal.j3.a6)var1);
            }
            break;
         case 5:
            if (this.u3 != null) {
               if ((this.u3.n5() & 16L) == 0L) {
                  return false;
               }

               switch (this.u3.n5(var1)) {
                  case 2:
                  case 3:
                     return false;
                  default:
                     this.n5((k7)var1);
               }
            } else {
               this.n5((k7)var1);
            }
            break;
         case 6:
            if (this.u3 != null) {
               if ((this.u3.n5() & 32L) == 0L) {
                  return false;
               }

               switch (this.u3.n5(var1)) {
                  case 2:
                  case 3:
                     return false;
                  default:
                     this.n5((m1)var1);
               }
            } else {
               this.n5((m1)var1);
            }
            break;
         case 7:
            if (this.u3 != null) {
               if ((this.u3.n5() & 64L) == 0L) {
                  return false;
               }

               switch (this.u3.n5(var1)) {
                  case 2:
                  case 3:
                     return false;
                  default:
                     this.n5((r4)var1);
               }
            } else {
               this.n5((r4)var1);
            }
            break;
         case 8:
            if (this.u3 != null) {
               if ((this.u3.n5() & 128L) == 0L) {
                  return false;
               }

               switch (this.u3.n5(var1)) {
                  case 2:
                  case 3:
                     return false;
                  default:
                     this.n5((h0)var1);
               }
            } else {
               this.n5((h0)var1);
            }
            break;
         case 9:
            if (this.u3 != null) {
               if ((this.u3.n5() & 256L) == 0L) {
                  return false;
               }

               switch (this.u3.n5(var1)) {
                  case 2:
                     return false;
                  default:
                     this.k5(var1);
               }
            } else {
               this.k5(var1);
            }
            break;
         case 10:
            if (this.u3 != null) {
               if ((this.u3.n5() & 512L) == 0L) {
                  return false;
               }

               switch (this.u3.n5(var1)) {
                  case 2:
                  case 3:
                     return false;
                  default:
                     this.n5((q0)var1);
               }
            } else {
               this.n5((q0)var1);
            }
            break;
         case 11:
            if (this.u3 != null) {
               if ((this.u3.n5() & 1024L) == 0L) {
                  return false;
               }

               switch (this.u3.n5(var1)) {
                  case 2:
                     return false;
                  case 3:
                     this.k5(var1);
                     return false;
                  default:
                     this.k5(var1);
               }
            } else {
               this.k5(var1);
            }
            break;
         case 12:
            if (this.u3 != null) {
               if ((this.u3.n5() & 2048L) == 0L) {
                  return false;
               }

               switch (this.u3.n5(var1)) {
                  case 2:
                  case 3:
                     return false;
                  default:
                     this.n5((w1)var1);
               }
            } else {
               this.n5((w1)var1);
            }
      }

      return true;
   }

   private void k5(z8 var1) {
      IGenericEnumerator var2 = var1.y1().iterator();

      try {
         while (var2.hasNext()) {
            z8 var3 = (z8)var2.next();
            this.l6(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final String n5(z8 var1) {
      k5 var2 = this.n5.u3();

      try {
         a5 var3 = new a5();
         var2.n5(new com.aspose.slides.internal.z0k.r4(var3));
         this.n5(var1, var2);
         return var3.toString();
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   protected abstract void n5(q0 var1);

   protected abstract void n5(c4 var1);

   protected abstract void n5(h0 var1);

   protected abstract void n5(com.aspose.slides.internal.j3.a6 var1);

   protected abstract void n5(m1 var1);

   protected abstract void n5(k7 var1);

   protected abstract void n5(w1 var1);

   protected abstract void n5(r4 var1);

   protected abstract void n5(z3 var1);

   protected abstract void l6(z3 var1);

   protected final void n5(String var1) {
      t2 var2 = new t2((byte)3, var1, "fatal", null, null, null);
      if (this.k5 != null) {
         this.k5.n5(var2);
      }

      throw new com.aspose.slides.internal.p6.h0(82, var1);
   }
}
