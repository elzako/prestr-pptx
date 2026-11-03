package com.aspose.slides.internal.d2a;

import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadata;
import org.w3c.dom.Node;

public class n5 extends IIOMetadata {
   private final com.aspose.slides.internal.g7e.n5 n5;

   public n5(com.aspose.slides.internal.g7e.n5 var1) {
      this.n5 = var1 instanceof com.aspose.slides.internal.g7e.l6 ? new com.aspose.slides.internal.g7e.l6(var1) : new com.aspose.slides.internal.g7e.n5(var1);
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

   public com.aspose.slides.internal.g7e.n5 n5() {
      return this.n5;
   }
}
