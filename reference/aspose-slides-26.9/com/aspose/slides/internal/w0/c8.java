package com.aspose.slides.internal.w0;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.q1;

public class c8 {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private float a6;
   private float u9;
   private int h0;
   private int c8;
   private static final int[] t2 = new int[]{4, 5, 4, 5, 2, 3, 6, 7};

   public c8() {
      this.n5 = this.u3 = 1.0F;
   }

   public c8(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      this.u9 = var6;
      this.z1();
   }

   public final boolean n5() {
      return this.n5 == 1.0F && this.l6 == 0.0F && this.k5 == 0.0F && this.u3 == 1.0F && this.a6 == 0.0F && this.u9 == 0.0F;
   }

   public final float[] l6() {
      return new float[]{this.n5, this.l6, this.k5, this.u3, this.a6, this.u9};
   }

   public final void n5(w1[] var1, int var2, int var3) {
      int var4 = this.h0;
      int var5 = var2 + var3;
      if (var5 > var1.length) {
         var5 = var1.length;
      }

      for (int var6 = var2; var6 < var5; var6++) {
         float var7 = var1[var6].l6();
         float var8 = var1[var6].k5();
         switch (var4) {
            case 0:
               break;
            case 1:
               var1[var6] = new w1(var7 + this.a6, var8 + this.u9);
               break;
            case 2:
               var1[var6] = new w1(var7 * this.n5, var8 * this.u3);
               break;
            case 3:
               var1[var6] = new w1(var7 * this.n5 + this.a6, var8 * this.u3 + this.u9);
               break;
            case 4:
               var1[var6] = new w1(var8 * this.k5, var7 * this.l6);
               break;
            case 5:
               var1[var6] = new w1(var8 * this.k5 + this.a6, var7 * this.l6 + this.u9);
               break;
            case 6:
               var1[var6] = new w1(var7 * this.n5 + var8 * this.k5, var7 * this.l6 + var8 * this.u3);
               break;
            case 7:
               var1[var6] = new w1(var7 * this.n5 + var8 * this.k5 + this.a6, var7 * this.l6 + var8 * this.u3 + this.u9);
               break;
            default:
               t4();
         }
      }
   }

   public final w1 n5(w1 var1) {
      w1 var2 = new w1(var1.l6(), var1.k5());
      int var3 = this.h0;
      float var4 = var2.l6();
      float var5 = var2.k5();
      switch (var3) {
         case 0:
            break;
         case 1:
            var2 = new w1(var4 + this.a6, var5 + this.u9);
            break;
         case 2:
            var2 = new w1(var4 * this.n5, var5 * this.u3);
            break;
         case 3:
            var2 = new w1(var4 * this.n5 + this.a6, var5 * this.u3 + this.u9);
            break;
         case 4:
            var2 = new w1(var5 * this.k5, var4 * this.l6);
            break;
         case 5:
            var2 = new w1(var5 * this.k5 + this.a6, var4 * this.l6 + this.u9);
            break;
         case 6:
            var2 = new w1(var4 * this.n5 + var5 * this.k5, var4 * this.l6 + var5 * this.u3);
            break;
         case 7:
            var2 = new w1(var4 * this.n5 + var5 * this.k5 + this.a6, var4 * this.l6 + var5 * this.u3 + this.u9);
            break;
         default:
            t4();
      }

      return var2;
   }

   public final void n5(w1[] var1) {
      this.n5(var1, 0, var1.length);
   }

   public final y1 n5(y1 var1) {
      w1 var2 = this.n5(new w1(var1.a6(), var1.t2())).u3();
      w1 var3 = this.n5(new w1(var1.h0(), var1.l6())).u3();
      float var4 = q1.l6(var2.l6(), var3.l6());
      float var5 = q1.l6(var2.k5(), var3.k5());
      float var6 = q1.n5(var2.l6(), var3.l6());
      float var7 = q1.n5(var2.k5(), var3.k5());
      return new y1(var4, var5, var6 - var4, var7 - var5);
   }

