package com.aspose.slides;

class f7s {
   private final IExternalResourceResolver n5;
   private final p2h l6;

   public f7s(IExternalResourceResolver var1) {
      this.n5 = var1;
      this.l6 = p2h.n5;
   }

   public String n5(String var1, String var2) {
      String var3 = this.l6.n5(var1, var2);
      if (var3 == null && this.n5 != null) {
         var3 = this.n5.resolveUri(var1, var2);
      }

      return var3;
   }

   public com.aspose.slides.internal.z0k.t4 n5(String var1) {
      if (this.l6.n5(null, var1) != null) {
         return this.l6.n5(var1);
      } else {
         return this.n5 != null ? ((ExternalResourceResolver)this.n5).getEntityInternal(var1) : null;
      }
   }
}
