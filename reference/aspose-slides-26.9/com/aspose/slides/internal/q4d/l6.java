package com.aspose.slides.internal.q4d;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.u2w.h0;
import com.aspose.slides.internal.u2w.u9;
import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadata;
import org.w3c.dom.Node;

public class l6 extends IIOMetadata {
   private h0 n5;
   private int l6 = -1;

   private l6() {
   }

   l6(h0 var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public static l6 n5() {
      return new l6();
   }

   public h0 l6() {
      return this.n5;
   }

   public u9 k5() {
      return this.n5.b3()[this.l6];
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
      throw new InvalidOperationException("Metadata is readonly");
   }

   @Override
   public void reset() {
      this.n5.n5().n5(true);
      this.n5.dispose();
      this.n5 = null;
      this.l6 = -1;
   }
}