   public final void n5(float var1, float var2, int var3) {
      if (var3 == 0) {
         this.n5(var1, var2);
      } else {
         if (this.h0 == 1 || this.h0 == 0) {
            this.h0 |= 2;
         }

         if ((this.h0 & 4) != 0) {
            this.k5 *= var1;
            this.l6 *= var2;
            if ((this.h0 & 2) != 0) {
               this.n5 *= var1;
               this.u3 *= var2;
            }
         } else {
            this.n5 *= var1;
            this.u3 *= var2;
         }

         if ((this.h0 & 1) != 0) {
            this.a6 *= var1;
            this.u9 *= var2;
         }

         this.c8 = -1;
      }
   }

   public final void n5(float var1, float var2) {
      int var3 = this.h0;
      if ((var3 & 2) != 0) {
         this.n5 *= var1;
         this.u3 *= var2;
      }

      switch (var3) {
         case 0:
         case 1:
            this.n5 = var1;
            this.u3 = var2;
            if (var1 != 1.0F || var2 != 1.0F) {
               this.h0 = var3 | 2;
               this.c8 = -1;
            }

            return;
         case 2:
         case 3:
            if (this.n5 == 1.0F && this.u3 == 1.0F) {
               int var5;
               this.h0 = var5 = var3 & 1;
               this.c8 = var5 == 0 ? 0 : 1;
            } else {
               this.c8 = -1;
            }

            return;
         case 4:
         case 5:
         case 6:
         case 7:
            this.k5 *= var2;
            this.l6 *= var1;
            if (this.k5 == 0.0F && this.l6 == 0.0F) {
               var3 &= 1;
               if (this.n5 == 1.0F && this.u3 == 1.0F) {
                  this.c8 = var3 == 0 ? 0 : 1;
               } else {
                  var3 |= 2;
                  this.c8 = -1;
               }

               this.h0 = var3;
            }

            return;
         default:
            t4();
      }
   }

   public final void l6(float var1, float var2, int var3) {
      if (var3 == 0) {
         this.l6(var1, var2);
      } else {
         switch (this.h0) {
            case 0:
            case 2:
            case 4:
            case 6:
               this.a6 = var1;
               this.u9 = var2;
               this.h0 |= 1;
               this.c8 |= 1;
               break;
            case 1:
            case 3:
            case 5:
            case 7:
               this.a6 += var1;
               this.u9 += var2;
         }
      }
   }

   public final void l6(float var1, float var2) {
      switch (this.h0) {
         case 0:
            this.a6 = var1;
            this.u9 = var2;
            if (var1 != 0.0F || var2 != 0.0F) {
               this.h0 = 1;
               this.c8 = 1;
            }

            return;
         case 1:
            this.a6 += var1;
            this.u9 += var2;
            if (this.a6 == 0.0F && this.u9 == 0.0F) {
               this.h0 = 0;
               this.c8 = 0;
            }

            return;
         case 2:
            this.a6 = var1 * this.n5;
            this.u9 = var2 * this.u3;
            if (this.a6 != 0.0 || this.u9 != 0.0) {
               this.h0 = 3;
               this.c8 |= 1;
            }

            return;
         case 3:
            this.a6 = var1 * this.n5 + this.a6;
            this.u9 = var2 * this.u3 + this.u9;
            if (this.a6 == 0.0 && this.u9 == 0.0) {
               this.h0 = 2;
               if (this.c8 != -1) {
                  this.c8--;
               }
            }

            return;
         case 4:
            this.a6 = var2 * this.k5;
            this.u9 = var1 * this.l6;
            if (this.a6 != 0.0 || this.u9 != 0.0) {
               this.h0 = 5;
               this.c8 |= 1;
            }

            return;
         case 5:
            this.a6 = var2 * this.k5 + this.a6;
            this.u9 = var1 * this.l6 + this.u9;
            if (this.a6 == 0.0 && this.u9 == 0.0) {
               this.h0 = 4;
               if (this.c8 != -1) {
                  this.c8--;
               }
            }

            return;
         case 6:
            this.a6 = var1 * this.n5 + var2 * this.k5;
            this.u9 = var1 * this.l6 + var2 * this.u3;
            if (this.a6 != 0.0 || this.u9 != 0.0) {
               this.h0 = 7;
               this.c8 |= 1;
            }

            return;
         case 7:
            this.a6 = var1 * this.n5 + var2 * this.k5 + this.a6;
            this.u9 = var1 * this.l6 + var2 * this.u3 + this.u9;
            if (this.a6 == 0.0 && this.u9 == 0.0) {
               this.h0 = 6;
               if (this.c8 != -1) {
                  this.c8--;
               }
            }

            return;
         default:
            t4();
      }
   }

