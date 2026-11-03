package com.aspose.slides.internal.y5s;

import com.aspose.slides.ms.core.resources.ResourcesLoader;
import java.awt.color.ICC_Profile;

public class x8 {
   private static final byte[] n5;

   public static com.aspose.slides.internal.a1k.n5 n5() {
      return new com.aspose.slides.internal.a1k.n5(n5("rswop.icm"));
   }

   public static com.aspose.slides.internal.a1k.n5 l6() {
      return new com.aspose.slides.internal.a1k.n5(new com.aspose.slides.internal.z0k.e2(n5));
   }

   private static com.aspose.slides.internal.z0k.t4 n5(String var0) {
      return ResourcesLoader.loadResource("System.Drawing", var0);
   }

   static {
      ICC_Profile var0 = ICC_Profile.getInstance(1000);
      n5 = var0.getData();
   }
}
