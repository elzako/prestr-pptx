package com.aspose.slides;

import java.io.OutputStream;

public abstract class OutputFile implements IOutputFile {
   @Override
   public void write(OutputStream stream) {
      com.aspose.slides.internal.l6o.l6.n5(new OutputFile$1(this, stream));
   }

   abstract void n5(com.aspose.slides.internal.z0k.t4 var1);
}
