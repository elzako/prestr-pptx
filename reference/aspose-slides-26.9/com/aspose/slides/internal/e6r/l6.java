package com.aspose.slides.internal.e6r;

import com.aspose.slides.internal.z4.a0;

public class l6 {
   public final void n5(int var1, a0 var2) {
      this.n5("/Link", var1, var2);
   }

   public final void l6(int var1, a0 var2) {
      this.n5("/Figure", var1, var2);
   }

   public final void k5(int var1, a0 var2) {
      this.n5("/Span", var1, var2);
   }

   public final void n5(a0 var1) {
      var1.u3().n5("/Artifact");
      var1.u3().u9();
      var1.u3().k5("BMC");
   }

   public final void l6(a0 var1) {
      var1.u3().n5("/Artifact");
      var1.u3().u9();
      var1.u3().n5("<</Type/Pagination/Subtype/Footer>>");
      var1.u3().u9();
      var1.u3().k5("BDC");
   }

   public final void k5(a0 var1) {
      var1.u3().n5("/Artifact");
      var1.u3().u9();
      var1.u3().n5("<</Type/Pagination/Subtype/Header>>");
      var1.u3().u9();
      var1.u3().k5("BDC");
   }

   public final void n5(String var1, int var2, a0 var3) {
      this.n5(var1, var2, var3, null);
   }

   public final void n5(String var1, int var2, a0 var3, String var4) {
      var3.u3().n5(var1);
      var3.u3().u9();
      var3.u3().c8();
      var3.u3().n5("/MCID", var2);
      var3.u3().u3("/Lang", var4);
      var3.u3().t2();
      var3.u3().u9();
      var3.u3().k5("BDC");
   }

   public final void u3(a0 var1) {
      var1.u3().k5("EMC");
   }
}
