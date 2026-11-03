package com.aspose.slides;

final class h1u extends y0k {
   public h1u(SmartArtShape var1) {
      super(var1);
   }

   public final SmartArtShape n5() {
      return (SmartArtShape)super.a6();
   }

   @Override
   void n5(e3 var1, s5u var2, InterruptionToken var3) {
      try {
         var2.n5(this.a6().getHyperlinkClick());
         super.n5(var1, var2, var3);
         if (!this.a6().getHidden() && this.n5().k5() != null) {
            com.aspose.slides.internal.w0.c8 var4 = s3z.n5(this.n5().k5().u3, var2);
            boolean var5 = l6o.n5(var1, var2, this.n5(), this.n5().k5());

            try {
               if (!var5) {
                  if (this.n5().k5().h0()) {
                     k0r var6 = new k0r(null);

                     try {
                        var6.n5(var1, var2, this.n5(), this.n5().k5(), var4);
                     } finally {
                        if (var6 != null) {
                           var6.dispose();
                        }
                     }
                  } else {
                     var1.k5(var4);
                     this.n5().k5().u3.n5(var1, var2);
                  }
               }
            } finally {
               if (!this.n5().k5().h0() && !var5) {
                  var1.z3();
               }

               if (var2.e2() != null) {
                  var2.n5((IHyperlink)null);
                  var1.a6();
               }
            }
         }
      } finally {
         var2.n5((IHyperlink)null);
      }
   }
}