   public final void n5(c8 var1, int var2) {
      if (var2 == 0) {
         this.n5(var1);
      } else {
         int var3 = this.h0;
         int var4 = var1.h0;
         switch (var4) {
            case 0:
               return;
            case 1:
               switch (var3) {
                  case 0:
                  case 2:
                  case 4:
                  case 6:
                     this.a6 = var1.a6;
                     this.u9 = var1.u9;
                     this.h0 = var3 | 1;
                     this.c8 |= 1;
                     break;
                  case 1:
                  case 3:
                  case 5:
                  case 7:
                     this.a6 = this.a6 + var1.a6;
                     this.u9 = this.u9 + var1.u9;
               }

               return;
            case 2:
               if (var3 == 1 || var3 == 0) {
                  this.h0 = var3 | 2;
               }

               float var13 = var1.n5;
               float var14 = var1.u3;
               if ((var3 & 4) != 0) {
                  this.k5 *= var13;
                  this.l6 *= var14;
                  if ((var3 & 2) != 0) {
                     this.n5 *= var13;
                     this.u3 *= var14;
                  }
               } else {
                  this.n5 *= var13;
                  this.u3 *= var14;
               }

               if ((var3 & 1) != 0) {
                  this.a6 *= var13;
                  this.u9 *= var14;
               }

               this.c8 = -1;
               return;
            case 3:
            default:
               float var5 = var1.n5;
               float var15 = var1.k5;
               float var10 = var1.a6;
               float var16 = var1.l6;
               float var6 = var1.u3;
               float var11 = var1.u9;
               if ((var3 & 1) != 0) {
                  float var19 = this.a6;
                  float var12 = this.u9;
                  var10 = var10 + var19 * var5 + var12 * var15;
                  var11 = var11 + var19 * var16 + var12 * var6;
               }

               switch (var3) {
                  case 0:
                  case 1:
                     this.a6 = var10;
                     this.u9 = var11;
                     this.n5 = var5;
                     this.l6 = var16;
                     this.k5 = var15;
                     this.u3 = var6;
                     this.h0 = var3 | var4;
                     this.c8 = -1;
                     return;
                  case 2:
                  case 3:
                     this.a6 = var10;
                     this.u9 = var11;
                     float var24 = this.n5;
                     this.n5 = var24 * var5;
                     this.l6 = var24 * var16;
                     var24 = this.u3;
                     this.k5 = var24 * var15;
                     this.u3 = var24 * var6;
                     break;
                  case 4:
                  case 5:
                     this.a6 = var10;
                     this.u9 = var11;
                     float var22 = this.l6;
                     this.n5 = var22 * var15;
                     this.l6 = var22 * var6;
                     var22 = this.k5;
                     this.k5 = var22 * var5;
                     this.u3 = var22 * var16;
                     break;
                  case 6:
                  case 7:
                     this.a6 = var10;
                     this.u9 = var11;
                     float var20 = this.n5;
                     float var26 = this.l6;
                     this.n5 = var20 * var5 + var26 * var15;
                     this.l6 = var20 * var16 + var26 * var6;
                     var20 = this.k5;
                     var26 = this.u3;
                     this.k5 = var20 * var5 + var26 * var15;
                     this.u3 = var20 * var16 + var26 * var6;
                     break;
                  default:
                     t4();
               }

               this.z1();
               return;
            case 4:
               if (var3 == 5 || var3 == 4) {
                  var3 |= 2;
                  this.h0 = var3 ^ 4;
               }

               if (var3 == 1 || var3 == 0 || var3 == 3 || var3 == 2) {
                  this.h0 = var3 ^ 4;
               }

               float var7 = var1.k5;
               float var8 = var1.l6;
               float var9 = this.n5;
               this.n5 = this.l6 * var7;
               this.l6 = var9 * var8;
               var9 = this.k5;
               this.k5 = this.u3 * var7;
               this.u3 = var9 * var8;
               var9 = this.a6;
               this.a6 = this.u9 * var7;
               this.u9 = var9 * var8;
               this.c8 = -1;
         }
      }
   }

