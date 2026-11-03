package com.aspose.slides;

public class ChartTextFormat implements IChartTextFormat, r0g {
   private final r0g n5;
   private final TextFrameFormat l6;
   private final ParagraphFormat k5;
   private final ChartPortionFormat u3;

   @Override
   public final IChartTextBlockFormat getTextBlockFormat() {
      return this.l6;
   }

   @Override
   public final IChartParagraphFormat getParagraphFormat() {
      return this.k5;
   }

   @Override
   public final IChartPortionFormat getPortionFormat() {
      return this.u3;
   }

   @Override
   public final void copyTo(ITextFrame destTextFrame) {
      if (destTextFrame != null) {
         ((TextFrameFormat)destTextFrame.getTextFrameFormat()).n5(this.l6);
         if (destTextFrame.getParagraphs().getCount() == 0) {
            destTextFrame.getParagraphs().add(new Paragraph());
         }

         ParagraphFormat var2 = (ParagraphFormat)destTextFrame.getParagraphs().get_Item(0).getParagraphFormat();
         var2.n5(this.k5);
         PortionFormat var3 = (PortionFormat)destTextFrame.getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat();
         var3.n5(this.u3);
      }
   }

   @Override
   public final void copyFrom(ITextFrame sourceTextFrame) {
      if (sourceTextFrame != null) {
         this.l6.n5((TextFrameFormat)sourceTextFrame.getTextFrameFormat());
         if (sourceTextFrame.getParagraphs().getCount() > 0) {
            this.k5.n5((ParagraphFormat)sourceTextFrame.getParagraphs().get_Item(0).getParagraphFormat());
            this.u3.n5((BasePortionFormat)((PortionFormat)sourceTextFrame.getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat()));
         }
      }
   }

   ChartTextFormat(r0g parentImmediate) {
      this.n5 = parentImmediate;
      this.l6 = new TextFrameFormat(this);
      this.k5 = new ParagraphFormat(this);
      this.u3 = new ChartPortionFormat(this);
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   final long n5() {
      return ((this.l6.getVersion() & 4294967295L) + (this.k5.getVersion() & 4294967295L) & 4294967295L) + (this.u3.getVersion() & 4294967295L) & 4294967295L;
   }
}
