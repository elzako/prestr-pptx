package com.aspose.slides.internal.m4d;

import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadata;
import org.w3c.dom.Node;

public class l6 extends IIOMetadata {
   private final com.aspose.slides.internal.e2l.u9 n5;
   private final com.aspose.slides.internal.e2l.u3 l6;
   private final com.aspose.slides.internal.v2x.k5 k5;
   private final int u3;
   private final byte[] a6;
   private final boolean u9;

   public l6() {
      this(null, null, null, null, new byte[0], false);
   }

   public l6(
      com.aspose.slides.internal.e2l.u9 var1,
      com.aspose.slides.internal.e2l.u3 var2,
      com.aspose.slides.internal.v2x.k5 var3,
      Integer var4,
      byte[] var5,
      boolean var6
   ) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4 != null ? var4 : -1;
      this.a6 = var5;
      this.u9 = var6;
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   @Override
   public Node getAsTree(String formatName) {
      return null;
   }

   @Override
   public void mergeTree(String formatName, Node root) throws IIOInvalidTreeException {
   }

   @Override
   public void reset() {
   }

   public com.aspose.slides.internal.e2l.u9 n5() {
      return this.n5;
   }

   public com.aspose.slides.internal.e2l.u3 l6() {
      return this.l6;
   }

   public com.aspose.slides.internal.v2x.k5 k5() {
      return this.k5;
   }

   public byte[] u3() {
      return this.a6;
   }

   public boolean a6() {
      return this.u9;
   }
}
