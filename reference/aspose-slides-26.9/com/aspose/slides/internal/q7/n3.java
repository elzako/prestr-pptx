package com.aspose.slides.internal.q7;

import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class n3 implements IDisposable {
   private final l6 n5;
   private final String l6;
   private final n3$n5 k5;
   private t4 u3;
   private String a6;
   private com.aspose.slides.internal.z0k.n3 u9;

   public n3(l6 var1, t4 var2, String var3, n3$n5 var4) {
      this.n5 = var1;
      this.u3 = var2;
      this.k5 = var4;
      this.l6 = z1.k5(var3);
   }

   public final com.aspose.slides.internal.z0k.n3 n5() {
      if (!this.l6()) {
         return this.n5(this.l6);
      }

      this.n5.l6();
      this.u3();
      return this.n5(this.a6);
   }

   private boolean l6() {
      if (!com.aspose.slides.internal.v6g.k5.l6(this.u3, com.aspose.slides.internal.z0k.n3.class)) {
         return false;
      }

      com.aspose.slides.internal.z0k.n3 var1 = (com.aspose.slides.internal.z0k.n3)this.u3;
      String var2 = z1.k5(var1.n5());
      return d1.a6(var2, this.l6);
   }

   @Override
   public final void dispose() {
      if (this.u9 != null) {
         this.u9.dispose();
      }

      if (this.k5()) {
         this.u3.dispose();
         com.aspose.slides.internal.z0k.u9.n5(this.a6, this.l6, true);
         com.aspose.slides.internal.z0k.u9.l6(this.a6);
         this.l6(this.l6);
      }
   }

   private boolean k5() {
      return !d1.n5(this.a6) && com.aspose.slides.internal.z0k.u9.k5(this.a6);
   }

   private com.aspose.slides.internal.z0k.n3 n5(String var1) {
      this.u9 = new com.aspose.slides.internal.z0k.n3(var1, 2, 2);
      return this.u9;
   }

   private void u3() {
      if (!this.n5.n5().getInitialized()) {
         this.n5.n5().init();
      }

      this.a6 = this.n5.n5().getNextTempFilePath();
   }

   private void l6(String var1) {
      this.u3 = new com.aspose.slides.internal.z0k.n3(var1, 3, 1, 1);
      this.k5.n5(this.u3);
   }
}
