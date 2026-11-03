package com.aspose.slides.internal.y4g;

import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.IDisposable;

class j8 implements IDisposable {
   private static final int n5 = 180;
   private boolean l6;
   private com.aspose.slides.ms.System.j5 k5 = new com.aspose.slides.ms.System.j5();
   private String u3;
   private byte[] a6;
   private byte[] u9;

   public j8(String var1, byte[] var2) {
      this.u3 = var1;
      this.a6 = var2;
      this.u3();
   }

   @Override
   protected void finalize() throws Throwable {
      this.n5(false);
      super.finalize();
   }

   public String n5() {
      return this.u3;
   }

   public byte[] l6() {
      return this.a6;
   }

   public boolean k5() {
      return this.u9 != null && com.aspose.slides.ms.System.j5.n5(this.k5, com.aspose.slides.ms.System.j5.t2());
   }

   public void n5(v8 var1) {
      this.a6();
      if (var1.w1() != null) {
         this.u9 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(var1.w1())).deepClone(), byte[].class);
      }
   }

   public void l6(v8 var1) {
      this.a6();
      if (this.u9 != null) {
         var1.u9(com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.u9)).deepClone(), byte[].class));
      }
   }

   public void u3() {
      this.a6();
      com.aspose.slides.ms.System.j5.t2().a6(n5).u3(this.k5);
   }

   @Override
   public void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   private void n5(boolean var1) {
      if (!this.l6) {
         com.aspose.slides.ms.System.j5.l6.u3(this.k5);
         this.u3 = null;
         this.a6 = null;
         if (this.u9 != null) {
            com.aspose.slides.ms.System.u3.n5(this.u9, 0, this.u9.length);
            this.u9 = null;
         }
      }

      this.l6 = true;
   }

   private void a6() {
      if (this.l6) {
         String var1 = "Cache session information were disposed.";
         throw new ObjectDisposedException(var1);
      }
   }
}
