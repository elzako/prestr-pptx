package com.aspose.slides;

class f6r implements IOutputSaver {
   @Override
   public final void save(String path, IOutputFile outputFile) {
      String var3 = com.aspose.slides.internal.z0k.z1.u9(path);
      if (!"".equals(var3) && !com.aspose.slides.internal.z0k.u3.k5(var3)) {
         com.aspose.slides.internal.z0k.u3.n5(var3);
      }

      if (!com.aspose.slides.ms.System.d1.t2(path, "?")) {
         com.aspose.slides.internal.z0k.n3 var4 = new com.aspose.slides.internal.z0k.n3(path, 2);

         try {
            ((OutputFile)outputFile).n5(var4);
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } else {
         ((OutputFile)outputFile).n5(com.aspose.slides.internal.v6g.k5.n5(outputFile, o2f.class).k5());
      }
   }
}
