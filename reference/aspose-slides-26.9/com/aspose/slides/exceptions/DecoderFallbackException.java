package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.j3;

@j3
public final class DecoderFallbackException extends ArgumentException {
   private byte[] n5 = null;
   private int l6 = 0;

   public DecoderFallbackException(String message, byte[] bytesUnknown, int index) {
      super(message);
      this.n5 = bytesUnknown;
      this.l6 = index;
   }

   public final byte[] getBytesUnknown() {
      return this.n5;
   }

   public final int getIndex() {
      return this.l6;
   }
}
