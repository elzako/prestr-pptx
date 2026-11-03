package com.aspose.slides.internal.h3d;

import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;

class t4 {
   public byte n5 = 0;
   public Object l6;
   public Object k5;
   public long u3;
   public c4 a6;
   public long u9;
   public x8 h0;
   public n3 c8;
   public com.aspose.slides.internal.p4l.e2 t2;
   public int[] s7;
   public l6 x8;
   public l6 n3;
   public t4 y4;

   public void n5(z1 var1, com.aspose.slides.internal.p4l.e2 var2, Object var3) {
      if (j8.n5(var3).s3()) {
         var3 = com.aspose.slides.ms.System.u3.n5((com.aspose.slides.ms.System.u3)var3);
      }

      if (var2 instanceof com.aspose.slides.internal.p4l.y4) {
         com.aspose.slides.internal.p4l.y4 var4 = (com.aspose.slides.internal.p4l.y4)var2;
         var4.u3().setAccessible(true);
         var4.n5(this.k5, var3);
      } else {
         if (!(var2 instanceof com.aspose.slides.internal.p4l.k7)) {
            throw new SerializationException("Cannot perform fixup");
         }

         ((com.aspose.slides.internal.p4l.k7)var2).n5(this.k5, var3, null);
      }

      if (this.t2 != null) {
         t4 var5 = var1.n5(this.u9);
         if (var5.k5()) {
            var5.n5(var1, this.t2, this.k5);
         }
      } else if (this.s7 != null) {
         t4 var6 = var1.n5(this.u9);
         if (var6.k5()) {
            var6.n5(var1, this.k5, this.s7);
         }
      }
   }

   public void n5(z1 var1, Object var2, int[] var3) {
      ((com.aspose.slides.ms.System.u3)this.k5).l6(var2, var3);
   }

   public void n5(z1 var1, String var2, Object var3) {
      if (this.a6 == null) {
         throw new SerializationException("Cannot perform fixup");
      }

      this.a6.n5(var2, var3, j8.n5(var3));
   }

   public boolean n5() {
      if (!this.k5()) {
         return false;
      } else {
         return this.l6() ? false : !j8.n5(this.k5).y1() || !this.u3() && this.a6 == null;
      }
   }

   public boolean l6() {
      return this.n5 != 3;
   }

   public boolean k5() {
      return this.n5 != 0;
   }

   public boolean n5(boolean var1, z1 var2, boolean var3) {
      l6 var4 = null;
      l6 var5 = var1 ? this.x8 : this.n3;
      boolean var6 = true;

      while (var5 != null) {
         if (var5.n5(var2, var3)) {
            this.n5(var5, var4, var1);
            if (var1) {
               var5.l6.n5(var5, false);
            } else {
               var5.n5.n5(var5, true);
            }
         } else {
            var4 = var5;
            var6 = false;
         }

         var5 = var1 ? var5.k5 : var5.u3;
      }

      return var6;
   }

   public void n5(l6 var1, boolean var2) {
      l6 var3 = null;

      for (l6 var4 = var2 ? this.x8 : this.n3; var4 != null; var4 = var2 ? var4.k5 : var4.u3) {
         if (var4 == var1) {
            this.n5(var4, var3, var2);
            return;
         }

         var3 = var4;
      }
   }

   private void n5(l6 var1, l6 var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            this.x8 = var1.k5;
         } else {
            this.n3 = var1.u3;
         }
      } else if (var3) {
         var2.k5 = var1.k5;
      } else {
         var2.u3 = var1.u3;
      }
   }

   public void l6(l6 var1, boolean var2) {
      if (var2) {
         var1.k5 = this.x8;
         this.x8 = var1;
      } else {
         var1.u3 = this.n3;
         this.n3 = var1;
      }
   }

   public boolean n5(z1 var1, n3 var2, s3 var3) {
      if (this.a6 != null) {
         if (this.h0 != null) {
            Object var4 = this.h0.n5(this.k5, this.a6, var3.k5(), this.c8);
            if (var4 != null) {
               this.k5 = var4;
            }

            this.n5 = 3;
         } else {
            if (!(this.k5 instanceof s7)) {
               throw new SerializationException(d1.n5(new String[]{"No surrogate selector was found for type ", j8.n5(this.k5).q0()}));
            }

            Object[] var7 = new Object[]{this.a6, var3};
            com.aspose.slides.internal.p4l.k5 var5 = j8.n5(this.k5)
               .n5(52, null, new y8[]{com.aspose.slides.internal.v6g.k5.n5(c4.class), com.aspose.slides.internal.v6g.k5.n5(s3.class)}, null);
            if (var5 == null) {
               throw new SerializationException(d1.n5(new String[]{"The constructor to deserialize an object of type ", j8.n5(this.k5).q0(), " was not found."}));
            }

            if (!var5.n5().isAccessible()) {
               var5.n5().setAccessible(true);
            }

            var5.n5(var7);
         }

         this.a6 = null;
      }

      if (this.k5 instanceof t2 && this.n5 != 3) {
         try {
            this.k5 = ((t2)this.k5).n5(var3.k5());

            int var8;
            for (var8 = 100; this.k5 instanceof t2 && var8 > 0; var8--) {
               Object var11 = ((t2)this.k5).n5(var3.k5());
               if (var11 == this.k5) {
                  break;
               }

               this.k5 = var11;
            }

            if (var8 == 0) {
               throw new SerializationException(
                  "The implementation of the IObjectReference interface returns too many nested references to other objects that implement IObjectReference."
               );
            }

            this.n5 = 3;
         } catch (NullReferenceException var6) {
            return false;
         }
      }

      if (this.t2 != null) {
         t4 var9 = var1.n5(this.u9);
         var9.n5(var1, this.t2, this.k5);
      } else if (this.s7 != null) {
         t4 var10 = var1.n5(this.u9);
         var10.n5(var1, this.k5, this.s7);
      }

      return true;
   }

   public boolean u3() {
      return this.x8 != null;
   }
}