   public final void n5(c8 var1) {
      int var2 = this.h0;
      int var3 = var1.h0;
      if (var2 == 0) {
         if ((var3 & 2) != 0) {
            this.n5 = var1.n5;
            this.u3 = var1.u3;
         }

         if ((var3 & 4) != 0) {
            this.k5 = var1.k5;
            this.l6 = var1.l6;
         }

         if ((var3 & 1) != 0) {
            this.a6 = var1.a6;
            this.u9 = var1.u9;
         }

         this.h0 = var3;
         this.c8 = var1.c8;
      } else {
         switch (var3) {
            case 0:
               return;
            case 1:
               this.l6(var1.a6, var1.u9);
               return;
            case 2:
               this.n5(var1.n5, var1.u3);
               return;
            case 4:
               switch (var2) {
                  case 1:
                     this.n5 = 0.0F;
                     this.k5 = var1.k5;
                     this.l6 = var1.l6;
                     this.u3 = 0.0F;
                     this.h0 = 5;
                     this.c8 = -1;
                     return;
                  case 2:
                  case 3:
                     this.k5 = this.n5 * var1.k5;
                     this.n5 = 0.0F;
                     this.l6 = this.u3 * var1.l6;
                     this.u3 = 0.0F;
                     this.h0 = var2 ^ 6;
                     this.c8 = -1;
                     return;
                  case 4:
                  case 5:
                     this.n5 = this.k5 * var1.l6;
                     this.k5 = 0.0F;
                     this.u3 = this.l6 * var1.k5;
                     this.l6 = 0.0F;
                     this.h0 = var2 ^ 6;
                     this.c8 = -1;
                     return;
                  case 6:
                  case 7:
                     float var12 = var1.k5;
                     float var13 = var1.l6;
                     float var19 = this.n5;
                     this.n5 = this.k5 * var13;
                     this.k5 = var19 * var12;
                     var19 = this.l6;
                     this.l6 = this.u3 * var13;
                     this.u3 = var19 * var12;
                     this.c8 = -1;
                     return;
               }
            case 3:
            default:
               float var7 = var1.n5;
               float var4 = var1.k5;
               float var8 = var1.a6;
               float var5 = var1.l6;
               float var9 = var1.u3;
               float var10 = var1.u9;
               switch (var2) {
                  case 1:
                     this.n5 = var7;
                     this.k5 = var4;
                     this.a6 += var8;
                     this.l6 = var5;
                     this.u3 = var9;
                     this.u9 += var10;
                     this.h0 = var3 | 1;
                     this.c8 = -1;
                     return;
                  case 2:
                  case 3:
                     float var17 = this.n5;
                     this.n5 = var7 * var17;
                     this.k5 = var4 * var17;
                     this.a6 += var8 * var17;
                     var17 = this.u3;
                     this.l6 = var5 * var17;
                     this.u3 = var9 * var17;
                     this.u9 += var10 * var17;
                     break;
                  case 4:
                  case 5:
                     float var15 = this.k5;
                     this.n5 = var5 * var15;
                     this.k5 = var9 * var15;
                     this.a6 += var10 * var15;
                     var15 = this.l6;
                     this.l6 = var7 * var15;
                     this.u3 = var4 * var15;
                     this.u9 += var8 * var15;
                     break;
                  case 6:
                  case 7:
                     if (var2 == 6) {
                        this.h0 = var2 | var3;
                     }

                     float var6 = this.n5;
                     float var11 = this.k5;
                     this.n5 = var7 * var6 + var5 * var11;
                     this.k5 = var4 * var6 + var9 * var11;
                     this.a6 = this.a6 + var8 * var6 + var10 * var11;
                     var6 = this.l6;
                     var11 = this.u3;
                     this.l6 = var7 * var6 + var5 * var11;
                     this.u3 = var4 * var6 + var9 * var11;
                     this.u9 = this.u9 + var8 * var6 + var10 * var11;
                     this.c8 = -1;
                     return;
                  default:
                     t4();
               }

               this.z1();
         }
      }
   }

