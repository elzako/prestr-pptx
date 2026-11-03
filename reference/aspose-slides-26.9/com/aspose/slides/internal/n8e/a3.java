package com.aspose.slides.internal.n8e;

import com.aspose.slides.IPresentationSignedWarningInfo;

public final class a3 extends w8 implements IPresentationSignedWarningInfo {
   public a3() {
      super("Reading signed presentation. Signature will be lost during processing.");
   }

   @Override
   public int getWarningType() {
      return 1;
   }
}
