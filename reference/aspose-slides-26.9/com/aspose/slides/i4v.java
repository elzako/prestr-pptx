package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;

class i4v {
   private final com.aspose.slides.internal.k4y.p3w n5;
   private final com.aspose.slides.internal.k4y.r9l l6;

   public i4v(com.aspose.slides.internal.k4y.p3w var1) {
      if (var1 == null) {
         throw new ArgumentNullException("graphicProperties");
      }

      this.n5 = var1;
      this.l6 = null;
   }

   public i4v(com.aspose.slides.internal.k4y.r9l var1) {
      if (var1 == null) {
         throw new ArgumentNullException("drawingPageProperties");
      }

      this.n5 = null;
      this.l6 = var1;
   }

   public final void n5(String var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.y2(var1);
      }

      if (this.l6 != null) {
         this.l6.k5(var1);
      }
   }

   public final void n5(int var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.h0(var1);
      }

      if (this.l6 != null) {
         this.l6.l6(var1);
      }
   }

   public final void l6(String var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.y1(var1);
      }

      if (this.l6 != null) {
         this.l6.u3(var1);
      }
   }

   public final void k5(String var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.a0(var1);
      }

      if (this.l6 != null) {
         this.l6.a6(var1);
      }
   }

   public final void u3(String var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.d2(var1);
      }

      if (this.l6 != null) {
         this.l6.u9(var1);
      }
   }

   public final void a6(String var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.d5(var1);
      }

      if (this.l6 != null) {
         this.l6.h0(var1);
      }
   }

   public final void l6(int var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.c8(var1);
      }

      if (this.l6 != null) {
         this.l6.k5(var1);
      }
   }

   public final void k5(int var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.u9(var1);
      }

      if (this.l6 != null) {
         this.l6.n5(var1);
      }
   }

   public final void u9(String var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.r4(var1);
      }

      if (this.l6 != null) {
         this.l6.n5(var1);
      }
   }

   public final void h0(String var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.s3(var1);
      }

      if (this.l6 != null) {
         this.l6.c8(var1);
      }
   }

   public final void c8(String var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.p8(var1);
      }

      if (this.l6 != null) {
         this.l6.t2(var1);
      }
   }

   public final void t2(String var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.c4(var1);
      }

      if (this.l6 != null) {
         this.l6.l6(var1);
      }
   }

   private void n5() {
      int var1 = 0;
      if (this.n5 != null) {
         var1++;
      }

      if (this.l6 != null) {
         var1++;
      }

      if (var1 != 1) {
         throw new InvalidOperationException("Only single owner of OdpPictureFillFormatSerializationContext allowed");
      }
   }
}