   public final void n5(float var1, int var2) {
      if (var1 != 0.0F) {
         if (var2 == 0) {
            this.n5(var1);
         } else {
            if (var1 == 90.0F || var1 == -270.0F) {
               this.y4();
            } else if (var1 == -90.0F || var1 == 270.0F) {
               this.t9();
            } else if (var1 != 180.0F && var1 != -180.0F) {
               double var3 = com.aspose.slides.internal.c8e.k5.n5(var1);
               double var5 = q1.h0(var3);
               double var7 = q1.c8(var3);
               if (var7 != 1.0) {
                  float var9 = this.n5;
                  float var10 = this.l6;
                  this.n5 = (float)(var7 * var9 - var5 * var10);
                  this.l6 = (float)(var5 * var9 + var7 * var10);
                  var9 = this.k5;
                  var10 = this.u3;
                  this.k5 = (float)(var7 * var9 - var5 * var10);
                  this.u3 = (float)(var5 * var9 + var7 * var10);
                  var9 = this.a6;
                  var10 = this.u9;
                  this.a6 = (float)(var7 * var9 - var5 * var10);
                  this.u9 = (float)(var5 * var9 + var7 * var10);
                  this.z1();
               }
            } else {
               this.e2();
            }
         }
      }
   }

   public final void n5(float var1) {
      if (var1 != 0.0F) {
         if (var1 == 90.0F || var1 == -270.0F) {
            this.s7();
         } else if (var1 == -90.0F || var1 == 270.0F) {
            this.n3();
         } else if (var1 != 180.0F && var1 != -180.0F) {
            double var2 = com.aspose.slides.internal.c8e.k5.n5(var1);
            double var4 = q1.h0(var2);
            double var6 = q1.c8(var2);
            if (var6 != 1.0) {
               float var8 = this.n5;
               float var9 = this.k5;
               this.n5 = (float)(var6 * var8 + var4 * var9);
               this.k5 = (float)(-var4 * var8 + var6 * var9);
               var8 = this.l6;
               var9 = this.u3;
               this.l6 = (float)(var6 * var8 + var4 * var9);
               this.u3 = (float)(-var4 * var8 + var6 * var9);
               this.z1();
            }
         } else {
            this.x8();
         }
      }
   }

   public final void n5(float var1, w1 var2, int var3) {
      if (var3 == 0) {
         this.n5(var1, var2.u3());
      } else {
         this.l6(-var2.l6(), -var2.k5(), 1);
         this.n5(var1, 1);
         this.l6(var2.l6(), var2.k5(), 1);
      }
   }

   public final void n5(float var1, w1 var2) {
      this.l6(var2.l6(), var2.k5());
      this.n5(var1);
      this.l6(-var2.l6(), -var2.k5());
   }

   private void s7() {
      float var1 = this.n5;
      this.n5 = this.k5;
      this.k5 = -var1;
      var1 = this.l6;
      this.l6 = this.u3;
      this.u3 = -var1;
      int var2 = t2[this.h0];
      if ((var2 & 6) == 2 && this.n5 == 1.0F && this.u3 == 1.0F) {
         var2 -= 2;
      }

      this.h0 = var2;
      this.c8 = -1;
   }

   private void x8() {
      this.n5 = -this.n5;
      this.u3 = -this.u3;
      int var1 = this.h0;
      if ((var1 & 4) != 0) {
         this.k5 = -this.k5;
         this.l6 = -this.l6;
      } else if (this.n5 == 1.0F && this.u3 == 1.0F) {
         this.h0 = var1 & -3;
      } else {
         this.h0 = var1 | 2;
      }

      this.c8 = -1;
   }

