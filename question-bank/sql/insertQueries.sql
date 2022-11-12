-- Insert data into category table
INSERT INTO public.category (subject, exam_type) VALUES ('Maths', 'GRE');
INSERT INTO public.category (subject, exam_type) VALUES ('Chemistry', 'WAEC');
INSERT INTO public.category (subject, exam_type) VALUES ('English', 'SAT');
INSERT INTO public.category (subject, exam_type) VALUES ('Physics', 'JAMB');

-- Insert data into question_answers table
INSERT INTO public.question_answers (category_id, question, answer)
    VALUES (1, 'If x and y are non-negative integers such that 2x+3y=8 and z=x2+y2, what is the maximum value of z?', '16');

INSERT INTO public.question_answers (category_id, question, answer)
VALUES (4, 'A ball is thrown upward at an angle of 30 °; to the horizontal and lands on the top edge
of a building that is 20 m away. The top edge is 5.0 m above the throwing point. How fast
was the ball thrown?', '20 m/s');

INSERT INTO public.question_answers (category_id, question, answer)
VALUES (4, 'A jetliner traveling at 600 km/h is turning in a circle of radius 2.5 km. What is its
centripetal acceleration?', '11 m/s2');

INSERT INTO public.question_answers (category_id, question, answer)
VALUES (2, 'The nucleus of an atom consists of', 'protons and neutrons');

INSERT INTO public.question_answers (category_id, question, answer)
VALUES (2, 'The number of moles of solute present in 1 kg of a solvent is called its', 'molality');

INSERT INTO public.question_answers (category_id, question, answer)
VALUES (2, 'The metal used to recover copper from a solution of copper sulphate is', 'Fe');