   private void n3() {
      float var1 = this.n5;
      this.n5 = -this.k5;
      this.k5 = var1;
      var1 = this.l6;
      this.l6 = -this.u3;
      this.u3 = var1;
      int var2 = t2[this.h0];
      if ((var2 & 6) == 2 && this.n5 == 1.0F && this.u3 == 1.0F) {
         var2 -= 2;
      }

      this.h0 = var2;
      this.c8 = -1;
   }

   private void y4() {
      float var1 = this.n5;
      this.n5 = -this.l6;
      this.l6 = var1;
      var1 = this.k5;
      this.k5 = -this.u3;
      this.u3 = var1;
      var1 = this.a6;
      this.a6 = -this.u9;
      this.u9 = var1;
      this.z1();
   }

   private void e2() {
      this.n5 = -this.n5;
      this.k5 = -this.k5;
      this.l6 = -this.l6;
      this.u3 = -this.u3;
      this.a6 = -this.a6;
      this.u9 = -this.u9;
      this.z1();
   }

   private void t9() {
      float var1 = this.n5;
      this.n5 = this.l6;
      this.l6 = -var1;
      var1 = this.k5;
      this.k5 = this.u3;
      this.u3 = -var1;
      var1 = this.a6;
      this.a6 = this.u9;
      this.u9 = -var1;
      this.z1();
   }

   public final c8 k5() {
      c8 var1 = new c8();
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
      var1.c8 = this.c8;
      return var1;
   }

   @Override
   public int hashCode() {
      long var1 = n1.n5(this.n5);
      var1 = var1 * 31L + n1.n5(this.k5);
      var1 = var1 * 31L + n1.n5(this.a6);
      var1 = var1 * 31L + n1.n5(this.l6);
      var1 = var1 * 31L + n1.n5(this.u3);
      var1 = var1 * 31L + n1.n5(this.u9);
      return (int)var1 ^ (int)(var1 >> 32);
   }

   @Override
   public boolean equals(Object obj) {
      c8 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, c8.class);
      return var2 == null ? false : n5(this, var2);
   }

   public static boolean n5(c8 var0, c8 var1) {
      if (j8.l6(var0, var1)) {
         return true;
      } else if (j8.l6(null, var0)) {
         return false;
      } else {
         return j8.l6(null, var1)
            ? false
            : var0.n5 == var1.n5 && var0.l6 == var1.l6 && var0.k5 == var1.k5 && var0.u3 == var1.u3 && var0.a6 == var1.a6 && var0.u9 == var1.u9;
      }
   }

   public final float u3() {
      return this.n5;
   }

   public final float a6() {
      return this.l6;
   }

   public final float u9() {
      return this.k5;
   }

   public final float h0() {
      return this.u3;
   }

   public final float c8() {
      return this.a6;
   }

   public final float t2() {
      return this.u9;
   }

   @Override
   public String toString() {
      return d1.n5("{0}, {1}, {2}, {3}, {4}, {5}", this.n5, this.l6, this.k5, this.u3, this.a6, this.u9);
   }

   private void z1() {
      if (this.k5 == 0.0F && this.l6 == 0.0F) {
         if (this.n5 == 1.0F && this.u3 == 1.0F) {
            if (this.a6 == 0.0F && this.u9 == 0.0F) {
               this.h0 = 0;
               this.c8 = 0;
            } else {
               this.h0 = 1;
               this.c8 = 1;
            }
         } else if (this.a6 == 0.0F && this.u9 == 0.0F) {
            this.h0 = 2;
            this.c8 = -1;
         } else {
            this.h0 = 3;
            this.c8 = -1;
         }
      } else if (this.n5 == 0.0F && this.u3 == 0.0F) {
         if (this.a6 == 0.0F && this.u9 == 0.0F) {
            this.h0 = 4;
            this.c8 = -1;
         } else {
            this.h0 = 5;
            this.c8 = -1;
         }
      } else if (this.a6 == 0.0F && this.u9 == 0.0F) {
         this.h0 = 6;
         this.c8 = -1;
      } else {
         this.h0 = 7;
         this.c8 = -1;
      }
   }

   private static void t4() {
      throw new Exception("missing case in transform state switch");
   }
}
